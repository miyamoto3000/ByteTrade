package com.shahid.ByteTrade.service;

import java.util.List;

import com.shahid.ByteTrade.model.Asset;
import com.shahid.ByteTrade.model.Coin;
import com.shahid.ByteTrade.model.User;

public interface AssetService {
    Asset createAsset(User user, Coin coin, double quantity);

    Asset getAssetById(Long assetId);

    Asset getAssetByUserAndId(Long userId,Long assetId);

    List<Asset> getUsersAssets(Long userId);

    Asset updateAsset(Long assetId,double quantity) throws Exception;

    Asset findAssetByUserIdAndCoinId(Long userId,String coinId) throws Exception;

    void deleteAsset(Long assetId);


}
