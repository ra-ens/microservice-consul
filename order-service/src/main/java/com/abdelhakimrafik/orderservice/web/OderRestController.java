package com.abdelhakimrafik.orderservice.web;

import com.abdelhakimrafik.orderservice.entities.Order;
import com.abdelhakimrafik.orderservice.model.Customer;
import com.abdelhakimrafik.orderservice.model.Product;
import com.abdelhakimrafik.orderservice.repositories.OrderRepository;
import com.abdelhakimrafik.orderservice.repositories.ProductItemRepository;
import com.abdelhakimrafik.orderservice.service.CustomerRestClientService;
import com.abdelhakimrafik.orderservice.service.InventoryRestClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OderRestController {
    private OrderRepository orderRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClientService customerRestClientService;
    private InventoryRestClientService inventoryRestClientService;

    @GetMapping("/fullOrder/{id}")
    public Order getOrder(@PathVariable Long id){
        Order order=orderRepository.findById(id).get();
        Customer customer=customerRestClientService.customerById(order.getCustomerId());
        order.setCustomer(customer);
        order.getProductItems().forEach(pi->{
            Product product=inventoryRestClientService.productById(pi.getProductId());
            pi.setProduct(product);
        });
        return order;
    }
}