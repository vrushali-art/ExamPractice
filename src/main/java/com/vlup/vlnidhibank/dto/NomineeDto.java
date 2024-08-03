package com.vlup.vlnidhibank.dto;

import com.vlup.vlnidhibank.enums.NomineeRelation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
public class NomineeDto 
{
        
	 private String nomineeId;
	    private String nomineeName;
	    private NomineeRelation nomineeRelation;
	    private String mobileNo;
	    private int age;
	    private String panNo;
	    private String address;
	    private String nomineeKycType;
		public String getNomineeId() {
			return nomineeId;
		}
		public void setNomineeId(String nomineeId) {
			this.nomineeId = nomineeId;
		}
		public String getNomineeName() {
			return nomineeName;
		}
		public void setNomineeName(String nomineeName) {
			this.nomineeName = nomineeName;
		}
		public NomineeRelation getNomineeRelation() {
			return nomineeRelation;
		}
		public void setNomineeRelation(NomineeRelation nomineeRelation) {
			this.nomineeRelation = nomineeRelation;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getPanNo() {
			return panNo;
		}
		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getNomineeKycType() {
			return nomineeKycType;
		}
		public void setNomineeKycType(String nomineeKycType) {
			this.nomineeKycType = nomineeKycType;
		}

  }
