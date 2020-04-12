package com.flightreservation.model.domain;

import java.io.Serializable;

public class AirlineData implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7870364508421850188L;
	private String airlineName;
	private String airlineId;
	private String country;
	
	public AirlineData(String airlineName, String airlineId, String country) {
		super();
		this.airlineName = airlineName;
		this.airlineId = airlineId;
		this.country = country;
	}
	
	
	/**
	 * 
	 * @return airlineName
	 */
	public String getAirlineName(){
		return airlineName;
	}

	/**
	 * 
	 * @param airlineName
	 */
	public void setAirlineName(String airlineName ) {
	this.airlineName = airlineName; 
	}
	/**
	 * 
	 * @return airlineName
	 */
	
	
	public String getAirlineId(){
		return airlineId;
	}

	/**
	 * 
	 * @param airlineId
	 */
	public void setSirlineId(String airlineId ) {
	this.airlineId = airlineId; 
	}
	/**
	 * 
	 * @return country
	 */
	
	
	public String getCountry(){
		return country;
	}

	/**
	 * 
	 * @param country
	 */
	public void setCountry(String country ) {
	this.country = country; 
	}
	
	public boolean validate() {
		if (airlineName == null)
			return false;
		if (airlineId.length() != 2)
			return false;
		if (airlineId == null)
			return false;		
		if (country == null)
				return false;
			
		return true;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineData aldt = (AirlineData) obj;
		if (airlineName == null) {
			if (aldt.airlineName != null) 
				return false;
		}else if(!airlineName.equals(aldt.airlineName))
			return false;
		if (airlineId == null) {
			if (aldt.airlineId != null)
				return false;
		}else if (!airlineId.equals(aldt.airlineId))
			return false;
		if (country == null) {
			if (aldt.country != null)
				return false;
		}else if (!country.equals(aldt.country))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuffer strBfr = new StringBuffer();
		strBfr.append("\nAirline Data:\n");
		strBfr.append(airlineName);
		strBfr.append("\n Airline ID: ");
		strBfr.append(airlineId);
		strBfr.append("\nCountry: ");
		strBfr.append(country);
		return strBfr.toString();
	}	
}	
	
	
	/*
	 * Want to try a multidimenstional array for the AirlineData 
	 * I will have to to and update to understand the setter in 
	 * this area. 
	 * 
	 * private String[][] airlines = {{"Alaska Airlines","AO","US"},
	 
			{"Aloha Air", "AQ","US"},
			{"America West Airlines","HP","US"},
			{"American Airlines", "AA","US"},
			{"Air One", "AP","US"},
			{"Continental Airlines", "CO","US"},
			{"Delta Air Lines", "DL","US"},
			{"Hawaiian Airlines", "HA","US"},
			{"Midwest Express", "YX","US"},
			{"Northwest Airlines", "NW","US"},
			{"Southwest Airlines", "WN","US"},
			{"Tower Air", "FF"},
			{"United Airlines", "UA","US"},
			{"AirTran", "FL","US"}		
			//Leaving room for International Carriers
	};
	           
	public AirlineData(String[][] airlines) {
		super();
		this.airlines = airline;
		
	}
	
	//getter
	
	/**
	 * 
	 * @return airline
	 *
	public String[][] getAirlines(){
		return airlines;
	}
	
	//I am confused with the setter for a Multidimensional array.
	// How do I get it to add a value to the array for the Manager to set up
	//and additional airline
	/**
	 * 
	 * @param airline
	 *
	public void setAirline(String[][] airlines ) {
		this.airlines = airlines; 
	}*/

