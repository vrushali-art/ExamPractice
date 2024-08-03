package com.vlup.vlnidhibank.entity;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

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
@Table(name = "Bank_Branch")
public class Branch {
	
	
	    @Id
	    @Column(name = "branchCode")
	    private String branchCode;
	    @Column(length = 30, nullable = false)
	    private String branchName;
	    @Column(nullable = false)
	    private Date openingDate;
	    @Column(length = 255, nullable = false)
	    private String branchAddress;
	    @Column(nullable = false)
	    private int pin;
	   
	    @Column(length = 30, nullable = false)
	    private String city;
	    @Column(length = 30, nullable = false)
	    private String branchState;
	    @Column(length = 70, nullable = false)
	    private String contactPersonName;
	    @Column(nullable = false, length = 20)
	    private String contactNo;
	
	    @Column(nullable = false)
	    private String concatenatedBranchName; 
	   
	 // Getter for concatenatedBranchName
	    public String getConcatenatedBranchName() {
	        return branchName + " - " + branchCode;
	    }
	    // Setter for concatenatedBranchName (if needed)
	    public void setConcatenatedBranchName(String concatenatedBranchName) {
	        this.concatenatedBranchName = concatenatedBranchName;
	    }
	    
	    
		
}
