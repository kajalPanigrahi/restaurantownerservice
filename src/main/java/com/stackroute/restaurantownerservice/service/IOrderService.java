package com.stackroute.restaurantownerservice.service;

import java.util.List;

import com.stackroute.restaurantownerservice.domain.Order;

public interface IOrderService {
	
	public List<List<Order>> getOrderHistory();

}
