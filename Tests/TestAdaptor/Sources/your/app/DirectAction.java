// Generated by the WOLips Templateengine Plug-in at 20.11.2009 15:05:59
package your.app;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WODirectAction;

import your.app.components.Main;

public class DirectAction extends WODirectAction {
	public DirectAction(WORequest request) {
		super(request);
	}

	public WOActionResults defaultAction() {
		return pageWithName(Main.class.getName());
	}
}
