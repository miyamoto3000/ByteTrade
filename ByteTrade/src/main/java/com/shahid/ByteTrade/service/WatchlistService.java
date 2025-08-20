package com.shahid.ByteTrade.service;

import com.shahid.ByteTrade.model.Coin;
import com.shahid.ByteTrade.model.User;
import com.shahid.ByteTrade.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
