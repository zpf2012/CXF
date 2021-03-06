package com.spring.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-09T16:02:28.783+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://ws.cxf.spring.com/", name = "OrderWS")
@XmlSeeAlso({ObjectFactory.class})
public interface OrderWS {

    @WebMethod
    @RequestWrapper(localName = "getOrderById", targetNamespace = "http://ws.cxf.spring.com/", className = "com.spring.cxf.ws.GetOrderById")
    @ResponseWrapper(localName = "getOrderByIdResponse", targetNamespace = "http://ws.cxf.spring.com/", className = "com.spring.cxf.ws.GetOrderByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.spring.cxf.ws.Order getOrderById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}
