package com.nidhibank.DTO;


import java.util.Date;

import com.nidhibank.Enums.Gender;
import com.nidhibank.Enums.State;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberSummaryDto {
	
	    private String memberCode;
	    private String memberName;
	    private Date registrationDate;
	    private String address;
	    private int pincode;
	    private State state;
	    private String mobileNo;
	    private String aadharNo;
	    private String panNo;
	    private String nomineeName;
	    private String emailId;
	    private Date dob;
	    private Long age;
	    private String branchCode;
	    private Gender gender;	    
	    
}
