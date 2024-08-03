package com.vlup.vlnidhibank.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	
	 String resourceName;
	 String fieldName;
	 String code;
	public ResourceNotFoundException(String resourceName, String fieldName, String code) {
		super(String.format("%s not found with %s : %s",resourceName,fieldName,code));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.code = code;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ResourceNotFoundException() {
		super();
	}
	 
	 
	 
	 
}
