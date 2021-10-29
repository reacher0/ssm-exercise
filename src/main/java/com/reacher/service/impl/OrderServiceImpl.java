package com.reacher.service.impl;

import com.reacher.entity.Order;
import com.reacher.mapper.IOrderMapper;
import com.reacher.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderMapper orderMapper;

    @Override
    public Order findOneOrder(String orderId) {
        return orderMapper.selectOneOrder(orderId);
    }

    @Override
    public Order findOrderItem(String orderId) {
        return orderMapper.selectOrderItem(orderId);
    }

    @Override
    public List<Order> findOrders(Order order) {
        return orderMapper.selectOrders(order);
    }
}
