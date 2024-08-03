package com.nidhibank.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "NomineeDetails")
public class Nominee {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id;	    

       @Column(nullable = false)
       private int nominees_id;

       @Column(name = "nomineeName",length = 50, nullable = false)
       private String nomineeName;
       
       @Column(name = "nomineeRelation", length = 10)
	    private String nomineeRelation;
       
       @Column(length = 10, nullable = false)
       private String mobileNo;

       @Column(nullable = false)
       private int age;

       @Column(nullable = false)
       private int panNo;

       @Column(length = 200, nullable = false)
       private String address;

       @Column(length = 20, nullable = false)
       private String nomineeKycType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
