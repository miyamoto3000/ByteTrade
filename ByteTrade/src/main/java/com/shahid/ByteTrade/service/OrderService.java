package com.shahid.ByteTrade.service;


import java.util.List;

import com.shahid.ByteTrade.domain.OrderType;
import com.shahid.ByteTrade.model.Coin;
import com.shahid.ByteTrade.model.Order;
import com.shahid.ByteTrade.model.OrderItem;
import com.shahid.ByteTrade.model.User;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}