
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import java.util.Enumeration;
import java.util.Vector;


public class EODefaultSpecifications extends EORuleComponent {

    public EODefaultSpecifications(WOContext context) { return null; }

    public boolean useQueryWindowAsDefault() { return true; }

    public boolean useEnumerationWindowAsDefault() { return true; }

    public boolean needsErrorSpecification() { return true; }

    public NSArray additionalDefaultSpecifications() { return null; }
}
