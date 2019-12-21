package com.test.country.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.country.json.JsonReader;
import com.test.country.model.CountryObj;

@Service
public class CountrySearchServiceImpl implements CountrySearchService{

	@Autowired
	private JsonReader jsonReader;
	
	@Override
	public CountryObj getDetailsByCountryCode(String code) {
		CountryObj countryObj = new CountryObj();
		countryObj = jsonReader.getCountryDtlFromApi(code);
		return countryObj;
	}

}
