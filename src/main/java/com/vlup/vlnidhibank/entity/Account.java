//package com.vlup.vlnidhibank.entity;
//
//import java.sql.Date;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//@Getter
//@Setter
//@NoArgsConstructor
//@Entity
//@Table(name = "account")
//public class Account {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int accId;
//	
//	@Column(nullable = false)
//	private Date date;
//	
//	@Column(nullable = false, length = 20)
//	private String accountNo;
//	
//	@Column(nullable = false, length = 10)
//	private String ifscCode;
//	
//	@Column(nullable = false, length = 30)
//	private String accHolderName;
//	
//	private enum accType{Saving, Current, Joint};
//	
//	@Column(nullable = false)
//	private Double openingBalance;
//	
//	private enum status{Active, Closed, Frozen, Inactive}
//
//	public int getAccId() {
//		return accId;
//	}
//
//	public void setAccId(int accId) {
//		this.accId = accId;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public String getAccountNo() {
//		return accountNo;
//	}
//
//	public void setAccountNo(String accountNo) {
//		this.accountNo = accountNo;
//	}
//
//	public String getIfscCode() {
//		return ifscCode;
//	}
//
//	public void setIfscCode(String ifscCode) {
//		this.ifscCode = ifscCode;
//	}
//
//	public String getAccHolderName() {
//		return accHolderName;
//	}
//
//	public void setAccHolderName(String accHolderName) {
//		this.accHolderName = accHolderName;
//	}
//
//	public Double getOpeningBalance() {
//		return openingBalance;
//	}
//
//	public void setOpeningBalance(Double openingBalance) {
//		this.openingBalance = openingBalance;
//	};
//	
//	
//
//}
