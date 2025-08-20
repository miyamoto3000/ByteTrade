package com.shahid.ByteTrade.service;

import com.shahid.ByteTrade.model.CoinDTO;
import com.shahid.ByteTrade.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
