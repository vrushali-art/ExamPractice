package com.vlup.vlnidhibank.entity;

import java.math.BigDecimal;
import java.sql.Date;

import com.vlup.vlnidhibank.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ShareDetails")
public class ShareDetail {

	@Id
	private String shareId;

	private int installmentNo;

	@Column(length = 50)
	private String shareAllotedFrom;

	private int previousShareBalance;
	private int previousNoOfShare;

	@Column(length = 100)
	private String folioNo;

	@Column(length = 100)
	private String dno;

	private BigDecimal unallotedShare;
	private Date transferDate;
	private BigDecimal transferAmount;

	@Column(length = 20, unique = true, nullable = false)
	private String shareNumber;

	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal shareValue;

	@Column(nullable = false)
	private int totalShares;

	@Column(nullable = false)
	private Date issueDate;

	private BigDecimal fees;

	private Date maturityDate;

	@Column(length = 20)
	private String paymentBy;

	@Column(precision = 10, scale = 2, columnDefinition = "decimal(10, 2) default '0.00'")
	private BigDecimal dividendsEarned;

	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdAt;

	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date updatedAt;

	@Lob
	private String remarks;

	@Enumerated(EnumType.STRING)
	private Status status;

	private BigDecimal memberfees;
	
	private String chequeNo;
	
	private Date chequeDate;
	
	

	@OneToOne(mappedBy="shares")
    private MemberEntity member;
	
}
