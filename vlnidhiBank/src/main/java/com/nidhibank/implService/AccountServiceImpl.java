package com.nidhibank.implService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nidhibank.DTO.AccountDto;
import com.nidhibank.DTO.TransactionDto;
import com.nidhibank.DTO.TransferFunddto;
import com.nidhibank.entities.Account;
import com.nidhibank.entities.Transaction;
import com.nidhibank.exceptions.AccountException;
import com.nidhibank.mapper.AccountMapper;
import com.nidhibank.repositories.AccountRepository;
import com.nidhibank.repositories.TransactionRepository;
import com.nidhibank.services.AccountService;

@Service  //automatically create spring bean for a class
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;

    private TransactionRepository transactionRepository;

    private static final String TRANSACTION_TYPE_DEPOSIT ="DEPOSIT"; //hardcoded value make a constant
    private static final String TRANSACTION_TYPE_WITHDRAW ="WITHDRAW";

    private static final String TRANSACTION_TYPE_TRANSFERFUNDS ="TRANSFERFUNDS";
    //constructor used to insert repository base de[pendency
    //spring 4.3 onwards @Autowired depricated  whenever spring will find single constructor in bean
    //it automatically inject the dependecies
    public AccountServiceImpl(AccountRepository accountRepository,
                              TransactionRepository transactionRepository)
    {
        this.accountRepository = accountRepository;
        this.transactionRepository=transactionRepository;
    }

    //Below method convert account dto into account jpa entity then
    // save account jpa entity into database


    //a method to create a new user account. It takes user-provided information,
    // converts it to a format suitable for storage, saves it to a database,
    // and then returns a representation of the saved account.
    @Override
	public AccountDto createAccount(AccountDto accountDto){
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account); //this save method will return jpa entity
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountbyId(Long id) {
        Account account = accountRepository
                .findById(id)

                .orElseThrow(() -> new AccountException("Account does not exist"));
        return AccountMapper.mapToAccountDto(account);
    }

    public AccountDto deposit(Long id, double amount) {
        Account account = accountRepository
                .findById(id)

                .orElseThrow(() -> new AccountException("Account does not exist"));
        double total = account.getBalance() + amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);


        Transaction transaction=new Transaction();
        transaction.setAccountId(account.getId()); //particular table id else put only (id)

        transaction.setAmount(amount);
        transaction.setTransactionType(TRANSACTION_TYPE_DEPOSIT);//enum and predefined transaction type deposit withdraw transfer
        transaction.setTimestamp(LocalDateTime.now());

        transactionRepository.save(transaction);
        return AccountMapper.mapToAccountDto(savedAccount);


    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account = accountRepository
                .findById(id)

                .orElseThrow(() -> new AccountException("Account does not exist"));

        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient amount");
        }

        double total = account.getBalance() - amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);

        Transaction transaction=new Transaction();
        transaction.setAccountId(account.getId()); //particular table id else put only (id)

        transaction.setAmount(amount);
        transaction.setTransactionType(TRANSACTION_TYPE_WITHDRAW);//enum and predefined transaction type deposit withdraw transfer
        transaction.setTimestamp(LocalDateTime.now());

        transactionRepository.save(transaction);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {

        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAccount(Long id) {
        Account account = accountRepository
                .findById(id)

                .orElseThrow(() -> new AccountException("Account does not exist"));

        accountRepository.deleteById(id)
;
    }

    @Override
	public void transferFunds(TransferFunddto tansferFundDto) {
        //Retrieve the account from which we send the amount
        Account fromAccount = accountRepository
                .findById(tansferFundDto.fromAccountId())
                .orElseThrow(() -> new AccountException("Account does not exist"));
        //Retrieve the account to which we send the amount
        Account toAccount=      accountRepository
                .findById(tansferFundDto.toAccountId())
                .orElseThrow(() -> new AccountException("Account does not exist"));

        if(fromAccount.getBalance() < tansferFundDto.amount())
        {
            throw new RuntimeException("INSUFFICIENT AMOUNT");
        }

        //Debit the amount from fromAccount object
        fromAccount.setBalance(fromAccount.getBalance()-tansferFundDto.amount());

        //credit the amount to toAccount object
        toAccount.setBalance(toAccount.getBalance()+tansferFundDto.amount());

        accountRepository.save(fromAccount);

        accountRepository.save(toAccount);

        Transaction transaction=new Transaction();
        transaction.setAccountId(tansferFundDto.fromAccountId()); //particular table id else put only (id)

        transaction.setAmount(tansferFundDto.amount());
        transaction.setTransactionType(TRANSACTION_TYPE_TRANSFERFUNDS);//enum and predefined transaction type deposit withdraw transfer
        transaction.setTimestamp(LocalDateTime.now());

        transactionRepository.save(transaction);

    }

    @Override
    public List<TransactionDto> getAccountTransactions(Long accountId) {
        List<Transaction> transactions =transactionRepository
                .findByAccountIdOrderByTimestampDesc(accountId);

        return  transactions.stream()
                .map(transaction -> convertEntityToDto(transaction))
                .collect(Collectors.toList());


    }
    private TransactionDto convertEntityToDto(Transaction transaction)
    {
        //(TransactionDto transactionDto)=
           return new TransactionDto(
          transaction.getId(),
          transaction.getAccountId(),
          transaction.getAmount(),
          transaction.getTransactionType(),
          transaction.getTimestamp()
        );

    }

	
	
}