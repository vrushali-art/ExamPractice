package com.nidhibank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhibank.DTO.CombinedDto;
import com.nidhibank.DTO.SavingPlanDto;
import com.nidhibank.services.CombinedService;
import com.nidhibank.services.SavingPlanService;


@RestController
@RequestMapping("api/combined")
public class CombinedController {

    @Autowired
    private CombinedService combinedService;

   
    
    @PostMapping("/")
    public ResponseEntity<CombinedDto> createSavingPlan(@RequestBody CombinedDto combinedDto) {
        CombinedDto createdCombined = combinedService.createCombinedData(combinedDto);
        return new ResponseEntity<>(createdCombined, HttpStatus.CREATED);
    }


 // Get Combined Data by Member ID and MemberPersonalDetail ID
    @GetMapping("/{memId}/{memDetailId}")
    public ResponseEntity<CombinedDto> getCombinedData(
            @PathVariable Long memId,
            @PathVariable Long memDetailId) {
        CombinedDto combinedData = combinedService.getCombinedData(memId, memDetailId);
        return ResponseEntity.ok(combinedData);
    }


    
}
