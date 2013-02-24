package org.admin.client.ui;

import org.admin.client.AdminRPCServiceAsync;
import org.admin.client.AppControllerWActivityNPlaces;
import org.admin.client.ClientFactory;
import org.admin.client.places.WelcomeMenuPlace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author ssrivastava
 *
 */
public class MainLogin extends Composite {

	private static MainLoginUiBinder uiBinder = GWT.create(MainLoginUiBinder.class);
	ClientFactory clientFactory = GWT.create(ClientFactory.class);
	private AdminRPCServiceAsync rpcService;

	interface MainLoginUiBinder extends UiBinder<Widget, MainLogin> {
	}
	
	 interface Resources extends ClientBundle {
	        @Source("resources/logo.jpg") public ImageResource logo();
	    }	

	 @UiField Button buttonLogin;
	 @UiField TextBox textBoxUsername;
	 @UiField PasswordTextBox textBoxPassowrd;
	 
	public MainLogin() {
		initWidget(uiBinder.createAndBindUi(this));
		setWidgetToMaxWidthAndHeight ();
	}
	
	
	@UiHandler("buttonLogin")
	void submitLoginForm (ClickEvent event) {
		rpcService=clientFactory.getAdminRPCService();
		  rpcService.isLogin(textBoxUsername.getValue(), textBoxPassowrd.getValue(),new AsyncCallback<Boolean>() {
	          public void onFailure(Throwable caught) {
	        	  Window.alert("Not able to communicate with server 404 expected"+caught); 
	            }
	            public void onSuccess(Boolean isLogIn) {
	            	if(isLogIn.booleanValue())
	            	{
	            		//History.newItem(Tokens.WELCOMEMENU);
	            		Window.alert("Username is correct."); 
	            		//SimplePanel simplePanel=RootPanel.get("centerPanel");
	            		MainWelcomeNavigator mainWelcomeNavigator=new MainWelcomeNavigator();
	            		SimplePanel simplePanel=mainWelcomeNavigator.getCenterPanel();
	            		AppControllerWActivityNPlaces appControllerWActivityNPlaces=new AppControllerWActivityNPlaces(clientFactory.getAdminRPCService(), clientFactory.getEventBus(), simplePanel, clientFactory);
	            		RootPanel.get().clear();
	            		RootPanel.get().add(mainWelcomeNavigator,0,0);
	            	}
	            	else Window.alert("Username is not correct."); 
	            		
	            }
	          });
	}

	/** Added to get access from View and Presnter**/
	public Button getButtonLogin() {
		return buttonLogin;
	}

	/** Added to get access from View and Presnter**/
	public TextBox getTextBoxUsername() {
		return textBoxUsername;
	}

	/** Added to get access from View and Presnter**/
	public PasswordTextBox getTextBoxPassowrd() {
		return textBoxPassowrd;
	}


/**
 * This method is required otherwise nothing is displayed on the DocLayoutPanel
 */
	private void setWidgetToMaxWidthAndHeight ()
	{
	        setWidth("100%");
	        setHeight("100%");
	}
	
}
