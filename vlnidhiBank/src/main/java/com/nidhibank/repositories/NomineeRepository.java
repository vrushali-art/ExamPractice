package com.nidhibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nidhibank.entities.Nominee;

public interface NomineeRepository extends JpaRepository<Nominee, Integer> {

}
