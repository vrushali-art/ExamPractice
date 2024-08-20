package com.nidhibank.DTO;

import java.sql.Date;

import com.nidhibank.Enums.Gender;
import com.nidhibank.Enums.State;
import com.nidhibank.Enums.VerifyWith;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class MemberPersonalDetailDto {
    private Long memDetailId;
    private Gender gender;
    private String dob;
    private String enterAadharNumber;
    private String otp;
    private Long age;
    private String mstatus;
    private String aadharNo;
    private String panNo;
    private String voterId;
    private String drivingLiscNo;
    private String mobileNo;
    private String emailId;
    private String occupation;
    private String education;
    private VerifyWith verificationMethod;
    private String address;
    private String district;
    private State state;
    private int pincode;
    private String rationNo;
}
