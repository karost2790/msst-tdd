package com.karost.spring.msstservice1.services;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.karost.spring.msstservice1.web.model.BeerDto;

@Service
public class BeerServiceImp implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerTyle("Pale Ale")
				.build();
	}

}
