package com.nidhibank.DTO;

import java.math.BigDecimal;
import java.sql.Date;

import com.nidhibank.Enums.Gender;
import com.nidhibank.Enums.ModeOfOperation;
import com.nidhibank.Enums.NomineeRelation;
import com.nidhibank.Enums.SelectPlan;
import com.nidhibank.Enums.State;
import com.nidhibank.Enums.VerifyWith;
import com.nidhibank.entities.Branch;

public class CombinedDto {

	private Long id;
	private String savingAccOpeningDate;
	// Member+code;
	private String memberName;
	private Date dob;
	private String mobileNo;
	private String nomineeName;
	private int nomineeAge;
	private NomineeRelation nomineeRelation;
	private String address;
	private String district;
	private State state;
	private int pincode;
	private ModeOfOperation modeOfOperation;
	private SelectPlan selectPlan;
	private BigDecimal openingFees;
	private BigDecimal openingAmount;

	private boolean accountStatus;
	private boolean smsSend;
	private boolean debitCardIssue;

	// branchNam;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSavingAccOpeningDate() {
		return savingAccOpeningDate;
	}
	public void setSavingAccOpeningDate(String savingAccOpeningDate) {
		this.savingAccOpeningDate = savingAccOpeningDate;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public int getNomineeAge() {
		return nomineeAge;
	}
	public void setNomineeAge(int nomineeAge) {
		this.nomineeAge = nomineeAge;
	}
	public NomineeRelation getNomineeRelation() {
		return nomineeRelation;
	}
	public void setNomineeRelation(NomineeRelation nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public ModeOfOperation getModeOfOperation() {
		return modeOfOperation;
	}
	public void setModeOfOperation(ModeOfOperation modeOfOperation) {
		this.modeOfOperation = modeOfOperation;
	}
	public SelectPlan getSelectPlan() {
		return selectPlan;
	}
	public void setSelectPlan(SelectPlan selectPlan) {
		this.selectPlan = selectPlan;
	}
	public BigDecimal getOpeningFees() {
		return openingFees;
	}
	public void setOpeningFees(BigDecimal openingFees) {
		this.openingFees = openingFees;
	}
	public BigDecimal getOpeningAmount() {
		return openingAmount;
	}
	public void setOpeningAmount(BigDecimal openingAmount) {
		this.openingAmount = openingAmount;
	}
	public boolean isAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	public boolean isSmsSend() {
		return smsSend;
	}
	public void setSmsSend(boolean smsSend) {
		this.smsSend = smsSend;
	}
	public boolean isDebitCardIssue() {
		return debitCardIssue;
	}
	public void setDebitCardIssue(boolean debitCardIssue) {
		this.debitCardIssue = debitCardIssue;
	}
	// private String savingAccNumber;


	public void setVerificationMethod(VerifyWith verificationMethod) {
		// TODO Auto-generated method stub
		
	}
	public void setRegistrationDate(Date registrationDate) {
		// TODO Auto-generated method stub
		
	}
	public void setAadharNo(String aadharNo) {
		// TODO Auto-generated method stub
		
	}
	public void setSponsorName(String sponsorName) {
		// TODO Auto-generated method stub
		
	}
	public void setGender(Gender gender) {
		// TODO Auto-generated method stub
		
	}
	public void setMstatus(String mstatus) {
		// TODO Auto-generated method stub
		
	}
	public void setBranchname(Branch branch) {
		// TODO Auto-generated method stub
		
	}
	public void setPanNo(String panNo) {
		// TODO Auto-generated method stub
		
	}
	public void setVoterId(String voterId) {
		// TODO Auto-generated method stub
		
	}
	public void setEmailId(String emailId) {
		// TODO Auto-generated method stub
		
	}
	public void setOccupation(String occupation) {
		// TODO Auto-generated method stub
		
	}
	public void setEducation(String education) {
		// TODO Auto-generated method stub
		
	}
	public void setIntroMemCode(String introMemCode) {
		// TODO Auto-generated method stub
		
	}
	

	// private SavingPlanDto savingPlan;
}
