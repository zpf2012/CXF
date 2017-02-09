
package com.hand.cxf_server.ws.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-09T17:25:14.360+08:00
 * Generated source version: 3.1.10
 * 
 */
public final class OrderWS_OrderWSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.ws.cxf_server.hand.com/", "OrderWSService");

    private OrderWS_OrderWSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = OrderWSService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        OrderWSService ss = new OrderWSService(wsdlURL, SERVICE_NAME);
        OrderWS port = ss.getOrderWSPort();  
        
        {
        System.out.println("Invoking getOrderById...");
        int _getOrderById_arg0 = 1275193049;
        com.hand.cxf_server.ws.service.Order _getOrderById__return = port.getOrderById(_getOrderById_arg0);
        System.out.println("getOrderById.result=" + _getOrderById__return);


        }

        System.exit(0);
    }

}