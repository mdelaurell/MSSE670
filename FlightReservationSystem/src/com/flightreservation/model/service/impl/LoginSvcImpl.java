package com.flightreservation.model.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.exception.LoginException;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.ILoginService;
import com.flightreservation.model.service.ITravelerSvc;
import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.service.factory.Factory;

public class LoginSvcImpl implements ILoginService{
	
	
	@Override
	public void aLogin(Traveler traveler) throws LoginException{
		ObjectOutputStream output = null;
		try {
			output = new ObjectOutputStream(new FileOutputStream("user.out", true));
			output.writeObject(traveler);
			output.flush();
			output.close();
		}catch(IOException e) {
		}
		System.out.println("Login Service has been enter aLogin Method");
	}			
		


	
	private Traveler savedTraveler;

	public boolean authenticateTraveler(Traveler traveler) throws LoginException{
		Factory factory = null;
		
		boolean isValid = false;
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream (new FileInputStream("Traveler.out"));
			savedTraveler = (Traveler)input.readObject();
			
			
			
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isValid;
	}

}
