package com.nidhibank.services;

import java.util.List;

import com.nidhibank.DTO.SavingPlanDto;

public interface SavingPlanService {

	// Create a new SavingPlan
	SavingPlanDto createSavingPlan(SavingPlanDto savingPlanDto);

	// Retrieve a SavingPlan by its ID
	SavingPlanDto getSavingPlanById(Long savingPlanId);

	// Retrieve all SavingPlans
	List<SavingPlanDto> getAllSavingPlans();

	// Update an existing SavingPlan
	
	SavingPlanDto updateSavingPlan(Long savingPlanId, SavingPlanDto savingPlanDto);
	
	// Delete a SavingPlan by its ID
	void deleteSavingPlan(Long savingPlanId);

}
