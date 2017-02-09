package com.spring.cxf.ws.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.cxf.ws.Order;
import com.spring.cxf.ws.OrderWS;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		OrderWS orderws = (OrderWS) context.getBean("orderClient");
		Order order = orderws.getOrderById(24);
		System.out.println(order.toString());
	}
}
