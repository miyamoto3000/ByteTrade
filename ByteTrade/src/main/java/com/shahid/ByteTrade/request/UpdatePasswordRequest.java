package com.shahid.ByteTrade.request;

import com.shahid.ByteTrade.domain.VerificationType;

import lombok.Data;

@Data
public class UpdatePasswordRequest {
    private String sendTo;
    private VerificationType verificationType;
}
