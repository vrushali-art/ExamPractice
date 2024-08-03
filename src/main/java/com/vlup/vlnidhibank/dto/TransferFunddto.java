package com.vlup.vlnidhibank.dto;

public record TransferFunddto(Long fromAccountId,
                              Long toAccountId,
                              double amount) {
}