package com.vlup.vlnidhibank.dto;





import com.vlup.vlnidhibank.enums.State;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberAddressDto {
	
	private String id;
    private String address;
    private String district;
    private State state;
    private int pincode;
    private String rationNo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getRationNo() {
		return rationNo;
	}
	public void setRationNo(String rationNo) {
		this.rationNo = rationNo;
	}
	public MemberAddressDto(String id, String address, String district, State state, int pincode, String rationNo) {
		super();
		this.id = id;
		this.address = address;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.rationNo = rationNo;
	}
	
}
