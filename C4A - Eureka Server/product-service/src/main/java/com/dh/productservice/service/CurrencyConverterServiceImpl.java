package com.dh.productservice.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService {

    @Override
    public Integer getConversion(String from, String to) {
        return 104;
    }
}
