
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eogeneration._EOKeyPathUtility;


public class EOSubform extends EOEntityController {

    public EOSubform(WOContext context) { return null; }

    private boolean _useControllerForPropertyKeyType(int propertyKeyType, boolean testEntityHierarchy) { return true; }

    public boolean useSelectSubform() { return true; }

    public boolean useSubform() { return true; }

    public boolean useSelectSublist() { return true; }

    public boolean useSubeditor() { return true; }
}
