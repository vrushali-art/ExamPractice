package com.nidhibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nidhibank.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}
