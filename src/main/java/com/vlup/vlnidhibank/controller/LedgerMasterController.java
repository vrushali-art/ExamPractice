//package com.vlup.vlnidhibank.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.vlup.vlnidhibank.entity.LedgerMaster;
//import com.vlup.vlnidhibank.service.LedgerMasterService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/ledger-masters")
//public class LedgerMasterController {
//
//    @Autowired
//    private LedgerMasterService ledgerMasterService;
//
//    @PostMapping
//    public ResponseEntity<String> createLedgerMaster(@RequestBody LedgerMaster ledgerMaster) {
//        LedgerMaster createdLedgerMaster = ledgerMasterService.createLedgerMaster(ledgerMaster);
//        
//        return ResponseEntity.status(HttpStatus.CREATED).body("Ledger Created successfully !!!");
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<LedgerMaster> getLedgerMasterById(@PathVariable Integer id) {
//        LedgerMaster ledgerMaster = ledgerMasterService.getLedgerMasterById(id);
//        return ResponseEntity.ok(ledgerMaster);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<LedgerMaster>> getAllLedgerMasters() {
//        List<LedgerMaster> ledgerMasters = ledgerMasterService.getAllLedgerMasters();
//        return ResponseEntity.ok(ledgerMasters);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<LedgerMaster> updateLedgerMaster(@PathVariable Integer id, @RequestBody LedgerMaster ledgerMaster) {
//        LedgerMaster updatedLedgerMaster = ledgerMasterService.updateLedgerMaster(id, ledgerMaster);
//        return ResponseEntity.ok(updatedLedgerMaster);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteLedgerMaster(@PathVariable Integer id) {
//        ledgerMasterService.deleteLedgerMaster(id);
//        return ResponseEntity.noContent().build();
//    }
//}
//
