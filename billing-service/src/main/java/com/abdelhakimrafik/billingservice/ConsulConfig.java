package com.abdelhakimrafik.billingservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "token")
@Data
public class ConsulConfig {
    private long accessTokenTimeout;
    private long refreshTokenTimeout;
}
