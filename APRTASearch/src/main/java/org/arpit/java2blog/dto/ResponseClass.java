package org.arpit.java2blog.dto;

import java.util.List;

public class ResponseClass {

	/*
	private Theft theft ;
	private Theft1 theft1 ;*/
	private List<Object> theftInfo;
	//private Object theftInfo;
	private String status;
	private String message ;
	
	
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Object> getTheftInfo() {
		return theftInfo;
	}
	public void setTheftInfo(List<Object> theftInfo) {
		this.theftInfo = theftInfo;
	}
	
	
	
	
	/*public Theft getTheft() {
		return theft;
	}
	public void setTheft(Theft theft) {
		this.theft = theft;
	}
	
	public Theft1 getTheft1() {
		return theft1;
	}
	public void setTheft1(Theft1 theft1) {
		this.theft1 = theft1;
	}*/
	
}
