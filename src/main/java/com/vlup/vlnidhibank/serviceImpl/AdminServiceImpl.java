package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.AdminDto;
import com.vlup.vlnidhibank.entity.Admin;
import com.vlup.vlnidhibank.repository.AdminRepository;
import com.vlup.vlnidhibank.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {
	
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private AdminDto convertEntityToDto(Admin admin) {
    	AdminDto adminDto=this.modelMapper.map(admin, AdminDto.class);
  	  return  adminDto; 
    }

    
    
    private Admin convertDtoToEntity(AdminDto adminDto) {
        Admin admin=this.modelMapper.map(adminDto,  Admin.class);
    	  return  admin;
    }
    
    
	@Override
    public List<AdminDto> getAllAdmins() {
        return adminRepo.findAll().stream()
                .map(admin -> modelMapper.map(admin, AdminDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public AdminDto getAdminById(Long id) {
        Optional<Admin> admin = adminRepo.findById(id);
        return admin.map(value -> modelMapper.map(value, AdminDto.class)).orElse(null);
    }

    @Override
    public AdminDto createAdmin(AdminDto AdminDto) {
        Admin admin = modelMapper.map(AdminDto, Admin.class);
        Admin savedAdmin = adminRepo.save(admin);
        return modelMapper.map(savedAdmin, AdminDto.class);
    }

    @Override
    public AdminDto updateAdmin(Long id, AdminDto AdminDto) {
        Admin existingAdmin = adminRepo.findById(id).orElse(null);
        if (existingAdmin != null) {
            modelMapper.map(AdminDto, existingAdmin);
            Admin updatedAdmin = adminRepo.save(existingAdmin);
            return modelMapper.map(updatedAdmin, AdminDto.class);
        }
        return null;
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepo.deleteById(id);
    }
	

}
