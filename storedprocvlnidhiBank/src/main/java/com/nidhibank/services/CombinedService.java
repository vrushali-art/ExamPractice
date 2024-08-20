package com.nidhibank.services;

import java.util.List;

import com.nidhibank.DTO.CombinedDto;

public interface CombinedService {
	CombinedDto createCombinedData(CombinedDto combinedDto);
	
    CombinedDto updateCombinedData(Long memId, Long memDetailId, CombinedDto combinedDto);
    
    void deleteCombinedData(Long memId, Long memDetailId);
    
    CombinedDto getCombinedData(Long memId, Long memDetailId);
    
    List<CombinedDto> getAllCombinedData();
}


