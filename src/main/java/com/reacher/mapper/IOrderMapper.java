package com.reacher.mapper;

import com.reacher.entity.Order;

import java.util.List;

public interface IOrderMapper {
    Order selectOneOrder(String orderId);
    Order selectOrderItem(String orderId);
    List<Order> selectOrders(Order order);
}
