package org.admin.client.presenter;

import com.google.gwt.place.shared.Place;


/**
 * @author ssrivastava
 * There’s no requirement to create interfaces, but it’s good engineering practice to do so *
 */
public interface Presenter {
	   
	 /**
	 * This method is required for navigation to different places.
	 */
	 public void goTo(Place place);
	/**
	 * A presenter will also implement a bind method. In this design, this is where the
	 * presenter will listen to any application-wide events it’s interested in (for example, this
	 * is where it hooks into the event bus) as well as where it calls the associated view’s set-
	 * Presenter method to bind the view to itself.
	 */
	public void bind();
}
