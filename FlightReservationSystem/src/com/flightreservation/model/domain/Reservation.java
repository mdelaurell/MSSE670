package com.flightreservation.model.domain;

import com.flightreservation.model.domain.AirportID;

import java.io.Serializable;

import com.flightreservation.model.domain.AirlineData;

public class Reservation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4399034892059544985L;
	private String reservationNumer;
	private String reservationDate;
	private String reservationStatus;
	private AirportID departureAirport1;
	private AirportID departureAirport2;
	private AirportID arrivalAirport1;
	private AirportID arrivalAirport2;
	private AirlineData airline1;
	private AirlineData airline2;
	private String departureDate;
	private String departureTime;
	private String arrivalDate;
	private String arrivalTime;
	private String bookingStatus;
	
	/**
	 * 
	 * @reservation
	 * 		 a <code>Reservation</code> object
	 */
	public Reservation(String reservationNumer, 
			String reservationDate,
			String reservationStatus,
			AirportID departureAirport1,
			AirportID departureAirport2,
			AirportID arrivalAirport1,
			AirportID arrivalAirport2,
			AirlineData airline1,
			AirlineData airline2,
			String departureDate,
			String departureTime,
			String arrivalDate,
			String arrivalTime,
			String bookingStatus) {
		super();
		this.reservationNumer =reservationNumer; 
		this.reservationDate = reservationDate;
		this.reservationStatus = reservationStatus;
		//in this case we would want to think of a better way
		// to user our class to allow for multiple airports without the 1, 2 designation
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
	
	public Reservation(String reservationNumer, 
			String reservationDate,
			String reservationStatus,
			String departureDate,
			String departureTime,
			String arrivalDate,
			String arrivalTime,
			String bookingStatus) {
		
		this.reservationNumer =reservationNumer; 
		this.reservationDate = reservationDate;
		this.reservationStatus = reservationStatus;
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
	public String getReservationNumber() {
		return reservationNumer;
	}
	/**
	 * @param reservationNumer
	 * 			set the reservationNumer
	 */
	public void setReservationNumber(String reservationNumer) {
		this.reservationNumer = reservationNumer;
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
	public AirportID getDepartureAiport1() {
		return departureAirport1;
	}
	/**
	 * @param departureAirport1
	 * 			set the departureAirport1
	 */
	public void setDepartureAiport1(AirportID departureAirport1) {
		this.departureAirport1 = departureAirport1;
	}
	
	
	/**
	 * @return the departureAirport2
	 */
	public AirportID getDepartureAiport2() {
		return departureAirport2;
	}
	/**
	 * @param departureAirport2
	 * 			set the departureAirport2
	 */
	public void setDepartureAiport2(AirportID departureAirport2) {
		this.departureAirport2 = departureAirport2;
	}
	
	/**
	 * @return the arrivalAirport1
	 */
	public AirportID getArrivalAirport1() {
		return arrivalAirport1;
	}
	/**
	 * @param arrivalAirport1
	 * 			set the arrivalAirport1
	 */
	public void setArrivalAirport1(AirportID arrivalAirport1) {
		this.arrivalAirport1 = arrivalAirport1;
	}
	
	
	/**
	 * @return the arrivalAirport1
	 */
	public AirportID getArrivalAirport2() {
		return arrivalAirport1;
	}
	/**
	 * @param arrivalAirport1
	 * 			set the arrivalAirport1
	 */
	public void setArrivalAirport2(AirportID arrivalAirport1) {
		this.arrivalAirport1 = arrivalAirport1;
	}
	
	
	/**
	 * @return the airline1
	 */
	public AirlineData getAirline1() {
		return airline1;
	}
	/**
	 * @param airline1
	 * 			set the airline1
	 */
	public void setAirline1(AirlineData airline1) {
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
		return "Reservation [reservationDate=" + reservationDate + 
							", reservationStatus=" + reservationStatus + 
							", departureAirport1=" + departureAirport1 + 
							", departureAirport2=" + departureAirport2 + 
							", arrivalAirport1=" + arrivalAirport1 + 
							", arrivalAirport2=" + arrivalAirport2 + 
							", airline1=" + airline1 + 
							", airline2=" + airline2 + 
							", departureDate=" + departureDate + 
							", departureTime=" + departureTime + 
							", arrivalDate=" + arrivalDate + 
							", arrivalTime=" + arrivalTime + 
							", bookingStatus=" + bookingStatus + 
							"]";
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
					", bookingStatus=" + bookingStatus + 
					"]";
		}	
		
	}

}
