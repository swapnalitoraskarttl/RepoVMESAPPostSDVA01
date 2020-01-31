package com.tml.vmepost;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tml.vmepost.ItOrder;

@XmlType(name = "Vmepostresponse", propOrder = {
		"USER_NAME","ROUTE","TCODE","STATUS",
		"ACTION","ItOrder"

}) 

@XmlRootElement(name = "Vmepostresponse" ,namespace="http://schemas.xmlsoap.org/soap/envelope/")

public class Vmepostresponse {
	
	protected String USER_NAME;
	@JsonProperty("ROUTE")
	protected String ROUTE;
	@JsonProperty("TCODE")
	protected String TCODE;	
	protected String STATUS;
	protected String ACTION;
	
	@XmlElement(name="ItOrder")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ItOrder> ItOrder ;
	
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getROUTE() {
		return ROUTE;
	}
	public void setROUTE(String rOUTE) {
		ROUTE = rOUTE;
	}
	public String getTCODE() {
		return TCODE;
	}
	public void setTCODE(String tCODE) {
		TCODE = tCODE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getACTION() {
		return ACTION;
	}
	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}
	
	

}
