package com.hand.cxf_server.ws.service.impl;

import javax.jws.WebService;

import com.hand.cxf_server.dto.Order;
import com.hand.cxf_server.ws.service.OrderWS;

@WebService(targetNamespace = "http://impl.service.ws.cxf_server.hand.com/", endpointInterface = "com.hand.cxf_server.ws.service.OrderWS", portName = "OrderWSImplPort", serviceName = "OrderWSImplService")
public class OrderWSImpl implements OrderWS {

	public Order getOrderById(int id) {
		System.out.println("Server getOrderById(): "+id);
		return new Order(id, "飞机", 999999999);
	}

}
