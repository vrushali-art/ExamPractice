package com.nidhibank.DTO;

public record TransferFunddto(String fromAccountId,
                              String toAccountId,
                              double amount) {
}