package com.flightreservation.model.service.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.AirlineData;
import com.flightreservation.model.domain.AirportID;
import com.flightreservation.model.exception.AirportIDException;
import com.flightreservation.model.service.IAirportSvc;

public class AirportSvcImpl implements IAirportSvc{

	@Override
	public void anAirport(AirportID arpt) throws AirportIDException {
		// TODO Auto-generated method stub
		
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream("Airport.out", true));
			output.writeObject(arpt);
			output.flush();
			output.close();
		}catch(IOException e) {
		}

		System.out.println("AiportID Service has been enter anAirportID Method");
		
	}

	@Override
	public AirportID getAirport(String id) {
		// TODO Auto-generated method stub
		ObjectInputStream input;
		AirportID savedAirport = null;
		try {
			input = new ObjectInputStream(new FileInputStream("Airport.out"));
			savedAirport = (AirportID)input.readObject();
			input.close();
			System.out.println(savedAirport);
			if (savedAirport != null) {
				System.out.println(savedAirport);
				System.out.println("AirportID Service has been enter getAirlineData Method");

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
			return savedAirport;
		}
	}


	@Override
	public AirportID updateAirport(String id) {
		// TODO Auto-generated method stub
		System.out.println("AiportID Service has been enter updateAirport Method");
		return new AirportID("Edinburgh International Airport", "EEDI");
	}

	@Override
	public AirportID removeAirport(String id) {
		// TODO Auto-generated method stub
		System.out.println("AiportID Service has been enter removeAiport Method");
		return new AirportID("Frankfurt International Airport","EFRA");
	}

}
