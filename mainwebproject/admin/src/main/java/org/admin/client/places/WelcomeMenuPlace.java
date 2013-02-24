package org.admin.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;


public class WelcomeMenuPlace extends Place{

	
	
	public WelcomeMenuPlace() {
		// TODO Auto-generated constructor stub
	}
	
	public static class Tokenizer implements PlaceTokenizer<WelcomeMenuPlace>{

		public WelcomeMenuPlace getPlace(String token) {
			return new WelcomeMenuPlace();
		}

		public String getToken(WelcomeMenuPlace place) {
			return null;
		}
	}	
}
