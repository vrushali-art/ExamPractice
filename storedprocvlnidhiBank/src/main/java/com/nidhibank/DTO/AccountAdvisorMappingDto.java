
package com.nidhibank.DTO;

public class AccountAdvisorMappingDto {

	private String inAccountId;
	private String outAccountHolderName;
	private String outAdvisor;
	private String outBranchName;
	private String outAdvisorCode;
	private String outAdvisorFirstName;
	private String outAdvisorLastName;

	public AccountAdvisorMappingDto(String id2, String accountHolderName2,String advisor2, String branchName2, 
			String advisorCode2,String advisorFirstName2,String advisorLastName2) {
		this.inAccountId = id2;
		this.outAccountHolderName=accountHolderName2;
		this.outAdvisor=advisor2;
		this.outAdvisorCode=advisorCode2;
		this.outAdvisorFirstName = advisorFirstName2;
		this.outAdvisorLastName=advisorLastName2;
		this.outBranchName=branchName2;
	}

	public String getInAccountId() {
		return inAccountId;
	}

	public void setInAccountId(String inAccountId) {
		this.inAccountId = inAccountId;
	}

	public String getOutAccountHolderName() {
		return outAccountHolderName;
	}

	public void setOutAccountHolderName(String outAccountHolderName) {
		this.outAccountHolderName = outAccountHolderName;
	}

	public String getOutAdvisor() {
		return outAdvisor;
	}

	public void setOutAdvisor(String outAdvisor) {
		this.outAdvisor = outAdvisor;
	}

	public String getOutBranchName() {
		return outBranchName;
	}

	public void setOutBranchName(String outBranchName) {
		this.outBranchName = outBranchName;
	}

	public String getOutAdvisorCode() {
		return outAdvisorCode;
	}

	public void setOutAdvisorCode(String outAdvisorCode) {
		this.outAdvisorCode = outAdvisorCode;
	}

	public String getOutAdvisorFirstName() {
		return outAdvisorFirstName;
	}

	public void setOutAdvisorFirstName(String outAdvisorFirstName) {
		this.outAdvisorFirstName = outAdvisorFirstName;
	}

	public AccountAdvisorMappingDto() {
		
	}

	public String getOutAdvisorLastName() {
		return outAdvisorLastName;
	}

	public void setOutAdvisorLastName(String outAdvisorLastName) {
		this.outAdvisorLastName = outAdvisorLastName;
	}

	
	// Getters and setters
}
