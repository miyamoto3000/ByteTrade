package com.shahid.ByteTrade.service;

import com.shahid.ByteTrade.model.PaymentDetails;
import com.shahid.ByteTrade.model.User;

import jakarta.persistence.OneToOne;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails( String accountNumber,
                                             String accountHolderName,
                                             String ifsc,
                                             String bankName,
                                             User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);


}
