	package com.test.country.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.country.model.CountryObj;
import com.test.country.model.CountryResponse;
import com.test.country.service.CountrySearchService;

@RestController
public class CountrySearchController {
	
	@Autowired
	private CountrySearchService countrySearchService;
	
	@RequestMapping("/search/{code}")
	public CountryResponse getDetailsByCountryCode(@PathVariable("code") String code) {
		CountryObj obj = countrySearchService.getDetailsByCountryCode(code);
		CountryResponse resp = new CountryResponse();
		if(null == obj.getId()) {
			resp.setStatusCode("400");
			resp.setMessage("Cannot find country");
		}else {
			resp.setStatusCode("201");
			resp.setCountryObj(obj);
		}
		return resp;
	}

}
