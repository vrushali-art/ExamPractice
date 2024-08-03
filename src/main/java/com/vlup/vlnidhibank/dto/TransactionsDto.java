package com.vlup.vlnidhibank.dto;

import java.time.LocalDateTime;

public record TransactionsDto(Long id,
                             Long accountId,
                             double amount,
                             String transactionType,
                             LocalDateTime timestamp) {

	public Long id() {
		return id;
	}

	public Long accountId() {
		return accountId;
	}

	public double amount() {
		return amount;
	}

	public String transactionType() {
		return transactionType;
	}

	public LocalDateTime timestamp() {
		return timestamp;
	}
}