//package com.vlup.vlnidhibank.entity;
//
//import java.sql.Date;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "addBankEmp")
//public class BankEmployee 
//{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int empId;
//	
//	@Column(nullable = false, length = 20)
//	private String branchName;
//	
//	@Column(nullable = false, length = 100)
//	private String empName;
//	
//	@Column(nullable = false, length = 10)
//	private String empCode;
//	
//	@Column(nullable = false)
//	private Date doj;
//	
//	@Column(nullable = false, length = 10)
//	private String mobileNo;
//	
//	@Column(nullable = false, length = 3)
//	private int age;
//	
//	@Column(nullable = false, length = 50)
//	private String address;
//	
//	@Column(nullable = false, length = 100)
//	private String qualification;
//	
//	@Column(length = 100)
//	private int experience;
//	
//	@Column(nullable = false)
//	private Double salary;
//	
//	@Column(nullable = false, length = 11)
//	private Long sbAccNo;
//	
//	@Column(name = "pan_no", length = 10)
//	private String panNo;
//	
//	@Column(nullable = false, length = 20)
//	private String relativeName;
//	
//	private enum relRelation{Father, Mother, Son, Daughter, Spouse, Husband, Wife, Brother, Sister, DaughterinLaw, BrotherinLaw, GrandDaughter, GrandSon, Other };
//	
//	@Column(nullable = false)
//    private Double fees;
//	
//	private enum paymentBy{Cash, Cheque, Online, NEFT};
//	
//	@Column(nullable = false)
//	private String remarks;
//
//	private enum empStatus{Yes, No}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getBranchName() {
//		return branchName;
//	}
//
//	public void setBranchName(String branchName) {
//		this.branchName = branchName;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpCode() {
//		return empCode;
//	}
//
//	public void setEmpCode(String empCode) {
//		this.empCode = empCode;
//	}
//
//	public Date getDoj() {
//		return doj;
//	}
//
//	public void setDoj(Date doj) {
//		this.doj = doj;
//	}
//
//	public String getMobileNo() {
//		return mobileNo;
//	}
//
//	public void setMobileNo(String mobileNo) {
//		this.mobileNo = mobileNo;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getQualification() {
//		return qualification;
//	}
//
//	public void setQualification(String qualification) {
//		this.qualification = qualification;
//	}
//
//	public int getExperience() {
//		return experience;
//	}
//
//	public void setExperience(int experience) {
//		this.experience = experience;
//	}
//
//	public Double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(Double salary) {
//		this.salary = salary;
//	}
//
//	public Long getSbAccNo() {
//		return sbAccNo;
//	}
//
//	public void setSbAccNo(Long sbAccNo) {
//		this.sbAccNo = sbAccNo;
//	}
//
//	public String getPanNo() {
//		return panNo;
//	}
//
//	public void setPanNo(String panNo) {
//		this.panNo = panNo;
//	}
//
//	public String getRelativeName() {
//		return relativeName;
//	}
//
//	public void setRelativeName(String relativeName) {
//		this.relativeName = relativeName;
//	}
//
//	public Double getFees() {
//		return fees;
//	}
//
//	public void setFees(Double fees) {
//		this.fees = fees;
//	}
//
//	public String getRemarks() {
//		return remarks;
//	}
//
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	};
//	
//    
//	
//}
//     