package com.spring.cxf.ws.impl;

import javax.jws.WebService;

import com.spring.cxf.ws.OrderWS;
import com.spring.cxf.ws.bean.Order;

@WebService(endpointInterface="com.spring.cxf.ws.OrderWS", serviceName="orderws")
public class OrderWSImpl implements OrderWS{

	public Order getOrderById(int id) {
		System.out.println("Server getOrderById(): "+id);
		return new Order(id, "飞机", 999999999);
	}

}
