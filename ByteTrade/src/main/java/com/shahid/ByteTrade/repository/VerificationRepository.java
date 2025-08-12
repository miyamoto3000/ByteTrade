package com.shahid.ByteTrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.VerificationCode;

public interface VerificationRepository extends JpaRepository<VerificationCode,Long> {
    VerificationCode findByUserId(Long userId);
}
