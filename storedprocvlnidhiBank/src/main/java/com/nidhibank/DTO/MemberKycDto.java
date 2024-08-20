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
public class MemberKycDto {

	    private String memberCode;
	    private String memberName;
	    private String mobileNo;
	    private Date registrationDate;
	    private String aadharNo;
	    private String panNo;  
}
