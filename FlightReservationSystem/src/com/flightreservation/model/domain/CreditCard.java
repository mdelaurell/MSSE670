package com.flightreservation.model.domain;

import java.io.Serializable;

public class CreditCard implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6249890086108700261L;
	
	private String creditcardnumber;
	private String expirationDate;
	
	public CreditCard(String creditcardnumber, String expirationDate) {
		this.creditcardnumber = creditcardnumber;
		this.expirationDate = expirationDate;
	}
	
	public String getCreditCardNumber() {
		return creditcardnumber;
	}

	public void setAddress(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}
	
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public boolean validate() {
		if (creditcardnumber == null)
			return false;
		if (expirationDate == null)
			return false;
		return true;
	}
	
	
	@Override
	public boolean equals(Object cc) {
		if (this == cc)
			return true;
		if (cc == null)
			return false;
		if (getClass() != cc.getClass())
			return false;
		CreditCard creditcard = (CreditCard) cc;
		if (creditcardnumber == null) {
			if ( creditcard.creditcardnumber != null)
				return false;
		} else if (!creditcardnumber.equals(creditcard.expirationDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreditCard [Credit Card Number=" + creditcardnumber + ", expiration date=" + expirationDate +  "]";
	}

}
