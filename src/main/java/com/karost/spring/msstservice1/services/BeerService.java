package com.karost.spring.msstservice1.services;

import java.util.UUID;

import com.karost.spring.msstservice1.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	

}
