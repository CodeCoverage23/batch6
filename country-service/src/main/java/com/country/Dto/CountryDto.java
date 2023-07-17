package com.country.Dto;

public class CountryDto {

	private int id;
	private String countryName;
	private String countryCapital;
	private Long population;
	private String primeminister;

	public CountryDto(int id, String countryName, String countryCapital, Long population, String primeminister) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		this.population = population;
		this.primeminister = primeminister;
	}

	public CountryDto() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	public Long getpopulation() {
		return population;
	}

	public void setpopulation(Long population) {
		this.population = population;
	}

	public String getprimeminister() {
		return primeminister;

	}

	public void setprimeminister(String primeminister) {
		this.primeminister = primeminister;
	}

	@Override
	public String toString() {
		return "CountryDto [id=" + id + ", countryName=" + countryName + ", countryCapital=" + countryCapital
				+ " primeminister=" + primeminister + "]";
	}

}
