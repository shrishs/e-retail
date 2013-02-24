package com.entitymanager;

import java.util.List;



import com.domain.City;

public class LocationService extends YPEntityManager {

	
	
	public City getLocationByID()
	{
		return (City)em.createNamedQuery("Cities.findById").setParameter("cityid", new Integer(3)).getSingleResult();
		
	}
	
}
