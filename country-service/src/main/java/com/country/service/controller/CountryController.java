package com.country.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.country.service.dto.CountryDto;
import com.country.service.repository.entity.CountryEntity;
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

	@GetMapping("/country")
	public List<CountryEntity> getAllCountries() {
		return countryService.getAllCountries();
	}
	
	
}
