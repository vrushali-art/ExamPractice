//package com.vlup.vlnidhibank.entity;
//
//import java.time.LocalDate;
//
//import jakarta.persistence.*;
//import lombok.*;
//import lombok.NoArgsConstructor;
//
//
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "contra_voucher")
//public class ContraVoucher {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "voucher_id")
//    private Long voucherId;
//
//
//    @Column(name = "txn_date", nullable = false)
//    private LocalDate txnDate;
//
//    @Column(name = "cr_ledger", nullable = false)
//    private String crLedger;
//
//    @Column(name = "dr_ledger", nullable = false)
//    private String drLedger;
//
//    @Column(name = "amount", nullable = false)
//    private Double amount;
//
//    @Column(name = "remarks")
//    private String remarks;
//    
//    public ContraVoucher() {
//		super();
//	}
//
//	public ContraVoucher(Long voucherId, LocalDate txnDate, String crLedger, String drLedger, Double amount,
//			String remarks) {
//		super();
//		this.voucherId = voucherId;
//		this.txnDate = txnDate;
//		this.crLedger = crLedger;
//		this.drLedger = drLedger;
//		this.amount = amount;
//		this.remarks = remarks;
//	}
//
//
//
//	public Long getVoucherId() {
//		return voucherId;
//	}
//
//
//
//	public void setVoucherId(Long voucherId) {
//		this.voucherId = voucherId;
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
//	public String getCrLedger() {
//		return crLedger;
//	}
//
//
//
//	public void setCrLedger(String crLedger) {
//		this.crLedger = crLedger;
//	}
//
//
//
//	public String getDrLedger() {
//		return drLedger;
//	}
//
//
//
//	public void setDrLedger(String drLedger) {
//		this.drLedger = drLedger;
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
//	public String getRemarks() {
//		return remarks;
//	}
//
//
//
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	}
//
//
//
//	// Constructor
//    public ContraVoucher(LocalDate txnDate, String crLedger, String drLedger, Double amount, String remarks) {
//        this.txnDate = txnDate;
//        this.crLedger = crLedger;
//        this.drLedger = drLedger;
//        this.amount = amount;
//        this.remarks = remarks;
//    }
//
//  
//}
