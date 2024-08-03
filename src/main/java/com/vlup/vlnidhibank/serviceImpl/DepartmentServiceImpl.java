//package com.vlup.vlnidhibank.serviceImpl;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.vlup.vlnidhibank.dto.DepartmentDto;
//import com.vlup.vlnidhibank.entity.Department;
//import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
//
//
//@Service
//public class DepartmentServiceImpl implements com.vlup.vlnidhibank.service.DepartmentService{
//	
//	@Autowired
//	private com.vlup.vlnidhibank.repository.DepartmentRepo departmrntRepo;
//	
//	@Autowired
//	private ModelMapper modelMapper;
//	
//	private com.vlup.vlnidhibank.dto.DepartmentDto convertEntityToDto(com.vlup.vlnidhibank.entity.Department department) {
//		com.vlup.vlnidhibank.dto.DepartmentDto departmentDto=this.modelMapper.map(department, DepartmentDto.class);
//  	  return departmentDto; 
//    }
//
//    
//    
//    private Department convertDtoToEntity(DepartmentDto departmentDto) {
//    	Department department=this.modelMapper.map(departmentDto, Department.class);
//    	  return department;
//     }
//
//	
//
//	@Override
//	public List<DepartmentDto> getAllDepartments() {
//		List<Department> departmentList=this.departmrntRepo.findAll();
//        List<DepartmentDto> listOfDepartmentDtos=departmentList.stream().map(departmentlist->this.convertEntityToDto(departmentlist)).collect(Collectors.toList()); 
//        return listOfDepartmentDtos;
//	}
//
//	@Override
//	public DepartmentDto createDepertment(DepartmentDto departmentDto) {
//		Department department = convertDtoToEntity(departmentDto);
//        Department savedDepartment= departmrntRepo.save(department);
//        return this.convertEntityToDto(savedDepartment);
//	}
//
//	@Override
//	public DepartmentDto updateDeaprtment(DepartmentDto departmentDto, Integer depart_id) {
//		Department department=this.departmrntRepo
//    			.findById(depart_id)
//    			.orElseThrow(()->new ResourceNotFoundException("Department","Id",depart_id));
//		
//		department.setDepart_id(departmentDto.getDepart_id());
//		department.setDepartName(departmentDto.getDepartName());
//		department.setDescription(departmentDto.getDescription());
//   
//        Department updateDepartment= this.departmrntRepo.save(department);
//	    DepartmentDto departmentDto1=this.convertEntityToDto(updateDepartment);
//	    
//	    return departmentDto1;
//	}
//
//	@Override
//	public DepartmentDto getDepartmentById(Integer depart_id) {
//		Department department = this.departmrntRepo
//    			.findById(depart_id)
//
//    			.orElseThrow(()->new ResourceNotFoundException("Department","Id",depart_id));
//    	return this.convertEntityToDto(department); 
//	}
//
//	@Override
//	public void deleteDepertment(Integer depart_id) {
//		Department department=this.departmrntRepo
//    			.findById(depart_id)
//
//    			.orElseThrow(()->new ResourceNotFoundException("Department","Id",depart_id));
//    	
//    	this.departmrntRepo.delete(department);
//		
//	}
//
//
//
//	
//
//}
