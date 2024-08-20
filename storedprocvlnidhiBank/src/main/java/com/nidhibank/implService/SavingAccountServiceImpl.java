package com.nidhibank.implService;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.transaction.Transactional;

@Service
public class SavingAccountServiceImpl {
	
	

	    @Autowired
	    private EntityManager entityManager;

	    @Transactional
	    public void createSavingAccount(
	        String openingDate,
	        String memberCode,
	        String branchCode,
	        String nomineeId,
	        String planId,
	        BigDecimal openingAmount,
	        String advisorCode,
	        String paymentMethod,
	        BigDecimal openingFees,
	        String remarks,
	        Boolean accountStatus,
	        Boolean smsSend,
	        Boolean debitCardIssue
	    ) {
	        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("create_saving_account");

	        query.registerStoredProcedureParameter("p_opening_date", Date.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_member_code", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_branch_code", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_nominee_id", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_plan_id", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_opening_amount", BigDecimal.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_advisor_code", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_payment_method", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_opening_fees", BigDecimal.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_remarks", String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_account_status", Boolean.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_sms_send", Boolean.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter("p_debit_card_issue", Boolean.class, ParameterMode.IN);

	        query.setParameter("p_opening_date", openingDate);
	        query.setParameter("p_member_code", memberCode);
	        query.setParameter("p_branch_code", branchCode);
	        query.setParameter("p_nominee_id", nomineeId);
	        query.setParameter("p_plan_id", planId);
	        query.setParameter("p_opening_amount", openingAmount);
	        query.setParameter("p_advisor_code", advisorCode);
	        query.setParameter("p_payment_method", paymentMethod);
	        query.setParameter("p_opening_fees", openingFees);
	        query.setParameter("p_remarks", remarks);
	        query.setParameter("p_account_status", accountStatus);
	        query.setParameter("p_sms_send", smsSend);
	        query.setParameter("p_debit_card_issue", debitCardIssue);

	        query.execute();
	    }
	}


