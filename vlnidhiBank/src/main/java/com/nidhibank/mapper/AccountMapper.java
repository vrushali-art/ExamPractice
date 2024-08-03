package com.nidhibank.mapper;

import java.util.Date;

import com.nidhibank.DTO.AccountDto;
import com.nidhibank.entities.Account;

public class AccountMapper {
	    //convert accountdto into accountjpa entity
	
	public static Account mapToAccount(AccountDto accountDto) {

	        Account account = new Account(
	                accountDto.getId(),
	                accountDto.getAccountHolderName(),
	                accountDto.getOpeningDate(),
	                accountDto.getBalance(),
	                accountDto.getOpeningAmount(),
	                accountDto.getAdvisor(),
	                accountDto.getOpeningfees()


	        );
	        return account;
	    }
	    public static AccountDto mapToAccountDto(Account account){
	        AccountDto accountDto=new AccountDto(
	                account.getId(),
	                account.getAccountHolderName(),
	                account.getOpeningDate(),
	                account.getBalance(),
	                account.getOpeningAmount(),
	                account.getAdvisor(),
	                account.getOpeningfees()

	        );
	        return accountDto;
	    }
	}

