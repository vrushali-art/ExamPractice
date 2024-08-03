package com.vlup.vlnidhibank;


import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;


import com.vlup.vlnidhibank.dto.MemberEntityDto;
import com.vlup.vlnidhibank.repository.MemberEntityRepository;
import com.vlup.vlnidhibank.service.MemberEntityService;
import com.vlup.vlnidhibank.serviceImpl.MemberEntityServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MemberEntityServiceImplTest {

	@InjectMocks
	private MemberEntityServiceImpl memberService;

	@MockBean
	private MemberEntityRepository memberRepo;

	@BeforeEach
	void setUp() {
		this.memberService = new MemberEntityServiceImpl(this.memberRepo);
		System.out.println("Setting up");
	}

	@Test
	void getAllMembers() {

		memberService.getAllMember();

		verify(memberRepo.findAll());
		/*
		 * MemberEntity member1 = new MemberEntity(1, "John Doe"); MemberEntity member2
		 * = new MemberEntity(2, "Jane Doe");
		 * 
		 * when(memberRepo.findAll()).thenReturn(Arrays.asList(member1, member2));
		 * 
		 * List<MemberEntityDto> actualResult = memberService.getAllMember();
		 * 
		 * assertThat(actualResult).hasSize(2);
		 * assertThat(actualResult.get(0).getName()).isEqualTo("John Doe");
		 * assertThat(actualResult.get(1).getName()).isEqualTo("Jane Doe");
		 * 
		 * verify(memberRepo, times(1)).findAll();
		 */
	}

	@AfterEach
	void tearDown() {
		System.out.println("Tearing down");
		memberRepo.deleteAll();
	}
}
