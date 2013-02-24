package org.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.domain.City;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	try
    	{
    	System.out.println("Before creating Factory");	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ypdomain");
    	System.out.println("After creating Factory");
    	
        EntityManager em = emf.createEntityManager();
        System.out.println("Before creating Entity Manager");
        List<City> list=em.createNamedQuery("Cities.findAll").getResultList();
        System.out.println("Got the list ::"+list.size());
        City city=list.get(0);
        System.out.println("City Name ::"+city.getCityName());
    	}catch(Exception ex)
    	{
    		System.out.println("Inside exception 111111111"+ex.getMessage());
    	}
    	
    	assertTrue( true );
    }
}
