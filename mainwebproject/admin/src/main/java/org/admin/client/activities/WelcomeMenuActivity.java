package org.admin.client.activities;

import org.admin.client.ClientFactory;
import org.admin.client.places.WelcomeMenuPlace;
import org.admin.client.presenter.WelcomeMenuPresenter;
import org.admin.client.view.WelcomeMenuView;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;


public class WelcomeMenuActivity extends AbstractActivity  implements WelcomeMenuPresenter{

	
	private ClientFactory clientFactory;
	private WelcomeMenuView welcomeMenuView;
	public WelcomeMenuActivity(WelcomeMenuPlace welcomeMenuPlace,ClientFactory clientFactory) {
		this.clientFactory=clientFactory;		
	}
	
	
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		welcomeMenuView=clientFactory.getWelcomeMenuView();
		panel.setWidget(welcomeMenuView.asWidget());
		bind();	
		
	}
	
	public void bind() {
		welcomeMenuView.setPresenter(this);
		
	}

	 public void goTo(Place place) {
	        clientFactory.getPlaceController().goTo(place);
	    }




}
