package com.shahid.ByteTrade.service;

import java.math.BigDecimal;

import com.shahid.ByteTrade.exception.WalletException;
import com.shahid.ByteTrade.model.Order;
import com.shahid.ByteTrade.model.User;
import com.shahid.ByteTrade.model.Wallet;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;



}
