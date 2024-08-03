package com.vlup.vlnidhibank;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.verify;

import com.vlup.vlnidhibank.repository.MemberPersonalDetailRepository;

import com.vlup.vlnidhibank.serviceImpl.MemberPersonalDetailServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class MemberPersonalDetailServiceImplTest {

	@InjectMocks
	private MemberPersonalDetailServiceImpl memberPersonalService;

	@MockBean
	private MemberPersonalDetailRepository memberPersonalRepo;

	@BeforeEach
	void setUp() {
		this.memberPersonalService = new MemberPersonalDetailServiceImpl(this.memberPersonalRepo);
		System.out.println("Setting up");
	}

	@Test
	public void getAllMembers() {

		memberPersonalService.getAllMembersPDetail();

		verify(memberPersonalRepo.findAll());
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
		memberPersonalRepo.deleteAll();
	}
}
