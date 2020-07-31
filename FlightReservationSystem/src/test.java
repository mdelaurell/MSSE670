import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.flightreservation.model.domain.Reservation;



class test<A>
{
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File newFile = new File("ReservationData.out");
		
		FileInputStream fin = new FileInputStream("ReservationData.out");
	    ObjectInputStream inputStream = new ObjectInputStream(fin);

	    Object obj = null;
	    try {
	    	
	    while ((obj = inputStream.readObject()) != null) {
	      if (obj instanceof Reservation) {
	        System.out.println(((Reservation) obj).toString());
	      }else
	      {
	    	  System.out.println("not obj Reservation");
	      }
	      
	    }
	    	fin.close();
			inputStream.close();
		}catch (EOFException eof) {
			//System.out.println("EOF Exception");
		}
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}

