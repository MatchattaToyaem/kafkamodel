package com.kafkamodel.model.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Transfer {
    private String account;
    private BigDecimal amount;
}
