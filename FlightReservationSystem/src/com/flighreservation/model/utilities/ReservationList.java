package com.flighreservation.model.utilities;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.flightreservation.model.domain.Reservation;

public class ReservationList {
	public String[] returnReservations(String[] args) throws FileNotFoundException, IOException {
		
		File newFile = new File("ReservationData.out");
		String[] reservations = new String[10];
		String text;
		FileInputStream fin = new FileInputStream(newFile);
	    ObjectInputStream inputStream = new ObjectInputStream(fin);

	    Object obj = null;
	    try {
	    System.out.println("help me!!!");	
	    int i = 0;
	    while ((obj = inputStream.readObject()) != null) {
	      if (obj instanceof Reservation) {
	        //System.out.println(((Reservation) obj).toString());
	        text = obj.toString();
	        System.out.println(i);
	        reservations[i] = text;
	        i++;
	      }else {
	    	  System.out.println("not obj Reservation");
	      } 
	    }
	    
	    System.out.println("help");
	    fin.close();
		inputStream.close();
			
					
		}catch (EOFException eof) {
			System.out.println("");
			System.out.println("End of File Reached.");
			System.out.println(reservations.length);
			for(int j=0; j < reservations.length; j++) {
				if (reservations[j] == null) {
					break;
				}
				System.out.println(reservations[j]);
			};
		}
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    finally {
	    	return reservations;
	    }
	  }
	

}
