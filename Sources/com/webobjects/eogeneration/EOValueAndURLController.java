
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EODisplayUtilities;
import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;


public abstract class EOValueAndURLController extends EOValueController {


    public EOValueAndURLController() { return null; }

    public EOValueAndURLController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public boolean isEditable() { return true; }

    public void setURLKey(String string) {}

    public String URLKey() { return null; }

    protected String _derivedLabel() { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private String _urlKey;

}
