package org.admin.client;

import org.admin.client.places.AddCategoryPlace;
import org.admin.client.places.WelcomeMenuPlace;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({WelcomeMenuPlace.Tokenizer.class,AddCategoryPlace.Tokenizer.class})
public interface AppPlacesHistoryMapper extends PlaceHistoryMapper{
}
