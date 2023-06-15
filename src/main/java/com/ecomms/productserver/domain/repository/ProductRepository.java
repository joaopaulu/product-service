package com.ecomms.productserver.domain.repository;

import com.ecomms.productserver.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
