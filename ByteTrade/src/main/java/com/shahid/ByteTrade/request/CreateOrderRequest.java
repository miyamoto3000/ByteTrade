package com.shahid.ByteTrade.request;

import lombok.Data;

import java.math.BigDecimal;

import com.shahid.ByteTrade.domain.OrderType;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
