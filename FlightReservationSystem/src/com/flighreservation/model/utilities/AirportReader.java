package com.flighreservation.model.utilities;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;


public class AirportReader {



 /** * Simple Java program to read CSV file in Java. In this program we will read 
  * * list of books stored in CSV file as comma separated values. 
  * * * @author WINDOWS 8 
  * * */ 

	public static void main(String... args) { 
	
		List<Airport> airports = readAirportsFromCSV("config/airportCodeWW.csv"); 
	
		// let's print all the person read from CSV file 
	
		for (Airport a : airports) { 
			System.out.println(a); 
		} 
	} 

	private static List<Airport> readAirportsFromCSV(String fileName) { 
		
		List<Airport> airports = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName); 
		
		// create an instance of BufferedReader 
		// using try with resource, Java 7 feature to close resources 
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) { 
			
			// read the first line from the text file 
			String line = br.readLine(); 
			
			// loop until all lines are read 
			while (line != null) { 
				
				// use string.split to load a string array with the values from 
				// each line of 
				// the file, using a comma as the delimiter 
				String[] attributes = line.split(","); 
				Airport airport = createAirport(attributes); 
				
				// adding book into ArrayList 
				
				airports.add(airport); 
				// read next line before looping 
				// if end of file reached, line would be null 
				line = br.readLine(); 
				} 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
			} return airports; 
			} 
	
	private static Airport createAirport(String[] metadata) { 
		
		String code = metadata[0]; 
		String name = metadata[1];
		String country = metadata[2]; 
		int elevation_ft = Integer.parseInt(metadata[3]);
		
		// create and return book of this metadata 
		return new Airport(code, name, country, elevation_ft); 
		} 
	} 
	
	class Airport { 
		private String code;
		private String name;  
		private String country; 
		private int elevation_ft; 
		
		public Airport(String code, String name, String country, int elevation_ft) { 
		
			this.code = code;
			this.name = name; 
			this.country = country;
			this.elevation_ft = elevation_ft; 
		
		} 
	
	public String getCode() { 
		return code; } 
	
	public void setCode(String code) { 
		this.name = code; 
		} 
	
	public String getName() { 
		return name; } 
	
	public void setName(String name) { 
		this.name = name; 
		} 
	
	public String getCountry() { 
		return country; 
		} 
	
	public void setCountry(String author) { 
		this.country = country; 
		} 

	public int getElevationFt() { 
		return elevation_ft; 
		} 
	
	public void setElevationFt(int price) { 
		this.elevation_ft = elevation_ft; 
		} 
	
	
	@Override public String toString() { 
		return "Airport [code=" + code + ", name=" + name +  ", country=" + country + ", elevation_ft=" + elevation_ft +"]"; 
		} 
	
	
	}




