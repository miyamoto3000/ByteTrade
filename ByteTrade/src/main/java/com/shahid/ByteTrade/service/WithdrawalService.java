package com.shahid.ByteTrade.service;
import lombok.With;

import java.util.List;

import com.shahid.ByteTrade.model.User;
import com.shahid.ByteTrade.model.Withdrawal;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(Long amount,User user);
    Withdrawal procedWithdrawal(Long withdrawalId,boolean accept) throws Exception;
    List<Withdrawal> getUsersWithdrawalHistory(User user);
    List<Withdrawal> getAllWithdrawalRequest();
}
