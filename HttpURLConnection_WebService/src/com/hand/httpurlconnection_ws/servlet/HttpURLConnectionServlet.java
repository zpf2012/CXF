package com.hand.httpurlconnection_ws.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpURLConnectionServlet
 */
public class HttpURLConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpURLConnectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String data = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><ns2:getOrderById xmlns:ns2=\"http://service.ws.cxf_server.hand.com/\"><arg0>"+name+"</arg0></ns2:getOrderById></soap:Body></soap:Envelope>";
		URL url = new URL("http://10.211.105.54:8080/server/services/orderws");
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setRequestProperty("Content-Type", "text/text;charset=utf-8");
		
		OutputStream os = connection.getOutputStream();
		os.write(data.getBytes("utf-8"));
		
		int responseCode = connection.getResponseCode();
		if (responseCode == 200) {
			InputStream is = connection.getInputStream();
			System.out.println(is.available());
			
			response.setContentType("text/text;charset=utf-8");
			ServletOutputStream outputStream = response.getOutputStream();
			
			byte[] bytes = new byte[1024];
			int len = 0;
			while ((len = is.read(bytes))>0) {
				outputStream.write(bytes, 0, len);
			}
			outputStream.flush();
			is.close();
		}
		os.close();
	}

}
