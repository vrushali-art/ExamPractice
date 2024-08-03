package com.vlup.vlnidhibank.entity;



import com.vlup.vlnidhibank.enums.State;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import jakarta.persistence.Id;

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
@Table(name = "MemberAddress")
public class MemberAddress {

    @Id
    private String id;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "district", nullable = false, length = 30)
    private String district;

    @Enumerated(EnumType.STRING)
    private State state;
    
    @Column(name = "pincode")
    private int pincode;

    @Column(name = "rationNo", length = 50)
    private String rationNo;

    
     @OneToOne(mappedBy="memberAddress")
     private MemberEntity member;

}
