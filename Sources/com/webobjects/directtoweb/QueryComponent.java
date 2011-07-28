
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.foundation.NSMutableDictionary;


public class QueryComponent extends D2WStatelessComponent
    implements DTWGeneration {


    public QueryComponent(WOContext aContext) { return null; }

    public WODisplayGroup displayGroup() { return null; }

    public void reset() {}

    public Object value() { return null; }

    public void setValue(Object newValue) {}

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x421414d2L;
    private WODisplayGroup _displayGroup;
    protected Object _value;

}
