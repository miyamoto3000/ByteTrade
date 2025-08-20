package com.shahid.ByteTrade.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.Wallet;
import com.shahid.ByteTrade.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
