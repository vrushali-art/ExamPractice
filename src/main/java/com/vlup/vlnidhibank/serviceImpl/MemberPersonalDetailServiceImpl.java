package com.vlup.vlnidhibank.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;
import com.vlup.vlnidhibank.entity.MemberEntity;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.MemberPersonalDetailRepository;
import com.vlup.vlnidhibank.service.MemberPersonalDetailService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
@AllArgsConstructor
public class MemberPersonalDetailServiceImpl implements MemberPersonalDetailService {

	private static final Logger log = LoggerFactory.getLogger(MemberPersonalDetailServiceImpl.class);

	@Autowired
	private MemberPersonalDetailRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	public String generateMemberCode() {
		// Fetch the last inserted member code from the repository (or any other
		// persistent storage)
		MemberPersonalDetail lastMember = repository.findTopByOrderByMembersIdDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix(lastMember.getMembersId()) : 0;

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

	private MemberPersonalDetailDto convertEntityToDto(MemberPersonalDetail memP) {
		MemberPersonalDetailDto memPDto = this.modelMapper.map(memP, MemberPersonalDetailDto.class);
		return memPDto;
	}

	private MemberPersonalDetail convertDtoToEntity(MemberPersonalDetailDto memPDto) {
		MemberPersonalDetail memP = this.modelMapper.map(memPDto, MemberPersonalDetail.class);
		return memP;

	}

	public List<MemberPersonalDetailDto> getAllMembersPDetail() {
		List<MemberPersonalDetail> listOfMemPDeatil = this.repository.findAll();
		List<MemberPersonalDetailDto> listOfMemPDtos = listOfMemPDeatil.stream()
				.map(memPlist -> this.convertEntityToDto(memPlist)).collect(Collectors.toList());

		return listOfMemPDtos;
	}

	@Override
	public MemberPersonalDetailDto createMemPersonalDetail(MemberPersonalDetailDto memPDto) {
		log.info("Creating new member with details: {}", memPDto);
		MemberPersonalDetail memP = convertDtoToEntity(memPDto);
		String memberCode = generateMemberCode();
		memP.setMembersId(memberCode);

		MemberPersonalDetail savedMemP = repository.save(memP); // Save entity
		log.info("Successfully created member personal details with code: {}", savedMemP.getMembersId());
		MDC.clear();
		return convertEntityToDto(savedMemP); // Convert and return DTO
	}

	@Override
	public MemberPersonalDetailDto updateMemPersonalDetail(MemberPersonalDetailDto memPDto, String membersid) {
		log.info("Updating member personal details with code: {}", membersid);

		MemberPersonalDetail mem = this.repository.findById(membersid)
				.orElseThrow(() -> new ResourceNotFoundException("Branch", "Id", membersid));

		mem.setMembersId(memPDto.getMembersId());
		mem.setRegistrationDate(memPDto.getRegistrationDate());
		mem.setGender(memPDto.getGender());
		mem.setDob(memPDto.getDob());
		mem.setAge(memPDto.getAge());
		mem.setMaritalStatus(memPDto.getMaritalStatus());
		mem.setAadharNo(memPDto.getAadharNo());
		mem.setPanNo(memPDto.getPanNo());
		mem.setVoterId(memPDto.getVoterId());
		mem.setDrivingLiscNo(memPDto.getDrivingLiscNo());
		mem.setMobileNo(memPDto.getMobileNo());
		mem.setEmailId(memPDto.getEmailId());
		mem.setOccupation(memPDto.getOccupation());
		mem.setEducation(memPDto.getEducation());
		mem.setVerificationMethod(memPDto.getVerificationMethod());
		mem.setAadharNo(memPDto.getAadharNo());
		mem.setOtp(memPDto.getOtp());
		mem.setEnterAadharNumber(memPDto.getEnterAadharNumber());
		MemberPersonalDetail updatemem = this.repository.save(mem);
		MemberPersonalDetailDto memPDto1 = this.convertEntityToDto(updatemem);

		log.info("Successfully updated member personal details with code: {}", updatemem.getMembersId());
		MDC.clear();
		return memPDto1;

	}

	@Override
	public MemberPersonalDetailDto getMemberPDetailById(String id) {
		MDC.put("membersId", id);
		log.info("Fetching member personal details  with id: {}", id);
		MemberPersonalDetail mem = this.repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("memberPersonalDetail", "Id", id));
		MDC.clear();
		return this.convertEntityToDto(mem);

	}

	@Override
	public void deleteMember(String id) {
		log.info("Deleting member personal details with id: {}", id);
		MemberPersonalDetail mem = this.repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("memberPersonalDetail", "Id", id));
		MDC.clear();
		this.repository.delete(mem);
	}

	public MemberPersonalDetailServiceImpl(MemberPersonalDetailRepository memberPersonalRepo) {
		this.repository= memberPersonalRepo;
		// TODO Auto-generated constructor stub
	}

	public MemberPersonalDetailServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
}
