
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;


public abstract class EOEnumerationController extends EOTitlesController {


    public EOEnumerationController() { return null; }

    public EOEnumerationController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected boolean preferredUsesLabelComponent() { return true; }

    public void setRelationshipPath(String string) {}

    public String relationshipPath() { return null; }

    protected String _derivedLabel() { return null; }

    protected EOEnterpriseObject _masterObject() { return null; }

    protected String _masterEntityName() { return null; }

    public String titlesEntityName() { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private String _relationshipPath;

}
