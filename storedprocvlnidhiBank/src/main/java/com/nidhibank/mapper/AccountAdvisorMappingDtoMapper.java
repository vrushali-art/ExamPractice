//package com.nidhibank.mapper;
//
//import java.util.Date;
//
//import com.nidhibank.DTO.AccountAdvisorMappingDto;
//import com.nidhibank.DTO.AccountDto;
//import com.nidhibank.entities.Account;
//import com.nidhibank.entities.AccountAdvisorMapping;
//
//public class AccountAdvisorMappingDtoMapper {
//	    //convert accountdto into accountjpa entity
//	
//	public static AccountAdvisorMapping mapToAccountAdvisorMapping(AccountAdvisorMappingDto accountAdvisorMappingDto) {
//
//		AccountAdvisorMapping accountAdvisorMapping = new AccountAdvisorMapping(
//	        		accountAdvisorMappingDto.getInAccountId(),
//	        		accountAdvisorMappingDto.getOutAccountHolderName(),
//	        		accountAdvisorMappingDto.getOutAdvisor(),
//	        		accountAdvisorMappingDto.getOutBranchName(),
//	        		accountAdvisorMappingDto.getOutAdvisorCode(),
//	        		accountAdvisorMappingDto.getOutAdvisorFirstName(),
//	        		accountAdvisorMappingDto.getOutAdvisorLastName()
//	        		
//
//
//	        );
//	        return accountAdvisorMapping;
//	    }
//	    public static AccountAdvisorMappingDto mapToAccountAdvisorMappingDto(AccountAdvisorMapping accountAdvisorMapping){
//	    	AccountAdvisorMappingDto accountAdvisorMappingDto=new AccountAdvisorMappingDto(
//	        		accountAdvisorMapping.getInAccountId(),
//	        		accountAdvisorMapping.getOutAccountHolderName(),
//	        		accountAdvisorMapping.getOutAdvisor(),
//	        		accountAdvisorMapping.getOutBranchName(),
//	        		accountAdvisorMapping.getOutAdvisorCode(),
//	        		accountAdvisorMapping.getOutAdvisorFirstName(),
//	        		accountAdvisorMapping.getOutAdvisorLastName()
//	        		
//
//	        );
//	        return accountAdvisorMappingDto;
//	    }
//	}
//
