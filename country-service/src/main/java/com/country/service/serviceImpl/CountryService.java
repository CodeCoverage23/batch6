package com.country.service.serviceImpl;

import com.country.service.dto.CountryDto;

public interface CountryService {

	/**
	 * This method is use to save the data in database
	 * 
	 * @param countryDto
	 * @return "Successfully Saved"
	 */
	String saveCountryInToDB(CountryDto countryDto);
}
