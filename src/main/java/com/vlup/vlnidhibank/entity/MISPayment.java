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
//@Table(name = "mis_payment")
//public class MISPayment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "payment_id")
//    private Long paymentId;
//
//    @Column(name = "policy_no", nullable = false)
//    private String policyNo;
//
//    @Column(name = "applicant_name", nullable = false)
//    private String applicantName;
//
//    @Column(name = "policy_date", nullable = false)
//    private LocalDate policyDate;
//
//    @Column(name = "policy_amt", nullable = false)
//    private Double policyAmt;
//
//    @Column(name = "interest_amount", nullable = false)
//    private Double interestAmount;
//
//    @Column(name = "scheme_name", nullable = false)
//    private String schemeName;
//
//    @Column(name = "policy_branch", nullable = false)
//    private String policyBranch;
//
//    @Column(name = "member_code", nullable = false)
//    private String memberCode;
//
//    @Column(name = "pay_amount", nullable = false)
//    private Double payAmount;
//
//    @Column(name = "pay_branch", nullable = false)
//    private String payBranch;
//
//    @Column(name = "pay_date", nullable = false)
//    private LocalDate payDate;
//
//    @Column(name = "payment_by", nullable = false)
//    private String paymentBy;
//
//    
//    
//     
//    public Long getPaymentId() {
//		return paymentId;
//	}
//
//
//
//
//	public void setPaymentId(Long paymentId) {
//		this.paymentId = paymentId;
//	}
//
//
//
//
//	public String getPolicyNo() {
//		return policyNo;
//	}
//
//
//
//
//	public void setPolicyNo(String policyNo) {
//		this.policyNo = policyNo;
//	}
//
//
//
//
//	public String getApplicantName() {
//		return applicantName;
//	}
//
//
//
//
//	public void setApplicantName(String applicantName) {
//		this.applicantName = applicantName;
//	}
//
//
//
//
//	public LocalDate getPolicyDate() {
//		return policyDate;
//	}
//
//
//
//
//	public void setPolicyDate(LocalDate policyDate) {
//		this.policyDate = policyDate;
//	}
//
//
//
//
//	public Double getPolicyAmt() {
//		return policyAmt;
//	}
//
//
//
//
//	public void setPolicyAmt(Double policyAmt) {
//		this.policyAmt = policyAmt;
//	}
//
//
//
//
//	public Double getInterestAmount() {
//		return interestAmount;
//	}
//
//
//
//
//	public void setInterestAmount(Double interestAmount) {
//		this.interestAmount = interestAmount;
//	}
//
//
//
//
//	public String getSchemeName() {
//		return schemeName;
//	}
//
//
//
//
//	public void setSchemeName(String schemeName) {
//		this.schemeName = schemeName;
//	}
//
//
//
//
//	public String getPolicyBranch() {
//		return policyBranch;
//	}
//
//
//
//
//	public void setPolicyBranch(String policyBranch) {
//		this.policyBranch = policyBranch;
//	}
//
//
//
//
//	public String getMemberCode() {
//		return memberCode;
//	}
//
//
//
//
//	public void setMemberCode(String memberCode) {
//		this.memberCode = memberCode;
//	}
//
//
//
//
//	public Double getPayAmount() {
//		return payAmount;
//	}
//
//
//
//
//	public void setPayAmount(Double payAmount) {
//		this.payAmount = payAmount;
//	}
//
//
//
//
//	public String getPayBranch() {
//		return payBranch;
//	}
//
//
//
//
//	public void setPayBranch(String payBranch) {
//		this.payBranch = payBranch;
//	}
//
//
//
//
//	public LocalDate getPayDate() {
//		return payDate;
//	}
//
//
//
//
//	public void setPayDate(LocalDate payDate) {
//		this.payDate = payDate;
//	}
//
//
//
//
//	public String getPaymentBy() {
//		return paymentBy;
//	}
//
//
//
//
//	public void setPaymentBy(String paymentBy) {
//		this.paymentBy = paymentBy;
//	}
//	
//
//	public MISPayment() {
//		super();
//	}
//
//	// Constructor
//    public MISPayment(String policyNo, String applicantName, LocalDate policyDate, Double policyAmt, Double interestAmount, String schemeName, String policyBranch, String memberCode, Double payAmount, String payBranch, LocalDate payDate, String paymentBy) {
//        this.policyNo = policyNo;
//        this.applicantName = applicantName;
//        this.policyDate = policyDate;
//        this.policyAmt = policyAmt;
//        this.interestAmount = interestAmount;
//        this.schemeName = schemeName;
//        this.policyBranch = policyBranch;
//        this.memberCode = memberCode;
//        this.payAmount = payAmount;
//        this.payBranch = payBranch;
//        this.payDate = payDate;
//        this.paymentBy = paymentBy;
//    }
//}
