
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.hand.cxf_server.ws.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-09T17:25:14.427+08:00
 * Generated source version: 3.1.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "OrderWSService",
                      portName = "OrderWSPort",
                      targetNamespace = "http://service.ws.cxf_server.hand.com/",
                      wsdlLocation = "http://localhost:8080/server/services/orderws?wsdl",
                      endpointInterface = "com.hand.cxf_server.ws.service.OrderWS")
                      
public class OrderWSPortImpl implements OrderWS {

    private static final Logger LOG = Logger.getLogger(OrderWSPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.hand.cxf_server.ws.service.OrderWS#getOrderById(int arg0)*
     */
    public com.hand.cxf_server.ws.service.Order getOrderById(int arg0) { 
        LOG.info("Executing operation getOrderById");
        System.out.println(arg0);
        try {
            com.hand.cxf_server.ws.service.Order _return = new com.hand.cxf_server.ws.service.Order();
            _return.setId(-1728378334);
            _return.setName("Name-1720000135");
            _return.setPrice(0.14172929341547824);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
