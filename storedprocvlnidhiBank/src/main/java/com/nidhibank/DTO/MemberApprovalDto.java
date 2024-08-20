package com.nidhibank.DTO;



import java.math.BigDecimal;
import java.sql.Date;

import com.nidhibank.Enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter  
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberApprovalDto {

	  private String memberCode;
	  private String memberName;
	  private Gender gender;
	  private Date registrationDate;
	  private String mobileNo;
	  private BigDecimal fees;
	  private long noOfShare;
}
