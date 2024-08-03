package com.vlup.vlnidhibank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlup.vlnidhibank.dto.MemberAddressDto;
import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.dto.NomineeDto;
//import com.vlup.vlnidhibank.entity.ShareDetail;




public interface MemberEntityService {
	
	MemberEntityDto createMember(MemberEntityDto memberDto);
	MemberEntityDto updateMember(MemberEntityDto memberDto, String memberid);
	List<MemberEntityDto> getAllMember(); 
	
	MemberEntityDto getMemberById(String id);
	
	void deleteMember(String id);
	
   
}
