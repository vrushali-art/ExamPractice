//package com.vlup.vlnidhibank.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//@Setter
//@Getter
//@AllArgsConstructor
//@Entity
//@Table(name="transactions")
//
//public class Transactions {
//    public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public Long getAccountId() {
//		return accountId;
//	}
//	public void setAccountId(Long accountId) {
//		this.accountId = accountId;
//	}
//	public double getAmount() {
//		return amount;
//	}
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//	public String getTransactionType() {
//		return TransactionType;
//	}
//	public void setTransactionType(String transactionType) {
//		TransactionType = transactionType;
//	}
//	public LocalDateTime getTimestamp() {
//		return timestamp;
//	}
//	public void setTimestamp(LocalDateTime timestamp) {
//		this.timestamp = timestamp;
//	}
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Long id;
//    private Long accountId;
//    private double amount;
//    private String TransactionType; //DEPOSIT ,WITHDRAW, TRANSFER
//    private LocalDateTime timestamp;
//
//}