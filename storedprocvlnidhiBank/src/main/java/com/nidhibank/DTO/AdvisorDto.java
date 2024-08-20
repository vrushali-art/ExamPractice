package com.nidhibank.DTO;

public class AdvisorDto {

	 private String advisorCode;
	   private String advisorFirstName;
	 private String advisorLastName;
	private String branchName;
	private String introducerCode;
	 private String introducerName;
	 private String address;
	private String photoUrl;
	 private String signatureUrl;
	public String getAdvisorCode() {
		return advisorCode;
	}
	public void setAdvisorCode(String advisorCode) {
		this.advisorCode = advisorCode;
	}
	public String getAdvisorFirstName() {
		return advisorFirstName;
	}
	public void setAdvisorFirstName(String advisorFirstName) {
		this.advisorFirstName = advisorFirstName;
	}
	public String getAdvisorLastName() {
		return advisorLastName;
	}
	public void setAdvisorLastName(String advisorLastName) {
		this.advisorLastName = advisorLastName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIntroducerCode() {
		return introducerCode;
	}
	public void setIntroducerCode(String introducerCode) {
		this.introducerCode = introducerCode;
	}
	public String getIntroducerName() {
		return introducerName;
	}
	public void setIntroducerName(String introducerName) {
		this.introducerName = introducerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getSignatureUrl() {
		return signatureUrl;
	}
	public void setSignatureUrl(String signatureUrl) {
		this.signatureUrl = signatureUrl;
	}
}
