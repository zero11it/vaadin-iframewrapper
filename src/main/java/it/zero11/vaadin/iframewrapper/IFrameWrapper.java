package it.zero11.vaadin.iframewrapper;

import com.vaadin.ui.AbstractComponent;

import it.zero11.vaadin.iframewrapper.client.IFrameWrapperState;

public class IFrameWrapper extends AbstractComponent {
	private static final long serialVersionUID = 1L;

	public IFrameWrapper() {
	}

	@Override
	public IFrameWrapperState getState() {
		return (IFrameWrapperState) super.getState();
	}
	
	public void setContent(String content){
		getState().content = content;
	}
}
