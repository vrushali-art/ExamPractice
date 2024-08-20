//package com.nidhibank.implService;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.nidhibank.DTO.AccountAdvisorMappingDto;
//import com.nidhibank.entities.AccountAdvisorMapping;
//import com.nidhibank.mapper.AccountAdvisorMappingDtoMapper;
//import com.nidhibank.repositories.AccountAdvisorMappingRepository;
//import com.nidhibank.services.AccountAdvisorMappingService;
//
//@Service
//public class AccountAdvisorMappingServiceImpl implements AccountAdvisorMappingService {
//
//	@Autowired
//	AccountAdvisorMappingRepository accountAdvisorMappingRepository;
//
//	@Override
//	public long getAccountCount() {
//		return accountAdvisorMappingRepository.fetchAccountsCount();
//
//	}
//
//	@Override
//	public Double getAccountBalanceByHolder(String accountHolderName) {
//		return accountAdvisorMappingRepository.fetchAccountBalanceByHolder(accountHolderName);
//	}
//
//	@Override
//	public Map<String, Object> fetchAccountAdvisorById(String id) {
//		return accountAdvisorMappingRepository.fetchAccountAdvisorById(id);
//	}
//
///*	 @Override
//	    public List<AccountAdvisorMappingDto>  getAccountAdvisor(String accountId) {
//		 	Map<String, Object> 
//	        List<AccountAdvisorMapping> accountAdvisor ;
//	        accountAdvisor=accountAdvisorMappingRepository.findAll();
//	        return accountAdvisor.stream().map(AccountAdvisorMappingDtoMapper::mapToAccountAdvisorMappingDto).collect(Collectors.toList());
//	    }*/
//	 
//	 @Override
//	    public List<AccountAdvisorMappingDto> getAccountAdvisor(String accountId) {
//	        Map<String, Object> resultMap = accountAdvisorMappingRepository.getAccountAdvisorProcedure(accountId);
//	        
//	        AccountAdvisorMappingDto dto = new AccountAdvisorMappingDto();
//	        dto.setInAccountId(accountId);
//	        dto.setOutAccountHolderName((String) resultMap.get("out_account_holder_name"));
//	        dto.setOutAdvisor((String) resultMap.get("out_advisor"));
//	        dto.setOutAdvisorCode((String) resultMap.get("out_advisor_code"));
//	        dto.setOutAdvisorFirstName((String) resultMap.get("out_advisor_first_name"));
//	        dto.setOutAdvisorLastName((String) resultMap.get("out_advisor_last_name"));
//	        dto.setOutBranchName((String) resultMap.get("out_branch_name"));
//
//	        return Collections.singletonList(dto);
//	    }
//	
//	/*@Override 
//	public AccountAdvisorMappingDto getAccountbyId(String id) {
//		 
//		  Account account = accountRepository.findById(id)
//		 
//		  .orElseThrow(() -> new AccountException("Account does not exist")); return
//		  AccountMapper.mapToAccountDto(account); }
//	    
//	}*/
//
//}
