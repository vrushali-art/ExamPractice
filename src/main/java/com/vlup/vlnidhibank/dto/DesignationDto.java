package com.vlup.vlnidhibank.dto;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DesignationDto {

	private int desig_id;
	private String desigName;
	public int getDesig_id() {
		return desig_id;
	}
	public void setDesig_id(int desig_id) {
		this.desig_id = desig_id;
	}
	public String getDesigName() {
		return desigName;
	}
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}

	
	
}
