//package com.vlup.vlnidhibank.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.time.LocalDate;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@Entity
//@Table(name = "journal_voucher")
//public class JournalVoucher {
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
//    @Column(name = "credit_ledger", nullable = false)
//    private String creditLedger;
//
//    @Column(name = "debit_ledger", nullable = false)
//    private String debitLedger;
//
//    @Column(name = "amount", nullable = false)
//    private Double amount;
//
//    @Column(name = "remarks")
//    private String remarks;
//
//    
//    
//    
//    public Long getReceiptNo() {
//		return receiptNo;
//	}
//
//
//
//
//	public void setReceiptNo(Long receiptNo) {
//		this.receiptNo = receiptNo;
//	}
//
//
//
//
//	public String getBranch() {
//		return branch;
//	}
//
//
//
//
//	public void setBranch(String branch) {
//		this.branch = branch;
//	}
//
//
//
//
//	public LocalDate getTxnDate() {
//		return txnDate;
//	}
//
//
//
//
//	public void setTxnDate(LocalDate txnDate) {
//		this.txnDate = txnDate;
//	}
//
//
//
//
//	public String getCreditLedger() {
//		return creditLedger;
//	}
//
//
//
//
//	public void setCreditLedger(String creditLedger) {
//		this.creditLedger = creditLedger;
//	}
//
//
//
//
//	public String getDebitLedger() {
//		return debitLedger;
//	}
//
//
//
//
//	public void setDebitLedger(String debitLedger) {
//		this.debitLedger = debitLedger;
//	}
//
//
//
//
//	public Double getAmount() {
//		return amount;
//	}
//
//
//
//
//	public void setAmount(Double amount) {
//		this.amount = amount;
//	}
//
//
//
//
//	public String getRemarks() {
//		return remarks;
//	}
//
//
//
//
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	}
//
//
//
//
//	// Constructor
//    public JournalVoucher(String branch, LocalDate txnDate, String creditLedger, String debitLedger, Double amount, String remarks) {
//        this.branch = branch;
//        this.txnDate = txnDate;
//        this.creditLedger = creditLedger;
//        this.debitLedger = debitLedger;
//        this.amount = amount;
//        this.remarks = remarks;
//    }
//}
