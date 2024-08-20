package com.nidhibank.entities;
import java.sql.Date;

import com.nidhibank.Enums.ServiceInterval;
import com.nidhibank.Enums.SmsInterval;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "SavingPlans")
public class SavingPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long savingPlanId;

	@Column(name = "effective_Date", length = 100)
	private String effectiveDate;

	@Column(name = "scheme_Creted_By", length = 500)
	private String schemecreatedBy;

	@Column(name = "status", length = 10, nullable = false)
	private boolean status;

	@Column(name = "scheme_code", length = 500)
	private String schemeCode;

	@Column(name = "scheme_name", length = 100 )
	private String schemeName;

	@Column(name = "annual_roi", nullable = false)
	private double annualRoi;

	@Column(name = "min_opening_amount", nullable = false)
	private double minOpeningAmount;

	@Column(name = "monthly_avg_bal", nullable = false)
	private double monthlyAvgBal;

	@Column(name = "lock_in_balance", nullable = false)
	private double lockInBalance;

	@Column(name = "sms_charges", nullable = false)
	private double smsCharges;

	@Enumerated(EnumType.STRING)
	private SmsInterval smsInterval;

	@Column(name = "free_ifsc_collection", nullable = false)
	private int freeIfscCollection;

	@Column(name = "free_transfers", nullable = false)
	private int freeTransfers;

	@Column(name = "single_txn_limit", nullable = false)
	private double singleTxnLimit;

	@Column(name = "daily_max_limit", nullable = false)
	private double dailyMaxLimit;

	@Column(name = "weekly_max_limit", nullable = false)
	private double weeklyMaxLimit;

	@Column(name = "monthly_max_limit", nullable = false)
	private double monthlyMaxLimit;

	@Column(name = "service_charges", nullable = false)
	private double serviceCharges;

	@Enumerated(EnumType.STRING)
	private ServiceInterval serviceInterval;

	@Column(name = "card_charge", nullable = false)
	private double cardCharge;

	@Column(name = "card_limit_monthly", nullable = false)
	private double cardLimitMonthly;

	@Column(name = "card_total_limit_yearly", nullable = false)
	private double cardTotalLimitYearly;
}
