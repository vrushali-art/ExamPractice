package com.nidhibank.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Apiresponse<T>{
	int recordount;
	T response;
	private String message;
	private boolean success;
	
	public Apiresponse(String message, boolean success) 
	{
		super();
		this.setMessage(message);
		this.setSuccess(success);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}

