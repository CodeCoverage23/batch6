package com.country.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;

import com.country.service.dto.CountryDto;
import com.country.service.repository.CountryRepository;
import com.country.service.repository.entity.CountryEntity;
import com.country.service.serviceImpl.CountryServiceImpl;

@SpringBootTest
class CountryServiceImplTest {

	@InjectMocks
	private CountryServiceImpl countryService;

	@Mock
	private CountryRepository countryRepository;

	@Test
	void testSaveCountryInToDB() {

		CountryEntity countryEntity = new CountryEntity(10, "India", "Delhi");

		when(countryRepository.save(Mockito.any())).thenReturn(countryEntity);

		String saveCountryInToDB = countryService.saveCountryInToDB(new CountryDto());

		assertEquals("Successfully Saved", saveCountryInToDB);

	}

	@Test
	void testGetAllCountries() {

		List<CountryEntity> countryList = new ArrayList<CountryEntity>();

		CountryEntity countryEntity = new CountryEntity(10, "India", "Delhi");
		CountryEntity countryEntity2 = new CountryEntity(10, "India", "Delhi");
		countryList.add(countryEntity);
		countryList.add(countryEntity2);

		when(countryRepository.findAll()).thenReturn(countryList);

		List<CountryDto> allCountries = countryService.getAllCountries();

		assertNotNull(allCountries);

		assertEquals(countryList.size(), allCountries.size());

	}

	@Test
	void testGetByID() {
		CountryEntity countryEntity = new CountryEntity(10, "India", "Delhi");

		Optional<CountryEntity> optionalCountryEntity = Optional.of(countryEntity);

		when(countryRepository.findById(Mockito.anyInt())).thenReturn(optionalCountryEntity);

		CountryDto countryById = countryService.getCountryById(0);

		assertNotNull(countryById);

	}

	@Test
	void testGetByID_Return_null() {
		when(countryRepository.findById(Mockito.anyInt())).thenReturn(null);
		CountryDto countryById = countryService.getCountryById(0);
		assertNull(countryById);
	}

	@Test
	void testDeleteById() {
		countryService.deleteCountry(0);
		verify(countryRepository, times(1)).deleteById(0);
	}

	@Test
	void testUpdateCountry() {
		CountryEntity countryEntity = new CountryEntity(10, "India", "Delhi");
		Optional<CountryEntity> optionalCountryEntity = Optional.of(countryEntity);
		when(countryRepository.findById(Mockito.anyInt())).thenReturn(optionalCountryEntity);
		when(countryRepository.save(Mockito.any())).thenReturn(countryEntity);
		CountryEntity entity = countryService.updateCountry(countryEntity, 10);
		assertNotNull(entity);
	}

}
