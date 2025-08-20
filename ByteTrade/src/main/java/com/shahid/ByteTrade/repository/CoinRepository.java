package com.shahid.ByteTrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.Coin;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
