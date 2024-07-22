package com.muratprojects.tinkoffservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.swing.*;
@Data
@ConfigurationProperties(prefix = "api")
public class ApiConfig {
    private Boolean isSandBoxMode;
}
