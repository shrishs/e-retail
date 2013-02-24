package org.admin.server;

import java.util.List;

import javax.inject.Inject;

import org.admin.client.AdminRPCService;
import org.admin.shared.FieldVerifier;

import com.domain.City;
import com.domain.ServiceCategory;
import com.entitymanager.CategoryService;
import com.entitymanager.CityService;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class AdminRPCServiceImpl extends RemoteServiceServlet implements
AdminRPCService {
	
	 @Inject
	 private CategoryService categoryService;
	 @Inject
	 private CityService cityService;

	public boolean isLogin(String userName, String password)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		GWT.log("Inside server "+userName);
		if("shrish".equals(userName))
		{
		GWT.log("Inside server true "+userName);
		System.out.println("Inside server true 1111111111111111 ");
		//CityService cityService=new CityService();
		System.out.println("Inside server true cityService :: "+cityService);
		List<City> list=cityService.getAllCities();
		System.out.println("after get all cities :: ");
		System.out.println("after get all cities :: City Name "+list.get(0).getCityName());
		return true;
		}
		else 
			return false;
	}

	public boolean addCategory(String categoryName, String description,
			boolean isParentCategory) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		System.out.println("AdminRPCServiceImpl::addCategory "+categoryName+"::"+description+"::"+isParentCategory);
		try
		{
		GWT.log("AdminRPCServiceImpl::addCategory "+categoryName+"::"+description+"::"+isParentCategory);
		ServiceCategory serviceCategory=new ServiceCategory();
		serviceCategory.setCatName(categoryName);
		serviceCategory.setCatDescription(description);
		categoryService.addCategory(serviceCategory);
		return true;
		}catch(Exception ex)
		{
			
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			return false;
		}
		
	}

	

 }
