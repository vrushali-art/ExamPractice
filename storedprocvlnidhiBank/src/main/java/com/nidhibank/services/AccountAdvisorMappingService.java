package com.nidhibank.services;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.query.Param;

import com.nidhibank.DTO.AccountAdvisorMappingDto;

public interface AccountAdvisorMappingService {
	public long getAccountCount();

	public Double getAccountBalanceByHolder(String accountHolderName);
	
	public Map<String, Object> fetchAccountAdvisorById(@Param("account_id") String id); 
	
	public List<AccountAdvisorMappingDto> getAccountAdvisor(@Param("inAccountId") String id); 
}
