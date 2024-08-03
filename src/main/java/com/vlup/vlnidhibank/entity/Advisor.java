//package com.vlup.vlnidhibank.entity;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Table(name="Advisor")
//@NoArgsConstructor
//@Getter
//@Setter
//public class Advisor {
//	
//
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//	    @Column(name = "advisor_code")
//	    private Integer advisorCode;
//
//		/*
//		 * @Column(name = "advisor_joining_date", nullable = false, columnDefinition =
//		 * "TIMESTAMP DEFAULT CURRENT_TIMESTAMP") private LocalDateTime advisorJdate;
//		 */
//
//	    @Column(name = "code", nullable = false)
//	    private String code;
//
//	    @Column(name = "advisor_first_name", nullable = false)
//	    private String advisorFirstName;
//
//	    @Column(name = "advisor_last_name", nullable = false)
//	    private String advisorLastName;
//
//	    @Column(name = "branch_name", nullable = false)
//	    private String branchName;
//
//	    @Column(name = "introducer_code")
//	    private String introducerCode;
//
//	    @Column(name = "introducer_name")
//	    private String introducerName;
//	    
//	    @Column(name = "Advisor_Address")
//	    private String Address;
//	    
//	    private String photoUrl; // New field for photo URL
//	    private String signatureUrl; // New field for signature URL
//		public Integer getAdvisorCode() {
//			return advisorCode;
//		}
//		public void setAdvisorCode(Integer advisorCode) {
//			this.advisorCode = advisorCode;
//		}
//		public String getCode() {
//			return code;
//		}
//		public void setCode(String code) {
//			this.code = code;
//		}
//		public String getAdvisorFirstName() {
//			return advisorFirstName;
//		}
//		public void setAdvisorFirstName(String advisorFirstName) {
//			this.advisorFirstName = advisorFirstName;
//		}
//		public String getAdvisorLastName() {
//			return advisorLastName;
//		}
//		public void setAdvisorLastName(String advisorLastName) {
//			this.advisorLastName = advisorLastName;
//		}
//		public String getBranchName() {
//			return branchName;
//		}
//		public void setBranchName(String branchName) {
//			this.branchName = branchName;
//		}
//		public String getIntroducerCode() {
//			return introducerCode;
//		}
//		public void setIntroducerCode(String introducerCode) {
//			this.introducerCode = introducerCode;
//		}
//		public String getIntroducerName() {
//			return introducerName;
//		}
//		public void setIntroducerName(String introducerName) {
//			this.introducerName = introducerName;
//		}
//		public String getAddress() {
//			return Address;
//		}
//		public void setAddress(String address) {
//			Address = address;
//		}
//		public String getPhotoUrl() {
//			return photoUrl;
//		}
//		public void setPhotoUrl(String photoUrl) {
//			this.photoUrl = photoUrl;
//		}
//		public String getSignatureUrl() {
//			return signatureUrl;
//		}
//		public void setSignatureUrl(String signatureUrl) {
//			this.signatureUrl = signatureUrl;
//		}
//
//	  
//		/*
//		 * // Constructor for advisorJdate public Advisor(LocalDateTime advisorJdate) {
//		 * this.advisorJdate = advisorJdate; }
//		 */
//
//
//		
//}
//
//
