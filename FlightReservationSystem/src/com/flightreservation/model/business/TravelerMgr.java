package com.flightreservation.model.business;

import com.flightreservation.model.domain.*;
import com.flightreservation.model.exception.TravelerException;
import com.flightreservation.model.service.ITravelerSvc;
import com.flightreservation.model.service.factory.Factory;

public class TravelerMgr {
	
	private static Traveler traveler = null;
	
	public TravelerMgr() {
		//TODO Code
	}
	
	public boolean create(Traveler t) throws ServiceLoadException, TravelerException{
		Factory factory = Factory.getInstance();
		ITravelerSvc travelerSvc = (ITravelerSvc)factory.getService(ITravelerSvc.NAME);
		travelerSvc.aTraveler(t);
		return true;
		}
		
		public Traveler get(int id) throws ServiceLoadException {
			Factory factory = Factory.getInstance();
			ITravelerSvc travelerSvc = (ITravelerSvc)factory.getService(ITravelerSvc.NAME);
			return traveler;
		
			
		}
	public void update(Traveler t) {
		
	}
	
	public void delete(Traveler t) {
		
	}
	
	

}
