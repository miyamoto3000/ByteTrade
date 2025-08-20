package com.shahid.ByteTrade.service;

import java.util.List;

import com.shahid.ByteTrade.domain.WalletTransactionType;
import com.shahid.ByteTrade.model.Wallet;
import com.shahid.ByteTrade.model.WalletTransaction;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
