package com.nidhibank.implService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhibank.DTO.SavingPlanDto;
import com.nidhibank.entities.SavingPlan;
import com.nidhibank.exceptions.ResourceNotFoundException;
import com.nidhibank.repositories.SavingPlanRepository;
import com.nidhibank.services.SavingPlanService;

@Service
public class SavingPlanServiceImpl implements SavingPlanService {

	@Autowired
	private SavingPlanRepository savingPlanRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SavingPlanDto createSavingPlan(SavingPlanDto savingPlanDto) {
		SavingPlan savingPlan = modelMapper.map(savingPlanDto, SavingPlan.class);
		SavingPlan savedSavingPlan = savingPlanRepository.save(savingPlan);
		return modelMapper.map(savedSavingPlan, SavingPlanDto.class);
	}

	@Override
	public SavingPlanDto getSavingPlanById(Long savingPlanId) {
		SavingPlan savingPlan = savingPlanRepository.findById(savingPlanId)
				.orElseThrow(() -> new ResourceNotFoundException("SavingPlan", "id", savingPlanId));
		return modelMapper.map(savingPlan, SavingPlanDto.class);
	}

	@Override
	public List<SavingPlanDto> getAllSavingPlans() {
		List<SavingPlan> savingPlans = savingPlanRepository.findAll();
		return savingPlans.stream().map(savingPlan -> modelMapper.map(savingPlan, SavingPlanDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public void deleteSavingPlan(Long savingPlanId) {
		SavingPlan savingPlan = savingPlanRepository.findById(savingPlanId)
				.orElseThrow(() -> new ResourceNotFoundException("SavingPlan", "id", savingPlanId));
		savingPlanRepository.delete(savingPlan);
	}
	
	

	@Override
	public SavingPlanDto updateSavingPlan(Long savingPlanId, SavingPlanDto savingPlanDto) {
	    SavingPlan existingSavingPlan = savingPlanRepository.findById(savingPlanId)
	            .orElseThrow(() -> new ResourceNotFoundException("SavingPlan", "id", savingPlanId));
	    
	    // Update the entity with new values from DTO only if they are not null or have a default value
	    if (savingPlanDto.getEffectiveDate() != null) {
	        existingSavingPlan.setEffectiveDate(savingPlanDto.getEffectiveDate());
	    }
	    if (savingPlanDto.getSchemecreatedBy() != null) {
	        existingSavingPlan.setSchemecreatedBy(savingPlanDto.getSchemecreatedBy());
	    }
	    existingSavingPlan.setStatus(savingPlanDto.isStatus()); // Assuming false is a valid update value
	    if (savingPlanDto.getSchemeCode() != null) {
	        existingSavingPlan.setSchemeCode(savingPlanDto.getSchemeCode());
	    }
	    if (savingPlanDto.getSchemeName() != null) {
	        existingSavingPlan.setSchemeName(savingPlanDto.getSchemeName());
	    }
	    if (savingPlanDto.getAnnualRoi() != 0.0) {
	        existingSavingPlan.setAnnualRoi(savingPlanDto.getAnnualRoi());
	    }
	    if (savingPlanDto.getMinOpeningAmount() != 0.0) {
	        existingSavingPlan.setMinOpeningAmount(savingPlanDto.getMinOpeningAmount());
	    }
	    if (savingPlanDto.getMonthlyAvgBal() != 0.0) {
	        existingSavingPlan.setMonthlyAvgBal(savingPlanDto.getMonthlyAvgBal());
	    }
	    if (savingPlanDto.getLockInBalance() != 0.0) {
	        existingSavingPlan.setLockInBalance(savingPlanDto.getLockInBalance());
	    }
	    if (savingPlanDto.getSmsCharges() != 0.0) {
	        existingSavingPlan.setSmsCharges(savingPlanDto.getSmsCharges());
	    }
	    if (savingPlanDto.getSmsInterval() != null) {
	        existingSavingPlan.setSmsInterval(savingPlanDto.getSmsInterval());
	    }
	    if (savingPlanDto.getFreeIfscCollection() != 0) {
	        existingSavingPlan.setFreeIfscCollection(savingPlanDto.getFreeIfscCollection());
	    }
	    if (savingPlanDto.getFreeTransfers() != 0) {
	        existingSavingPlan.setFreeTransfers(savingPlanDto.getFreeTransfers());
	    }
	    if (savingPlanDto.getSingleTxnLimit() != 0.0) {
	        existingSavingPlan.setSingleTxnLimit(savingPlanDto.getSingleTxnLimit());
	    }
	    if (savingPlanDto.getDailyMaxLimit() != 0.0) {
	        existingSavingPlan.setDailyMaxLimit(savingPlanDto.getDailyMaxLimit());
	    }
	    if (savingPlanDto.getWeeklyMaxLimit() != 0.0) {
	        existingSavingPlan.setWeeklyMaxLimit(savingPlanDto.getWeeklyMaxLimit());
	    }
	    if (savingPlanDto.getMonthlyMaxLimit() != 0.0) {
	        existingSavingPlan.setMonthlyMaxLimit(savingPlanDto.getMonthlyMaxLimit());
	    }
	    if (savingPlanDto.getServiceCharges() != 0.0) {
	        existingSavingPlan.setServiceCharges(savingPlanDto.getServiceCharges());
	    }
	    if (savingPlanDto.getServiceInterval() != null) {
	        existingSavingPlan.setServiceInterval(savingPlanDto.getServiceInterval());
	    }
	    if (savingPlanDto.getCardCharge() != 0.0) {
	        existingSavingPlan.setCardCharge(savingPlanDto.getCardCharge());
	    }
	    if (savingPlanDto.getCardLimitMonthly() != 0.0) {
	        existingSavingPlan.setCardLimitMonthly(savingPlanDto.getCardLimitMonthly());
	    }
	    if (savingPlanDto.getCardTotalLimitYearly() != 0.0) {
	        existingSavingPlan.setCardTotalLimitYearly(savingPlanDto.getCardTotalLimitYearly());
	    }

	    // Save the updated entity
	    SavingPlan updatedSavingPlan = savingPlanRepository.save(existingSavingPlan);
	    return modelMapper.map(updatedSavingPlan, SavingPlanDto.class);
	}

	
}
