package com.nidhibank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nidhibank.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long>{
List<Transaction> findByAccountIdOrderByTimestampDesc(Long accountId);

}
