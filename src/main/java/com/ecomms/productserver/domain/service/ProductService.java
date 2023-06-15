package com.ecomms.productserver.domain.service;

import com.ecomms.productserver.domain.model.Product;
import com.ecomms.productserver.domain.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product save(Product product) {
        return productRepository.save(product);
    }

}
