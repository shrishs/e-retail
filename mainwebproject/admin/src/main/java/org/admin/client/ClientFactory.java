package org.admin.client;

import org.admin.client.view.AddCategoryView;
import org.admin.client.view.WelcomeMenuView;


import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;


public interface ClientFactory {
	public EventBus getEventBus();
	AdminRPCServiceAsync getAdminRPCService();
	WelcomeMenuView getWelcomeMenuView();
	AddCategoryView getAddCategoryView();
	public PlaceController getPlaceController();
	public boolean isMenuVisible();
	public void setMenuVisible(boolean isVisible);
}
