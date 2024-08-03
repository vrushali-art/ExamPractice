//package com.vlup.vlnidhibank.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.nidhibank.DTO.AccountDto;
//import com.nidhibank.DTO.TransactionDto;
//import com.nidhibank.DTO.TransferFunddto;
//import com.nidhibank.services.AccountService;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController  //this makes class as spring mvc rest controller class
//@RequestMapping("/api/accounts")
//public class SBAccountController {
//    private AccountService accountService;
//
//    //constructor based dependency injection
//    public SBAccountController(AccountService accountService) {
//        this.accountService = accountService;
//    }
//
//    // ADD ACCOUNT REST API =first crate amethod and will make that method as rest api
//    //using spring annotation
//    @PostMapping //here response entity Account dto is generic
//    //requestbody annotation will map requestbody to this java object
//    //requestbody contain json and this will map automaticalluy to java object
//    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
//        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
//    }
//
//    //GET ACCOUNT REST API
//    @GetMapping("/{id}")
//    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
//        AccountDto accountDto=accountService.getAccountbyId(id)
//;
//        return ResponseEntity.ok(accountDto);
//    }
//
//    //DEPOSIT REST API
//    @PutMapping("/{id}/deposit")
//    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
//                                              @RequestBody Map<String,Double> request){
//        Double amount =request.get("amount");
//        AccountDto accountDto= accountService.deposit(id,amount);
//        return ResponseEntity.ok(accountDto);
//    }
//
//    //WITHDRAW REST API
//    @PutMapping("/{id}/withdraw")
//    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
//                                              @RequestBody Map<String,Double> request){
//        Double amount =request.get("amount");
//        AccountDto accountDto= accountService.withdraw(id,amount);
//        return ResponseEntity.ok(accountDto);
//    }
//    // GET ALL ACCOUNTS REST API
//    @GetMapping
//    public ResponseEntity<List<AccountDto>> getAllAccount(){
//        List<AccountDto> accounts=accountService.getAllAccounts();
//        return ResponseEntity.ok(accounts);
//    }
//    //DELETE ACCOUNT REST API
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteAccount(@PathVariable Long id){
//        accountService.deleteAccount(id)
//;
//        return ResponseEntity.ok("Account is deleted Successfully!");
//    }
//    //Build transfer REST API
//    @PostMapping("/transfer")
//    public ResponseEntity<String> transferFund(@RequestBody TransferFunddto transferFunddto){
//        accountService.transferFunds(transferFunddto);
//        return ResponseEntity.ok("Transfer Successfull ");
//    }
//
//    //Build transactions REST API
//    @GetMapping("/{id}/transactions")
//    public ResponseEntity<List<TransactionDto>> fetchAccountTransactions(@PathVariable("id") Long accountId) {
//        List<TransactionDto> transactions = accountService.getAccountTransactions(accountId);
//        return ResponseEntity.ok(transactions);
//    }
//
//}