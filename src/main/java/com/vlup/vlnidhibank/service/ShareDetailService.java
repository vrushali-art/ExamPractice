package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.NomineeDto;
import com.vlup.vlnidhibank.dto.ShareDetailDto;
import com.vlup.vlnidhibank.entity.ShareDetail;

public interface ShareDetailService {

	List<ShareDetailDto> getAllShareDetails(); 
	ShareDetailDto createShareDetail(ShareDetailDto ShareDetailDto);
	ShareDetailDto updateShareDetail(ShareDetailDto shareDetailDto, String ShareDetailid);
	ShareDetailDto getShareDetailById(String id);
	
	void deleteShareDetail(String id);
}
