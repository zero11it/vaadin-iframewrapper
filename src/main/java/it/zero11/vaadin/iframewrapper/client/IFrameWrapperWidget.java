package it.zero11.vaadin.iframewrapper.client;

import com.google.gwt.dom.client.Style.BorderStyle;
import com.google.gwt.user.client.ui.Frame;

public class IFrameWrapperWidget extends Frame {

	public IFrameWrapperWidget() {
		setStyleName("iframewrapper");	
		getElement().setAttribute("border", "0");
		getElement().getStyle().setBorderStyle(BorderStyle.NONE);
	}

}