package org.admin.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author ssrivastava
 *
 */
public class MainNavigator extends Composite {

	private static MainNavigatorUiBinder uiBinder = GWT.create(MainNavigatorUiBinder.class);

	interface MainNavigatorUiBinder extends UiBinder<Widget, MainNavigator> {
	}
	
	/* interface Resources extends ClientBundle {
	        @Source("resources/logo.jpg") public ImageResource logo();
	    }	*/

    @UiField SimplePanel centerPanel;
	public MainNavigator() {
		initWidget(uiBinder.createAndBindUi(this));
		setWidgetToMaxWidthAndHeight ();
		Window.addResizeHandler(resizeHandler);
	}
	
	public SimplePanel getCenterPanel() {
		return centerPanel;
	}



	public void setCenterPanel(SimplePanel centerPanel) {
		this.centerPanel = centerPanel;
	}
	
	 /* *************  WIDGET CENTERING CODE *************** */
    private ResizeHandler resizeHandler = new ResizeHandler()
    {
        public void onResize (ResizeEvent event)
        {
            setWidgetToMaxWidthAndHeight();
        }
    };	
	

/**
 * This method is required otherwise nothing is displayed on the DocLayoutPanel
 */
	private void setWidgetToMaxWidthAndHeight ()
	{
	        setWidth("100%");
	        setHeight("100%");
	}
	
}
