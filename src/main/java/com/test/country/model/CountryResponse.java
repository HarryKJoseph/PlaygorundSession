package com.test.country.model;

public class CountryResponse {

	private String statusCode;
	private String message;
	private CountryObj countryObj;
	
	public CountryObj getCountryObj() {
		return countryObj;
	}
	public void setCountryObj(CountryObj countryObj) {
		this.countryObj = countryObj;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
