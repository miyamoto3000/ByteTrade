package com.shahid.ByteTrade.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shahid.ByteTrade.model.Asset;

import java.util.List;
import java.util.Optional;

public interface AssetsRepository extends JpaRepository<Asset,Long> {
   public List<Asset> findByUserId(Long userId);

   Asset findByUserIdAndCoinId(Long userId, String coinId);

   Asset findByIdAndUserId(Long assetId, Long userId);


}

