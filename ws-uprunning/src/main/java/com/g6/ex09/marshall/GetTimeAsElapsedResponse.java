package com.g6.ex09.marshall;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTimeAsElapsedResponse", namespace = "http://ts.ch01/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTimeAsElapsedResponse", namespace = "http://ts.ch01/")
public class GetTimeAsElapsedResponse {

	@XmlElement(name = "return", namespace = "")
	private long _return;

	public long get_return() {
		return this._return;
	}

	public void set_return(long _return) {
		this._return = _return;
	}
}