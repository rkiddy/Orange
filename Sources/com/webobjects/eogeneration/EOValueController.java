
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EODisplayUtilities;
import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;


public abstract class EOValueController extends EOAssociationController {


    public EOValueController() { return null; }

    public EOValueController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public boolean canBeTransient() { return true; }

    protected boolean _preferredCanResizeVertically() { return true; }

    public void setValueKey(String string) {}

    public String valueKey() { return null; }

    protected String _derivedLabel() { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private String _valueKey;

}
