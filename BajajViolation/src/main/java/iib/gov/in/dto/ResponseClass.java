package iib.gov.in.dto;

import java.util.List;

public class ResponseClass {
	private List<Object> voilationInfo;
	//private Object theftInfo;
	private String status;
	private String message ;
	public List<Object> getVoilationInfo() {
		return voilationInfo;
	}
	public String getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public void setVoilationInfo(List<Object> voilationInfo) {
		this.voilationInfo = voilationInfo;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
