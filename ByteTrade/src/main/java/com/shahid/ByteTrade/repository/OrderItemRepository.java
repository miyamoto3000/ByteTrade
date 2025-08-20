package com.shahid.ByteTrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
