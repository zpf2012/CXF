package com.hand.cxf_server.ws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-09T17:25:14.445+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "OrderWSService", 
                  wsdlLocation = "http://localhost:8080/server/services/orderws?wsdl",
                  targetNamespace = "http://service.ws.cxf_server.hand.com/") 
public class OrderWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ws.cxf_server.hand.com/", "OrderWSService");
    public final static QName OrderWSPort = new QName("http://service.ws.cxf_server.hand.com/", "OrderWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/server/services/orderws?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/server/services/orderws?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OrderWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OrderWS
     */
    @WebEndpoint(name = "OrderWSPort")
    public OrderWS getOrderWSPort() {
        return super.getPort(OrderWSPort, OrderWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderWS
     */
    @WebEndpoint(name = "OrderWSPort")
    public OrderWS getOrderWSPort(WebServiceFeature... features) {
        return super.getPort(OrderWSPort, OrderWS.class, features);
    }

}
