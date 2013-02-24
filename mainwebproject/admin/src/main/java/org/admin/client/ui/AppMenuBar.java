package org.admin.client.ui;

import org.admin.client.ClientFactory;
import org.admin.client.places.AddCategoryPlace;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;


public class AppMenuBar extends Composite {

	private static AppMenuBarUiBinder uiBinder = GWT
			.create(AppMenuBarUiBinder.class);
	
	private ClientFactory clientFactory = GWT.create(ClientFactory.class);
	
	interface AppMenuBarUiBinder extends UiBinder<Widget, AppMenuBar> {
	}

	public AppMenuBar() {
		initWidget(uiBinder.createAndBindUi(this));
		
		setUp();
	}

	
	@UiField MenuItem addCategory;
	@UiField MenuItem addSupplier;
	
	private void setUp(){
		addCategory.setScheduledCommand(new Command(){
			public void execute() {
				Window.alert("addCategory");
				goTo(new AddCategoryPlace());
			}			
		});
		addSupplier.setScheduledCommand(new Command(){
			public void execute() {
				Window.alert("addSupplier");
			}			
		});
	}

	public void goTo(Place place) {
        clientFactory.getPlaceController().goTo(place);
    }	
}
