package org.admin.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FooterUI extends Composite {

	private static FooterUIUiBinder uiBinder = GWT
			.create(FooterUIUiBinder.class);

	interface FooterUIUiBinder extends UiBinder<Widget, FooterUI> {
	}

	public FooterUI() {
		initWidget(uiBinder.createAndBindUi(this));
		 setWidth("100%");
	        setHeight("100%");
	}

}
