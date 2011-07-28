
package com.webobjects.eogeneration;

import com.webobjects.eoaccess.*;
import com.webobjects.eoapplication.EOUserInterfaceParameters;
import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation._NSUtilities;
import java.text.Format;


public class _EOAccessKeyPathUtility extends _EOKeyPathUtility {


    public _EOAccessKeyPathUtility() { return null; }

    public boolean _classDescriptionHasRelationshipNamed(EOClassDescription classDescription, String key) { return true; }

    public Object _propertyForKeyPath(String entityName, String keyPath, boolean checkAttributes, boolean checkRelationships) { return null; }

    public String destinationEntityNameForKeyPath(String entityName, String keyPath) { return null; }

    protected int _typeForKeyPath(String entityName, String keyPath, boolean checkAttributes, boolean checkRelationships) { return 0; }

    public boolean keyPathRepresentsToOneRelationshipWithAutomaticallyCreatedObject(String entityName, String keyPath) { return true; }

    public boolean keyPathRepresentsMandatoryProperty(String entityName, String keyPath) { return true; }

    public Format defaultFormatForKeyPath(String entityName, String keyPath) { return null; }

    public String inverseKeyPath(String entityName, String keyPath) { return null; }

    static  {}

    public static final Class _CLASS;

}
