package com.test.controller;

import com.test.model.Order;
import com.test.model.OrderItem;
import com.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(path="/{userId}")
	public List<Order> getOrderListByUserId(@PathVariable("userId") Integer userId) {
		return orderService.getOrderListByUserId(userId);
	}
	
	@RequestMapping(path="/{userId}/{orderId}")
	public String createOrderRest(@PathVariable("userId") Integer userId, @PathVariable("orderId") Integer orderId) {
		Order order = new Order();
		order.setOrderId(orderId);
		order.setUserId(userId);
		orderService.createOrder(order);
		return "success";
	}
	
	@RequestMapping(path="/createOrder")
	public String createOrder(Integer userId, Integer orderId) {
		Order order = new Order();
		order.setOrderId(4);
		order.setUserId(4);
		orderService.createOrder(order);
		return "success";
	}

	@RequestMapping(path="/createOrderItem")
	public String createOrderItem(Integer itemId, Integer userId, Integer orderId) {
		OrderItem orderItem = new OrderItem();
		orderItem.setItemId(11);
		orderItem.setOrderId(11);
		orderItem.setUserId(11);
		orderService.createOrderItem(orderItem);
		return "success";
	}
}
