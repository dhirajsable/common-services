package com.contact.login.discoveryclient;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryClientApplication {

  @Qualifier("eurekaClient")
  @Autowired
  EurekaClient eurekaClient;

  @Autowired RestTemplateBuilder restTemplateBuilder;

  public static void main(String[] args) {
    SpringApplication.run(DiscoveryClientApplication.class, args);
  }
}
