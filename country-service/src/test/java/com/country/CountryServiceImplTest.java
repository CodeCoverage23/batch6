package com.country;

import static org.mockito.Mockito.when;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.country.Dto.CountryDto;
import com.country.Repository.CountryRepo;
import com.country.Repository.Entity.Country;
import com.country.serviceimpl.CountryServiceImpl;

public class CountryServiceImplTest {
	
	@InjectMocks
	private CountryServiceImpl countryService;
	
	@Mock
	private CountryRepo countryRepo;
	
	@Test
	void testSaveCountryInToDB()
	{
		Country country = new Country(10, "India", " Delhi", 10000, null);
		
		when(countryRepo.save(Mockito.any())).thenReturn(country);
		String saveCountryInToDB = countryService.saveCountryInToDB(new CountryDto());
	
		assertEquals("Successfully Saved", saveCountryInToDB);
	}

	private void assertEquals(String string, String saveCountryInToDB) {
			
	}
	@Test
	void testGetAllCountries()
	{
		List<Country> countryList = new ArrayList<Country>();
		
		Country country = new Country(10, "India", "Delhi", 123400, "Narendra modi");
		
		List<CountryDto> allCountries = countryService.getAllcountry();
		
		assertNotNull(allCountries);
		
		assertEquals(countryList.size(), allCountries.size());
	}

	private void assertEquals(int size, int size2) {
		
	}

	private void assertNotNull(List<CountryDto> allCountries) {
		
	}
	

	@Test
	void testGetById()
	{
		Country country = new Country(10, "India", "Delhi", 2876576, "NarendraModi");
		
		Optional<Country> optionalcountryEntity = Optional.of(country);
		
		when(countryRepo.findById(Mockito.anyInt())).thenReturn(optionalcountryEntity);
		
		CountryDto countryById = countryService.getCountryById(0);
		
		assertNotNull(countryById);
	}

	private void assertNotNull(CountryDto countryById) {
		
		
	}
	
	@Test
	void testGetById_Return_null() 
	{
		when(countryRepo.findById(Mockito.anyInt())).thenReturn(null);
		CountryDto countryById = countryService.getCountryById(0);
		assertNull(countryById);
	}

	private void assertNull(CountryDto countryById) {
		
		
	}
	
}










