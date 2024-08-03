package com.vlup.vlnidhibank.serviceImpl;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.BranchDto;
import com.vlup.vlnidhibank.entity.Branch;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.BranchRepository;
import com.vlup.vlnidhibank.service.BranchService;


@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	private BranchRepository branchRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private BranchDto convertEntityToDto(Branch branch) {
    	BranchDto branchDto=this.modelMapper.map(branch, BranchDto.class);
  	  return  branchDto; 
    }
    
    private Branch convertDtoToEntity(BranchDto branchDto) {
        Branch branch=this.modelMapper.map(branchDto,  Branch.class);
    	  return  branch;
}

	@Override
	public List<BranchDto> getAllBranches() {
		List<Branch> branchList=this.branchRepo.findAll();	
     List<BranchDto> listOfBranchDtos=branchList.stream().map(branchlist->this.convertEntityToDto(branchlist)).collect(Collectors.toList()); 
        return listOfBranchDtos;
	}
	
	
	// By writing custom code generate auto_increment code.
    public String generateBranchCode() 
    {
    	Branch lastBranch = branchRepo.findTopByOrderByBranchCodeDesc();
    	int lastBranchCode = (lastBranch != null)? 
    	extractNumericSuffix(lastBranch.getBranchCode()):0;
    	
    	int newId = lastBranchCode + 1;
    	
    	//String formattedId = String.format("%03d", newId);
    	String formattedId = String.format("%d", newId);
    	return formattedId;
     }

	private int extractNumericSuffix(String branchCode)
	{
		
		return Integer.parseInt(branchCode);
	}

  // end of auto generation code.
	
	
	@Override
	public BranchDto createBranch(BranchDto branchDto) {
		String branchCode = generateBranchCode();    //001
		branchDto.setBranchCode(branchCode);        // set 001
		Branch branch = convertDtoToEntity(branchDto);
		// Set concatenatedBranchName before saving
		branch.setConcatenatedBranchName(branch.getConcatenatedBranchName());
        Branch savedBranch= branchRepo.save(branch);
        return this.convertEntityToDto(savedBranch);
	
	}

	

	@Override
	public BranchDto updateBranch(BranchDto branchDto, String branchid) {
		Branch branch=this.branchRepo
    			.findById(branchid)
    			.orElseThrow(()->new ResourceNotFoundException("Branch","Id",branchid));
   
		branch.setBranchCode(branchDto.getBranchCode());
		branch.setBranchName(branchDto.getBranchName());
		branch.setOpeningDate(branchDto.getOpeningDate());
		branch.setBranchAddress(branchDto.getBranchAddress());
		branch.setPin(branchDto.getPin());
		branch.setCity(branchDto.getCity());
		branch.setBranchState(branchDto.getBranchState());
		branch.setContactPersonName(branchDto.getContactPersonName());
		branch.setContactNo(branchDto.getContactNo());
		branch.setConcatenatedBranchName(branchDto.getConcatenatedBranchName());
		
		
	    Branch updateBranch= this.branchRepo.save(branch);
	    BranchDto branchPDto1=this.convertEntityToDto(updateBranch);
	    
	    return branchPDto1;
	}

	@Override
	public BranchDto getBranchById(String id) {
		Branch branch= this.branchRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Branch","Id",id));
    	return this.convertEntityToDto(branch); 
	}

	@Override
	public void deleteBranch(String id) {
		Branch branch=this.branchRepo
    			.findById(id)
    			.orElseThrow(()->new ResourceNotFoundException("Branch","Id",id));
    	
    	this.branchRepo.delete(branch);
		
	}

}
