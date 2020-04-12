package com.flightreservation.model.service.factory;

import com.flightreservation.model.service.factory.Factory;
import com.flightreservation.model.business.ServiceLoadException;
import com.flightreservation.model.service.*;

public class Factory {
	
	public Factory() {
	}
	
	public IService getService(String name) throws ServiceLoadException {
		try {
			Class<?> c = Class.forName(getImplName(name));
			return (IService)c.newInstance(); 
		} catch (Exception e){
				throw new ServiceLoadException(name + " not loaded", e);
			}
	}
	
	private String getImplName (String name) throws Exception {
		java.util.Properties props = new java.util.Properties(); java.io.FileInputStream fis = new
		java.io.FileInputStream("config/properties.txt"); props.load(fis);
		fis.close();
		return props.getProperty(name);
		}
}