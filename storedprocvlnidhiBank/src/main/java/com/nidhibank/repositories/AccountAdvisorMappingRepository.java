package com.nidhibank.repositories;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.nidhibank.entities.AccountAdvisorMapping;

public interface AccountAdvisorMappingRepository extends JpaRepository<AccountAdvisorMapping,String>{

	@Procedure(value="get_accounts_count_proc")
	public Integer fetchAccountsCount();
	
	@Procedure(procedureName = "get_account_balance_by_holder")
	public Double fetchAccountBalanceByHolder(@Param("account_holder_name_input") String accountHolderName);
	
	@Procedure(procedureName="get_accadv_proc")
	public Map<String,Object> fetchAccountAdvisorById(@Param(value = "in_account_id") String id); 
	
	  @Procedure(name = "get_accadv_proc")
	    Map<String, Object> getAccountAdvisorProcedure(
	        @Param("in_account_id") String inAccountId
	    );
	  
	/* @Procedure(name = "get_accadv_proc")
	    void getAccountAdvisorProcedure(
	        @Param("in_account_id") String inAccountId,
	        @Param("out_account_holder_name") String outAccountHolderName,
	        @Param("out_advisor") String outAdvisor,
	        @Param("out_advisor_code") String outAdvisorCode,
	        @Param("out_advisor_first_name") String outAdvisorFirstName,
	        @Param("out_advisor_last_name") String outAdvisorLastName,
	        @Param("out_branch_name") String outBranchName
	    );*/
	
}
