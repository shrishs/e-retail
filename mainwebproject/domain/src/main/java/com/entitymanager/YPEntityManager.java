package com.entitymanager;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class YPEntityManager implements Serializable {

	 private EntityTransaction etx;

	 @Inject
	 protected EntityManagerFactory emf;
	 //protected EntityManager em;
	 protected EntityManager em;
	
	
/*	 public YPEntityManager(EntityManager em)
	 {
		 System.out.println("Before Injection ::"+em);
		 this.em=em;
		 System.out.println("after Injection"+em);
		 
	 }*/
	 
	 public YPEntityManager(EntityManagerFactory emf)
	 {
		 System.out.println("Before Injection ::"+emf);
		 this.emf=emf;
		 this.em=emf.createEntityManager();
		 System.out.println("after Injection"+emf);
		 
	 }
	 public YPEntityManager()
	 {
		 //em=emf.createEntityManager();
	 }	 
	 
	 
	 public EntityTransaction getTransaction()
	{
		
		this.em=emf.createEntityManager();
		System.out.println("Inside getTransaction():after joining ::"+em.isOpen());
		etx = em.getTransaction();
		return etx;
		
	}

	
	
	public void createEntity(Object entity)
	{

		etx=getTransaction();
		try {
			etx.begin();
			em.persist(entity);
			etx.commit();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			System.out.println("Inside getTransaction() ::"+etx.isActive());
			em.close();
			if(etx.isActive())
				etx.rollback();
		}
	}
	
	public Object findEntityByPrimaryKey(Class className,int id)
	{
		return em.find(className, id);
	}	

	public void findAndRemoveEntity(Class className,int id)
	{
		etx=getTransaction();
		Object entity=em.find(className, id);
		if(entity!=null)
		{	
		etx.begin();
		em.remove(entity);
		etx.commit();
		}
	}
	
	
}
