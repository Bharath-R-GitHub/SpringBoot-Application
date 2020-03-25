package com.example.demo.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;

public class Student {
	@NotNull(message = "is required")
	private String firstName;
	@NotNull(message = "is required")
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOption;

	public Student() {
		countryOption = new LinkedHashMap<String, String>();
		countryOption.put("IN", "India");
		countryOption.put("FR", "French");
		countryOption.put("BR", "Brazil");
		countryOption.put("US", "UnitedStates");
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(LinkedHashMap<String, String> countryOption) {
		this.countryOption = countryOption;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
