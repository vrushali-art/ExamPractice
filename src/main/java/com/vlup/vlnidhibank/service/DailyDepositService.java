package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.DailyDepositDTO;


public interface DailyDepositService {
	
    DailyDepositDTO createDailyDeposit(DailyDepositDTO dailyDepositDTO);
    List<DailyDepositDTO> getAllDailyDeposits();
}
