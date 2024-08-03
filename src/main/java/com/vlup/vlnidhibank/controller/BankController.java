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
//import com.vlup.vlnidhibank.dto.BankDto;
//
//@RestController
//@RequestMapping("api/bankDetails")
//public class BankController {
//	@Autowired
//	private com.vlup.vlnidhibank.service.BankService bankService;
//	
//	
//	@PostMapping("/")
//	public ResponseEntity<BankDto> createBank(@RequestBody BankDto bankDto)
//	{
//		BankDto bankDetilsDto= this.bankService.createBank(bankDto);
//		
//		return new ResponseEntity<>(bankDetilsDto, HttpStatus.CREATED);
//	}
//	
//	@PutMapping("/{bankDtoId}")
//	public ResponseEntity<BankDto> updateBank(@RequestBody BankDto bankDto,@PathVariable Integer bankDtoId)
//	{     
//		BankDto updatedBankDetails=this.bankService.updateBank(bankDto, bankDtoId);
//		return ResponseEntity.ok(updatedBankDetails);
//	}
//	
//	@DeleteMapping("/{bankDtoId}")
//	public ResponseEntity<ApiResponse> deleteBank(@PathVariable Integer bankDtoId){
//		this.bankService.deleteBankDetails(bankDtoId);
//		return new ResponseEntity<ApiResponse>(new ApiResponse ("Bank deleted Successfully",true), HttpStatus.OK);
//	} 
//	
//	
////	 Get All Bankdetails
//	
//	@GetMapping("/")
//	public ResponseEntity<List<BankDto>> getAllBanksDeatails(){
//		
//		return ResponseEntity.ok(this.bankService.getAllBanksDeatails());
//	}
//	
////	 Get Single Bankdetail
//	@GetMapping("/{bankDtoId}")
//	public ResponseEntity<BankDto> getBankById(@PathVariable Integer bankDtoId){
//		
//		return ResponseEntity.ok(this.bankService.getBankById(bankDtoId));
//	}
//
//
//}
