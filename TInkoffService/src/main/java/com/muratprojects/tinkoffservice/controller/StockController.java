package com.muratprojects.tinkoffservice.controller;

import com.muratprojects.tinkoffservice.model.Stock;
import com.muratprojects.tinkoffservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(String ticker){
        stockService.getStockByTicker(ticker);
    }
}
