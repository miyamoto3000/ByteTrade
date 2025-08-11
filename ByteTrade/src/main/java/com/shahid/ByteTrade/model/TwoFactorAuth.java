package com.shahid.ByteTrade.model;

import com.shahid.ByteTrade.domain.VerificationType;

import lombok.Data;
 
@Data
public class TwoFactorAuth {
     
    private boolean isEnabled=false;
    private VerificationType sendTo;
    
}
