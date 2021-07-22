package com.k00lbean.msscbrewery.web.controllers;

import com.k00lbean.msscbrewery.services.BeerService;
import com.k00lbean.msscbrewery.web.models.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by dmm on 2021-07-21.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(BeerDto beerDto) {

        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname to url
        headers.add("location", "/api/v1/beer" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

}
