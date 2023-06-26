package com.country.service.serviceImpl;

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

}
