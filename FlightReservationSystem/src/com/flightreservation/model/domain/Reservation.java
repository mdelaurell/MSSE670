package com.flightreservation.model.domain;

import com.flightreservation.model.domain.AirportID;

import java.io.Serializable;

import com.flightreservation.model.domain.AirlineData;

public class Reservation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4399034892059544985L;
	private int reservationNumber;
	private String reservationDate;
	private String reservationStatus;
	private String departureAirport1;
	private String departureAirport2;
	private String arrivalAirport1;
	private String arrivalAirport2;
	private String airline1;
	private String airline2;
	private String departureDate;
	private String departureTime;
	private String arrivalDate;
	private String arrivalTime;
	private String bookingStatus;
	private Address address;
	
	/**
	 * 
	 * @reservation
	 * 		 a <code>Reservation</code> object
	 */
/*	public Reservation(
			String reservationNumber, 
			String reservationDate,
			String reservationStatus,
			String departureAirport1,
			String departureAirport2,
			String arrivalAirport1,
			String arrivalAirport2,
			String airline1,
			String airline2,
			String departureDate,
			String departureTime,
			String arrivalDate,
			String arrivalTime,
			String bookingStatus,
			Address address)
	{
		super();
		this.reservationNumber =reservationNumber; 
		this.reservationDate = reservationDate;
		this.reservationStatus = reservationStatus;
		this.departureAirport1 = departureAirport1;
		this.departureAirport2 = departureAirport2;
		this.arrivalAirport1 = arrivalAirport1;
		this.arrivalAirport2 = arrivalAirport2;
		this.airline1 = airline1;
		this.airline2 = airline2;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.bookingStatus = bookingStatus;
		this.address = address;
	}*/
	
	public Reservation(
			int reservationNumber, 
			String reservationDate,
			String reservationStatus,
			String departureAirport1,
			String departureAirport2,
			String arrivalAirport1,
			String arrivalAirport2,
			String airline1,
			String airline2,
			String departureDate,
			String departureTime,
			String arrivalDate,
			String arrivalTime,
			String bookingStatus) {
		
		this.reservationNumber =reservationNumber; 
		this.reservationDate = reservationDate;
		this.reservationStatus = reservationStatus;
		this.departureAirport1 = departureAirport1;
		this.departureAirport2 = departureAirport2;
		this.arrivalAirport1 = arrivalAirport1;
		this.arrivalAirport2 = arrivalAirport2;
		this.airline1 = airline1;
		this.airline2 = airline2;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.bookingStatus = bookingStatus;

	}
	
	
	//getters and setters
	//will show inconsistant coding in getters and setter from Traveler. 
	// This is done to show how difference in coding styles away from 
	// best practices and guidelines can impact a project
	
	//getters and setters 
	/**
	 * @return the reservationNumer
	 */
	public int getReservationNumber() {
		return reservationNumber;
	}
	/**
	 * @param reservationNumer
	 * 			set the reservationNumer
	 */
	public void setReservationNumber(int reservationNumer) {
		this.reservationNumber = reservationNumer;
	}
	
	/**
	 * @return the reservationDate
	 */
	public String getReservationDate() {
		return reservationDate;
	}
	/**
	 * @param reservationDate
	 * 			set the reservationDate
	 */
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	/**
	 * @return the reservationStatus
	 */
	public String getReservationStatus() {
		return reservationStatus;
	}
	/**
	 * @param reservationStatus
	 * 			set the reservationStatus
	 */
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	
	
	/**
	 * @return the departureAirport1
	 */
	public String getDepartureAiport1() {
		return departureAirport1;
	}
	/**
	 * @param departureAirport1
	 * 			set the departureAirport1
	 */
	public void setDepartureAiport1(String departureAirport1) {
		this.departureAirport1 = departureAirport1;
	}
	
	
	/**
	 * @return the departureAirport2
	 */
	public String getDepartureAiport2() {
		return departureAirport2;
	}
	/**
	 * @param departureAirport2
	 * 			set the departureAirport2
	 */
	public void setDepartureAiport2(String departureAirport2) {
		this.departureAirport2 = departureAirport2;
	}
	
	/**
	 * @return the arrivalAirport1
	 */
	public String getArrivalAirport1() {
		return arrivalAirport1;
	}
	/**
	 * @param arrivalAirport1
	 * 			set the arrivalAirport1
	 */
	public void setArrivalAirport1(String arrivalAirport1) {
		this.arrivalAirport1 = arrivalAirport1;
	}
	
	
	/**
	 * @return the arrivalAirport1
	 */
	public String getArrivalAirport2() {
		return arrivalAirport1;
	}
	/**
	 * @param arrivalAirport1
	 * 			set the arrivalAirport1
	 */
	public void setArrivalAirport2(String arrivalAirport1) {
		this.arrivalAirport1 = arrivalAirport1;
	}
	
	
	/**
	 * @return the airline1
	 */
	public String getAirline1() {
		return airline1;
	}
	/**
	 * @param airline1
	 * 			set the airline1
	 */
	public void setAirline1(String airline1) {
		this.airline1 = airline1;
	}
	
	
	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}
	/**
	 * @param airline1
	 * 			set the airline1
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	
	
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime
	 * 			set the departureTime
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	/**
	 * @return the arrivalDate
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}
	/**
	 * @param arrivalDate
	 * 			set the arrivalDate
	 */
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	
	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime
	 * 			set the arrivalTime
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	
	public boolean validate() {
		if (departureDate == null)
			return false;
		if (departureTime == null)
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
		Reservation rsv = (Reservation) obj;
		if (departureAirport1 == null) {
			if ( rsv.departureAirport1 != null)
				return false;
		} else if (!departureAirport1.equals(rsv.departureAirport1))
			return false;
		if (arrivalAirport1 == null) {
			if (rsv.arrivalAirport1 != null)
				return false;
		} else if (!arrivalAirport1.equals(rsv.arrivalAirport1))
			return false;
		if (airline1 == null) {
			if (rsv.airline1 != null)
				return false;
		} else if (!airline1.equals(rsv.airline1))
			return false;
		if (departureDate == null) {
			if (rsv.departureDate != null)
				return false;
		} else if (!departureDate.equals(rsv.departureDate))
			return false;
		if (departureTime == null) {
			if (rsv.departureTime != null)
				return false;
		} else if (!departureTime.equals(rsv.departureTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		if (departureAirport2 != null) {
		return 		reservationDate + 
				"," + reservationStatus +
				"," + departureDate + 
				"," + departureTime + 
				"," + departureAirport1 + 
				"," + arrivalAirport1 + 
				"," + airline1 + 
				"," + departureAirport2 + 
				"," + arrivalAirport2 + 
				"," + airline2 + 
				"," + arrivalDate + 
				"," + arrivalTime + 
				"," + bookingStatus;
		} else {
			return "Reservation [reservationDate=" + reservationDate + 
					", reservationStatus=" + reservationStatus + 
					", departureAirport1=" + departureAirport1 + 
					", arrivalAirport1=" + arrivalAirport1 + 
					", airline1=" + airline1 + 
					", departureDate=" + departureDate + 
					", departureTime=" + departureTime + 
					", arrivalDate=" + arrivalDate + 
					", arrivalTime=" + arrivalTime + 
					", bookingStatus=" + bookingStatus;
		}	
		
	}

}
