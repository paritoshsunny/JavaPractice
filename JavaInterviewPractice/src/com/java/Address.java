package com.java;

public class Address {
	
	int houseNo;
	String street;
	String city;
	String country;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(int houseNo, String street, String city, String country) {
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}
	
	
	

}
