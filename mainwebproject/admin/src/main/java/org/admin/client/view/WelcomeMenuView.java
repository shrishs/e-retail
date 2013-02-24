package org.admin.client.view;

import org.admin.client.presenter.WelcomeMenuPresenter;

import com.google.gwt.user.client.ui.IsWidget;

public interface WelcomeMenuView extends IsWidget {

	void setPresenter(WelcomeMenuPresenter presenter);

}
