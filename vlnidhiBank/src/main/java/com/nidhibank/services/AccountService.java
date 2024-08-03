package com.nidhibank.services;

import java.util.List;

import com.nidhibank.DTO.AccountDto;
import com.nidhibank.DTO.TransactionDto;
import com.nidhibank.DTO.TransferFunddto;


public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountbyId(Long id);
    AccountDto deposit(Long id,double amount);
    AccountDto withdraw(Long id,double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);
    void transferFunds(TransferFunddto tansferFundDto);
    List<TransactionDto> getAccountTransactions(Long accountId);
    List<AccountDto> findAccountsWithSorting(String field);


  //  void transferFund(Long id);
}