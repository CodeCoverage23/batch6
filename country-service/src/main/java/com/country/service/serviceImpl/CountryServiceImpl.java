package com.country.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.service.dto.CountryDto;
import com.country.service.repository.CountryRepository;
import com.country.service.repository.entity.CountryEntity;

@Service
public class CountryServiceImpl implements CountryService {

	public static final String DELETE_COUNTRY = "Country is delete";

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
	public List<CountryDto> getAllCountries() {

		List<CountryEntity> countryList = countryRepository.findAll();

		List<CountryDto> list = new ArrayList<>();

		for (CountryEntity country : countryList) {

			CountryDto countryDto = new CountryDto();
			countryDto.setId(country.getId());
			countryDto.setCountryName(country.getCountryName());
			countryDto.setCountryCapital(country.getCountryCapital());

			list.add(countryDto);
		}

		return list;
	}

	@Override
	public CountryDto getCountryById(int countryId) {
		CountryDto countryDto = new CountryDto();
		try {
			CountryEntity country = countryRepository.findById(countryId).get();
			if (country != null) {
				countryDto.setId(country.getId());
				countryDto.setCountryName(country.getCountryName());
				countryDto.setCountryCapital(country.getCountryCapital());
			}

		} catch (Exception e) {
			System.out.println("Country Not found in DB : " + countryId + "	" + e.getMessage());
			return null;
		}
		return countryDto;
	}

	@Override
	public CountryEntity updateCountry(CountryEntity entity, int countryId) {

		CountryEntity countryEntity = countryRepository.findById(countryId).get();

		countryEntity.setId(countryId);
		countryEntity.setCountryName(entity.getCountryName());
		countryEntity.setCountryCapital(entity.getCountryCapital());

		return countryRepository.save(countryEntity);

	}

	@Override
	public String deleteCountry(int countryId) {

		countryRepository.deleteById(countryId);

		return DELETE_COUNTRY;
	}

}
