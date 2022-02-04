package com.example.bobo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceFacade {

    @Autowired
    private CountryService countryService;

    @Autowired
    private PriceService priceService;

    public String getCountryAndPrice() {
        return countryService.getName(1L) + " " + priceService.getPrice();
    }

    @Transactional
    public String updateCountryName(Long id, String name) {
        countryService.updateName(id, name);
        return countryService.getName(id);
    }

}
