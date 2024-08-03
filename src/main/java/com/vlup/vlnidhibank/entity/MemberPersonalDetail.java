package com.vlup.vlnidhibank.entity;

import java.lang.reflect.Member;
import java.sql.Date;

import com.vlup.vlnidhibank.enums.Gender;
import com.vlup.vlnidhibank.enums.MartialStatus;
import com.vlup.vlnidhibank.enums.VerifyWith;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "MemberPersonalDetails")
public class MemberPersonalDetail {
	
	@Id
    private String membersId;

    @Column(name = "registrationDate", nullable = false)
    private Date registrationDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "dob", nullable = false)
    private Date dob;

       private String enterAadharNumber;
    private String otp;
   @Column(name = "age")
    private Long age;

   @Enumerated(EnumType.STRING)
   private MartialStatus maritalStatus;

    @Column(name = "aadharNo", nullable = false)
    private Long aadharNo;

    @Column(name = "panNo", length = 20)
    private String panNo;

    @Column(name = "voter_id", nullable = false, length = 20)
    private String voterId;

    @Column(name = "drivingLiscNo", length = 50)
    private String drivingLiscNo;

    @Column(name = "mobileNo", length = 20)
    private String mobileNo;

    @Column(name = "emailId", length = 50)
    private String emailId;

    @Column(name = "occupation", length = 20)
    private String occupation;

    @Column(name = "education", length = 20)
    private String education;
    
    @Enumerated(EnumType.STRING)
    private VerifyWith verificationMethod;    
	
}
