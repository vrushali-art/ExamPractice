package com.nidhibank.entities;

import java.sql.Date;

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
@Table(name = "BankDetails")
public class Bank {
		
	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getOpeningdate() {
		return openingdate;
	}

	public void setOpeningdate(Date openingdate) {
		this.openingdate = openingdate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bank_id;
	
	@Column(nullable = false, length = 100)
	private String bankName;
	
	//@Column(nullable = false, length = 11)
	//private String accountNo;
	
	//@Column(nullable = false, length = 10)
	//private String IFSCcode;
	
	
	@Column(nullable = false, length = 10)
	private String mobileNo;
	
	@Column(nullable = false, length = 100)
	private String address;
	
	 @Column(name = "city")
	 private String city;

	 @Column(name = "country")
	 private String country;
	
	@Column(nullable = false)
	private Date openingdate;
	
	@Column(nullable = false)
	private Double balance;

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}

