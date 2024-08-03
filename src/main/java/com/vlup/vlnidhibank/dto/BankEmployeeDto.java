package com.vlup.vlnidhibank.dto;

import java.sql.Date;




import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BankEmployeeDto {
	
    private int empId;
	private String branchName;
	private String empName;
	private String empCode;
	private Date doj;
	private String mobileNo;
	private int age;
	private String address;
	private String qualification;
	private int experience;
	private Double salary;
	private Long sbAccNo;
    private String panNo;
	private String relativeName;
	//private enum relRelation{Father, Mother, Son, Daughter, Spouse, Husband, Wife, Brother, Sister, DaughterinLaw, BrotherinLaw, GrandDaughter, GrandSon, Other };
    private Double fees;
	//private enum paymentBy{Cash, Cheque, Online, NEFT};
	private String remarks;
//	private enum empStatus{Yes, No}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Long getSbAccNo() {
		return sbAccNo;
	}
	public void setSbAccNo(Long sbAccNo) {
		this.sbAccNo = sbAccNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getRelativeName() {
		return relativeName;
	}
	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	};

}
