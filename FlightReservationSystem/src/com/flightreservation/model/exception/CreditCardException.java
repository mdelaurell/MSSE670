package com.flightreservation.model.exception;

public class CreditCardException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6009821813727278428L;

	
	public CreditCardException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public CreditCardException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}