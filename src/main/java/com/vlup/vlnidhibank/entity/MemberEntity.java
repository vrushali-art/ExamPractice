package com.vlup.vlnidhibank.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Members")
public class MemberEntity {
	
	@Id
    private String memberCode; 
      
    @Column(name = "remarks", columnDefinition = "text")
    private String remarks;
    
    @Column(name = "status")
    private boolean status;

	@Column(name = "memberName", nullable = false)
    private String memberName;
    
    private String searchByCode;
    
    private String branchCodes;
    @Column(length = 30, nullable = false)
    
    private String branchNames;
    
   
	private String concatenatedBranchNames;
	
	private String sponsorName;
	
	private String introMemCode;

    @Column(name = "photo")
    private byte[] photo;

    @Column(name = "signature")
    private byte[] signature;  

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id", referencedColumnName = "id")
    private MemberAddress memberAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_memPersonalDetail_id", referencedColumnName = "membersId")
    private MemberPersonalDetail memPerDetail;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_nominee_id", referencedColumnName = "nomineeId")
    private Nominee nominee;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_branch_id", referencedColumnName = "branchCode")
    private Branch branch;
   
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_share_id", referencedColumnName = "shareId")
    private ShareDetail shares;

	public String getConcatenatedBranchNames() {
		return branchNames + " - "+ branchCodes;
	}

	public void setConcatenatedBranchNames(String concatenatedBranchNames) {
		this.concatenatedBranchNames = concatenatedBranchNames;
	}

	public String getSearchByCode() {
		return memberCode +" - "+memberName;
	}

	public void setSearchByCode(String searchByCode) {
		this.searchByCode = searchByCode;
	}
}
