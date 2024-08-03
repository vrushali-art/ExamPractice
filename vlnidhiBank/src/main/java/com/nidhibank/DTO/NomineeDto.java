package com.nidhibank.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NomineeDto {
    private int nominees_id;
    private String nomineeName;
    private String nomineeRelation;
    private String mobileNo;
    private int age;
    private int panNo;
    private String address;
    private String nomineeKycType;
	public int getNominees_id() {
		return nominees_id;
	}
	public void setNominees_id(int nominees_id) {
		this.nominees_id = nominees_id;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeRelation() {
		return nomineeRelation;
	}
	public void setNomineeRelation(String nomineeRelation) {
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
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
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
