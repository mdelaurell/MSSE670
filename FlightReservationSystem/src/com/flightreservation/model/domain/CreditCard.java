package com.flightreservation.model.domain;

public class CreditCard {
	private String creditcardnumber;
	private String expirationDate;
	
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
