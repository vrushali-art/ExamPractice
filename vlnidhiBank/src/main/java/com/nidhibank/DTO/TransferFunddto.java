package com.nidhibank.DTO;

public record TransferFunddto(Long fromAccountId,
                              Long toAccountId,
                              double amount) {
}