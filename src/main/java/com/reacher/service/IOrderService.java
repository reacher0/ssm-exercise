package com.reacher.service;

import com.reacher.entity.Order;

import java.util.List;

public interface IOrderService {
    Order findOneOrder(String orderId);
    Order findOrderItem(String orderId);
    List<Order> findOrders(Order order);
}
