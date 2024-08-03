package com.vlup.vlnidhibank.dto;



import java.math.BigDecimal;
import java.sql.Date;

import com.vlup.vlnidhibank.entity.Branch;
import com.vlup.vlnidhibank.entity.MemberAddress;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.entity.ShareDetail;
import com.vlup.vlnidhibank.enums.Gender;
import com.vlup.vlnidhibank.enums.MartialStatus;
import com.vlup.vlnidhibank.enums.NomineeRelation;
import com.vlup.vlnidhibank.enums.State;
import com.vlup.vlnidhibank.enums.VerifyWith;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntityDto {

    private String memberCode;
    private String remarks;
    private boolean status;
    private String searchByCode;
    private byte[] photo;
    private byte[] signature; 
    private String memberName;
    private String branchCodes;
    private String branchNames; 
    private String concatenatedBranchNames;
    private String sponsorName;
	private String introMemCode;
    private MemberAddress memberAddress;
    private MemberPersonalDetail memPerDetail;
    private Nominee nominee;
    private Branch branch;
    private ShareDetail shares;
    
    
        
	
}


