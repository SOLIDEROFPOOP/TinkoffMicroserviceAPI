package com.muratprojects.tinkoffservice.service;

import com.muratprojects.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
}
