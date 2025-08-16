package com.example.storefront.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class CatalogController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/catalog")
    public List<Map> getCatalog() {
        String url = "http://localhost:8081/products"; // Warehouse
        return restTemplate.getForObject(url, List.class);
    }
}
