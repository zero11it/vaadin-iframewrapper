package it.zero11.vaadin.iframewrapper.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.FrameElement;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

import it.zero11.vaadin.iframewrapper.IFrameWrapper;

@Connect(IFrameWrapper.class)
public class IFrameWrapperConnector extends AbstractComponentConnector {
	private static final long serialVersionUID = 1L;

	public IFrameWrapperConnector() {
		
	}

	@Override
	protected Widget createWidget() {
		return GWT.create(IFrameWrapperWidget.class);
	}

	@Override
	public IFrameWrapperWidget getWidget() {
		return (IFrameWrapperWidget) super.getWidget();
	}

	@Override
	public IFrameWrapperState getState() {
		return (IFrameWrapperState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);

		setIframeContent((FrameElement) getWidget().getElement().cast(), getState().content);	
	}
	
	private native void setIframeContent(FrameElement frameElement, String value) /*-{
		var doc = frameElement.contentWindow.document;
		doc.open();
		doc.write(value);
		doc.close();
	}-*/;

}
