package com.country.Repository.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Coutry_Service")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Country_Name")
	private String countryname;
	
	@Column(name = "Country_Capital")
	private String coutrycapital;
	
	@Column(name = "Country_Population")
	private Long population;
	
	@Column(name="prime_minister")
    private String primeminister;

	public Country(int id, String countryname,  String coutrycapital, long population, String primeminister) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.coutrycapital = coutrycapital;
		this.population = population;
		this.primeminister = primeminister;
	}

	public Country() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCoutrycapital() {
		return coutrycapital;
	}

	public void setCoutrycapital(String coutrycapital) {
		this.coutrycapital = coutrycapital;
	}
	
	public Long getpopulation()
	{
		return population;
	}
	
	public void setpopulation(Long population)
	{
		this.population= population;
	}
	
	public String getprimeminister()
	{
		return primeminister;
	}
	
	public void setprimeminster(String primeminister)
	{
		this.primeminister = primeminister;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryname=" + countryname + ", coutrycapital=" + coutrycapital + 
				" population= "+population+" primeminister="+primeminister+" ]";
	}

	
	
}
