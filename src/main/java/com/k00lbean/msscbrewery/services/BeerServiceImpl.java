package com.k00lbean.msscbrewery.services;

import com.k00lbean.msscbrewery.web.models.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by dmm on 2021-07-21
 */
@Service

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update a beer
    }

}
