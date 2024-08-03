//package com.vlup.vlnidhibank.entity;
//
//import java.time.LocalDate;
//
//import jakarta.persistence.*;
//
////import javax.persistence.*;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@Entity
//@Table(name = "payment")  
//public class Payment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "receipt_no")
//    private Long receiptNo;
//
//    @Column(name = "branch", nullable = false)
//    private String branch;
//
//    @Column(name = "txn_date", nullable = false)
//    private LocalDate txnDate;
//
//    @Column(name = "ledger", nullable = false)
//    private String ledger;
//
//    @Column(name = "type", nullable = false)
//    private String type;
//
//    @Column(name = "transaction_mode", nullable = false)
//    private String transactionMode;
//
//    @Column(name = "amount", nullable = false)
//    private Double amount;
//
//    @Column(name = "narration")
//    private String narration;
//
//    
//    
//    public Long getReceiptNo() {
//		return receiptNo;
//	}
//
//
//
//	public void setReceiptNo(Long receiptNo) {
//		this.receiptNo = receiptNo;
//	}
//
//
//
//	public String getBranch() {
//		return branch;
//	}
//
//
//
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
//
//
//
//	public LocalDate getTxnDate() {
//		return txnDate;
//	}
//
//
//
//	public void setTxnDate(LocalDate txnDate) {
//		this.txnDate = txnDate;
//	}
//
//
//
//	public String getLedger() {
//		return ledger;
//	}
//
//
//
//	public void setLedger(String ledger) {
//		this.ledger = ledger;
//	}
//
//
//
//	public String getType() {
//		return type;
//	}
//
//
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//
//
//	public String getTransactionMode() {
//		return transactionMode;
//	}
//
//
//
//	public void setTransactionMode(String transactionMode) {
//		this.transactionMode = transactionMode;
//	}
//
//
//
//	public Double getAmount() {
//		return amount;
//	}
//
//
//
//	public void setAmount(Double amount) {
//		this.amount = amount;
//	}
//
//
//
//	public String getNarration() {
//		return narration;
//	}
//
//
//
//	public void setNarration(String narration) {
//		this.narration = narration;
//	}
//
//
//
//	// Constructor
//    public Payment(String branch, LocalDate txnDate, String ledger, String type, String transactionMode, Double amount, String narration) {
//        this.branch = branch;
//        this.txnDate = txnDate;
//        this.ledger = ledger;
//        this.type = type;
//        this.transactionMode = transactionMode;
//        this.amount = amount;
//        this.narration = narration;
//    }
//}
