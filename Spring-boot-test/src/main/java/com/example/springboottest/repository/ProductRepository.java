package com.example.springboottest.repository;

import com.example.springboottest.entity.Product;
import com.example.springboottest.entity.enums.ProductStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends JpaRepository<Product, String>, JpaSpecificationExecutor {
    Page<Product> findAllByStatusEquals(ProductStatus active, PageRequest of);

}
