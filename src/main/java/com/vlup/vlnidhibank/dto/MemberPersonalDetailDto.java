package com.vlup.vlnidhibank.dto;


import java.sql.Date;


import com.vlup.vlnidhibank.enums.Gender;

import com.vlup.vlnidhibank.enums.MartialStatus;
import com.vlup.vlnidhibank.enums.VerifyWith;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MemberPersonalDetailDto {
	
	private String membersId;
    private Date registrationDate;
    private Gender gender;
    private Date dob;
    private String enterAadharNumber;
    private String otp;
    private Long age;
    private MartialStatus maritalStatus;
    private Long aadharNo;
    private String panNo;
    private String voterId;
    private String drivingLiscNo;
    private String mobileNo;
    private String emailId;
    private String occupation;
    private String education;
    private VerifyWith verificationMethod;
	public String getMembersId() {
		return membersId;
	}
	public void setMembersId(String membersId) {
		this.membersId = membersId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEnterAadharNumber() {
		return enterAadharNumber;
	}
	public void setEnterAadharNumber(String enterAadharNumber) {
		this.enterAadharNumber = enterAadharNumber;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public MartialStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MartialStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getDrivingLiscNo() {
		return drivingLiscNo;
	}
	public void setDrivingLiscNo(String drivingLiscNo) {
		this.drivingLiscNo = drivingLiscNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public VerifyWith getVerificationMethod() {
		return verificationMethod;
	}
	public void setVerificationMethod(VerifyWith verificationMethod) {
		this.verificationMethod = verificationMethod;
	}	
}



