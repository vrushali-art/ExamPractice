package com.vlup.vlnidhibank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.Nominee;
import com.vlup.vlnidhibank.entity.ShareDetail;

@Repository
public interface ShareDetailRepository extends JpaRepository<ShareDetail , String>{


	ShareDetail findTopByOrderByShareIdDesc();
	
}
