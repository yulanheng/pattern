package cn.ylh.pattern.chain;

import java.io.Serializable;

public class Request implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String request;

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
	
}
