//package com.nidhibank.controllers;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.nidhibank.DTO.AccountAdvisorMappingDto;
//import com.nidhibank.DTO.AccountDto;
//import com.nidhibank.services.AccountAdvisorMappingService;
//
//@RestController
//@RequestMapping("/storedProc/accounts")
//public class AccountAdvisorMappingController {
//
//    private final AccountAdvisorMappingService accountAdvisorMappingService;
//
//    @Autowired
//    public AccountAdvisorMappingController(AccountAdvisorMappingService accountAdvisorMappingService) {
//        this.accountAdvisorMappingService = accountAdvisorMappingService;
//    }
//
//    @GetMapping("/count")
//    public long getAccountCount() {
//        return accountAdvisorMappingService.getAccountCount();
//    }
//    
//    @GetMapping("/balance/{accountHolderName}")
//    public Double getAccountBalance(@PathVariable String accountHolderName) {
//        return accountAdvisorMappingService.getAccountBalanceByHolder(accountHolderName);
//    }
//    
//    @GetMapping("/accountadvisor/{id}")
//    public Map<String, Object> fetchAccountAdvisorById(@PathVariable String id)
//    {
//    	return accountAdvisorMappingService.fetchAccountAdvisorById(id);
//    }
//    
// /*   @GetMapping("/{accountId}")
//    public Map<String,Object> getAccountAdvisor(String inAccountId)
//    {
//    	return accountAdvisorMappingService.getAccountAdvisor(inAccountId);
//    }*/
//    
//    @GetMapping("/{accountId}")
//    public ResponseEntity<List<AccountAdvisorMappingDto>> getAccountAdvisor(@PathVariable String accountId) {
//        List<AccountAdvisorMappingDto> accountDto = accountAdvisorMappingService.getAccountAdvisor(accountId);
//        return ResponseEntity.ok(accountDto);
//    }
//   
//}