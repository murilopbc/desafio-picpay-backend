package com.murilo.picpay.dtos;

import com.murilo.picpay.enums.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType ) {
}
