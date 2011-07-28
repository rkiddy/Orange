
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.foundation._NSUtilities;

public interface EODocument {


    public abstract boolean isDocumentForGlobalID(EOGlobalID eoglobalid, String s);

    public abstract void setEdited(boolean flag);

    public abstract boolean isEdited();

    public abstract boolean save();

    public abstract boolean saveIfUserConfirms(String s, String s1);



    public static final Class _CLASS = null;

}
