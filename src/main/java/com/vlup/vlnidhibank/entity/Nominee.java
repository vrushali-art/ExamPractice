package com.vlup.vlnidhibank.entity;

import com.vlup.vlnidhibank.enums.NomineeRelation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "NomineeDetails")
public class Nominee {
	        @Id
	        private String nomineeId;	    

	        @Column(name = "nomineeName",length = 50, nullable = false)
	        private String nomineeName;
	        
	        @Column(name = "nomineeRelation")
		    private NomineeRelation nomineeRelation;
	        
	        @Column(length = 10, nullable = false)
	        private String mobileNo;

	        @Column(nullable = false)
	        private int age;

	        @Column(nullable = false)
	        private String panNo;

	        @Column(length = 200, nullable = false)
	        private String address;

	        @Column(length = 20, nullable = false)
	        private String nomineeKycType;	
			      
	  }

	    

