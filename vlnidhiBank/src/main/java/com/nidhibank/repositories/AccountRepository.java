package com.nidhibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nidhibank.entities.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{

}
