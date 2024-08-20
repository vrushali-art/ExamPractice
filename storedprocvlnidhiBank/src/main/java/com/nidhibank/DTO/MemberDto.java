package com.nidhibank.DTO;



import java.sql.Date;

import com.nidhibank.Enums.NomineeRelation;
import com.nidhibank.Enums.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class MemberDto {

	private Long memId;
    private String memberCode;
    private String remarks;
    private Status status;
    private String memberName;
    private String searchByCode;
    private String sponsorName;
    private String introMemCode;
    private String nomineeName;
    private NomineeRelation nomineeRelation;
    private String nomineeEmailId;
    private String nomineemobileNo;
    private int nomineeAge;
    private String nomineePanNo;
    private String nomineeAddress;
    private byte[] applicantPhoto;
    private byte[] signature;
    private byte[] aadharFrontPhoto;
    private byte[] aadharBackPhoto;
    private byte[] panPhoto;
    private String registrationDate;
    private boolean memberStatus;
    private String approvalStatus;
    private String paymentBy;
    private BranchDto branch;
    private MemberPersonalDetailDto memberPersonalDetail;
    private AccountDto account;
    
    public String getSearchByCode() {
		return memberName +" - "+memberCode;
	}

	public void setSearchByCode(String searchByCode) {
		this.searchByCode = searchByCode;
	}
}
