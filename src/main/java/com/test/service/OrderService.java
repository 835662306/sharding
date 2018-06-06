package com.test.service;

import com.test.mapper.OrderMapper;
import com.test.model.Order;
import com.test.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	
	public List<Order> getOrderListByUserId(Integer userId) {
		return orderMapper.getOrderListByUserId(userId);
	}
	
	public void createOrder(Order order) {
		orderMapper.createOrder(order);
	}

	public void createOrderItem(OrderItem orderItem) {
		orderMapper.createOrderItem(orderItem);
	}
}
