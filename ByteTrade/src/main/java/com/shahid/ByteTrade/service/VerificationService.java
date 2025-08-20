package com.shahid.ByteTrade.service;

import com.shahid.ByteTrade.domain.VerificationType;
import com.shahid.ByteTrade.model.User;
import com.shahid.ByteTrade.model.VerificationCode;

public interface VerificationService {
    VerificationCode sendVerificationOTP(User user, VerificationType verificationType);

    VerificationCode findVerificationById(Long id) throws Exception;

    VerificationCode findUsersVerification(User user) throws Exception;

    Boolean VerifyOtp(String opt, VerificationCode verificationCode);

    void deleteVerification(VerificationCode verificationCode);
}
