package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.MemberPersonalDetailDto;



public interface MemberPersonalDetailService {
	
	
	List<MemberPersonalDetailDto> getAllMembersPDetail(); 
	MemberPersonalDetailDto createMemPersonalDetail(MemberPersonalDetailDto memPDto);
	MemberPersonalDetailDto updateMemPersonalDetail(MemberPersonalDetailDto memPDto, String membersid);
	MemberPersonalDetailDto getMemberPDetailById(String id);
	
	void deleteMember(String id);

	public String generateMemberCode();
}
