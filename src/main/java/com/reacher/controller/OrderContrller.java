package com.reacher.controller;

import com.reacher.entity.Order;
import com.reacher.entity.User;
import com.reacher.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/orders")
@RestController
public class OrderContrller {

    @Autowired
    private IOrderService orderService;

    @GetMapping("")
    public List<Order> queryOrders(String userId){
        User user = new User();
        user.setId(userId);
        Order order = new Order();
        order.setUser(user);
        return orderService.findOrders(order);
    }

    @GetMapping("/{orderId}")
    public Order queryOneOrder(@PathVariable String orderId){
        return orderService.findOneOrder(orderId);
    }

    @GetMapping("/items/{orderId}")
    public Order queryOrderItem(@PathVariable String orderId){
        return orderService.findOrderItem(orderId);
    }
}
