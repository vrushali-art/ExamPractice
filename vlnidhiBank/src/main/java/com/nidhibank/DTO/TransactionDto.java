package com.nidhibank.DTO;

import java.time.LocalDateTime;

public record TransactionDto(Long id,
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