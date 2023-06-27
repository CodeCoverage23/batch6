package com.country.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.service.dto.CountryDto;
import com.country.service.repository.CountryRepository;
import com.country.service.repository.entity.CountryEntity;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public String saveCountryInToDB(CountryDto countryDto) {

		CountryEntity countryEntity = new CountryEntity();

		countryEntity.setCountryName(countryDto.getCountryName());
		countryEntity.setCountryCapital(countryDto.getCountryCapital());

		countryRepository.save(countryEntity);

		return "Successfully Saved";
	}

	@Override
	public List<CountryEntity> getAllCountries() {

		return countryRepository.findAll();

		/*
		 * List<CountryDto> list = null;
		 * 
		 * for (CountryEntity country : countryList) {
		 * 
		 * CountryDto countryDto = new CountryDto();
		 * countryDto.setId(country.getId());
		 * countryDto.setCountryName(country.getCountryName());
		 * countryDto.setCountryCapital(country.getCountryName());
		 * 
		 * list.add(countryDto); }
		 */

	}

}
