package com.vlup.vlnidhibank.serviceImpl;

//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.vlup.vlnidhibank.dto.SBAccountDto;
//import com.vlup.vlnidhibank.dto.TransactionsDto;
////import com.vlup.vlnidhibank.entity.SBAccount;
////import com.vlup.vlnidhibank.entity.Transactions;
//import com.vlup.vlnidhibank.exceptions.AccountException;
//import com.vlup.vlnidhibank.repository.SBAccountRepository;
//import com.vlup.vlnidhibank.repository.TransactionRepository;
//import com.vlup.vlnidhibank.repository.TransactionsRepository;



//@Service  //automatically create spring bean for a class
//public class SBAccountServiceImpl implements com.vlup.vlnidhibank.service.AccountService {
//
//
//    private SBAccountRepository accountRepository;
//
//    private TransactionsRepository transactionRepository;
//
//    private static final String TRANSACTION_TYPE_DEPOSIT ="DEPOSIT"; //hardcoded value make a constant
//    private static final String TRANSACTION_TYPE_WITHDRAW ="WITHDRAW";
//
//    private static final String TRANSACTION_TYPE_TRANSFERFUNDS ="TRANSFERFUNDS";
//    //constructor used to insert repository base de[pendency
//    //spring 4.3 onwards @Autowired depricated  whenever spring will find single constructor in bean
//    //it automatically inject the dependecies
//    public SBAccountServiceImpl(SBAccountRepository accountRepository,
//                              TransactionsRepository transactionRepository)
//    {
//        this.accountRepository = accountRepository;
//        this.transactionRepository=transactionRepository;
//    }
//
//    //Below method convert account dto into account jpa entity then
//    // save account jpa entity into database
//
//
//    //a method to create a new user account. It takes user-provided information,
//    // converts it to a format suitable for storage, saves it to a database,
//    // and then returns a representation of the saved account.
//    @Override
//	public SBAccountDto createAccountDto(SBAccountDto accountDto){
//        SBAccount account = AccountMapper.mapToAccount(accountDto);
//        SBAccount savedAccount = accountRepository.save(account); //this save method will return jpa entity
//        return AccountMapper.mapToAccountDto(savedAccount);
//    }
//
//    @Override
//    public SBAccountDto getAccountbyId(Long id) {
//        SBAccount account = accountRepository
//                .findById(id)
//
//                .orElseThrow(() -> new AccountException("Account does not exist"));
//        return AccountMapper.mapToAccountDto(account);
//    }
//
//    public SBAccountDto deposit(Long id, double amount) {
//        SBAccount account = accountRepository
//                .findById(id)
//
//                .orElseThrow(() -> new AccountException("Account does not exist"));
//        double total = account.getBalance() + amount;
//        account.setBalance(total);
//        SBAccount savedAccount = accountRepository.save(account);
//
//
//        Transactions transaction=new Transactions();
//        transaction.setAccountId(account.getId()); //particular table id else put only (id)
//
//        transaction.setAmount(amount);
//        transaction.setTransactionType(TRANSACTION_TYPE_DEPOSIT);//enum and predefined transaction type deposit withdraw transfer
//        transaction.setTimestamp(LocalDateTime.now());
//
//        transactionRepository.save(transaction);
//        return AccountMapper.mapToAccountDto(savedAccount);
//
//
//    }
//
//    @Override
//    public SBAccountDto withdrawAccountDto(Long id, double amount) {
//        SBAccount account = accountRepository
//                .findById(id)
//
//                .orElseThrow(() -> new AccountException("Account does not exist"));
//
//        if (account.getBalance() < amount) {
//            throw new RuntimeException("Insufficient amount");
//        }
//
//        double total = account.getBalance() - amount;
//        account.setBalance(total);
//        SBAccount savedAccount = accountRepository.save(account);
//
//        Transactions transaction=new Transactions();
//        transaction.setAccountId(account.getId()); //particular table id else put only (id)
//
//        transaction.setAmount(amount);
//        transaction.setTransactionType(TRANSACTION_TYPE_WITHDRAW);//enum and predefined transaction type deposit withdraw transfer
//        transaction.setTimestamp(LocalDateTime.now());
//
//        transactionRepository.save(transaction);
//
//        return AccountMapper.mapToAccountDto(savedAccount);
//    }
//
//    @Override
//    public List<SBAccountDto> getAllAccounts() {
//
//        List<SBAccount> accounts = accountRepository.findAll();
//        return accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public void deleteAccount(Long id) {
//        SBAccount account = accountRepository
//                .findById(id)
//
//                .orElseThrow(() -> new AccountException("Account does not exist"));
//
//        accountRepository.deleteById(id)
//;
//    }
//
//    @Override
//	public void transferFunds(TransferFunddto tansferFundDto) {
//        //Retrieve the account from which we send the amount
//        SBAccount fromAccount = accountRepository
//                .findById(tansferFundDto.fromAccountId())
//                .orElseThrow(() -> new AccountException("Account does not exist"));
//        //Retrieve the account to which we send the amount
//        SBAccount toAccount=      accountRepository
//                .findById(tansferFundDto.toAccountId())
//                .orElseThrow(() -> new AccountException("Account does not exist"));
//
//        if(fromAccount.getBalance() < tansferFundDto.amount())
//        {
//            throw new RuntimeException("INSUFFICIENT AMOUNT");
//        }
//
//        //Debit the amount from fromAccount object
//        fromAccount.setBalance(fromAccount.getBalance()-tansferFundDto.amount());
//
//        //credit the amount to toAccount object
//        toAccount.setBalance(toAccount.getBalance()+tansferFundDto.amount());
//
//        accountRepository.save(fromAccount);
//
//        accountRepository.save(toAccount);
//
//        Transactions transaction=new Transactions();
//        transaction.setAccountId(tansferFundDto.fromAccountId()); //particular table id else put only (id)
//
//        transaction.setAmount(tansferFundDto.amount());
//        transaction.setTransactionType(TRANSACTION_TYPE_TRANSFERFUNDS);//enum and predefined transaction type deposit withdraw transfer
//        transaction.setTimestamp(LocalDateTime.now());
//
//        transactionRepository.save(transaction);
//
//    }
//
//    @Override
//    public List<TransactionsDto> getAccountTransactionsDtos(Long accountId) {
//        List<Transactions> transactions =transactionRepository
//                .findByAccountIdOrderByTimestampDesc(accountId);
//
//        return  transactions.stream()
//                .map(transaction -> convertEntityToDto(transaction))
//                .collect(Collectors.toList());
//
//
//    }
//    private TransactionsDto convertEntityToDto(Transactions transaction)
//    {
//        //(TransactionDto transactionDto)=
//           return new TransactionsDto(
//          transaction.getId(),
//          transaction.getAccountId(),
//          transaction.getAmount(),
//          transaction.getTransactionType(),
//          transaction.getTimestamp()
//        );
//
//    }
//
//	
//	
//}