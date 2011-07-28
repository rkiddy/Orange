
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOComponent;

public class WOConstantValueAssociation extends WOAssociation
    implements Cloneable {


    public WOConstantValueAssociation(Object aValue) { return null; }

    public Object clone() { return null; }

    public String toString() { return null; }

    public Object valueInComponent(WOComponent aComponent) { return null; }

    public void setValue(Object aValue, WOComponent aComponent) {}

    public boolean isValueSettable() { return true; }

    public boolean isValueConstant() { return true; }

    protected String _debugDescription() { return null; }

    public String keyPath() { return null; }

    public String bindingInComponent(WOComponent aComponent) { return null; }

    public boolean booleanValueInComponent(WOComponent aComponent) { return true; }

    static  {}

    private Object _value;
    private boolean _needToCacheBoolean;
    private boolean _booleanValue;
    public static final WOConstantValueAssociation TRUE;
    public static final WOConstantValueAssociation FALSE;

}
