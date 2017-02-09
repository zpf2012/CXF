package com.spring.cxf.ws.client.test;

import com.spring.cxf.ws.bean.Order;
import com.spring.cxf.ws.impl.OrderWSImpl;

public class OrderTest {

	public static void main(String[] args) {
		OrderWSImpl orderWS = new OrderWSImpl();
		Order order = orderWS.getOrderById(0);
		System.out.println(order.toString());
	}
}
