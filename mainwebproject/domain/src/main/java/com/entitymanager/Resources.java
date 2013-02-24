package com.entitymanager;


import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * @author Shrish
 * In java 5 all the J2EE resources can be injected,
 * In java 6 any bean can be injected with help of CDI(Context and Dependency Injection).One can use @Inject annotation
 * To enable the CDI one need to put baln bean.xml in classpath.In this case it's kept in web.xml
 * If one want to use @Inject with the resources ,he has to produce it in order to inject .That is the reason this class is written
 * In classes like LocationCoordinationBean we are using @Inject rather than @PersitenceContext 
 * As of now resource is required only in domain module ,so the right place for Resource.java is in the domain module
 *
 */
public class Resources {

   // Expose an entity manager using the resource producer pattern
   @SuppressWarnings("unused")
   @Produces
   @PersistenceUnit
	private EntityManagerFactory emf;
  /* @PersistenceContext
   private EntityManager em;
  */ 
  

/*   @Produces
   Logger getLogger(InjectionPoint ip) {
      String category = ip.getMember().getDeclaringClass().getName();
      return Logger.getLogger(category);
   }*/

}
