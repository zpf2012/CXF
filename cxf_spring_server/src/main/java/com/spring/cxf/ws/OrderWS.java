package com.spring.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.spring.cxf.ws.bean.Order;

@WebService
public interface OrderWS {

	@WebMethod
	public Order getOrderById(int id);
}
