package com.country.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.country.service.dto.CountryDto;
import com.country.service.serviceImpl.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;

	@PostMapping("/add-country")
	public String saveCountryInTODB(@RequestBody CountryDto countryDto) {
		String saveCountryInToDB = countryService.saveCountryInToDB(countryDto);
		return saveCountryInToDB;
	}

}
