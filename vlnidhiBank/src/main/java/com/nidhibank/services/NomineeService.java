package com.nidhibank.services;

import java.util.List;

import com.nidhibank.DTO.NomineeDto;

public interface NomineeService {
	List<NomineeDto> getAllNominee(); 
	NomineeDto createNominee(NomineeDto nomineeDto);
	NomineeDto updateNominee(NomineeDto nomineeDto, Integer nomineeid);
	NomineeDto getNomineeById(Integer id);
	
	void deleteNominee(Integer id);

}
