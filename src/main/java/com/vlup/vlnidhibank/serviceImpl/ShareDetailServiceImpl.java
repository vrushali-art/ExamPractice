package com.vlup.vlnidhibank.serviceImpl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.dto.ShareDetailDto;
import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.entity.ShareDetail;
import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
import com.vlup.vlnidhibank.repository.ShareDetailRepository;
import com.vlup.vlnidhibank.service.ShareDetailService;




@Service
public class ShareDetailServiceImpl implements ShareDetailService{
	
	
	@Autowired
	private ShareDetailRepository shareDetailRepo; 
	
	@Autowired
	private ModelMapper modelMapper;

	

	private ShareDetailDto convertEntityToDto(ShareDetail shareDetail) {
		ShareDetailDto shareDetailDto=this.modelMapper.map(shareDetail, ShareDetailDto.class);
  	  return  shareDetailDto; 
    }

    
    
    private ShareDetail convertDtoToEntity(ShareDetailDto shareDetailDto) {
    	ShareDetail shareDetail=this.modelMapper.map(shareDetailDto,  ShareDetail.class);
    	  return shareDetail;
      }
	
    
	@Override
	public List<ShareDetailDto> getAllShareDetails() {
		List<ShareDetail> shareDetailList= this.shareDetailRepo.findAll();
		List<ShareDetailDto> listOfShareDtos=shareDetailList.stream().map(slist->this.convertEntityToDto(slist)).collect(Collectors.toList());
		return listOfShareDtos;
	}

	
	public String generateMemberCode() {
        // Fetch the last inserted member code from the repository (or any other persistent storage)
		ShareDetail lastMember = shareDetailRepo.findTopByOrderByShareIdDesc();
        int lastMemberCode = (lastMember != null) ? extractNumericSuffix(lastMember.getShareId()) : 0;

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
    
   
	
	@Override
	public ShareDetailDto createShareDetail(ShareDetailDto shareDetailDto) {
		ShareDetail share=convertDtoToEntity(shareDetailDto);
		String memberCode = generateMemberCode();
		share.setShareId(memberCode);
		ShareDetail savedShare=this.shareDetailRepo.save(share);
		return this.convertEntityToDto(savedShare);
	}
	
	

	@Override
	public ShareDetailDto updateShareDetail(ShareDetailDto shareDetailDto, String shareDetailid) {
		ShareDetail share=this.shareDetailRepo
				          .findById(shareDetailid)
				          .orElseThrow(()-> new ResourceNotFoundException("Share","Id",shareDetailid));
	
		share.setShareId(shareDetailDto.getShareId());
		share.setInstallmentNo(shareDetailDto.getInstallmentNo());
		share.setShareAllotedFrom(shareDetailDto.getShareAllotedFrom());
		share.setPreviousShareBalance(shareDetailDto.getPreviousShareBalance());
		share.setPreviousNoOfShare(shareDetailDto.getPreviousNoOfShare());
		share.setFolioNo(shareDetailDto.getFolioNo());
		share.setDno(shareDetailDto.getDno());
		share.setUnallotedShare(shareDetailDto.getUnallotedShare());
		share.setTransferDate(shareDetailDto.getTransferDate());
		share.setTransferAmount(shareDetailDto.getTransferAmount());
		share.setShareNumber(shareDetailDto.getShareNumber());
		share.setShareValue(shareDetailDto.getShareValue());
		share.setTotalShares(shareDetailDto.getTotalShares());
		share.setIssueDate(shareDetailDto.getIssueDate());
		share.setMaturityDate(shareDetailDto.getMaturityDate());
		share.setPaymentBy(shareDetailDto.getPaymentBy());
	    share.setStatus(shareDetailDto.getStatus());
		share.setDividendsEarned(shareDetailDto.getDividendsEarned());
		share.setCreatedAt(shareDetailDto.getCreatedAt());
		share.setUpdatedAt(shareDetailDto.getUpdatedAt());
		share.setRemarks(shareDetailDto.getRemarks());
		share.setFees(shareDetailDto.getFees());
		share.setMemberfees(shareDetailDto.getMemberFees());
		 ShareDetail updateShare= this.shareDetailRepo.save(share);
		 ShareDetailDto shareDetailPDto1=this.convertEntityToDto(updateShare);
		    
		    return shareDetailPDto1;
	}
 
	
	@Override
	public ShareDetailDto getShareDetailById(String id) {
		ShareDetail shareDetail=this.shareDetailRepo
				                .findById(id)
				                .orElseThrow(()->new ResourceNotFoundException("Share","Id",id));
		return this.convertEntityToDto(shareDetail);
	}
	

	@Override
	public void deleteShareDetail(String id) {
		ShareDetail share = this.shareDetailRepo
				.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Share","Id",id));
		this.shareDetailRepo.delete(share);
	}
	
//	public List<ShareDetailDto> getSharesByMemberId(Integer memberId) {
//        return shareDetailRepo.findByMemberId(memberId).stream()
//                .map(this::convertEntityToDto)
//                .collect(Collectors.toList());
//    }

}
