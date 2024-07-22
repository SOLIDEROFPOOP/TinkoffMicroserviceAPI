package com.muratprojects.tinkoffservice.service;

import com.muratprojects.tinkoffservice.exception.StockNotFoundException;
import com.muratprojects.tinkoffservice.model.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tinkoff.invest.openapi.OpenApi;
@Service
@RequiredArgsConstructor
public class TinkoffService implements StockService{
    private final OpenApi openApi;
    @Override
    public Stock getStockByTicker(String ticker) {
        var context = openApi.getMarketContext();
        var listCF = context.searchMarketInstrumentsByTicker(ticker);
        var list = listCF.join().getInstruments();
        if (list.isEmpty()){
            throw new StockNotFoundException(String.format("Stock %S not found", ticker));
        }
    }
}
