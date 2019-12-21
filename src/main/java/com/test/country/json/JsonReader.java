package com.test.country.json;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.test.country.model.CountryObj;

@Component
public class JsonReader {
	
	@Value("${worldbank.country.api}" )
	private String countryUrl;
	ObjectMapper objectMapper = new ObjectMapper();

	//get country details from world bank api
	public CountryObj getCountryDtlFromApi(String code){
		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		List<CountryObj> countryObj = new ArrayList<CountryObj>();
		CountryObj resobj = new CountryObj();
		try {
			//countryObj = mapper.readValue(new URL(countryUrl), new TypeReference<List<CountryObj>>(){});
			Gson gson = new Gson();
			InputStream inputStream = new URL(countryUrl).openStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			Map<String, String> map = new HashMap<String, String>();
			countryObj = (List<CountryObj>) gson.fromJson(in, List.class);
			resobj = getCountry((List) countryObj.get(1), code);
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return resobj;
		
	}
	
	public CountryObj getCountry(List countryObjList, String code) {
		CountryObj countryObj = new CountryObj();
		for (Object object : countryObjList) {
			System.out.println(object);
			LinkedTreeMap<Object,Object> t = (LinkedTreeMap) object;
	        String id = t.get("id").toString();
	        if(!id.equals(code)) {
	        	continue;
	        }
	        String iso2Code = t.get("iso2Code").toString();
	        String name = t.get("name").toString();
	        String capitalCity = t.get("capitalCity").toString();
	        String region =  ((LinkedTreeMap) t.get("region")).get("value").toString();
	        String incomeLevel  =  ((LinkedTreeMap) t.get("incomeLevel")).get("value").toString();
	        String lendingType   =  ((LinkedTreeMap) t.get("lendingType")).get("value").toString();
	        String longitude = t.get("longitude").toString();
	        String latitude = t.get("latitude").toString();
	        countryObj = new CountryObj(id, iso2Code, name, capitalCity, region, incomeLevel, lendingType, longitude, latitude);
	        break;
		}
		System.out.println(countryObj);
		return countryObj;
	}
}
