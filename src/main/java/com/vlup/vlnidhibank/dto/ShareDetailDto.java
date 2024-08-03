package com.vlup.vlnidhibank.dto;

import java.math.BigDecimal;
import java.sql.Date;
import com.vlup.vlnidhibank.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShareDetailDto {

	private String shareId;
    private int installmentNo;
    private String shareAllotedFrom;
    private int previousShareBalance;
    private int previousNoOfShare;
    private String folioNo;
    private String dno;
    private BigDecimal unallotedShare;
    private Date transferDate;
    private BigDecimal transferAmount;
    private String shareNumber;
    private BigDecimal shareValue;
    private int totalShares;
    private Date issueDate;
    private BigDecimal fees;
    private Date maturityDate;
    private String paymentBy;
    private BigDecimal dividendsEarned;
    private Date createdAt;
    private Date updatedAt;
    private String remarks;
    private Status status;
    private BigDecimal memberFees;
	public String getShareId() {
		return shareId;
	}
	public void setShareId(String shareId) {
		this.shareId = shareId;
	}
	public int getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}
	public String getShareAllotedFrom() {
		return shareAllotedFrom;
	}
	public void setShareAllotedFrom(String shareAllotedFrom) {
		this.shareAllotedFrom = shareAllotedFrom;
	}
	public int getPreviousShareBalance() {
		return previousShareBalance;
	}
	public void setPreviousShareBalance(int previousShareBalance) {
		this.previousShareBalance = previousShareBalance;
	}
	public int getPreviousNoOfShare() {
		return previousNoOfShare;
	}
	public void setPreviousNoOfShare(int previousNoOfShare) {
		this.previousNoOfShare = previousNoOfShare;
	}
	public String getFolioNo() {
		return folioNo;
	}
	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public BigDecimal getUnallotedShare() {
		return unallotedShare;
	}
	public void setUnallotedShare(BigDecimal unallotedShare) {
		this.unallotedShare = unallotedShare;
	}
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public BigDecimal getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(BigDecimal transferAmount) {
		this.transferAmount = transferAmount;
	}
	public String getShareNumber() {
		return shareNumber;
	}
	public void setShareNumber(String shareNumber) {
		this.shareNumber = shareNumber;
	}
	public BigDecimal getShareValue() {
		return shareValue;
	}
	public void setShareValue(BigDecimal shareValue) {
		this.shareValue = shareValue;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public BigDecimal getFees() {
		return fees;
	}
	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public String getPaymentBy() {
		return paymentBy;
	}
	public void setPaymentBy(String paymentBy) {
		this.paymentBy = paymentBy;
	}
	public BigDecimal getDividendsEarned() {
		return dividendsEarned;
	}
	public void setDividendsEarned(BigDecimal dividendsEarned) {
		this.dividendsEarned = dividendsEarned;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public BigDecimal getMemberFees() {
		return memberFees;
	}
	public void setMemberFees(BigDecimal memberFees) {
		this.memberFees = memberFees;
	}
}
