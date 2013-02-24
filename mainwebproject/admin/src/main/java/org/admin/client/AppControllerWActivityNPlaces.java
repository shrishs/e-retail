package org.admin.client;

import org.admin.client.places.WelcomeMenuPlace;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;




public class AppControllerWActivityNPlaces {
	
     private AdminRPCServiceAsync rpcService ;
     private EventBus eventBus;	
     private Place defaultPlace = new WelcomeMenuPlace();
	
	public AppControllerWActivityNPlaces(AdminRPCServiceAsync rpcService ,EventBus eventBus, AcceptsOneWidget appWidget,ClientFactory clientFactory) {
		
		GWT.log("AppControllerWActivityNPlaces");
		 PlaceController placeController = clientFactory.getPlaceController();
		 
		 // Start ActivityManager for the main widget with our ActivityMapper
        ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
        activityManager.setDisplay(appWidget);
        
        // Start PlaceHistoryHandler with our PlaceHistoryMapper
        AppPlacesHistoryMapper historyMapper= GWT.create(AppPlacesHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eventBus, defaultPlace);
        
        // Goes to the place represented on URL else default place
      
        historyHandler.handleCurrentHistory();
		
		
		this.eventBus = eventBus;
		this.rpcService = rpcService;
		bind();
        
	}

	private void bind() {
		// Listen for AppWide events on the event bus
		
	}

}
