package com.reacher.mapper;

import com.reacher.entity.Product;

public interface IProductMapper {
    Product selectOneProduct(String productId);
}
