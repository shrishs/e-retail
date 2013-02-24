package org.admin.client.activities;

import org.admin.client.AdminRPCServiceAsync;
import org.admin.client.ClientFactory;
import org.admin.client.places.AddCategoryPlace;
import org.admin.client.presenter.AddCategoryPresenter;
import org.admin.client.view.AddCategoryView;


import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasWidgets;

public class AddCategoryActivity extends AbstractActivity  implements AddCategoryPresenter{

	
	private ClientFactory clientFactory;
	private AddCategoryView addCategoryView;
	private AdminRPCServiceAsync rpcService;
	public AddCategoryActivity(AddCategoryPlace welcomeMenuPlace,ClientFactory clientFactory) {
		this.clientFactory=clientFactory;		
	}
	
	
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		addCategoryView=clientFactory.getAddCategoryView();
		panel.setWidget(addCategoryView.asWidget());
		bind();	
		
	}
	
	public void bind() {
		addCategoryView.setPresenter(this);
		
	}

	public void submitAddCategoryForm() {
		rpcService=clientFactory.getAdminRPCService();
		
		  rpcService.addCategory(addCategoryView.getTextBoxCategoryName().getValue(),addCategoryView.getTextBoxCategoryDescription().getValue(),addCategoryView.isParentCategory(),new AsyncCallback<Boolean>() {
	          public void onFailure(Throwable caught) {
	        	  Window.alert("Not able to communicate with server 404 expected"+caught); 
	            }
	            public void onSuccess(Boolean isSuccess) {
	            	if(isSuccess.booleanValue())
	            	{
	            		addCategoryView.setAllFieldtoNull();
	            		addCategoryView.setErrorMessage("Category added Successfully");
	            		goTo(new AddCategoryPlace());
	            	}
	            	else
	            	{
	            		addCategoryView.setErrorMessage("Category Not added");
	            		goTo(new AddCategoryPlace());
	            	}
	            		
	            }
	          });

		
	}

	 public void goTo(Place place) {
	        clientFactory.getPlaceController().goTo(place);
	    }

}
