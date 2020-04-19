package com.flightreservation.model.domain;

import com.flightreservation.model.domain.Reservation;

import java.io.Serializable;

import com.flightreservation.model.domain.Address;
import com.flightreservation.model.domain.CreditCard;

public class Traveler implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 3726244877680489726L;

	/**
	 * 
	 */
	//Traveler id
	private int id;
	
	//Traveler Username
	private String username;
	
	//Traveler Password
	private String password;
	
	// Traveler First Name
	private String firstName;
	
	//Traveler Last Name
	private String lastName;
	
	//Traveler Address
	//private Address address;
	
	//Traveler email address
	private String emailAddress;
	
	//Traveler CreditCard Information
	//private CreditCard creditcard;
	
	//Travelers Reservation
	//private Reservation reservation;
	
	/**
	 * 
	 * @param traveler
	 * 
	 */
	
/*	public Traveler(int id, String username, String password, String firstName, String lastName,
			Address address, String emailAddress, CreditCard creditcard, Reservation reservation) {
		
		//From geeksforgeeks.org
		/* The super keyword in java is a reference variable that is used to refer parent 
		 * class objects.  The keyword “super” came into the picture with the concept of 
		 * Inheritance.
		 *
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailAddress = emailAddress;
		this.creditcard = creditcard;
		this.reservation = reservation;
	}
*/
		
	/**
	 * 
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 */
	
	public Traveler(int id, String username, String password, String firstName, String lastName,
			String emailAddress){
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	
	//GETTERS
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @return the password
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirtName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the address
	 */
/* public Address getAddress() {
		return address;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @return the creditcard
	 */
/*	public CreditCard getCreditCard() {
		return creditcard;
	}

	/**
	 * @return the reservation
	 */
/*	public Reservation getReservation() {
		return reservation;
	}
*/	
	//Setters

	/**
	 * @param username
	 * 			set the username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @param password
	 * 			set the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @param firstName
	 * 			set the firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @param lastName
	 * 			set the lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @param address
	 * 			set the address
	 */
/*	public void setUsername(Address address) {
		this.address = address;
	}
	
	/**
	 * @param emailAddress
	 * 			set the emailAddress
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	/**
	 * @param creditcard
	 * 			set the creditcard
	 */
/*	public void setCreditCard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	
	/**
	 * @param reservation
	 * 			set the reservation
	 */
/*	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
*/	
	
	public boolean validate() {
		if (id == 0)
			return false;
		if (username == null)
			return false;
		if (password == null)
			return false;
		if (firstName == null)
			return false;
		if (lastName == null)
			return false;
		if (emailAddress == null)
			return false;
		return true;
	}

	//This method overrides equals()
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Traveler trvl = (Traveler) obj;
		if (username == null) {
			if (trvl.username != null) 
				return false;
		}else if(!username.equals(trvl.username))
			return false;
		if (password == null) {
			if (trvl.password != null)
				return false;
		}else if (!password.equals(trvl.password))
			return false;
		if (firstName == null) {
			if (trvl.firstName != null)
				return false;
		}else if (!firstName.equals(trvl.firstName))
			return false;
/*		if (address == null) {
			if (trvl.address != null)
				return false;
		} else if (!address.equals(trvl.address))
			return false; */
		if (emailAddress == null) {
			if (trvl.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(trvl.emailAddress))
			return false;
		/*		if (creditcard == null) {
			if (trvl.creditcard != null)
				return false;
		} else if (!creditcard.equals(trvl.creditcard))
			return false; 
		if (reservation == null) {
			if (trvl.reservation != null)
				return false;
		} else if (!reservation.equals(trvl.reservation))
			return false; */
		return true;
	}
	
/*	@Override
	public String toString() {
		return "Traveler [userName =" + username + ", password=" + password + ", firstName =" + firstName +
				", lastName=" + lastName + ",address=" + address + ", emailAddress=" + emailAddress +
				", creditcard=" + creditcard + ", reservation=" + reservation + "]";
	} */
	@Override
	public String toString() {
		return "Traveler [userName =" + username + ", password=" + password + ", firstName =" + firstName +
				", lastName=" + lastName + ", emailAddress=" + emailAddress + "]";
	}

	


}
