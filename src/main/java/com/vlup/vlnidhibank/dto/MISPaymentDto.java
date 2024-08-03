package com.vlup.vlnidhibank.dto;

import java.time.LocalDate;

public class MISPaymentDto {
	
	private String policyNo;
    private String applicantName;
    private LocalDate policyDate;
    private Double policyAmt;
    private Double interestAmount;
    private String schemeName;
    private String policyBranch;
    private String memberCode;
    private Double payAmount;
    private String payBranch;
    private LocalDate payDate;
    private String paymentBy;
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public LocalDate getPolicyDate() {
		return policyDate;
	}
	public void setPolicyDate(LocalDate policyDate) {
		this.policyDate = policyDate;
	}
	public Double getPolicyAmt() {
		return policyAmt;
	}
	public void setPolicyAmt(Double policyAmt) {
		this.policyAmt = policyAmt;
	}
	public Double getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(Double interestAmount) {
		this.interestAmount = interestAmount;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getPolicyBranch() {
		return policyBranch;
	}
	public void setPolicyBranch(String policyBranch) {
		this.policyBranch = policyBranch;
	}
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public Double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayBranch() {
		return payBranch;
	}
	public void setPayBranch(String payBranch) {
		this.payBranch = payBranch;
	}
	public LocalDate getPayDate() {
		return payDate;
	}
	public void setPayDate(LocalDate payDate) {
		this.payDate = payDate;
	}
	public String getPaymentBy() {
		return paymentBy;
	}
	public void setPaymentBy(String paymentBy) {
		this.paymentBy = paymentBy;
	}
	public MISPaymentDto(String policyNo, String applicantName, LocalDate policyDate, Double policyAmt,
			Double interestAmount, String schemeName, String policyBranch, String memberCode, Double payAmount,
			String payBranch, LocalDate payDate, String paymentBy) {
		super();
		this.policyNo = policyNo;
		this.applicantName = applicantName;
		this.policyDate = policyDate;
		this.policyAmt = policyAmt;
		this.interestAmount = interestAmount;
		this.schemeName = schemeName;
		this.policyBranch = policyBranch;
		this.memberCode = memberCode;
		this.payAmount = payAmount;
		this.payBranch = payBranch;
		this.payDate = payDate;
		this.paymentBy = paymentBy;
	}
	public MISPaymentDto() {
		super();
	}
    
    

}
