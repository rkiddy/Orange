
package com.webobjects.eointerface;

import com.webobjects.foundation._NSUtilities;


public abstract class EOMasterAssociation extends EOAssociation {


    public EOMasterAssociation(Object object) { return null; }

    protected String[][] _aspectInfo() { return null; }

    public boolean isUsableWithObject(Object object) { return true; }

    public int priority() { return 0; }

    public String primaryAspect() { return null; }

    static  {}

    public static final Class _CLASS;

}
