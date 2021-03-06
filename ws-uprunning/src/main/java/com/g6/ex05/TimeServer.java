package com.g6.ex05;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "TimeServer", targetNamespace = "http://ex5.g6.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeServer {
	@WebMethod
	@WebResult(partName = "return")
	public String getTimeAsString();

	@WebMethod
	@WebResult(partName = "return")
	public long getTimeAsElapsed();
}