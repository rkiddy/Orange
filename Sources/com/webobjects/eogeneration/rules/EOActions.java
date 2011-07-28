
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;


public class EOActions extends EORuleComponent {

    public EOActions(WOContext context) { return null; }

    public boolean hasMainEntities() { return true; }

    public boolean hasEnumerationEntities() { return true; }

    public NSArray additionalActions() { return null; }
}
