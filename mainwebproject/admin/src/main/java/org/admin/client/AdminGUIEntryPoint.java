package org.admin.client;



import org.admin.client.ui.MainNavigator;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;






/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AdminGUIEntryPoint implements EntryPoint {
  /**
   * This is the entry point method.
   */
	
	  ClientFactory clientFactory = GWT.create(ClientFactory.class);
	  SimplePanel simplePanel;
	
  public void onModuleLoad() {

	  
	  
	  GWT.log("AdminGUIEntryPoint ::onModuleLoad::Start ");
	  MainNavigator mainNavigator=new  MainNavigator();
    
     //Following step is required otherwise nothing will be dispalyed
	  mainNavigator.setSize("100%","100%");
	  //Giving coordinate is very important otherwise page will be displayed in chrome and Internet explorer(quirk mode) but not in Internet explorer(Standard mode)
     RootPanel.get().add(mainNavigator,0,0);
	  GWT.log("AdminGUIEntryPoint ::onModuleLoad::End ");
	  
  
  }
		
}
