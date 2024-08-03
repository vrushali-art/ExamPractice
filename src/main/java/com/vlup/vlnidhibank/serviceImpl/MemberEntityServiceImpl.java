package com.vlup.vlnidhibank.serviceImpl;

import java.lang.reflect.Member;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.BranchDto;
//import com.codegeneration.SequenceCodeGenerator.dto.MembersDto;
//import com.codegeneration.SequenceCodeGenerator.entity.Members;
import com.vlup.vlnidhibank.dto.MemberAddressDto;
import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.entity.Branch;
import com.vlup.vlnidhibank.entity.MemberAddress;
import com.vlup.vlnidhibank.entity.MemberEntity;
import com.vlup.vlnidhibank.entity.MemberPersonalDetail;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.entity.ShareDetail;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.BranchRepository;
import com.vlup.vlnidhibank.repository.MemberAddressRepository;
import com.vlup.vlnidhibank.repository.MemberEntityRepository;
import com.vlup.vlnidhibank.repository.MemberPersonalDetailRepository;
import com.vlup.vlnidhibank.repository.NomineeRepository;
import com.vlup.vlnidhibank.repository.ShareDetailRepository;
//import com.vlup.vlnidhibank.entity.Nominee;
//import com.vlup.vlnidhibank.entity.ShareDetail;
//import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
//import com.vlup.vlnidhibank.repository.MemberAddressRepository;
//import com.vlup.vlnidhibank.repository.MemberEntityRepository;
//import com.vlup.vlnidhibank.repository.ShareDetailRepository;
//import com.vlup.vlnidhibank.service.MemberEntityService;
import com.vlup.vlnidhibank.service.MemberEntityService;

import lombok.AllArgsConstructor;

@Service
public class MemberEntityServiceImpl implements MemberEntityService {

	//for the mockito test case pass the object through constructor
	public MemberEntityServiceImpl(MemberEntityRepository memberRepo) {
		super();
		this.memberRepo = memberRepo;
	}

	private static final Logger log = LoggerFactory.getLogger(MemberEntityServiceImpl.class);
	@Autowired
	private MemberEntityRepository memberRepo;

	@Autowired
	private MemberAddressRepository memberAddressRepo;

	@Autowired
	private MemberPersonalDetailRepository memPerRepo;

	@Autowired
	private NomineeRepository nomineeRepo;

	@Autowired
	private BranchRepository branchRepo;

	@Autowired
	private ShareDetailRepository shareDetailRepo;

	@Autowired
	private ModelMapper modelMapper;

	private MemberEntity convertDtoToEntity(MemberEntityDto memberDto) {
		MemberEntity member = this.modelMapper.map(memberDto, MemberEntity.class);
		return member;
	}

	private MemberEntityDto convertEntityToDto(MemberEntity member) {
		MemberEntityDto memberDto = this.modelMapper.map(member, MemberEntityDto.class);
		return memberDto;
	}

	private String generateMemberCode() {
		// Fetch the last inserted member code from the repository (or any other
		// persistent storage)
		MemberEntity lastMember = memberRepo.findTopByOrderByMemberCodeDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix(lastMember.getMemberCode()) : 0;

		// Increment the counter
		int newId = lastMemberCode + 1;

		// Determine the width of the numeric part based on the value of newId
		int idWidth = Math.max(5, String.valueOf(newId).length()); // Minimum width of 5 digits

		// Format the new ID
		String formattedId = "VL" + String.format("%0" + idWidth + "d", newId);

		return formattedId;
	}

	private int extractNumericSuffix(String memberCode) {
		// Extract the numeric part of the member code and convert it to an integer
		String numericSuffix = memberCode.substring(2); // Exclude the "VL" prefix
		return Integer.parseInt(numericSuffix);
	}

	public String generateMemberAddId() {
		// Fetch the last inserted member code from the repository (or any other
		// persistent storage)
		MemberAddress lastMember = memberAddressRepo.findTopByOrderByIdDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix1(lastMember.getId()) : 0;

		// Increment the counter
		int newId = lastMemberCode + 1;

		// Format the new ID
		String formattedId = String.format("%d", newId);

		return formattedId;
	}

	private int extractNumericSuffix1(String membersId) {
		// Extract the numeric part of the member code and convert it to an integer
		return Integer.parseInt(membersId);
	}

