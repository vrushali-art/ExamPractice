package com.nidhibank.entities;



import java.sql.Date;

import com.nidhibank.Enums.NomineeRelation;
import com.nidhibank.Enums.State;
import com.nidhibank.Enums.Status;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter  
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Entity
@Table(name = "Member")
@Builder
public class Member {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memId;

    private String memberCode;
    
    @Column(name = "remarks", columnDefinition = "text")
    private String remarks;
    
    @Column(name = "status")
    private Status status;

	@Column(name = "memberName")
    private String memberName;
    
    private String searchByCode;
	
	private String sponsorName;
	
	private String introMemCode;
	
	@Column(name = "nomineeName",length = 50)
    private String nomineeName;
    
    @Enumerated(EnumType.STRING)
    private NomineeRelation nomineeRelation;
    
    private String nomineeEmailId;
    
    @Column(length = 10)
    private String nomineemobileNo;

    private int nomineeAge;

    private String nomineePanNo;

    @Column(length = 200)
    private String nomineeAddress;	

    
    private String applicantPhotoName;
    private String applicantPhotoType;
    
	@Lob
	private byte[] applicantPhoto;
	

	private String signatureName;
    private String signatureType;
	@Lob
    private byte[] signature;  
	
	private String aadharFrontPhotoName;
    private String aadharFrontPhotoType;
	@Lob
    private byte[] aadharFrontPhoto;
	
	private String aadharBackPhotoName;
    private String aadharBackPhotoType;
	@Lob
    private byte[] aadharBackPhoto;
	
	private String panPhotoName;
    private String panPhotoType;
	@Lob
	private byte[] panPhoto;
	
	private Date registrationDate;
	
	private boolean memberStatus;
	
	 private String approvalStatus;
	 
	 private String paymentBy;
	
	
	// Many-to-One relationship with Branch
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
    
 // One-to-One relationship with MemberPersonalDetail
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_detail_id")
    private MemberPersonalDetail memberPersonalDetail;
    
 // One-to-One relationship with Account
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;
    
    
    @OneToOne(mappedBy = "member")
    private SavingAccount savingAccount;
    
// // Many-to-One relationship with CodeSettings
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "code_settings_id")
//    private CodeSettings codeSettings;
	
	public String getSearchByCode() {
		return memberName +" - "+memberCode;
	}

	public void setSearchByCode(String searchByCode) {
		this.searchByCode = searchByCode;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDistrict() {
		// TODO Auto-generated method stub
		return null;
	}

	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

