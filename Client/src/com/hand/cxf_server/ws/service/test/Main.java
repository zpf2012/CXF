package com.hand.cxf_server.ws.service.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.cxf_server.ws.service.Order;
import com.hand.cxf_server.ws.service.OrderWS;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cxf-client.xml");
		OrderWS orderWS = (OrderWS) context.getBean("orderClient");
		Order order = orderWS.getOrderById(33);
		System.out.println(order);
	}
}
