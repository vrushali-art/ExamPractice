package com.nidhibank.DTO;



import java.util.Date;

import com.nidhibank.Enums.Gender;
import com.nidhibank.Enums.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  
@Setter
@NoArgsConstructor 
@AllArgsConstructor
public class MemberSearchDto {
	private String memberCode;
    private String memberName;
    private Gender gender;
    private Date registrationDate;
    private String aadharNo;
    private String panNo;
    private String mobileNo;
    private String nomineeName;
    private Status status;
    
    
    
}

