package com.flightreservation.model.domain;

import com.flightreservation.model.domain.Address;

public class AirportID {
	
	
	private String airportName;
	private String airportIdent; // 4 letter identification code
	private Address address;
	
	public AirportID(String airportName, String airportIdent, Address address) {
		super ();
		this.airportName = airportName;
		this.airportIdent = airportIdent;
		this.address = address;
	}
	
	/**
	 * @param airportName
	 * @para airportIdent
	 */
	public AirportID(String airportName, String airportIdent) {
		this.airportName = airportName;
		this.airportIdent = airportIdent;
		
	}
	
	//Getter and Setters
	
	/**
	 * @return the airportName
	 */
	public String getAirportName() {
		return airportName;
	}

	/**
	 * @param airportName
	 * 			set the airportName
	 */
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	/**
	 * @return the airportIdent
	 */
	public String getAirportIdent() {
		return airportName;
	}

	/**
	 * @param airportIdent
	 * 			set the airportIdent
	 */
	public void setAirportIdent(String airportIdent) {
		this.airportIdent = airportIdent;
	}
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address
	 * 			set the address
	 */
	public void setUsername(Address address) {
		this.address = address;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirportID apid = (AirportID) obj;
		if (airportName == null) {
			if (apid.airportName != null) 
				return false;
		}else if(!airportName.equals(apid.airportName))
			return false;
		if (airportIdent == null) {
			if (apid.airportIdent != null)
				return false;
		}else if (!airportIdent.equals(apid.airportIdent))
			return false;
		if (address == null) {
			if (apid.address != null)
				return false;
		}else if (!address.equals(apid.address))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "AirportID [airportName =" + airportName +
				", airportIdent=" + airportIdent + 
				",address=" + address + 
				"]";
	}
	
}