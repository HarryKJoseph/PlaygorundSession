package com.test.country.model;

import java.math.BigDecimal;

public class CountryObj {

	private String id;
	private String iso2Code;
	private String name;
	private String capitalCity;
	private String region;
	private String incomeLevel;
	private String lendingType;
	private String longitude;
	private String latitude;
	private String page;
	
	public CountryObj() {
		super();
	}
	
	public CountryObj(String id, String iso2Code, String name, String capitalCity, String region, String incomeLevel,
			String lendingType, String longitude, String latitude) {
		super();
		this.id = id;
		this.iso2Code = iso2Code;
		this.name = name;
		this.capitalCity = capitalCity;
		this.region = region;
		this.incomeLevel = incomeLevel;
		this.lendingType = lendingType;
		this.longitude = longitude;
		this.latitude = latitude;
	}



	private String pages;
	private String perPage;
	private String total;
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getPerPage() {
		return perPage;
	}
	public void setPerPage(String perPage) {
		this.perPage = perPage;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getIncomeLevel() {
		return incomeLevel;
	}
	public void setIncomeLevel(String incomeLevel) {
		this.incomeLevel = incomeLevel;
	}
	public String getLendingType() {
		return lendingType;
	}
	public void setLendingType(String lendingType) {
		this.lendingType = lendingType;
	}

	public String getIso2Code() {
		return iso2Code;
	}

	public void setIso2Code(String iso2Code) {
		this.iso2Code = iso2Code;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
}
