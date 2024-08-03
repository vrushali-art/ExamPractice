//package com.vlup.vlnidhibank.serviceImpl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.vlup.vlnidhibank.dto.BankEmployeeDto;
//import com.vlup.vlnidhibank.entity.BankEmployee;
//import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
//
//
//
//
//@Service
//public class BankEmpServiceImpl implements com.vlup.vlnidhibank.service.BankEmployeeService {
//	
//	@Autowired
//	private com.vlup.vlnidhibank.repository.BankEmployeeRepo bankEmpRepo;
//	
//	@Autowired
//	private ModelMapper modelMapper;
//	
//
//	@Override
//	public com.vlup.vlnidhibank.dto.BankEmployeeDto createBankEmployee(BankEmployeeDto bankEmployeeDto) {
//		
//		// TODO Auto-generated method stub
//		com.vlup.vlnidhibank.entity.BankEmployee bankEmp = this.dtoToBankEmployee(bankEmployeeDto);
//		com.vlup.vlnidhibank.entity.BankEmployee savedBankEmp = this.bankEmpRepo.save(bankEmp);
//		return this.bankEmployeeToDto(savedBankEmp);
//		
//	}
//
//	@Override
//	public com.vlup.vlnidhibank.dto.BankEmployeeDto UpdateBankEmployee(com.vlup.vlnidhibank.dto.BankEmployeeDto bankEmployeeDto, Integer bankempid) {
//			
//		com.vlup.vlnidhibank.entity.BankEmployee bankEmployee = this.bankEmpRepo.findById(bankempid)
//				.orElseThrow(()-> new ResourceNotFoundException("BankEmployee", "id", bankempid));
//		bankEmployee.setAddress(bankEmployeeDto.getAddress());
//		bankEmployee.setMobileNo(bankEmployeeDto.getMobileNo());
//		bankEmployee.setSalary(bankEmployeeDto.getSalary());
//		bankEmployee.setBranchName(bankEmployeeDto.getBranchName());
//		
////		bankEmployee.setNominee(bankEmployeeDto.getNominee());
//		
//		com.vlup.vlnidhibank.entity.BankEmployee updatedBankEmp = this.bankEmpRepo.save(bankEmployee);
//		com.vlup.vlnidhibank.dto.BankEmployeeDto bankEmployeeDto1 = this.bankEmployeeToDto(updatedBankEmp);
//		
//		return bankEmployeeDto1;
//	}
//
//	@Override
//	public BankEmployeeDto getBankEmpById(Integer bankempid) {
//		BankEmployee bankEmployee = this.bankEmpRepo.findById(bankempid)
//				.orElseThrow(()-> new ResourceNotFoundException("BankEmployee", "id", bankempid));
//		return this.bankEmployeeToDto(bankEmployee);
//	}
//
//	@Override
//	public List<BankEmployeeDto> getAllBankEmp() {
//		List<BankEmployee> bankEmployees = this.bankEmpRepo.findAll();
//		List<BankEmployeeDto> bankEmpDtos = bankEmployees.stream().map(bankEmp->this.bankEmployeeToDto(bankEmp)).collect(Collectors.toList());
//		return bankEmpDtos;
//	}
//
//	@Override
//	public void deleteBankEmp(Integer bankempid) {
//		BankEmployee bankEmployee = this.bankEmpRepo.findById(bankempid).orElseThrow(()->new ResourceNotFoundException("BankEmployee", "id", bankempid));
//		this.bankEmpRepo.delete(bankEmployee);
//
//	}
//	
//	private BankEmployee dtoToBankEmployee(BankEmployeeDto bankdto)
//	{
////		BankEmployee bankEmp = new BankEmployee();
//		BankEmployee bankEmp = this.modelMapper.map(bankdto, BankEmployee.class);
//		
////		bankEmp.setDoj(bankdto.getDoj());
////		bankEmp.setEmpId(bankdto.getEmpId());
////    	bankEmp.setPanNo(bankdto.getPanNo());
////		bankEmp.setEmpName(bankdto.getEmpName());
////		bankEmp.setEmpCode(bankdto.getEmpCode());
////		bankEmp.setBranchName(bankdto.getBranchName());
////		bankEmp.setMobileNo(bankdto.getMobileNo());
////		bankEmp.setAge(bankdto.getAge());
////		bankEmp.setAddress(bankdto.getAddress());
////		bankEmp.setQualification(bankdto.getQualification());
////		bankEmp.setExperience(bankdto.getExperience());
////		bankEmp.setRelativeName(bankdto.getRelativeName());
////		bankEmp.setRelativeName(bankdto.getRelativeName());
////		bankEmp.setFees(bankdto.getFees());
////		bankEmp.setSalary(bankdto.getSalary());
////		bankEmp.setSbAccNo(bankdto.getSbAccNo());
////		bankEmp.setRemarks(bankdto.getRemarks());
//		return bankEmp;
//		
//	}
//	
//	public BankEmployeeDto bankEmployeeToDto(BankEmployee bankEmp) 
//	{
////		BankEmployeeDto bankEmpDto = new BankEmployeeDto();
//		BankEmployeeDto bankEmpDto = this.modelMapper.map(bankEmp, BankEmployeeDto.class);
//		
//		
////		bankEmpDto.setDoj(bankEmp.getDoj());
////		bankEmpDto.setEmpId(bankEmp.getEmpId());
////     	bankEmpDto.setPanNo(bankEmp.getPanNo());
////		bankEmpDto.setEmpName(bankEmp.getEmpName());
////		bankEmpDto.setEmpCode(bankEmp.getEmpCode());
////		bankEmpDto.setBranchName(bankEmp.getBranchName());
////		bankEmpDto.setBranchName(bankEmp.getBranchName());
////		bankEmpDto.setMobileNo(bankEmp.getMobileNo());
////		bankEmpDto.setAge(bankEmp.getAge());
////		bankEmpDto.setAddress(bankEmp.getAddress());
////		bankEmpDto.setQualification(bankEmp.getQualification());
////		bankEmpDto.setExperience(bankEmp.getExperience());
////		bankEmpDto.setRelativeName(bankEmp.getRelativeName());
////		bankEmpDto.setRelativeName(bankEmp.getRelativeName());
////		bankEmpDto.setFees(bankEmp.getFees());
////		bankEmpDto.setSalary(bankEmp.getSalary());
////		bankEmpDto.setSbAccNo(bankEmp.getSbAccNo());
////		bankEmpDto.setRemarks(bankEmp.getRemarks());
//
//		
//		return bankEmpDto;
//	}
//	
//	
//
//}
