package org.admin.client;

import org.admin.client.view.AddCategoryView;
import org.admin.client.view.WelcomeMenuView;
import org.admin.client.view.impl.AddCategoryViewImpl;
import org.admin.client.view.impl.WelcomeMenuViewImpl;

import com.google.gwt.core.client.GWT;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;


public class ClientFactoryImpl implements ClientFactory{

	private static EventBus eventBus;
	private static AdminRPCServiceAsync rpcService;
	private static WelcomeMenuView wecomeMenuView;
	private static AddCategoryView addCategoryView;
	private static PlaceController placeController;
	private boolean isVisible=false;
	 
	
	public EventBus getEventBus() {
		if (eventBus == null) eventBus = new SimpleEventBus();
		return eventBus;
	}

	public AdminRPCServiceAsync getAdminRPCService() {
		if (rpcService == null) rpcService = GWT.create(AdminRPCService.class);
		return rpcService;
	}



	public WelcomeMenuView getWelcomeMenuView() {
		if (wecomeMenuView == null) wecomeMenuView = new WelcomeMenuViewImpl();
		return wecomeMenuView;
	}

	
	/**
	 * Need to do some updating to reflect EventBus moving in GWT 2.4 causing the
	 * warning below.
	 */
	//Have made the following change
	//@Override
	public PlaceController getPlaceController() {
		if (placeController == null) placeController = new PlaceController(getEventBus());
		return placeController;
	}

	public AddCategoryView getAddCategoryView() {
		if (addCategoryView == null) addCategoryView = new AddCategoryViewImpl();
		return addCategoryView;
	}

	public boolean isMenuVisible() {
		return isVisible;
	}
	
	public void setMenuVisible(boolean isVisible) {
		this.isVisible=isVisible;
	}
}