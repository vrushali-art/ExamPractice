package com.nidhibank.implService;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhibank.DTO.CombinedDto;
import com.nidhibank.DTO.MemberDto;

import com.nidhibank.entities.Member;
import com.nidhibank.entities.MemberPersonalDetail;
import com.nidhibank.repositories.MemberPersonalDetailRepository;
import com.nidhibank.repositories.MemberRepository;
import com.nidhibank.services.CombinedService;

@Service
public class CombinedServiceImpl implements CombinedService {

    @Autowired
    private MemberRepository memRepository;

    @Autowired
    private MemberPersonalDetailRepository memDetailRepository;
    
    @Autowired
	private ModelMapper modelMapper;

    @Override
    public CombinedDto createCombinedData(CombinedDto combinedDto) {
        // Save Member and MemberPersonalDetail data separately
    	    // Map CombinedDto to Member and MemberPersonalDetail entities
    	    Member Member = modelMapper.map(combinedDto, Member.class);
    	    MemberPersonalDetail MemberPersonalDetail = modelMapper.map(combinedDto, MemberPersonalDetail.class);

    	    // Save Member and MemberPersonalDetail data separately
    	    Member savedMember = memRepository.save(Member);
    	    MemberPersonalDetail savedMemberPersonalDetail = memDetailRepository.save(MemberPersonalDetail);

    	    // Map the saved entities back to CombinedDto
    	    CombinedDto savedCombinedDto = new CombinedDto();
    	    modelMapper.map(savedMember, savedCombinedDto);
    	    modelMapper.map(savedMemberPersonalDetail, savedCombinedDto);

    	    return savedCombinedDto;
    	}

    

//    @Override
//    public CombinedDto updateCombinedData(Long memId, Long memDetailId, CombinedDto combinedDto) {
//        Optional<MemberDto> existingMember = memRepository.findById(memId);
//        Optional<MemberPersonalDetailDto> existingMemberDetail = memDetailRepository.findById(memDetailId);
//        if (existingMember.isPresent() && existingMemberDetail.isPresent()) {
//            // Update Member and MemberPersonalDetail data
//            memRepository.save(combinedDto.getMemberId());
//            memDetailRepository.save(combinedDto.getMemberPersonalDetailId());
//            return combinedDto;
//        } else {
//            throw new RuntimeException("Member or MemberPersonalDetail not found with the provided IDs.");
//        }
//    }

    @Override
    public void deleteCombinedData(Long memId, Long memDetailId) {
        memRepository.deleteById(memId);
        memDetailRepository.deleteById(memDetailId);
    }

    @Override
    public CombinedDto getCombinedData(Long memId, Long memDetailId) {
        // Retrieve Member data by memId
        Member member = memRepository.findById(memId)
                .orElseThrow(() -> new RuntimeException("Member not found with id " + memId));

        // Retrieve MemberPersonalDetail data by memDetailId
        MemberPersonalDetail memberPersonalDetail = memDetailRepository.findById(memDetailId)
                .orElseThrow(() -> new RuntimeException("MemberPersonalDetail not found with id " + memDetailId));

        // Manually map the selected fields from Member and MemberPersonalDetail to CombinedDto
        CombinedDto combinedDto = new CombinedDto();
        
        combinedDto.setVerificationMethod(memberPersonalDetail.getVerificationMethod());
        combinedDto.setRegistrationDate(member.getRegistrationDate());
        combinedDto.setDob(memberPersonalDetail.getDob());
        combinedDto.setAadharNo(memberPersonalDetail.getAadharNo());
        combinedDto.setMemberName(member.getMemberName());
        combinedDto.setSponsorName(member.getSponsorName());
        combinedDto.setGender(memberPersonalDetail.getGender());
        combinedDto.setMstatus(memberPersonalDetail.getMstatus());
        combinedDto.setAddress(member.getAddress());
        combinedDto.setDistrict(member.getDistrict());
        combinedDto.setState(member.getState());
        combinedDto.setBranchname(member.getBranch());
        combinedDto.setPincode(memberPersonalDetail.getPincode());
        combinedDto.setPanNo(memberPersonalDetail.getPanNo());
        combinedDto.setVoterId(memberPersonalDetail.getVoterId());
        combinedDto.setMobileNo(memberPersonalDetail.getMobileNo());
        combinedDto.setEmailId(memberPersonalDetail.getEmailId());
        combinedDto.setOccupation(memberPersonalDetail.getOccupation());
        combinedDto.setEducation(memberPersonalDetail.getEducation());
        combinedDto.setIntroMemCode(member.getIntroMemCode());

        return combinedDto;
    }
    @Override
    public List<CombinedDto> getAllCombinedData() {
		return null;
        // Logic to fetch all combined data if needed
    }



	@Override
	public CombinedDto updateCombinedData(Long memId, Long memDetailId, CombinedDto combinedDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
