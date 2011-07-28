
package com.webobjects.eogeneration;

import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation._NSUtilities;
import java.text.Format;

public abstract class _EOKeyPathUtility {


    public static void _useUtilityIfNotSpecified(_EOKeyPathUtility utility) { return null; }

    public static void setUtility(_EOKeyPathUtility utility) { return null; }

    public static _EOKeyPathUtility utility() { return null; }

    public _EOKeyPathUtility() { return null; }

    public abstract boolean _classDescriptionHasRelationshipNamed(EOClassDescription eoclassdescription, String s);

    protected EOClassDescription _classDescriptionForComponentAtIndexOfKeyPath(EOClassDescription classDescription, NSArray keyPathComponents, int index) { return null; }

    public abstract Object _propertyForKeyPath(String s, String s1, boolean flag, boolean flag1);

    public Object propertyForKeyPath(String entityName, String keyPath) { return null; }

    public abstract String destinationEntityNameForKeyPath(String s, String s1);

    protected abstract int _typeForKeyPath(String s, String s1, boolean flag, boolean flag1);

    public int typeForKeyPath(String entityName, String keyPath) { return 0; }

    public boolean keyPathRepresentsAttribute(String entityName, String keyPath) { return true; }

    public boolean keyPathRepresentsRelationship(String entityName, String keyPath) { return true; }

    public boolean keyPathRepresentsToOneRelationship(String entityName, String keyPath) { return true; }

    public boolean keyPathRepresentsToManyRelationship(String entityName, String keyPath) { return true; }

    public abstract boolean keyPathRepresentsToOneRelationshipWithAutomaticallyCreatedObject(String s, String s1);

    public abstract boolean keyPathRepresentsMandatoryProperty(String s, String s1);

    public abstract Format defaultFormatForKeyPath(String s, String s1);

    public abstract String inverseKeyPath(String s, String s1);

    static  {}

    public static final Class _CLASS;
    public static final int UnknownType = -1;
    public static final int Attribute = 0;
    public static final int ToOneRelationship = 1;
    public static final int ToManyRelationship = 2;
    private static _EOKeyPathUtility _utility;

}
