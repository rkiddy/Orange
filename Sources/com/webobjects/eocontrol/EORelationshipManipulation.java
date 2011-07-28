
package com.webobjects.eocontrol;

import com.webobjects.foundation._NSUtilities;

public interface EORelationshipManipulation {


    public abstract void addObjectToPropertyWithKey(Object obj, String s);

    public abstract void removeObjectFromPropertyWithKey(Object obj, String s);

    public abstract void addObjectToBothSidesOfRelationshipWithKey(EORelationshipManipulation eorelationshipmanipulation, String s);

    public abstract void removeObjectFromBothSidesOfRelationshipWithKey(EORelationshipManipulation eorelationshipmanipulation, String s);



    public static final Class _CLASS = null;

}
