/**
 * 
 */
package com.flightreservation.model.exception;

/**
 * @author michaeldelaurell
 *
 */
public class AirlineException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6009821813727278428L;

	
	public AirlineException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public AirlineException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}
