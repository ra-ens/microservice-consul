package com.abdelhakimrafik.billingservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class ConsulConfigRestController {

    private ConsulConfig consulConfig;
    private VaultConfig vaultConfig;

    @GetMapping("/config")
    public Map<String,Object> config(){
        return Map.of("consulConfig", consulConfig, "vaultConfig", vaultConfig);
    }
}
