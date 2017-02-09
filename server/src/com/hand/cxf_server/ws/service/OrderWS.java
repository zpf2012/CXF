package com.hand.cxf_server.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.hand.cxf_server.dto.Order;

@WebService
public interface OrderWS {

	@WebMethod
	public Order getOrderById(int id);
}
