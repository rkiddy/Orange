
package com.webobjects.eocontrol;

import com.webobjects.foundation._NSUtilities;
import java.io.Serializable;

public abstract class EOGlobalID
    implements Serializable, Cloneable {


    public EOGlobalID() { return null; }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public boolean isTemporary() { return true; }

    public Object clone() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String GlobalIDChangedNotification = "EOGlobalIDChangedNotification";

}
