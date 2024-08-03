//package com.vlup.vlnidhibank.controller;
//
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.vlup.vlnidhibank.dto.DailyDepositDTO;
//import com.vlup.vlnidhibank.service.DailyDepositService;
//
//
//@RestController
//@RequestMapping("/api/daily-deposit")
//public class DailyDepositController {
//
//    @Autowired
//    private DailyDepositService dailyDepositService;
//
//    @PostMapping
//    public ResponseEntity<String> createDailyDeposit( @RequestBody DailyDepositDTO dailyDepositDTO) {
//        dailyDepositService.createDailyDeposit(dailyDepositDTO);
//        return new ResponseEntity<>("Created successfully", HttpStatus.CREATED);
//    }
//    
//    @GetMapping
//    public ResponseEntity<List<DailyDepositDTO>> getAllDailyDeposits() {
//        List<DailyDepositDTO> dailyDeposits = dailyDepositService.getAllDailyDeposits();
//        return new ResponseEntity<>(dailyDeposits, HttpStatus.OK);
//    }
//}
