package org.admin.client.view.impl;

import org.admin.client.presenter.AddCategoryPresenter;
import org.admin.client.ui.category.AddCategory;
import org.admin.client.view.AddCategoryView;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class AddCategoryViewImpl  extends Composite implements  AddCategoryView{


	private AddCategoryPresenter presenter;
	private AddCategory addCategory;
	public AddCategoryViewImpl() {
		
		VerticalPanel verticalPanel=new VerticalPanel();
		addCategory=new AddCategory();
		verticalPanel.add(addCategory);
		
		
		initWidget(verticalPanel);
		//Following line is required otherwise nothing will be displayed on the screen.
		verticalPanel.setSize("100%", "100%");
		bind();
		
	}
	private void bind() {
		//To handle all the event Handler
		addCategory.getButtonAdd().addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent arg0) {
				presenter.submitAddCategoryForm();
				
			}
		});
		
	}
	
	public void setPresenter(AddCategoryPresenter presenter) {
		this.presenter=presenter;
		
	}
	
	
	/** Added to get access from View and Presnter**/
	public HasValue<String> getTextBoxCategoryName() {
		return addCategory.getTextBoxCategoryName();
	}

	/** Added to get access from View and Presnter**/
	public HasValue<String> getTextBoxCategoryDescription() {
		return addCategory.getTextBoxCategoryDescription();
	}

	/** Added to get access from View and Presnter**/
	public boolean isParentCategory() {
		return addCategory.isParentCategory().getValue();
	}	
	
	/** Added to get access from View and Presnter**/
	public void setErrorMessage(String errorMessage) {
		addCategory.setErrorMessage(errorMessage);
		
	}
	public void setAllFieldtoNull() {
		addCategory.setAllFieldtoNull();
		
	}	

}
