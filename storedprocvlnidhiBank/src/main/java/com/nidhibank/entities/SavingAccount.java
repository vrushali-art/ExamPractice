package com.nidhibank.entities;



import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.nidhibank.Enums.ModeOfOperation;
import com.nidhibank.Enums.SelectPlan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Entity
public class SavingAccount {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	private String savingAccNumber;
	
	private ModeOfOperation modeOfOperation;
	
	private SelectPlan selectPlan;
		
	private BigDecimal openingFees;
	
	private boolean accountStatus;
	
	private boolean smsSend;
	
	private boolean cardIssue;
	
	private Date savingAccOpeningDate;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "saving_plan_id")
    private SavingPlan savingPlan;
	
}
