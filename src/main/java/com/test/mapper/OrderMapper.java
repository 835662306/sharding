package com.test.mapper;

import com.test.model.Order;
import com.test.model.OrderItem;

import java.util.List;

public interface OrderMapper {
	
	List<Order> getOrderListByUserId(Integer userId);
	
	void createOrder(Order order);

	void createOrderItem(OrderItem orderItem);

}
