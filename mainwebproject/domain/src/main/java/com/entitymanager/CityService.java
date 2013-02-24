package com.entitymanager;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.domain.City;

public class CityService extends YPEntityManager implements Serializable{

	
	

/*	@Inject
	public CityService(EntityManager em)
	 {
		 super(em);
		 
	 }
*/
	private EntityManager em;
	public CityService() {
		super();
	}
	
	public List getAllCities()
	{
		System.out.println("Inside City service 22222222 ::"+em);
/*		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ypdomain");
		System.out.println("After creating entitz manager  factorz::"+em);
		em=emf.createEntityManager();	
		System.out.println("After gettingz::"+em);
		
*/		System.out.println("After gettingz::"+em);
System.out.println("After gettingfffff::"+emf);
		em=emf.createEntityManager();
		System.out.println("After gettingz11111::"+em);
		return em.createNamedQuery("Cities.findAll").getResultList();
		
	}	
	
	public Set getLocationByCityID(int selectedCityID)
	{
		City city= (City)em.createNamedQuery("Cities.findById").setParameter("cityid", new Integer(selectedCityID)).getSingleResult();
		Set locations=city.getCityLocations();
		return locations;
		
	}
	
	
	public City getCityByID()
	{
		return (City)em.createNamedQuery("Cities.findById").setParameter("cityid", new Integer(3)).getSingleResult();
		
	}
	
}
