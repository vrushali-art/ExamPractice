//package com.vlup.vlnidhibank.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name="accounts")
//@Entity
//public class SBAccount {
//    public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getAccountHolderName() {
//		return accountHolderName;
//	}
//
//	public void setAccountHolderName(String accountHolderName) {
//		this.accountHolderName = accountHolderName;
//	}
//
//	public String getOpeningDate() {
//		return openingDate;
//	}
//
//	public void setOpeningDate(String openingDate) {
//		this.openingDate = openingDate;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public double getOpeningAmount() {
//		return openingAmount;
//	}
//
//	public void setOpeningAmount(double openingAmount) {
//		this.openingAmount = openingAmount;
//	}
//
//	public String getAdvisor() {
//		return advisor;
//	}
//
//	public void setAdvisor(String advisor) {
//		this.advisor = advisor;
//	}
//
//	public double getOpeningfees() {
//		return openingfees;
//	}
//
//	public void setOpeningfees(double openingfees) {
//		this.openingfees = openingfees;
//	}
//
//	public SBAccount(Long id2, String accountHolderName2, String openingDate2, double balance2,
//			double openingAmount2, String advisor2, double openingfees2) {
//		this.id=id2;
//		this.accountHolderName=accountHolderName2;
//		this.openingDate=openingDate2;
//		this.balance=balance2;
//		this.openingAmount=openingAmount2;
//		this.advisor=advisor2;
//		this.openingfees=openingfees2;
//		
//		// TODO Auto-generated constructor stub
//	}
//
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "account_holder_name")
//    private String accountHolderName;
//    
//    @Column(name="opneningdate")
//    private String openingDate;
//    
//    @Column(name="balance")
//    private double balance;
//    
//    @Column(name="openingamount")
//    private double openingAmount;
//    
//    @Column(name="advisor")
//    private String advisor;
//    
//    @Column(name="openingfees")
//    private double openingfees;
//}