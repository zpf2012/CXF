package com.spring.cxf.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.spring.cxf.ws.OrderWS;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-02-09T16:02:28.851+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "orderws", 
                  wsdlLocation = "http://localhost:8080/cxf_spring_server/orderws?wsdl",
                  targetNamespace = "http://impl.ws.cxf.spring.com/") 
public class Orderws extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.ws.cxf.spring.com/", "orderws");
    public final static QName OrderWSImplPort = new QName("http://impl.ws.cxf.spring.com/", "OrderWSImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cxf_spring_server/orderws?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Orderws.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/cxf_spring_server/orderws?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Orderws(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Orderws(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Orderws() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Orderws(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Orderws(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Orderws(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OrderWS
     */
    @WebEndpoint(name = "OrderWSImplPort")
    public OrderWS getOrderWSImplPort() {
        return super.getPort(OrderWSImplPort, OrderWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderWS
     */
    @WebEndpoint(name = "OrderWSImplPort")
    public OrderWS getOrderWSImplPort(WebServiceFeature... features) {
        return super.getPort(OrderWSImplPort, OrderWS.class, features);
    }

}
