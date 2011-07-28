
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;


public class EOWindow extends EOController {

    public EOWindow(WOContext context) { return null; }

    public boolean useQueryWindow() { return true; }

    public boolean useEnumerationWindow() { return true; }

    public boolean useOtherWindow() { return true; }
}
