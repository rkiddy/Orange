
package com.webobjects.eocontrol;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation._NSUtilities;


public abstract class EODataSource {


    public EODataSource() { return null; }

    public Object createObject() { return null; }

    public abstract void insertObject(Object obj);

    public abstract void deleteObject(Object obj);

    public NSArray fetchObjects() { return null; }

    public EOEditingContext editingContext() { return null; }

    public EOClassDescription classDescriptionForObjects() { return null; }

    public abstract EODataSource dataSourceQualifiedByKey(String s);

    public abstract void qualifyWithRelationshipKey(String s, Object obj);

    static  {}

    public static final Class _CLASS;

}
