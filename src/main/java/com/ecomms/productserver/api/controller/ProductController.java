package com.ecomms.productserver.api.controller;

import com.ecomms.productserver.domain.model.Product;
import com.ecomms.productserver.domain.repository.ProductRepository;
import com.ecomms.productserver.domain.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductRepository productRepository;

    private final ProductService productService;

    public ProductController(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }

    @GetMapping
    public List<Product> listAll(){
        return productRepository.findAll();
    }
}
