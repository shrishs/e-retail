package org.admin.client.view.impl;

import org.admin.client.presenter.WelcomeMenuPresenter;
import org.admin.client.ui.AppMenuBar;
import org.admin.client.ui.FooterUI;
import org.admin.client.ui.HeaderUI;
import org.admin.client.view.WelcomeMenuView;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class WelcomeMenuViewImpl  extends Composite implements  WelcomeMenuView{

	private WelcomeMenuPresenter presenter;
	
	public WelcomeMenuViewImpl() {
		/*DockLayoutPanel dockLayoutPanel=new DockLayoutPanel(Unit.PCT);
		VerticalPanel verticalPanel=new VerticalPanel();
		verticalPanel.add(new HeaderUI());
		verticalPanel.add(new AppMenuBar());
		verticalPanel.setSize("100%", "100%");
	
		dockLayoutPanel.addNorth(verticalPanel, 18);
		dockLayoutPanel.addSouth(new FooterUI(), 5);*/
		HTMLPanel htmlPanel=new HTMLPanel("Hello");
		//dockLayoutPanel.add(htmlPanel);
		//initWidget(dockLayoutPanel);
		initWidget(htmlPanel);
		//Following line is required otherwise nothing will be displayed on the screen.
		//dockLayoutPanel.setSize("100%", "100%");
		htmlPanel.setSize("100%", "100%");
		bind();
		
	}
	private void bind() {
		//To handle all the event Handler
		
	}
	public void setPresenter(WelcomeMenuPresenter presenter) {
		this.presenter=presenter;
		
	}

}
