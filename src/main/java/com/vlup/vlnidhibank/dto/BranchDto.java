package com.vlup.vlnidhibank.dto;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BranchDto {
	
	private String branchCode;
    private String branchName;
    private Date openingDate;
    private String branchAddress;
    private int pin;
    private String city;
    private String branchState;
    private String contactPersonName;
    private String contactNo;
    private String concatenatedBranchName;
	
    
	public String getConcatenatedBranchName() {
		return branchName +" - "+branchCode;
	}
	public void setConcatenatedBranchName(String concatenatedBranchName) {
		this.concatenatedBranchName = concatenatedBranchName;
	}
    
}
