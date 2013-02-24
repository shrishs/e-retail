package com.domain;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import com.entitymanager.YPEntityManager;



/**
 * Hello world!
 *
 */
public class App 
{
	@PersistenceUnit
	EntityManagerFactory emf;
	
    public static void main( String[] args )
    {
 /*   	@PersistenceUnit
    	EntityManagerFactory emf;
    	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ypdomain");
    	EntityManager em = emf.createEntityManager(); // Retrieve an application managed entity manager
    	em.getTransaction().begin();
    	// Work with the EM
    	//city ct=em.find(city.class, 2);
    	//System.out.println(ct.getCityName());
    	city ct1=new city();
    	//ct1.setCityid(2);
    	ct1.setCityName("Munich");
    	em.persist(ct1);
    	em.getTransaction().commit();
    	em.close();    	
*/    	
    	
 
    	//YPEntityManager em=new YPEntityManager();
    	//Passing null just to get the code compiling 
    	YPEntityManager em=new YPEntityManager(null);
/*    	City ct1=new City();
    	ct1.setCityName("Amritsar"); 
    	em.createEntity(ct1);
    	*/
    	
/*    	City city=(City)em.findEntityByPrimaryKey(City.class, 5);
    	em.findAndRemoveEntity(City.class, 5);
*/
    	//List list=em.getAllCities();
    	/*    	System.out.println( "Hello World!1111111"+((City)list.get(2)).getCityName() );*/
    	
    	//City city=em.getCityByID();
    	//System.out.println( "Hello World!1111111"+city.getCityName() );
    	
    }
}