	public String generateMemberPersonalCode() {
		// Fetch the last inserted member code from the repository (or any other
		// persistent storage)
		MemberPersonalDetail lastMember = memPerRepo.findTopByOrderByMembersIdDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix2(lastMember.getMembersId()) : 0;

		// Increment the counter
		int newId = lastMemberCode + 1;

		// Format the new ID
		String formattedId = String.format("%d", newId);

		return formattedId;
	}

	private int extractNumericSuffix2(String membersId) {
		// Extract the numeric part of the member code and convert it to an integer
		return Integer.parseInt(membersId);
	}

	public String generateNomineeId() {
		// Fetch the last inserted member code from the repository (or any other
		// persistent storage)
		Nominee lastMember = nomineeRepo.findTopByOrderByNomineeIdDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix3(lastMember.getNomineeId()) : 0;

		// Increment the counter
		int newId = lastMemberCode + 1;

		// Format the new ID
		String formattedId = String.format("%d", newId);

		return formattedId;
	}

	private int extractNumericSuffix3(String membersId) {
		// Extract the numeric part of the member code and convert it to an integer
		return Integer.parseInt(membersId);
	}

	// By writing custom code generate auto_increment code.
	public String generateBranchCode() {
		MemberEntity lastMember = memberRepo.findTopByOrderByBranchCodesDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix4(lastMember.getBranchCodes()) : 0;

		int newId = lastMemberCode + 1;

		// String formattedId = String.format("%03d", newId);
		String formattedId = String.format("%d", newId);

		// No fixed width for the branch code; it will grow dynamically as the number of
		// branches increases
		// String formattedId = String.format("%d", newId);
		return formattedId;
	}

