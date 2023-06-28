package com.country.service.serviceImpl;

import java.util.List;

import com.country.service.dto.CountryDto;
import com.country.service.repository.entity.CountryEntity;

public interface CountryService {

	/**
	 * This method is use to save the data in database
	 * 
	 * @param countryDto
	 * @return "Successfully Saved"
	 */
	String saveCountryInToDB(CountryDto countryDto);

	/**
	 * This method is use to get the country list from database
	 * 
	 * @return CountryDto List of countries
	 */
	List<CountryDto> getAllCountries();

	CountryDto getCountryById(int countryId);
}
