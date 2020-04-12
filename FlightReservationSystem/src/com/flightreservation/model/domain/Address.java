package com.flightreservation.model.domain;

import java.io.Serializable;

public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3368437786412480282L;
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	private String type;
	
	public Address(String address1, String address2, String city, String state, String zipcode, String type) {
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.type = type;
			
	}
	
	public String getAddress1() {
		return address1;
	}
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean validate() {
		if (address1 == null)
			return false;
		if (city == null)
			return false;
		if (state == null)
			return false;
		if (zipcode == null)
			return false;
		return true;
	}
	
// ?????  hashCode override required?
	
	
	//This is a check of the values expected to be completed by the Customer
	@Override
	public boolean equals(Object add) {
		if (this == add)
			return true;
		if (add == null)
			return false;
		if (getClass() != add.getClass())
			return false;
		Address address = (Address) add;
		if (address1 == null) {
			if (address.address1 != null)
				return false;
		} else if (!address1.equals(address.address1))
			return false;
		if (city == null) {
			if (address.city != null)
				return false;
		} else if (!city.equals(address.city))
			return false;
		if (state == null) {
			if (address.state != null)
				return false;
		} else if (!state.equals(address.state))
			return false;
		if (zipcode == null) {
			if (address.zipcode != null)
				return false;
		} else if (!zipcode.equals(address.zipcode))
			return false;
		return true;
	}
	
	// This produces the address as a string
	@Override
	public String toString() {
		return "Address [address=" + address1 + ", address2=" + address2 +", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + ", type=" + type + "]";
	}	

}
