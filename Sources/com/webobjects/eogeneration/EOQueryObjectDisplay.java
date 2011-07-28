
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOObjectDisplay;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation._NSUtilities;

public interface EOQueryObjectDisplay
    extends EOObjectDisplay {


    public abstract EOEditingContext queryEditingContext();

    public abstract EODisplayGroup queryDisplayGroup();



    public static final Class _CLASS = null;

}
