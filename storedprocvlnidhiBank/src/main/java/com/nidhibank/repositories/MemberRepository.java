package com.nidhibank.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nidhibank.DTO.AddSBAccountDto;
import com.nidhibank.DTO.MemberApprovalDto;
import com.nidhibank.DTO.MemberKycDto;
import com.nidhibank.DTO.MemberReportDto;
import com.nidhibank.DTO.MemberSearchDto;
import com.nidhibank.DTO.MemberSummaryDto;
import com.nidhibank.DTO.ShareCertificateDto;
import com.nidhibank.DTO.ShareTransferDto;
import com.nidhibank.DTO.UnallotedShareReportDto;
import com.nidhibank.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	
	Optional<Member> findByMemberCode(String memberCode);

	Optional<Member> findTopByOrderByIdDesc();

	List<Member> findBySearchByCode(String searchByCode);
	
	 
	@Query("SELECT new com.vlup.vlnidhi.dto.MemberSummaryDto(m.memberCode, m.memberName, m.registrationDate, "
		       + "mpd.address, mpd.pincode, mpd.state, mpd.mobileNo, mpd.aadharNo, mpd.panNo, m.nomineeName, "
		       + "mpd.emailId, mpd.dob, mpd.age, b.branchCode, mpd.gender) "
		       + "FROM Member m "
		       + "JOIN memberPersonalDetail mpd ON m.id = mpd.member.id "
		       + "JOIN branch b ON m.branch.id = b.id "
		       + "WHERE m.searchByCode = :searchByCode")
		MemberSummaryDto findMemberDetailsBySearchByCode(@Param("searchByCode") String searchByCode);
	
	
	@Query("SELECT new com.vlup.vlnidhi.dto.MemberReportDto(m.memberCode, m.memberName, b.cspCode, m.registrationDate, m.nomineeName, mpd.address, mpd.mobileNo, mpd.aadharNo, mpd.panNo) " +
		       "FROM Member m " +
		       "JOIN m.branch b " +
		       "JOIN m.memberPersonalDetail mpd " +
		       "WHERE b.branchName = :branchName " +
		       "AND m.registrationDate BETWEEN :fromDate AND :toDate")
		List<MemberReportDto> findMembersByBranchAndRegistrationDateRange(String branchName, LocalDate fromDate, LocalDate toDate);

	
	@Query("SELECT new com.vlup.vlnidhi.dto.MemberSearchDto(m.memberCode, m.memberName, mpd.gender, m.registrationDate, mpd.aadharNo, mpd.panNo, mpd.mobileNo, m.nomineeName, m.status) " +
		       "FROM Member m " +
		       "JOIN m.branch b " +
		       "JOIN m.memberPersonalDetail mpd " +
		       "WHERE b.branchName = :branchName " +
		       "AND m.registrationDate BETWEEN :fromDate AND :toDate " +
		       "AND (" +
		       "m.memberName = :memberName OR :memberName IS NULL OR :memberName = '' " +
		       "OR m.memberCode = :memberCode OR :memberCode IS NULL OR :memberCode = '' " +
		       "OR mpd.mobileNo = :mobileNo OR :mobileNo IS NULL OR :mobileNo = '' " +
		       "OR mpd.aadharNo = :aadharNo OR :aadharNo IS NULL OR :aadharNo = '' " +
		       "OR mpd.panNo = :panNo OR :panNo IS NULL OR :panNo = '' " +
		       ")")
		Optional<MemberSearchDto> findMembersByBranchAndRegistrationDateRangeAndOptionalParameters(
		        String branchName, LocalDate fromDate, LocalDate toDate,
		        String memberName, String memberCode, String mobileNo,
		        String aadharNo, String panNo);
	
	@Query("SELECT new com.vlup.vlnidhi.dto.MemberKycDto(m.memberCode, m.memberName, mpd.mobileNo, m.registrationDate, mpd.aadharNo, mpd.panNo) " +
	           "FROM Member m " +
	           "JOIN m.memberPersonalDetail mpd " +
	           "WHERE m.searchByCode = :searchByCode")
	    Optional<MemberKycDto> findMemberKycBySearchByCode(@Param("searchByCode") String searchByCode);

	
	@Query("SELECT new com.vlup.vlnidhi.dto.ShareTransferDto(" +
		       "m.memberName, m.registrationDate, a.previousShareBalance, a.previousNoOfShare, m.memberCode, " +
		       "a.transferDate,a.shareValue, a.transferAmount, a.noOfShare, a.folioNo, " +   
		       "a.dno, a.paymentBy) " +
		       "FROM Member m " +
		       "JOIN m.account a " +
		       "WHERE m.memberCode = :searchByCode OR a.shareAllotedFrom = :searchByCode")
		List<ShareTransferDto> fetchMemberDetailsBySearchByCode(@Param("searchByCode") String searchByCode);
	
	
	@Query("SELECT new com.vlup.vlnidhi.dto.UnallotedShareReportDto(" +
	           "   m.memberCode, m.memberName, a.issueDate, " +
	           "   a.noOfShare, a.shareValue, a.folioNo, a.shareAllotedFrom, a.unallotedShare) " +
	           "FROM Member m " +
	           "JOIN m.account a")
	    List<UnallotedShareReportDto> findAllUnAllotedShareReports();
	
	
	@Query("SELECT new com.vlup.vlnidhi.dto.ShareCertificateDto(" +
		       "   m.memberCode, m.memberName, a.shareValue, a.noOfShare, " +
		       "   a.folioNo, a.dno, m.status) " +
		       "FROM Member m " +
		       "JOIN m.account a " +
		       "WHERE m.searchByCode = :searchByCode")
		List<ShareCertificateDto> findAllShareCertificatesBySearchByCode(@Param("searchByCode") String searchByCode);
	
	@Query("SELECT new com.vlup.vlnidhi.dto.MemberApprovalDto(m.memberCode, m.memberName, mpd.gender, m.registrationDate, mpd.mobileNo, a.fees, a.noOfShare) " +
	           "FROM Member m " +
	           "JOIN m.memberPersonalDetail mpd " +
	           "JOIN m.account a " +
	           "JOIN m.branch b " + 
	           "WHERE b.branchName = :branchName " +
	           "AND m.registrationDate BETWEEN :fromDate AND :toDate")
	    List<MemberApprovalDto> findMembersByBranchAndDateRange(
	        String branchName,
	        LocalDate fromDate,
	        LocalDate toDate);	

	    @Query("SELECT new com.vlup.vlnidhi.dto.AddSBAccountDto(m.memberName, mpd.dob, m.nomineeRelation, mpd.mobileNo, mpd.address, mpd.district, mpd.state, mpd.pincode) " +
	           "FROM Member m " +
	           "JOIN m.memberPersonalDetail mpd " +
	           "WHERE m.searchByCode = :searchByCode")
	    Optional<AddSBAccountDto> fetchMemberPersonalDetailsByCode(@Param("searchByCode") String searchByCode);
	
}
