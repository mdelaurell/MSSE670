package com.flightreservation.model.exception;

public class ReservationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6009821813727278428L;

	
	public ReservationException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public ReservationException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}