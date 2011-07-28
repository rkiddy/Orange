
package com.webobjects.eointerface;

import com.webobjects.eocontrol.EODataSource;
import com.webobjects.eocontrol.EODetailDataSource;
import com.webobjects.foundation.*;


public class EOMasterDetailAssociation extends EOMasterAssociation {


    public EOMasterDetailAssociation(Object object) { return null; }

    public void dispose() {}

    public boolean isUsableWithObject(Object object) { return true; }

    protected void _connectionWasEstablished() {}

    protected void _connectionWasBroken() {}

    public void subjectChanged() {}

    static  {}

    public static final Class _CLASS;
    private Object _currentMasterObject;
    private Object _currentMasterValue;
    private int _currentNumberOfDisplayedObjects;

}
