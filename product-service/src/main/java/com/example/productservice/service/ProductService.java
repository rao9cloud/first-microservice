package com.example.productservice.service;

import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product saveProduct(Product product) {
        log.info("Inside saveProduct method of ProductService");
        productRepository.save(product);
        log.info("Product {} is saved", product.getProdId());
        return product;
    }

    public List<Product> getAllProducts() {
        log.info("Inside getAllProducts method of ProductService");
        return productRepository.findAll();
    }
}
