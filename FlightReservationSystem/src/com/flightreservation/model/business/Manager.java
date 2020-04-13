package com.flightreservation.model.business;

import com.flightreservation.model.service.IService;
import com.flightreservation.model.service.factory.Factory;

public abstract class Manager {
	
	private Factory factory = Factory.getInstance();
	
	protected IService getService(String name) throws ServiceLoadException{
		return factory.getService(name);
	}

}
