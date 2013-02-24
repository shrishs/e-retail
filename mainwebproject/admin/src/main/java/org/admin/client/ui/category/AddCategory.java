package org.admin.client.ui.category;

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
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author ssrivastava
 *
 */
public class AddCategory extends Composite {

	private static AddCategoryUiBinder uiBinder = GWT.create(AddCategoryUiBinder.class);
	ClientFactory clientFactory = GWT.create(ClientFactory.class);
	private AdminRPCServiceAsync rpcService;

	interface AddCategoryUiBinder extends UiBinder<Widget, AddCategory> {
	}
	
	

	 @UiField Button buttonAdd;
	 @UiField TextBox textCategoryName;
	 @UiField TextBox textDescription;
	 @UiField CheckBox  isParentCategory;
	 @UiField Label errorMessage;
	 
	public AddCategory() {
		initWidget(uiBinder.createAndBindUi(this));
		setWidgetToMaxWidthAndHeight ();
	}
	
	
	@UiHandler("buttonAdd")
	void submitAddCategory (ClickEvent event) {
/*		rpcService=clientFactory.getAdminRPCService();
		rpcService.addCategory(categoryName, description, isParentCategory, callback)
		  rpcService.addCategory(textCategoryName.getValue(), textDescription.getValue(),isParentCategory.getValue(),new AsyncCallback<Boolean>() {
	          public void onFailure(Throwable caught) {
	        	  Window.alert("Not able to communicate with server 404 expected"+caught); 
	            }
	            public void onSuccess(Boolean isSuccess) {
	            	if(isSuccess.booleanValue())
	            	{
	            		Window.alert("Category added Successfully"); 
	            		MainWelcomeNavigator mainWelcomeNavigator=new MainWelcomeNavigator();
	            		SimplePanel simplePanel=mainWelcomeNavigator.getCenterPanel();
	            		AppControllerWActivityNPlaces appControllerWActivityNPlaces=new AppControllerWActivityNPlaces(clientFactory.getAdminRPCService(), clientFactory.getEventBus(), simplePanel, clientFactory);
	            		RootPanel.get().clear();
	            		RootPanel.get().add(mainWelcomeNavigator,0,0);
	            	}
	            	else Window.alert("Category Not added Successfully"); 
	            		
	            }
	          });
*/	}

	/** Added to get access from View and Presnter**/
	public Button getButtonAdd() {
		return buttonAdd;
	}

	/** Added to get access from View and Presnter**/
	public TextBox getTextBoxCategoryName() {
		return textCategoryName;
	}

	/** Added to get access from View and Presnter**/
	public TextBox getTextBoxCategoryDescription() {
		return textDescription;
	}

	/** Added to get access from View and Presnter**/
	public CheckBox isParentCategory() {
		return isParentCategory;
	}	
	
	/** Added to get access from View and Presnter**/
	public void setErrorMessage(String errorMessage) {
		this.errorMessage.setText(errorMessage);
	}	
	
	
	public void setAllFieldtoNull()
	{
		 this.textCategoryName.setValue(null);
		 this.textDescription.setValue(null);
		 this.isParentCategory.setValue(null);
		 //this.errorMessage=null;
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
