package com.hand.cxf_server.dto;

import javax.jws.WebService;

@WebService
public class Order {

	private int id;
	private String name;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderWS [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Order(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
