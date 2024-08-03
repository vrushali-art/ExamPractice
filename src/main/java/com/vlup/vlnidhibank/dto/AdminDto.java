package com.vlup.vlnidhibank.dto;

public class AdminDto {

	     
		private String email;
		private String password;
		private String role;
		private String fullname;
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public AdminDto(String email, String password, String role, String fullname) {
			super();
			this.email = email;
			this.password = password;
			this.role = role;
			this.fullname = fullname;
		}
              
		
	
}
