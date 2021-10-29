package com.reacher.service;

import com.reacher.entity.Product;

public interface IProductService {
    Product findOneProduct(String productId);
}
