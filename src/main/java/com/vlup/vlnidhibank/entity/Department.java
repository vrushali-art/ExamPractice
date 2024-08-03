//package com.vlup.vlnidhibank.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//@Getter
//@Setter
//@NoArgsConstructor
//@Table(name = "Department")
//@Entity
//public class Department {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int depart_id;
//	
//	@Column(length = 50, nullable = false)
//	private String departName;
//	
//	@Column(length = 100, nullable = false)
//	private String description;
//
//	public int getDepart_id() {
//		return depart_id;
//	}
//
//	public void setDepart_id(int depart_id) {
//		this.depart_id = depart_id;
//	}
//
//	public String getDepartName() {
//		return departName;
//	}
//
//	public void setDepartName(String departName) {
//		this.departName = departName;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	
//
//	
//}
