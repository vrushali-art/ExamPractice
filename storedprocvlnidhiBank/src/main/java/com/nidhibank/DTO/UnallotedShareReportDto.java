package com.nidhibank.DTO;



import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;





@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnallotedShareReportDto {
	
	  private String memberCode;
	  private String memberName;
	  private Date issueDate;
	  private long noOfShare;
	  private BigDecimal shareValue;
	  private String folioNo; 
	  private String shareAllotedFromfrom;
	  private String shareAllotedFromto;
	  private String unallotedShareFrom;
	  private String unallotedShareTo;
	  
	  
	public UnallotedShareReportDto(String memberCode, String memberName, Date issueDate, long noOfShare,
			BigDecimal shareValue, String folioNo, String shareAllotedFrom, String unallotedShare) {
		super();
		this.memberCode = memberCode;
		this.memberName = memberName;
		this.issueDate = issueDate;
		this.noOfShare = noOfShare;
		this.shareValue = shareValue;
		this.folioNo = folioNo;	
	} 
}
