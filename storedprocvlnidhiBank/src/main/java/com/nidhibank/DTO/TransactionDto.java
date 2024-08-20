package com.nidhibank.DTO;

import java.time.LocalDateTime;

public record TransactionDto(Long id, String accountId, double amount, String transactionType,
		String timestamp) {

	public Long id() {
		return id;
	}

	public String accountId() {
		return accountId;
	}

	public double amount() {
		return amount;
	}

	public String transactionType() {
		return transactionType;
	}

	public String timestamp() {
		return timestamp;
	}
}