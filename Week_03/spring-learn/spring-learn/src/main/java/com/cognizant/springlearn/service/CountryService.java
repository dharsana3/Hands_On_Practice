package com.cognizant.springlearn.service;

import java.util.List;

import com.cognizant.springlearn.model.Country;

public class CountryService {
	private final List<Country> countryList;
	
	public CountryService(List<Country> countryList)
	{
		this.countryList = countryList;
	}
	
	public Country getCountry(String code)
	{
		for(Country country : countryList)
		{
			if(country.getCode().equalsIgnoreCase(code))
				return country;
		}
		return null;
	}
}