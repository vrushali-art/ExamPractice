//package com.vlup.vlnidhibank.service;
//
//import java.util.List;
//
//import com.vlup.vlnidhibank.dto.SBAccountDto;
//import com.vlup.vlnidhibank.dto.TransactionsDto;
//import com.vlup.vlnidhibank.dto.TransferFunddto;
//
//
//
//public interface SBAccountService {
//    SBAccountDto createAccount(SBAccountDto accountDto);
//    SBAccountDto getAccountbyId(Long id);
//    SBAccountDto deposit(Long id,double amount);
//    SBAccountDto withdraw(Long id,double amount);
//    List<SBAccountDto> getAllAccounts();
//    void deleteAccount(Long id);
//    void transferFunds(TransferFunddto tansferFundDto);
//    List<TransactionsDto> getAccountTransactions(Long accountId);
//    List<SBAccountDto> findAccountsWithSorting(String field);
//
//
//  //  void transferFund(Long id);
//}