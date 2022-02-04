package com.example.bobo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public String getName(Long id) {
        return countryRepository.getName(id);
    }

    public void updateName(Long id, String name) {
        countryRepository.updateName(id, name);
    }

}
