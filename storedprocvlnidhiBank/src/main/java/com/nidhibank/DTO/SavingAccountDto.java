package com.nidhibank.DTO;

import java.math.BigDecimal;
import java.util.Date;

import com.nidhibank.Enums.ModeOfOperation;
import com.nidhibank.Enums.SelectPlan;

public class SavingAccountDto {
	  private Long id;
	    private String savingAccNumber;
		private ModeOfOperation modeOfOperation;
		private SelectPlan selectPlan;
		private BigDecimal openingFees;
		private boolean accountStatus;
		private boolean smsSend;
		private boolean debitCardIssue;
		private String savingAccOpeningDate;
		private MemberDto member;
		//private SavingPlanDto savingPlan;
}
