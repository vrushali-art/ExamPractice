package com.vlup.vlnidhibank.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class DepartmentDto {
	
	private int depart_id;
	private String departName;
	private String description;
	public int getDepart_id() {
		return depart_id;
	}
	public void setDepart_id(int depart_id) {
		this.depart_id = depart_id;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
