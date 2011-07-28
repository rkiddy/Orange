
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eogeneration._EOKeyPathUtility;


public class EOFormElement extends EOController {

    public EOFormElement(WOContext context) { return null; }

    public boolean useWidgetController() { return true; }

    public boolean useActionWidgetController() { return true; }
}
