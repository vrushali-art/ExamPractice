package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.MemberAddressDto;



public interface MemberAddressService {

	
	List<MemberAddressDto> getAllMemberAddress(); 
	 MemberAddressDto createMemberAddress(MemberAddressDto memPDto);
	 MemberAddressDto updateMemberAddress(MemberAddressDto memPDto, String membersid);
	 MemberAddressDto getMemAddressById(String id);
	void deleteMemberAddress(String id);
}
