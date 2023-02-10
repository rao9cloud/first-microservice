package com.example.productservice.controller;

import com.example.productservice.entity.Product;
import com.example.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){
        log.info("Inside saveProduct method of ProductController");
        return productService.saveProduct(product);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        log.info("Inside getAllProducts method of ProductController");
        return productService.getAllProducts();

    }
}
