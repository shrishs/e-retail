package org.admin.client;

import org.admin.client.activities.AddCategoryActivity;
import org.admin.client.activities.WelcomeMenuActivity;
import org.admin.client.places.AddCategoryPlace;
import org.admin.client.places.WelcomeMenuPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;


public class AppActivityMapper implements ActivityMapper{

    private ClientFactory clientFactory;

    public AppActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

	
    public Activity getActivity(Place place) {
		if (place instanceof WelcomeMenuPlace)
				return new WelcomeMenuActivity((WelcomeMenuPlace)place, clientFactory);
		else if (place instanceof AddCategoryPlace)
			return new AddCategoryActivity((AddCategoryPlace)place, clientFactory);
		else return null;
	}

}
