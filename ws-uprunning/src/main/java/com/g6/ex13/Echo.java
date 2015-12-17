package com.g6.ex13;

import java.util.Map;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 * A minimalist service to explore the MessageContext. The operation takes a
 * string and echoes it together with transport information back to the client.
 */
@WebService
@HandlerChain(file = "handler-chain.xml")
public class Echo {
	// Enable 'dependency injection' on web service context
	@Resource
	WebServiceContext ws_ctx;

	@WebMethod
	public String echo(String from_client) {
		MessageContext ctx = ws_ctx.getMessageContext();
		Map req_headers = (Map) ctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		MapDump.dump_map((Map) ctx, "");
		String response = "Echoing your message: " + from_client;
		return response;
	}
}