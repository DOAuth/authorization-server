package com.example.authorizationserver;

import com.example.authorizationserver.config.AuthorizationServerConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AuthorizationServerConfigurationProperties.class)
@SpringBootApplication
public class AuthorizationProxyApplication {

  public static void main(String[] args) {
    SpringApplication.run(AuthorizationProxyApplication.class, args);
  }
}
