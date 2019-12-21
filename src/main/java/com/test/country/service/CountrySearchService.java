package com.test.country.service;

import com.test.country.model.CountryObj;

public interface CountrySearchService {
	
	public CountryObj getDetailsByCountryCode(String code);

}
