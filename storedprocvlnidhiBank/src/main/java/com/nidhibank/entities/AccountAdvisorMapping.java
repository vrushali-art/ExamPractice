package com.nidhibank.entities;

import java.util.Map;

import org.springframework.data.jpa.repository.query.Procedure;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

   //THIS NAME "account.advisor" SHOULD MATCH WITH @Procedure (procedureName="accounts.advisor")
@Entity 
@NamedStoredProcedureQuery(name="get_accadv_proc"
,procedureName="get_accadv_proc" 
,parameters={
		
	@StoredProcedureParameter(mode=ParameterMode.IN,name="in_account_id",type=String.class),
	@StoredProcedureParameter(mode=ParameterMode.OUT,name="out_account_holder_name",type=String.class ),
	@StoredProcedureParameter(mode=ParameterMode.OUT,name="out_advisor",type=String.class ),
	@StoredProcedureParameter(mode=ParameterMode.OUT,name="out_advisor_code",type=String.class ),
	@StoredProcedureParameter(mode=ParameterMode.OUT,name="out_advisor_first_name",type=String.class ),
	@StoredProcedureParameter(mode=ParameterMode.OUT,name="out_advisor_last_name",type=String.class ),
	@StoredProcedureParameter(mode=ParameterMode.OUT,name="out_branch_name",type=String.class ),
}
)

public class AccountAdvisorMapping {

    @Id
    private String inAccountId;
    private String outAccountHolderName;
    private String outAdvisor;
    private String outAdvisorCode;
    private String outAdvisorFirstName;
    private String outAdvisorLastName;
    private String outBranchName;
	public AccountAdvisorMapping(String id2,String accountHolderName2,String advisor2,
			String branchName2, 
		String advisorCode2,	String advisorFirstName2, String advisorLastName2 ) {
		this.inAccountId=id2;
		this.outAccountHolderName=accountHolderName2;
		this.outAdvisor=advisor2;
		this.outAdvisorCode=advisorCode2;
		this.outAdvisorFirstName=advisorFirstName2;
		this.outAdvisorLastName=advisorLastName2;
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
	public String getOutAdvisorLastName() {
		return outAdvisorLastName;
	}
	public void setOutAdvisorLastName(String outAdvisorLastName) {
		this.outAdvisorLastName = outAdvisorLastName;
	}
	public String getOutBranchName() {
		return outBranchName;
	}
	public void setOutBranchName(String outBranchName) {
		this.outBranchName = outBranchName;
	}
	    // Getters and setters
	public AccountAdvisorMapping() {


	}
	
}
