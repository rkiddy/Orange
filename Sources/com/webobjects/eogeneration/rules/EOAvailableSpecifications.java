
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import java.util.Enumeration;
import java.util.Vector;


public class EOAvailableSpecifications extends EORuleComponent {

    public EOAvailableSpecifications(WOContext context) { return null; }

    public boolean hasMainEntities() { return true; }

    public boolean hasEnumerationEntities() { return true; }

    public boolean needsErrorSpecification() { return true; }

    public NSArray additionalAvailableSpecifications() { return null; }
}
