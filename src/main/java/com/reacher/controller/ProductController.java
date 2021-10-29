package com.reacher.controller;

import com.reacher.entity.Product;
import com.reacher.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/{productId}")
    public Product queryOneProduct(@PathVariable String productId){
        return productService.findOneProduct(productId);
    }
}
