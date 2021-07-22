package com.k00lbean.msscbrewery.services;

import com.k00lbean.msscbrewery.web.models.BeerDto;

import java.util.UUID;

/**
 * Created by dmm on 2021-07-21.
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
