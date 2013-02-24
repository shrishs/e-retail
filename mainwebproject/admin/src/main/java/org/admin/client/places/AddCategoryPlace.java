package org.admin.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;


public class AddCategoryPlace extends Place{

	
	
	public AddCategoryPlace() {
		// TODO Auto-generated constructor stub
	}
	
	public static class Tokenizer implements PlaceTokenizer<AddCategoryPlace>{

		
		public AddCategoryPlace getPlace(String token) {
			return new AddCategoryPlace();
		}

		public String getToken(AddCategoryPlace place) {
			return null;
		}

		
	}	
}
