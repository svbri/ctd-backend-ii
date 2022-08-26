package com.dh.productservice.controller;

import com.dh.productservice.service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class CurrencyConverterController {
    private final CurrencyConverterService currencyConverterService;

    //Constructor del controller
    @Autowired
    public CurrencyConverterController(CurrencyConverterService currencyConverterService) {
        this.currencyConverterService = currencyConverterService;
    }

    @GetMapping
    public Integer getConversion(@RequestParam String from, @RequestParam String to) {
        return currencyConverterService.getConversion(from, to);
    }
}
