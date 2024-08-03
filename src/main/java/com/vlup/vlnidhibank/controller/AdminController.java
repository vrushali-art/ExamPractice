package com.vlup.vlnidhibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlup.vlnidhibank.dto.AdminDto;
import com.vlup.vlnidhibank.service.AdminService;

@RestController
@RequestMapping("api/admin")
public class AdminController {

	
	     @Autowired
	    private AdminService adminService;

	    @GetMapping("/")
	    public List<AdminDto> getAllAdmins() {
	        return adminService.getAllAdmins();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<AdminDto> getAdminById(@PathVariable Long id) {
	        AdminDto admin = adminService.getAdminById(id);
	        if (admin != null) {
	            return ResponseEntity.ok(admin);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping("/")
	    public AdminDto createAdmin(@RequestBody AdminDto AdminDto) {
	        return adminService.createAdmin(AdminDto);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<AdminDto> updateAdmin(@PathVariable Long id, @RequestBody AdminDto AdminDto) {
	        AdminDto updatedAdmin = adminService.updateAdmin(id, AdminDto);
	        if (updatedAdmin != null) {
	            return ResponseEntity.ok(updatedAdmin);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
	        adminService.deleteAdmin(id);
	        return ResponseEntity.noContent().build();
	    }
}
