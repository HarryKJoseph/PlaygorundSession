package com.test.country.Test;

import com.test.country.json.JsonReader;
import com.test.country.model.CountryObj;
import com.test.country.service.CountrySearchServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.*;

//@RunWith(MockitoJUnitRunner.class)
public class CountrySearchTest {
	
		
	CountrySearchServiceImpl service = new CountrySearchServiceImpl();
	
	//@Mock
	private JsonReader jsonReader = new JsonReader();
	
	@Test
	public void getDetailsByCountryCodeTest() {
		CountryObj res = service.getDetailsByCountryCode("ABW");
		assertNotNull(res);
	}
	
	@Test
	public void checkCountryDetails() {
		assertEquals("ABW",service.getDetailsByCountryCode("ABW"));
	}

}
