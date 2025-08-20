package com.shahid.ByteTrade.service;

import com.shahid.ByteTrade.domain.VerificationType;
import com.shahid.ByteTrade.model.ForgotPasswordToken;
import com.shahid.ByteTrade.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
