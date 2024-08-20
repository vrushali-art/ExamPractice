package com.nidhibank.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
public class MemberReportDto {

	private String memberCode;
    private String memberName;
    private String cspCode;
    private Date registrationDate;
    private String nomineeName;
    private String address;
    private String mobileNo;
    private String aadharNo;
    private String panNo;
    
  	  
}
