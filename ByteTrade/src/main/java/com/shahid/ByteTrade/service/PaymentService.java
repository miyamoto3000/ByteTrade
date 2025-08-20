package com.shahid.ByteTrade.service;

import com.razorpay.RazorpayException;
import com.shahid.ByteTrade.domain.PaymentMethod;
import com.shahid.ByteTrade.model.PaymentOrder;
import com.shahid.ByteTrade.model.User;
import com.shahid.ByteTrade.response.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount, PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    Boolean ProccedPaymentOrder (PaymentOrder paymentOrder,
                                 String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user,
                                              Long Amount,
                                              Long orderId) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long Amount,
                                            Long orderId) throws StripeException;
}