package com.vlup.vlnidhibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlup.vlnidhibank.entity.Admin;


@Repository
public interface AdminRepository  extends JpaRepository<Admin, Long>{

	
	
}
