package com.flightreservation.presentation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;
import com.flightreservation.model.business.Manager;
import com.flightreservation.model.business.ReservationMgr;
import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.domain.Reservation;
import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.exception.ReservationException;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.IReservationSvc;
import com.flightreservation.model.service.ITravelerSvc;
import com.flightreservation.model.service.factory.Factory;
import com.github.lgooddatepicker.components.DateTimePicker;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class CreateReservation extends JFrame {

	private JPanel contentPane;
    private String[] Airlines = {"Alaska Airlines (AS)", "Aloha Air (AQ)", "American Airlines (AA)", "Delta Airlines (DL)", "Hawaiian Airlines (HA)", "Frountier Airlines (F9)", "Lufthansa Airlines (German)", "Southwest Airlines (US)", "United Airlines (US)", "===================", "Air Canada (AC)", "Air France (AF)", "British Airways (BA)", "Lufthansa (LH)", "Qantas Airways (QF)", "Swissair (SR)"};
    private String[] Airports = {"Abraham Lincoln Capital Airport","Austin Bergstrom International Airport","Baltimore/Washington International Thurgood Marshall Airport","Bangor International Airport","Billings Logan International Airport","Birmingham-Shuttlesworth International Airport","Boeing Field King County International Airport","Boise Air Terminal/Gowen Field","Charleston Air Force Base-International Airport","Charlotte Douglas International Airport","Chicago Midway International Airport","Chicago O'Hare International Airport","Dallas Fort Worth International Airport","Dallas Love Field","Dane County Regional Truax Field","Daniel K Inouye International Airport","Daytona Beach International Airport","Denver International Airport","Des Moines International Airport","Duluth International Airport","Fairbanks International Airport","Fairchild Air Force Base","Fort Lauderdale Hollywood International Airport","Fort Smith Regional Airport","Fort Wayne International Airport","Fort Worth Alliance Airport","Fort Worth Meacham International Airport","General Edward Lawrence Logan International Airport","John F Kennedy International Airport","John Glenn Columbus International Airport","John Wayne Airport-Orange County Airport","Joint Base Andrews","Joplin Regional Airport","Kansas City International Airport","La Guardia Airport","Lafayette Regional Airport","Langley Air Force Base","Los Angeles International Airport","Louis Armstrong New Orleans International Airport","Louisville International Standiford Field","Lovell Field","Lubbock Preston Smith International Airport","Tucson International Airport","Tulsa International Airport","Tyndall Air Force Base","Vance Air Force Base","Vandenberg Air Force Base","Washington Dulles International Airport","Whiteman Air Force Base","Wichita Eisenhower National Airport","Will Rogers World Airport","William P Hobby Airport","Wright-Patterson Air Force Base","Yeager Airport","Gothenburg-Landvetter Airport","Stockholm-Arlanda Airport","Khartoum International Airport","Seychelles International Airport","King Abdulaziz International Airport","Kigali International Airport","Sochi International Airport","Tolmachevo Airport","Ufa International Airport","Ukrainka Air Base","Vnukovo International Airport","Yemelyanovo Airport","Zhukovsky International Airport","Belgrade Nikola Tesla Airport","Faa'a International Airport","Jorge Ch√°vez International Airport","Tocumen International Airport","Duqm International Airport","Muscat International Airport","Rustaq Airport","Auckland International Airport","Christchurch International Airport","Wellington International Airport","Oslo Gardermoen Airport","Amsterdam Airport Schiphol","Eindhoven Airport","Mallam Aminu International Airport","Murtala Muhammed International Airport","Nnamdi Azikiwe International Airport","Diori Hamani International Airport","Hosea Kutako International Airport","Maputo Airport","Kuala Lumpur International Airport","Los Cabos International Airport","Sir Seewoosagur Ramgoolam International Airport","Malta International Airport","Nouakchott‚ÄìOumtounsy International Airport","Macau International Airport","Chinggis Khaan International Airport","Mandalay International Airport","Yangon International Airport","Modibo Keita International Airport","Skopje Alexander the Great Airport","Ivato Airport","Podgorica Airport","Mohammed V International Airport","Tripoli International Airport","Riga International Airport","Luxembourg-Findel International Airport","Vilnius International Airport","Roberts International Airport","Bandaranaike International Colombo Airport","Mattala Rajapaksa International Airport","Beirut Rafic Hariri International Airport","Almaty Airport","Astana International Airport","Sary-Arka Airport","Owen Roberts International Airport","Kuwait International Airport","Jeju International Airport","Kunsan Air Base","Muan International Airport","Osan Air Base","Phnom Penh International Airport","Siem Reap International Airport","Manas International Airport","Jomo Kenyatta International Airport","Mombasa Moi International Airport","Fukuoka Airport","Narita International Airport","New Chitose Airport","Osaka International Airport","Tokyo Haneda International Airport","Malpensa International Airport","Milano Linate Airport","Naples International Airport","Pisa International Airport","Treviso-Sant'Angelo Airport","Turin Airport","Venice Marco Polo Airport","Verona Villafranca Airport","Baghdad International Airport","Calicut International Airport","Indira Gandhi International Airport","Kempegowda International Airport","Netaji Subhash Chandra Bose International Airport","Rajiv Gandhi International Airport","Sri Guru Ram Dass Jee International Airport","Trivandrum International Airport","Ben Gurion International Airport","Ovda International Airport","Cork Airport","Dublin Airport","Shannon Airport","Dominique Edward Osok Airport","Hasanuddin International Airport","Juanda International Airport","Kualanamu International Airport","Ngurah Rai (Bali) International Airport","Sentani International Airport","Soekarno-Hatta International Airport","Sungai Siring International Airport","Budapest Liszt Ferenc International Airport","Zagreb Airport","Hong Kong International Airport","Antonio B. Won Pat International Airport","La Aurora Airport","Eleftherios Venizelos International Airport","Heraklion International Nikos Kazantzakis Airport","Thessaloniki Macedonia International Airport","Aberdeen Dyce Airport","Belfast International Airport","Edinburgh Airport","Glasgow International Airport","Liverpool John Lennon Airport","London Gatwick Airport","London Heathrow Airport","London Stansted Airport","Charles de Gaulle International Airport","Lyon Saint-Exup√©ry Airport","Marseille Provence Airport","Nice-C√¥te d'Azur Airport","Paris-Orly Airport","Toulouse-Blagnac Airport","Helsinki Vantaa Airport","Barcelona International Airport","La Palma Airport","Tenerife Norte Airport","Tenerife South Airport","Cairo International Airport","Luxor International Airport","Lennart Meri Tallinn Airport","Cotopaxi International Airport","Mariscal Sucre International Airport","Houari Boumediene Airport","Las Am√©ricas International Airport","Punta Cana International Airport","Copenhagen Kastrup Airport","Berlin-Tegel Airport","Frankfurt am Main Airport","Hamburg Airport","Karlsruhe Baden-Baden Airport","Munich Airport","Ramstein Air Base","Stuttgart Airport","V√°clav Havel Airport Prague","Larnaca International Airport","Paphos International Airport","Am√≠lcar Cabral International Airport","Jos√© Mart√≠ International Airport","Juan Gualberto Gomez International Airport","Daniel Oduber Quiros International Airport","El Dorado International Airport","Baita International Airport","Beijing Capital International Airport","Beijing Daxing International Airport","Comodoro Arturo Merino Ben√≠tez International Airport","Rarotonga International Airport","Geneva Cointrin International Airport","Calgary International Airport","Edmonton International Airport","Halifax / Stanfield International Airport","Montreal / Pierre Elliott Trudeau International Airport","Ottawa Macdonald-Cartier International Airport","Vancouver International Airport","Philip S. W. Goldson International Airport","Minsk National Airport","Sir Seretse Khama International Airport","Lynden Pindling International Airport","Afonso Pena Airport","Congonhas Airport","Viru Viru International Airport","Brunei International Airport","Bahrain International Airport","Burgas Airport","Sofia Airport","Varna Airport","Ouagadougou Airport","Brussels Airport","Brussels South Charleroi Airport","Hazrat Shahjalal International Airport","Sarajevo International Airport","Heydar Aliyev International Airport","Adelaide International Airport","Sydney Kingsford Smith International Airport","Vienna International Airport","Ministro Pistarini International Airport","Quatro de Fevereiro Airport","Zvartnots International Airport","Tirana International Airport Mother Teresa","Abu Dhabi International Airport","Robert Gabriel Mugabe International Airport","Kenneth Kaunda International Airport Lusaka","Cape Town International Airport","George Airport","King Shaka International Airport","O R Tambo International","OR Tambo International Airport","OR Tambo International Airport","Pri≈°tina International Airport","Da Nang International Airport","Noi Bai International Airport","Tan Son Nhat International Airport","General Jos√© Antonio Anzoategui International Airport","Sim√≥n Bol√≠var International Airport","Tashkent International Airport","Carrasco International /General C L Berisso Airport"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateReservation frame = new CreateReservation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	


	/**
	 * Create the frame.
	 */
	
	
	
	
	
	public CreateReservation() {
		setResizable(true);
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 463);
		setPreferredSize(new Dimension(750, 500));
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Reservation Services");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 15));
		lblNewLabel.setBounds(16, 6, 283, 27);
		contentPane.add(lblNewLabel);

		JLabel airlineLabel = new JLabel("Airlines");
		airlineLabel.setBounds(537, 143, 87, 16);
		contentPane.add(airlineLabel);
		
		JComboBox Airline1comboBox = new JComboBox();
		Airline1comboBox.setModel(new DefaultComboBoxModel(Airlines));
		Airline1comboBox.setBounds(547, 171, 145, 27);
		contentPane.add(Airline1comboBox);
		
		JComboBox Airline2comboBox = new JComboBox();
		Airline2comboBox.setModel(new DefaultComboBoxModel(Airlines));
		Airline2comboBox.setBounds(547, 230, 145, 27);
		contentPane.add(Airline2comboBox);
		
		JLabel lblDepart1 = new JLabel("Depature Airport");
		lblDepart1.setBounds(35, 143, 130, 16);
		contentPane.add(lblDepart1);
		
		JComboBox departureAirport1comboBox = new JComboBox();
		departureAirport1comboBox.setModel(new DefaultComboBoxModel(Airports));
		departureAirport1comboBox.setBounds(35, 171, 251, 27);
		contentPane.add(departureAirport1comboBox);	
		
		JComboBox departureAirport2comboBox = new JComboBox();
		departureAirport2comboBox.setModel(new DefaultComboBoxModel(Airports));
		departureAirport2comboBox.setBounds(35, 230, 251, 27);
		contentPane.add(departureAirport2comboBox);
		
		JLabel lblDate = new JLabel("Travel Date");
		lblDate.setBounds(77, 60, 92, 16);
		contentPane.add(lblDate);
		
		DateTimePicker dateTimePicker = new DateTimePicker();
		dateTimePicker.getTimePicker().getComponentTimeTextField().setText("Time");
		dateTimePicker.getDatePicker().getComponentDateTextField().setText("Pick a Date");
		dateTimePicker.setBounds(63, 85, 367, 29);
		contentPane.add(dateTimePicker);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(288, 60, 61, 16);
		contentPane.add(lblTime);
		
		JLabel lblArrival1 = new JLabel("Arrival Airport");
		
		lblArrival1.setBounds(288, 143, 142, 16);
		contentPane.add(lblArrival1);
		
		JComboBox arrivalAirport1comboBox = new JComboBox();
		arrivalAirport1comboBox.setModel(new DefaultComboBoxModel(Airports));
		arrivalAirport1comboBox.setBounds(288, 171, 247, 27);
		contentPane.add(arrivalAirport1comboBox);
		
		JComboBox arrivalAirport2comboBox = new JComboBox();
		arrivalAirport2comboBox.setModel(new DefaultComboBoxModel(Airports));
		arrivalAirport2comboBox.setBounds(288, 230, 247, 27);
		contentPane.add(arrivalAirport2comboBox);
		
		JLabel lblAddLeg = new JLabel("Add Connecting Flight");
		lblAddLeg.setBounds(16, 202, 185, 16);
		contentPane.add(lblAddLeg);
		
		JComboBox statusComboBox = new JComboBox();
		statusComboBox.setModel(new DefaultComboBoxModel(new String[] {"Reservre", "Purchase", "Cancel"}));
		statusComboBox.setBounds(286, 292, 218, 27);
		contentPane.add(statusComboBox);
		
		JLabel lblStatus = new JLabel("Reservation Status");
		lblStatus.setBounds(266, 264, 121, 16);
		contentPane.add(lblStatus);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(575, 354, 117, 29);
		contentPane.add(btnSave);
		
		pack();
		setVisible(true);

		
		 btnSave.addActionListener(
				 new ActionListener() {
						//private Factory factory;
						//ITravelerSvc itrs;			 

					 public void actionPerformed(ActionEvent res)
					 {
						 try {
								if (dateTimePicker.datePicker.getText().isEmpty()) {
									JOptionPane.showMessageDialog(rootPane, "Please choose a date.");
								}
								if (dateTimePicker.timePicker.getText().isEmpty()) {
										JOptionPane.showMessageDialog(rootPane, "Please choose a time.");
								}
								else			
								{
							 
							 	Factory factory = new Factory();
								Reservation reserveIt;
								ReservationMgr resMgr = new ReservationMgr();
								int id;
								
								Random rand = new Random();
								
								int upperbound = 1000000;
								int int_randome = rand.nextInt(upperbound);
								System.out.println(int_randome);

								//System.out.println(dateTimePicker.getTimePicker());
								String strMainTime = dateTimePicker.getTimePicker().toString();
								String[] arrSplit = strMainTime.split(":");
								int hours = Integer.parseInt(arrSplit[0]);
								int minutes = Integer.parseInt(arrSplit[1]);
								int newHours = hours + 10;
								int newMinutes = minutes + 25; 
								String newArrivalTime = newHours + ":" + newMinutes;
								DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd");
								LocalDateTime now = LocalDateTime.now();
								String currentDate = dtf.format(now).toString();
						
								reserveIt = new Reservation(int_randome,
															currentDate,
															statusComboBox.getSelectedItem().toString(), 
															departureAirport1comboBox.getSelectedItem().toString(), 
															departureAirport2comboBox.getSelectedItem().toString(), 
															arrivalAirport1comboBox.getSelectedItem().toString(), 
															arrivalAirport2comboBox.getSelectedItem().toString(), 
															Airline1comboBox.getSelectedItem().toString(), 
															Airline2comboBox.getSelectedItem().toString(), 
															dateTimePicker.getDatePicker().getText(), 
															dateTimePicker.getTimePicker().getText(), 
															dateTimePicker.getDatePicker().getText(), 
															 newArrivalTime, 
															 statusComboBox.getSelectedItem().toString());
								 
								resMgr.create(reserveIt);
								FlightReservation flightRes = new FlightReservation();
								flightRes.setVisible(true);
								setVisible(false);
								}
							} catch (ServiceLoadException sle) {
								// TODO Auto-generated catch block
								sle.printStackTrace();
								
							} catch (ReservationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}	
					 }
				 }
				 
			);
		

	    
		
	}
}



