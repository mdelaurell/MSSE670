package com.flightreservation.model.exception;

public class AirportIDException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6009821813727278428L;

	
	public AirportIDException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public AirportIDException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}