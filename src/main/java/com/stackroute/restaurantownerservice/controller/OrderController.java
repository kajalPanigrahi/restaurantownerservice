package com.stackroute.restaurantownerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.restaurantownerservice.service.IOrderService;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	private ResponseEntity<?> responseEntity;
	
	@GetMapping("/orders")
	public ResponseEntity<?> getAllOrders(){
		try {
			responseEntity = new ResponseEntity<>(orderService.getOrderHistory(), HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>("Some internal error occured..", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		return responseEntity;
	}

}
