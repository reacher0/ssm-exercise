package com.reacher.service.impl;

import com.reacher.entity.Product;
import com.reacher.mapper.IProductMapper;
import com.reacher.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductMapper productMapper;

    @Override
    public Product findOneProduct(String productId) {
        return productMapper.selectOneProduct(productId);
    }
}
