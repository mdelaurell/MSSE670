package com.flightreservation.model.service.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.ITravelerSvc;

public class TravelerSvcImpl implements ITravelerSvc{

	@Override
	public void aTraveler(Traveler traveler) throws TravelerException{
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream("Traveler.out", true));
			output.writeObject(traveler);
			output.flush();
			output.close();
		}catch(IOException e) {
		}
		System.out.println("Traveler Service has been enter aTraveler Method");
	}			
		



	@Override
	public Traveler getTraveler(int id){
		// Get the Reservation Information for Display
		ObjectInputStream input;
		Traveler savedTraveler = null;
		try {
			input = new ObjectInputStream(new FileInputStream("Traveler.out"));
			savedTraveler = (Traveler)input.readObject();
			input.close();
			System.out.println(savedTraveler);
			if (savedTraveler != null) {
				System.out.println(savedTraveler);
				System.out.println("Traveler Service has been enter getTraveler Method");

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
			return savedTraveler;
		}
	}
	@Override
	public Traveler updateTraveler(int id) {
		// TODO Auto-generated method stub
		System.out.println("Traveler Service has been enter updateTraveler Method");
		return new Traveler(id ,"username","password","firstName","lastName","email@address.com");
	}

	@Override
	public Traveler deleteTraveler(int id) {
		// TODO Auto-generated method stub
		System.out.println("Traveler Service has been enter deleteTraveler Method");
		return new Traveler(id,"username","password","firstName","lastName","email@address.com");
	}

}
