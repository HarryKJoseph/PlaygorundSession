package com.test.country.model;

import java.util.List;

public class CountryOjbList {
	
	private String page;
	private String pages;
	private String perPage;
	private String total;
	private List<CountryObj> countryObjLst ;
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
	public List<CountryObj> getCountryObjLst() {
		return countryObjLst;
	}
	public void setCountryObjLst(List<CountryObj> countryObjLst) {
		this.countryObjLst = countryObjLst;
	}
	
	

}
