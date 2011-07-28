
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOComponent;
import com.webobjects.eocontrol.EOEventCenter;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSValidation;

public class WOKeyValueAssociation extends WOAssociation
    implements Cloneable {


    public WOKeyValueAssociation(String aKeyPath) { return null; }

    public Object clone() { return null; }

    public String toString() { return null; }

    public Object valueInComponent(WOComponent aComponent) { return null; }

    public void setValue(Object aValue, WOComponent aComponent) {}

    public void _setValueNoValidation(Object aValue, WOComponent aComponent) {}

    public boolean isValueSettable() { return true; }

    public boolean isValueConstant() { return true; }

    public String keyPath() { return null; }

    public String bindingInComponent(WOComponent aComponent) { return null; }

    protected String _keyPath;
    protected boolean _isValueSettable;

}
