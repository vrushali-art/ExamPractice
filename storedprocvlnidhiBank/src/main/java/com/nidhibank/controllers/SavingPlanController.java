package com.nidhibank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhibank.DTO.SavingPlanDto;
import com.nidhibank.entities.Apiresponse;
import com.nidhibank.services.SavingPlanService;

@RestController
@RequestMapping("api/savingplan")
public class SavingPlanController {

    @Autowired
    private SavingPlanService savingPlanService;

    @PostMapping("/")
    public ResponseEntity<SavingPlanDto> createSavingPlan(@RequestBody SavingPlanDto savingPlanDto) {
        SavingPlanDto createdSavingPlan = savingPlanService.createSavingPlan(savingPlanDto);
        return new ResponseEntity<>(createdSavingPlan, HttpStatus.CREATED);
    }

    @PutMapping("/{savingPlanId}")
    public ResponseEntity<SavingPlanDto> updateSavingPlan(@PathVariable Long savingPlanId, @RequestBody SavingPlanDto savingPlanDto ) {
        SavingPlanDto updatedSavingPlan = savingPlanService.updateSavingPlan(savingPlanId, savingPlanDto);
        return ResponseEntity.ok(updatedSavingPlan);
    }

    @DeleteMapping("/{savingPlanId}")
    public ResponseEntity<Apiresponse> deleteSavingPlan(@PathVariable Long savingPlanId) {
        savingPlanService.deleteSavingPlan(savingPlanId);
        return new ResponseEntity<>(new Apiresponse("Saving plan deleted successfully", true), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<SavingPlanDto>> getAllSavingPlans() {
        List<SavingPlanDto> savingPlans = savingPlanService.getAllSavingPlans();
        return ResponseEntity.ok(savingPlans);
    }

    @GetMapping("/{savingPlanId}")
    public ResponseEntity<SavingPlanDto> getSavingPlanById(@PathVariable Long savingPlanId) {
        SavingPlanDto savingPlan = savingPlanService.getSavingPlanById(savingPlanId);
        return ResponseEntity.ok(savingPlan);
    }
}
