package com.flightreservation.model.service.impl;

import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.exception.AirlineException;
import com.flightreservation.model.service.IAirlineDataSvc;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AirlineDataSvcImpl implements IAirlineDataSvc{

	@Override
	public boolean anAirline(AirlineData airline) throws AirlineException {
		// TODO Auto-generated method stub
		
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream("AirlineData.out", true));
			output.writeObject(airline);
			output.flush();
			output.close();
		}catch(IOException e) {
		}
		finally {
			System.out.println("AirlineData Service has been enter anAirline Method");
			return true;
		}
	}

	@Override
	public AirlineData getAirlineData(String airlineId) {
		// TODO Auto-generated method stub
		ObjectInputStream input;
		AirlineData savedAirline = null;
		try {
			input = new ObjectInputStream(new FileInputStream("AirlineData.out"));
			savedAirline = (AirlineData)input.readObject();
			input.close();
			System.out.println(savedAirline);
			if (savedAirline != null) {
				System.out.println(savedAirline);
				System.out.println("AirlineData Service has been enter getAirlineData Method");

			}else {
				System.out.println("No data available");
				return null;
			}
			 
		}catch (IOException e1) {
			e1.printStackTrace();
		} 
		catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		finally {
			return savedAirline;
		}
	}

	public AirlineData updateAirlineData(String id) {
		// TODO Auto-generated method stub
		System.out.println("AirlineData Service has been enter updateAirlineData Method");
		return new AirlineData("Update Airline","UA","United Kingdom");
	}

	@Override
	public AirlineData removeAirlineData(String id) {
		// TODO Auto-generated method stub
		System.out.println("AirlineData Service has been enter removeAirlineData Method");
		return new AirlineData("Remove Airport", "RA", "Germany");
	}

}
