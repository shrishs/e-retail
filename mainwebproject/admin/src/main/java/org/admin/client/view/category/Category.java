package org.admin.client.view.category;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.widget.client.TextButton;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

public class Category extends Composite {

	public Category() {
		
		VerticalPanel verPanel=new VerticalPanel();
		initWidget(verPanel);
		verPanel.setSize("100%", "100%");
		
		FlexTable flexTable = new FlexTable();
		verPanel.add(flexTable);
		verPanel.setCellVerticalAlignment(flexTable, HasVerticalAlignment.ALIGN_MIDDLE);
		verPanel.setCellHorizontalAlignment(flexTable, HasHorizontalAlignment.ALIGN_CENTER);
		flexTable.setSize("20%", "20%");
		
		Label lblCategoryName = new Label("CategoryName");
		flexTable.setWidget(0, 0, lblCategoryName);
		
		TextBox txtCatgegoryName=new TextBox();
		flexTable.setWidget(0, 1, txtCatgegoryName);

		Label lblCategoryDescription = new Label("CategoryDescription");
		flexTable.setWidget(1, 0, lblCategoryDescription);
		
		TextBox txtCategoryDescription=new TextBox();
		flexTable.setWidget(1, 1, txtCategoryDescription);
		
		CheckBox isParentCategory=new CheckBox();
		isParentCategory.setName("isParentCategory");
		flexTable.setWidget(2, 1, isParentCategory);
		
		Label lblIsParentCategory = new Label("ParentCategory");
		flexTable.setWidget(2, 0, lblIsParentCategory);
		
		TextButton buttonCreateCategory=new TextButton("Create");
		flexTable.setWidget(3, 1, buttonCreateCategory);
		
		flexTable.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		flexTable.getCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		flexTable.getCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		flexTable.getCellFormatter().setHorizontalAlignment(3, 1, HasHorizontalAlignment.ALIGN_CENTER);
	
		
		
	}

}
