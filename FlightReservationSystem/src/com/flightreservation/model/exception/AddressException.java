package com.flightreservation.model.exception;

public class AddressException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6009821813727278428L;

	
	public AddressException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public AddressException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}