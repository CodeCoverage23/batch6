package com.country.service.repository.entity;

 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Country_Details")  //(Custom name)ye table ka name change krne ke liye use hota hai ...other wise class ka nam hi table ko dde dete hai
public class CountryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //fetch krte tb ye id generate krne ke kam aata hai
	private int id;
	@Column(name = "Country_Name")
	private String countryName;
	@Column(name = "Country_Capital")
	private String countryCapital;
}
