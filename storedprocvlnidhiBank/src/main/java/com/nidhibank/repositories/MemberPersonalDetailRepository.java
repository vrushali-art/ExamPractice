package com.nidhibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidhibank.entities.MemberPersonalDetail;

@Repository
public interface MemberPersonalDetailRepository extends JpaRepository<MemberPersonalDetail, Long> {

}
