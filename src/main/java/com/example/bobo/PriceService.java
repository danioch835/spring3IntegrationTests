package com.example.bobo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Double getPrice() {
        return 2.0;
    }

}
