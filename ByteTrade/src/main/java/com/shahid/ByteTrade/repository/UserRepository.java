package com.shahid.ByteTrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.User;



public interface UserRepository extends JpaRepository<User,Long>{
    
} 
