//package com.vlup.vlnidhibank.serviceImpl;

//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.vlup.vlnidhibank.dto.AccountDto;
//import com.vlup.vlnidhibank.dto.TransactionsDto;
//import com.vlup.vlnidhibank.entity.Account;
//import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
//import com.vlup.vlnidhibank.entity.Account;
//import com.vlup.vlnidhibank.service.AccountService;
//
//
//
//
//@Service
//public class AccountServiceImpl implements AccountService{
//	
//	@Autowired
//	private com.vlup.vlnidhibank.repository.AccountRepo accountRepo;
//	
//	@Autowired
//	private ModelMapper modelMapper;
//	
//
//	private AccountDto convertEntityToDto(Account account) {
//		AccountDto accountDto=this.modelMapper.map(account, AccountDto.class);
//  	  return  accountDto; 
//    }
//
//    
//    
//    private Account convertDtoToEntity(AccountDto accountDto) {
//        Account account=this.modelMapper.map(accountDto, Account.class);
//    	  return  account;
//     }
//
//
//	@Override
//	public List<AccountDto> getAllAccounts() {
//		List<Account> accountList=this.accountRepo.findAll();
//        List<AccountDto> listOfAccountDtos=accountList.stream().map(accountlist->this.convertEntityToDto(accountlist)).collect(Collectors.toList()); 
//        return listOfAccountDtos;
//	}
//
//	@Override
//	public AccountDto createAccount(AccountDto accountDto) {
//		Account account = convertDtoToEntity(accountDto);
//		Account savedAccount= accountRepo.save(account);
//        return this.convertEntityToDto(savedAccount);
//	}
//
//	@Override
//	public AccountDto updateAccount(AccountDto accountDto, Integer accId) {
//		Account account=this.accountRepo
//    			.findById(accId)
//    			.orElseThrow(()->new ResourceNotFoundException("Account","Id",accId));
//		
//		
//		// Update by 
//		account.setAccHolderName(accountDto.getAccHolderName());
//		account.setOpeningBalance(accountDto.getOpeningBalance());
//   
//
//		
//	    Account updateAccount= this.accountRepo.save(account);
//	    AccountDto accDto1=this.convertEntityToDto(updateAccount);
//	    
//	    return accDto1;
//	}
//
//	@Override
//	public AccountDto getAccountById(Integer accId) {
//		Account account= this.accountRepo
//    			.findById(accId)
//                .orElseThrow(()->new ResourceNotFoundException("Account","Id",accId));
//    	return this.convertEntityToDto(account);
//	}
//
//	@Override
//	public void deleteAccount(Integer accId) {
//		Account account=this.accountRepo
//    			.findById(accId)
//
//    			.orElseThrow(()->new ResourceNotFoundException("Account","Id",accId));
//    	
//    	this.accountRepo.delete(account);
//		
//	}
//
//
//
//	@Override
//	public List<TransactionsDto> getAccountTransactionsDtos(Long accountId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
