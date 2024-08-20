package com.nidhibank.DTO;



import java.math.BigDecimal;
import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ShareTransferDto {

	private String memberName;
    private Date registrationDate;
    private int previousShareBalance; // (previous Balance & share balance are the same fields)
    private int previousNoOfShare;
    private String toCode; // Previously memberCode
    private String fromCode; // Corresponding to fromCode
    private Date transferDate;
    private BigDecimal shareValue;
    private BigDecimal transferAmount; // (take as share amount)
    private long noOfShare;
    private String folioNo;
    private String dnoFrom;
    private String dnoTo; // (take as dno from & dno To)
    private String paymentBy;

    // Constructor matching the JPQL query selection
    public ShareTransferDto(String memberName, Date registrationDate, int previousShareBalance, int previousNoOfShare,
                            String memberCode, Date transferDate, BigDecimal shareValue, BigDecimal transferAmount,
                            long noOfShare, String folioNo, String dno, String paymentBy) {
        this.memberName = memberName;
        this.registrationDate = registrationDate;
        this.previousShareBalance = previousShareBalance;
        this.previousNoOfShare = previousNoOfShare;
        this.transferDate = transferDate;
        this.shareValue = shareValue;
        this.transferAmount = transferAmount;
        this.noOfShare = noOfShare;
        this.folioNo = folioNo;
        this.paymentBy = paymentBy;

        // Split memberCode into toCode and fromCode if applicable
        if (memberCode != null && !memberCode.isEmpty()) {
            String[] parts = memberCode.split("-");
            if (parts.length == 2) {
                this.toCode = parts[0];
                this.fromCode = parts[1];
            } else {
                // Handle case where memberCode format is unexpected
                this.toCode = memberCode;
                this.fromCode = memberCode;
            }
        }

        // Split dno into dnoFrom and dnoTo
        if (dno != null && !dno.isEmpty()) {
            String[] parts = dno.split("-");
            if (parts.length == 2) {
                this.dnoFrom = parts[0];
                this.dnoTo = parts[1];
            } else {
                // Handle case where dno format is unexpected
                this.dnoFrom = dno;
                this.dnoTo = dno;
            }
        }
    }
}

