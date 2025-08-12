package com.shahid.ByteTrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.TwoFactorOTP;

public interface TwoFactorOtpRepository extends JpaRepository<TwoFactorOTP,String> {

    TwoFactorOTP findByUserId(Long userId);
}
