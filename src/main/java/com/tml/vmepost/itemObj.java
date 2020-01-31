package com.tml.vmepost;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItOrder", propOrder = {
		"RefDoc","ItemNo","DocType","Payer","PurchNo","OrdReason","CondType","CondValue","RefDocCa",
		"ClaimId"

}) 


public class itemObj {
	@JsonProperty("RefDoc")	
	String RefDoc;
	@JsonProperty("ItemNo")
	String ItemNo;
	@JsonProperty("DocType")
	String DocType;
	@JsonProperty("Payer")
	String Payer;
	@JsonProperty("PurchNo")
	String PurchNo;
	@JsonProperty("OrdReason")
	String OrdReason;
	@JsonProperty("CondType")
	String CondType;
	@JsonProperty("CondValue")
	String CondValue;
	@JsonProperty("RefDocCa")
	String RefDocCa;
	@JsonProperty("ClaimId")
	String ClaimId;
	
	public String getRefDoc() {
		return RefDoc;
	}
	public void setRefDoc(String refDoc) {
		RefDoc = refDoc;
	}
	public String getItemNo() {
		return ItemNo;
	}
	public void setItemNo(String itemNo) {
		ItemNo = itemNo;
	}
	public String getDocType() {
		return DocType;
	}
	public void setDocType(String docType) {
		DocType = docType;
	}
	public String getPayer() {
		return Payer;
	}
	public void setPayer(String payer) {
		Payer = payer;
	}
	public String getPurchNo() {
		return PurchNo;
	}
	public void setPurchNo(String purchNo) {
		PurchNo = purchNo;
	}
	public String getOrdReason() {
		return OrdReason;
	}
	public void setOrdReason(String ordReason) {
		OrdReason = ordReason;
	}
	public String getCondType() {
		return CondType;
	}
	public void setCondType(String condType) {
		CondType = condType;
	}
	public String getCondValue() {
		return CondValue;
	}
	public void setCondValue(String condValue) {
		CondValue = condValue;
	}
	public String getRefDocCa() {
		return RefDocCa;
	}
	public void setRefDocCa(String refDocCa) {
		RefDocCa = refDocCa;
	}
	public String getClaimId() {
		return ClaimId;
	}
	public void setClaimId(String claimId) {
		ClaimId = claimId;
	}
	
	
	
	

}
