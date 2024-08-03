package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.AdminDto;


public interface AdminService {

	
	 List<AdminDto> getAllAdmins();
	    AdminDto getAdminById(Long id);
	    AdminDto createAdmin(AdminDto adminDTO);
	    AdminDto updateAdmin(Long id, AdminDto adminDTO);
	    void deleteAdmin(Long id);
}
