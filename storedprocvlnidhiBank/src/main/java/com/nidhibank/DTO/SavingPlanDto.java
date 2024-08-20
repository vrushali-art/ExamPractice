package com.nidhibank.DTO;

import java.sql.Date;

import com.nidhibank.Enums.ServiceInterval;
import com.nidhibank.Enums.SmsInterval;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SavingPlanDto {

    private Long savingPlanId;
    private String effectiveDate;
    private String schemecreatedBy;
    private boolean status;
    private String schemeCode;
    private String schemeName;
    private double annualRoi;
    private double minOpeningAmount;
    private double monthlyAvgBal;
    private double lockInBalance;
    private double smsCharges;
    private SmsInterval smsInterval;
    private int freeIfscCollection;
    private int freeTransfers;
    private double singleTxnLimit;
    private double dailyMaxLimit;
    private double weeklyMaxLimit;
    private double monthlyMaxLimit;
    private double serviceCharges;
    private ServiceInterval serviceInterval;
    private double cardCharge;
    private double cardLimitMonthly;
    private double cardTotalLimitYearly;
}
