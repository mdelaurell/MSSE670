package com.flightreservation.model.exception;

public class TravelerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6009821813727278428L;

	
	public TravelerException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public TravelerException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}