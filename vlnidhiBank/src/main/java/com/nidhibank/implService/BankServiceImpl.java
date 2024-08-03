package com.nidhibank.implService;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhibank.DTO.BankDto;
import com.nidhibank.entities.Bank;
import com.nidhibank.exceptions.ResourceNotFoundException;
import com.nidhibank.repositories.BankRepository;
import com.nidhibank.services.BankService;

//@SuppressWarnings("unused")
@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankRepository bankRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private BankDto convertEntityToDto(Bank bank) {
    	BankDto bankDto=this.modelMapper.map(bank, BankDto.class);
  	  return bankDto; 
    }
    
    private Bank convertDtoToEntity(BankDto bankDto) {
        Bank bank=this.modelMapper.map(bankDto, Bank.class);
    	  return bank;
     }

	@Override
	public List<BankDto> getAllBanksDeatails() {
		List<Bank> bankDetailsList = this.bankRepo.findAll();
		List<BankDto> listOfBankDetails = bankDetailsList.stream().map(bankDetail->this.convertEntityToDto(bankDetail)).collect(Collectors.toList());
		return listOfBankDetails;
	}

	@Override
	public BankDto createBank(BankDto bankDto){
		Bank bank = convertDtoToEntity(bankDto);
        Bank savedBank= bankRepo.save(bank);
        return this.convertEntityToDto(savedBank);
	}

	@Override
	public BankDto updateBank(BankDto bankDto, Integer bank_id) {
		Bank bank=this.bankRepo
    			.findById(bank_id)
    			.orElseThrow(()->new ResourceNotFoundException("Bank","Id", bank_id));
		
	   bank.setBankName(bankDto.getBankName());
	   bank.setMobileNo(bankDto.getMobileNo());
	   bank.setAddress(bankDto.getAddress());
	   bank.setCountry(bankDto.getCountry());
	   bank.setCity(bankDto.getCity());
	   bank.setOpeningdate(bankDto.getOpeningdate());
	   bank.setBalance(bankDto.getBalance());
	   Bank updateBankDetails = this.bankRepo.save(bank);
	   BankDto bankDetails = this.convertEntityToDto(updateBankDetails);
	   return bankDetails;
		   
	}

	@Override
	public BankDto getBankById(Integer bank_id) {
		Bank bank= this.bankRepo
    			.findById(bank_id).orElseThrow(()->new ResourceNotFoundException("Bank","Id",bank_id));
    	return this.convertEntityToDto(bank); 
	}

	@Override
	public void deleteBankDetails(Integer bank_id) {
		Bank bank=this.bankRepo
    			.findById(bank_id)

    			.orElseThrow(()->new ResourceNotFoundException("Bank","Id",bank_id));
    	
    	this.bankRepo.delete(bank);
		
	}

		
}
