package com.karost.spring.msstservice1.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
	private UUID id;
	private String beerName;
	private String beerTyle;
	private Long upc;

}
