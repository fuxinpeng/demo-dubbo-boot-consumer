package com.dubbo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.test.bean.UserAddress;
import com.dubbo.test.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("initorder")
	public List<UserAddress> initOrder(String userId) {
		return orderService.initOrder(userId);
	}
	
}
