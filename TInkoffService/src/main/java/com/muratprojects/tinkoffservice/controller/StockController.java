package com.muratprojects.tinkoffservice.controller;

import com.muratprojects.tinkoffservice.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class StockController {

    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(String ticker){
        stockService.getStockByTicket();
    }
}
