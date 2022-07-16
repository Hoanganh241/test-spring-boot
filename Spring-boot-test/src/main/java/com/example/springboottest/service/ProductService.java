package com.example.springboottest.service;

import com.example.springboottest.entity.Product;
import com.example.springboottest.entity.enums.ProductStatus;
import com.example.springboottest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Page<Product> findAll(){
        return productRepository.findAllByStatusEquals(ProductStatus.ACTIVE, PageRequest.of(0, 10));
    }

    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(String id){
        productRepository.deleteById(id);
    }
}
