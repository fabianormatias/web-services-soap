package com.g6.ex05;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

@WebServiceClient(name = "TimeServerImplService", targetNamespace = "http://ex5.g6.com/", wsdlLocation = "http://localhost:9876/ts?wsdl")
public class TimeServerImplService extends Service {
	private final static URL TIMESERVERIMPLSERVICE_WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL("http://localhost:9876/ts?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		TIMESERVERIMPLSERVICE_WSDL_LOCATION = url;
	}

	public TimeServerImplService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public TimeServerImplService() {
		super(TIMESERVERIMPLSERVICE_WSDL_LOCATION, new QName("http://ex5.g6.com/", "TimeServerImplService"));
	}

	@WebEndpoint(name = "TimeServerImplPort")
	public TimeServer getTimeServerImplPort() {
		return (TimeServer) super.getPort(new QName("http://ex5.g6.com/", "TimeServerImplPort"), TimeServer.class);
	}
}