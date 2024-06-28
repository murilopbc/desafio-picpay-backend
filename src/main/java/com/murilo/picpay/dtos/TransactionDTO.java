package com.murilo.picpay.dtos;


import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverid) {
}
