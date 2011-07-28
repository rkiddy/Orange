
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation._NSUtilities;

public interface EOObjectDisplay {


    public abstract String entityName();

    public abstract EOEditingContext editingContext();

    public abstract EODisplayGroup displayGroup();

    public abstract EODisplayGroup controllerDisplayGroup();



    public static final Class _CLASS = null;

}
