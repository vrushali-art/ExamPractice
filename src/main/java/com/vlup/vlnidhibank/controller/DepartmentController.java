//package com.vlup.vlnidhibank.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.vlup.vlnidhibank.dto.ApiResponse;
//import com.vlup.vlnidhibank.dto.DepartmentDto;
//import com.vlup.vlnidhibank.service.DepartmentService;
//
//
//
//@RestController
//@RequestMapping("api/department")
//public class DepartmentController {
//	@Autowired
//	private DepartmentService departmentService;
//	
//	
//	@PostMapping("/")
//	public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto)
//	{
//		DepartmentDto departmentDtos= this.departmentService.createDepertment(departmentDto);
//		
//		return new ResponseEntity<>(departmentDtos,HttpStatus.CREATED);
//	}
//	
//	@PutMapping("/{departmentDtoId}")
//	public ResponseEntity<DepartmentDto> updateDepartment(@RequestBody DepartmentDto departmentDto,@PathVariable Integer departmentDtoId)
//	{     
//		DepartmentDto updatedDepartmentDto=this.departmentService.updateDeaprtment(departmentDto, departmentDtoId);
//		return ResponseEntity.ok(updatedDepartmentDto);
//	}
//	
//	@DeleteMapping("/{departmentDtoId}")
//	public ResponseEntity<ApiResponse> deleteDepartment(@PathVariable Integer departmentDtoId){
//		this.departmentService.deleteDepertment(departmentDtoId);
//		return new ResponseEntity<ApiResponse>(new ApiResponse ("Department deleted Successfully",true), HttpStatus.OK);
//	} 
//	
//	// Get All Branches
//	@GetMapping("/")
//	public ResponseEntity<List<DepartmentDto>> getAllDepartments(){
//		
//		return ResponseEntity.ok(this.departmentService.getAllDepartments());
//	}
//	
//	
//	// Get A Single Branch
//	@GetMapping("/{departmentDtoId}")
//	public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable Integer departmentDtoId){
//		
//		return ResponseEntity.ok(this.departmentService.getDepartmentById(departmentDtoId));
//	}
//
//
//}
