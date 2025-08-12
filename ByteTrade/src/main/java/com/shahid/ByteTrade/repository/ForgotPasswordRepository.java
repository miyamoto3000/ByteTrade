package com.shahid.ByteTrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.ForgotPasswordToken;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordToken,String> {
    ForgotPasswordToken findByUserId(Long userId);
}
