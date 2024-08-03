package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.MemberAddressDto;
import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;
import com.vlup.vlnidhibank.entity.MemberAddress;
import com.vlup.vlnidhibank.entity.MemberEntity;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.MemberAddressRepository;
import com.vlup.vlnidhibank.service.MemberAddressService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberAddressServiceImpl implements MemberAddressService {

	private static final Logger log = LoggerFactory.getLogger(MemberAddressServiceImpl.class);

	@Autowired
	private MemberAddressRepository memberAddrRepo;

	@Autowired
	private ModelMapper modelMapper;

	public String generateMemberCode() {
		// Fetch the last inserted member code from the repository (or any other
		// persistent storage)
		MemberAddress lastMember = memberAddrRepo.findTopByOrderByIdDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix(lastMember.getId()) : 0;

		// Increment the counter
		int newId = lastMemberCode + 1;

		// Format the new ID
		String formattedId = String.format("%d", newId);

		return formattedId;
	}

	private int extractNumericSuffix(String membersId) {
		// Extract the numeric part of the member code and convert it to an integer
		return Integer.parseInt(membersId);
	}

//    @Override
//	public MemberEntityDto createMember(MemberEntityDto memberDto) {
//		String memberCode = generateMemberCode();
//		memberDto.setMemberCode(memberCode);
//		MemberEntity member=convertDtoToEntity(memberDto);
//		// Set concatenatedBranchName before saving
//		member.setSearchByCode(member.getSearchByCode());
//		MemberEntity savedMember=memberRepo.save(member);
//		return this.convertEntityToDto(savedMember);
//	}

	@Override
	public MemberAddressDto createMemberAddress(MemberAddressDto memberAddrDto) {
		log.info("Creating new member address");
		String memberCode = generateMemberCode();
		memberAddrDto.setId(memberCode);
		MemberAddress memAddrP = convertDtoToEntity(memberAddrDto);
		MemberAddress savedMemAddrP = memberAddrRepo.save(memAddrP);
		log.info("Successfully created member address with ID: {}", savedMemAddrP.getId());
		MDC.clear();
		return this.convertEntityToDto(savedMemAddrP);
	}

	@Override
	public List<MemberAddressDto> getAllMemberAddress() {
		log.info("Fetching all member addresses");
		List<MemberAddress> listOfMemAddr = this.memberAddrRepo.findAll();
		List<MemberAddressDto> listOfMemAddrDtos = listOfMemAddr.stream()
				.map(memAddrlist -> this.convertEntityToDto(memAddrlist)).collect(Collectors.toList());
		log.info("Successfully fetched {} member addresses", listOfMemAddrDtos.size());
		MDC.clear();
		return listOfMemAddrDtos;

	}

	private MemberAddressDto convertEntityToDto(MemberAddress memAddr) {
		MemberAddressDto memAddrDto = this.modelMapper.map(memAddr, MemberAddressDto.class);
		return memAddrDto;
	}

	private MemberAddress convertDtoToEntity(MemberAddressDto memAddrDto) {
		MemberAddress memAddr = this.modelMapper.map(memAddrDto, MemberAddress.class);
		return memAddr;

	}

	@Override
	public MemberAddressDto updateMemberAddress(MemberAddressDto memAddrDto, String membersid) {
		log.info("Updating member address with ID: {}", membersid);
		MemberAddress memAddr = this.memberAddrRepo.findById(membersid)
				.orElseThrow(() -> new ResourceNotFoundException("MemberDetails", "Id", membersid));
		memAddr.setId(memAddrDto.getId());
		memAddr.setAddress(memAddrDto.getAddress());
		memAddr.setDistrict(memAddrDto.getDistrict());
		memAddr.setState(memAddrDto.getState());
		memAddr.setPincode(memAddrDto.getPincode());
		memAddr.setRationNo(memAddrDto.getRationNo());

		MemberAddress updatedmemberAddress = this.memberAddrRepo.save(memAddr);
		MemberAddressDto memAddrDto1 = this.convertEntityToDto(updatedmemberAddress);
		log.info("Successfully updated member address with ID: {}", updatedmemberAddress.getId());
		MDC.clear();
		return memAddrDto1;
	}

	@Override
	public MemberAddressDto getMemAddressById(String id) {
		log.info("Fetching member address with ID: {}", id);
		MemberAddress memP = this.memberAddrRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("MemberAddress", "Id", id));
		log.info("Successfully fetched member address with ID: {}", id);
		MDC.clear();
		return this.convertEntityToDto(memP);

	}

	@Override
	public void deleteMemberAddress(String id) {
		log.info("Deleting member address with ID: {}", id);
		MDC.put("memberAddress", id);
		MemberAddress memP = this.memberAddrRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("MemberAddress", "Id", id));

		this.memberAddrRepo.delete(memP);
		log.info("Successfully deleted member address with ID: {}", id);
		MDC.clear();
	}

}
