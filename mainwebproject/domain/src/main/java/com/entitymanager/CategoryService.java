package com.entitymanager;

import java.io.Serializable;

import com.domain.ServiceCategory;


public class CategoryService extends YPEntityManager implements Serializable{

	
public void addCategory(ServiceCategory serviceCategory)
{
  super.createEntity(serviceCategory);
}


	
}
