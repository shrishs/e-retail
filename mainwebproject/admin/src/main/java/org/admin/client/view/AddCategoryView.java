package org.admin.client.view;

import org.admin.client.presenter.AddCategoryPresenter;


import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;

public interface AddCategoryView extends IsWidget {

	void setPresenter(AddCategoryPresenter presenter);
	public HasValue<String> getTextBoxCategoryName();
	public HasValue<String> getTextBoxCategoryDescription();
	public boolean isParentCategory();
	public void setErrorMessage(String errorMessage);
	public void setAllFieldtoNull();
	
	
}
