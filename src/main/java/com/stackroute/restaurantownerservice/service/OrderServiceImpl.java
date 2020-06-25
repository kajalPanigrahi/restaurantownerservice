package com.stackroute.restaurantownerservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.restaurantownerservice.domain.Order;
import com.stackroute.restaurantownerservice.domain.Restaurant;
import com.stackroute.restaurantownerservice.repository.RestaurantRepository;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Override
	public List<List<Order>> getOrderHistory() {
		
		try {
		return	restaurantRepository.findAll().stream().map(Restaurant::getOrdersList).collect(Collectors.toList());
		} catch (Exception e) {
			return null;
		}
		
		
	}

}
