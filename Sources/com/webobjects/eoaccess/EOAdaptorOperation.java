
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.*;


public class EOAdaptorOperation {


    public EOAdaptorOperation(EOEntity entity) { return null; }

    public int adaptorOperator() { return 0; }

    public void setAdaptorOperator(int adaptorOperator) {}

    public EOEntity entity() { return null; }

    public EOQualifier qualifier() { return null; }

    public void setQualifier(EOQualifier qualifier) {}

    public NSDictionary changedValues() { return null; }

    public void setChangedValues(NSDictionary changedValues) {}

    public NSArray attributes() { return null; }

    public void setAttributes(NSArray attributes) {}

    public EOStoredProcedure storedProcedure() { return null; }

    public void setStoredProcedure(EOStoredProcedure storedProcedure) {}

    public Throwable exception() { return null; }

    public void setException(Throwable exception) {}

    public String toString() { return null; }

    public int compareAdaptorOperation(EOAdaptorOperation other) { return 0; }

    protected int _adaptorOperator;
    protected EOEntity _entity;
    protected EOQualifier _qualifier;
    protected NSDictionary _changedValues;
    protected NSArray _attributes;
    protected EOStoredProcedure _storedProcedure;
    protected Throwable _exception;

}