	private int extractNumericSuffix4(String branchCode) {
		if (branchCode == null || branchCode.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(branchCode);
	}

	// By writing custom code generate auto_increment code.
	public String generateBranchCodes() {
		Branch branch = branchRepo.findTopByOrderByBranchCodeDesc();
		int lastMemberCode = (branch != null) ? extractNumericSuffix51(branch.getBranchCode()) : 0;

		int newId = lastMemberCode + 1;

//    	String formattedId = String.format("%03d", newId);
		String formattedId = String.format("%d", newId);

		// No fixed width for the branch code; it will grow dynamically as the number of
		// branches increases
		// String formattedId = String.format("%d", newId);
		return formattedId;
	}

	private int extractNumericSuffix51(String branchCodes) {
		if (branchCodes == null || branchCodes.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(branchCodes);
	}

	public String generateShareDetailCode() {
		// Fetch the last inserted member code from the repository (or any other
		// persistent storage)
		ShareDetail lastMember = shareDetailRepo.findTopByOrderByShareIdDesc();
		int lastMemberCode = (lastMember != null) ? extractNumericSuffix51(lastMember.getShareId()) : 0;

		// Increment the counter
		int newId = lastMemberCode + 1;

		// Format the new ID
		String formattedId = String.format("%d", newId);

		return formattedId;
	}

	private int extractNumericSuffix5(String membersId) {
		// Extract the numeric part of the member code and convert it to an integer
		return Integer.parseInt(membersId);
	}

	@Override
	public MemberEntityDto createMember(MemberEntityDto memberDto) {

		log.info("Creating new member with details: {}", memberDto);
		String memberCode = generateMemberCode();
		memberDto.setMemberCode(memberCode);

		String branchCode = generateBranchCode();
		memberDto.setBranchCodes(branchCode);

		MemberEntity member = convertDtoToEntity(memberDto);

		// Set concatenatedMemberName before saving
		member.setSearchByCode(member.getSearchByCode());

		// Set concatenatedBranchNames before saving
		member.setConcatenatedBranchNames(member.getConcatenatedBranchNames());

		// Handle member address association
		if (member.getMemberAddress() != null) {
			MemberAddress memberAddress = member.getMemberAddress();
			memberAddress.setId(generateMemberAddId()); // Generate ID
			MemberAddress savedAddress = memberAddressRepo.save(memberAddress);
			member.setMemberAddress(savedAddress);
		}

		// Handle member personal detail association
		if (member.getMemPerDetail() != null) {
			MemberPersonalDetail memPDetail = member.getMemPerDetail();
			memPDetail.setMembersId(generateMemberPersonalCode()); // Generate ID
			MemberPersonalDetail savedMemPDetail = memPerRepo.save(memPDetail);
			member.setMemPerDetail(savedMemPDetail);
		}

		// Handle Nominee association
		if (member.getNominee() != null) {
			Nominee nominee = member.getNominee();
			nominee.setNomineeId(generateNomineeId()); // Generate ID
			Nominee savedNominee = nomineeRepo.save(nominee);
			member.setNominee(savedNominee);
		}

		// Set concatenatedBranchName before saving
	   // setConcatenatedBranchName(member);

		if (member.getShares() != null) {
			ShareDetail shareDetail = member.getShares();
			shareDetail.setShareId(generateShareDetailCode());
			ShareDetail savedShareDetail = shareDetailRepo.save(shareDetail);
			member.setShares(savedShareDetail);
		}

		// Handle branch association
		if (member.getBranch() != null) {
			Branch branch = member.getBranch();
			branch.setBranchCode(generateBranchCodes()); // Generate branch code and set it
			Branch savedBranch = branchRepo.save(branch);
			member.setBranch(savedBranch);
		}

		MemberEntity savedMember = memberRepo.save(member);
		log.info("Successfully created member with code: {}", savedMember.getMemberCode());
		MDC.clear();
		return this.convertEntityToDto(savedMember);
	}

//	private String generateConcatenatedBranchName(Branch branch) {
//        // Example logic to generate concatenated branch name
//        return branch.getBranchName() + "_" + branch.getBranchCode();
//    }

	@Override
	public MemberEntityDto updateMember(MemberEntityDto memberDto, String memberCode) {
		log.info("Updating member with code: {}", memberCode);
		MemberEntity existingMember = memberRepo.findById(memberCode)
				.orElseThrow(() -> new ResourceNotFoundException("Member", "Code", memberCode));
		modelMapper.map(memberDto, existingMember);
		MemberEntity updatedMember = memberRepo.save(existingMember);

		log.info("Successfully updated member with code: {}", updatedMember.getMemberCode());
		MDC.clear();
		return convertEntityToDto(updatedMember);
	}

//	@Override
//	public MemberEntityDto updateMember(MemberEntityDto memberDto, String memberid) {
//		MemberEntity member= this.memberRepo
//				      .findById(memberid)
//				      .orElseThrow(()->new ResourceNotFoundException("Member","Code",memberid));
//		   
//		member.setRemarks(memberDto.getRemarks());
//		member.setSearchByCode(memberDto.getMemberCode());
//		member.setStatus(memberDto.getStatus());
//		
////		member.setC2(memberDto.getC2());
////		member.setC3(memberDto.getC3());
////		member.setMemberAddress(memberDto.getMemberAddress());
////		member.setMemPerDetail(memberDto.getMemPerDetail());
////		member.setBranch(memberDto.getBranch());
////		member.setNominee(memberDto.getNominee());
////		member.setShares(memberDto.getShares());
//		
//		MemberEntity updateMemberEntity= this.memberRepo.save(member);
//	    MemberEntityDto memDto1=this.convertEntityToDto(updateMemberEntity);
//		return memDto1;
//	}

	@Override
	public List<MemberEntityDto> getAllMember() {
		log.info("Fetching all members");
		List<MemberEntity> memEntityList = this.memberRepo.findAll();
		List<MemberEntityDto> listOfMemEntityDtos = memEntityList.stream()
				.map(mElist -> this.convertEntityToDto(mElist)).collect(Collectors.toList());

		MDC.clear();
		return listOfMemEntityDtos;
	}

	@Override
	public MemberEntityDto getMemberById(String id) {
		MDC.put("membersId", id);
		log.info("Fetching member with id: {}", id);

		MemberEntity member = memberRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Member", "Code", id));
		MDC.clear();
		return convertEntityToDto(member);
	}

	@Override
	public void deleteMember(String id) {
		log.info("Deleting member with id: {}", id);

		MemberEntity member = memberRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Member", "Code", id));
		memberRepo.delete(member);

		log.info("Successfully deleted member with id: {}", id);
		MDC.clear();
	}
}
