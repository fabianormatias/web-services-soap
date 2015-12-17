package com.g6.ex09.marshall;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

class MarshalGTER {
	private static final String file_name = "gter.mar";

	public static void main(String[] args) {
		new MarshalGTER().run_example();
	}

	private void run_example() {
		try {
			JAXBContext ctx = JAXBContext.newInstance(GetTimeAsElapsedResponse.class);
			Marshaller m = ctx.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			GetTimeAsElapsedResponse tr = new GetTimeAsElapsedResponse();
			tr.set_return(new java.util.Date().getTime());
			m.marshal(tr, System.out);
		} catch (JAXBException e) {
			System.err.println(e);
		}
	}
}