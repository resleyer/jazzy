/*
 * Created on 2004-apr-23
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package com.swabunga.spell.swing.autospell;

import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

/**
 * Gets the views from the original ViewFactory and but all of them in a
 * AutoSpellView to support the waved line style. (Maybe this should only
 * be done for elements actually marked as misspelled, maybe...)
 * 
 * @author Robert Gustavsson (robert@lindesign.se)
 */
public class AutoSpellViewFactory implements ViewFactory{

	private ViewFactory	viewFactory=null;
	
	public AutoSpellViewFactory(ViewFactory wf){
		viewFactory=wf;
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.text.ViewFactory#create(javax.swing.text.Element)
	 */
	public View create(Element arg0) {
		View view=viewFactory.create(arg0);
		return new AutoSpellView(view);
	}
}