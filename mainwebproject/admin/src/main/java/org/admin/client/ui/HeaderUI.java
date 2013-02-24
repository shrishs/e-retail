package org.admin.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HeaderUI extends Composite {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, HeaderUI> {
	}

	public HeaderUI() {
		initWidget(binder.createAndBindUi(this));
		  setWidth("100%");
	        setHeight("100%");
	}

}
