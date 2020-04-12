package com.flightreservation.model.service.impl;

import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.exception.AirlineException;
import com.flightreservation.model.service.IAirlineDataSvc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AirlineDataSvcImpl implements IAirlineDataSvc{

	@Override
	public void anAirline(AirlineData airline) throws AirlineException {
		// TODO Auto-generated method stub
		
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream("AirlineData.out"));
			output.writeObject(airline);
			output.flush();
			output.close();
		}catch(IOException e) {
		}
			System.out.println("AirlineData Service has been enter anAirline Method");
	}

	@Override
	public AirlineData getAirlineData(int id) {
		// TODO Auto-generated method stub
		ObjectInputStream input;
		AirlineData airline = null;
		try {
			input = new ObjectInputStream(new FileInputStream("AirlineData.out"));
			 airline = (AirlineData) input.readObject();
		}catch (IOException e1) {
			e1.printStackTrace();
		} 
		catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		System.out.println("AirlineData Service has been enter getAirlineData Method");
		return new AirlineData("New Airline","NA","USA");
	}

	@Override
	public AirlineData updateAirlineData(int id) {
		// TODO Auto-generated method stub
		System.out.println("AirlineData Service has been enter updateAirlineData Method");
		return new AirlineData("Update Airline","UA","United Kingdom");
	}

	@Override
	public AirlineData removeAirlineData(int id) {
		// TODO Auto-generated method stub
		System.out.println("AirlineData Service has been enter removeAirlineData Method");
		return new AirlineData("Remove Airport", "RA", "Germany");
	}

}
