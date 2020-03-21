package com.dubbo.test.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import com.dubbo.test.bean.UserAddress;
import com.dubbo.test.service.OrderService;
import com.dubbo.test.service.UserService;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）导入dubbo依赖
 * 		2）配置服务提供者
 * 2、让服务消费者去注册中心订阅服务提供者的服务
 * @author Administrator
 * 
 */
@Service
public class OrderServiceImpl implements OrderService {
	
	//这里设置负载均衡机制为轮询，默认为随机
	@Reference(loadbalance="roundrobin",timeout=5000)
	private UserService userService;
	
	@Override
	public List<UserAddress> initOrder(String userId) {
		//查询用户收货地址
		List<UserAddress> list = userService.getUserAddressList(userId);
		System.out.println(list);
		return list;
	} 

}