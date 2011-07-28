
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOComponent;


public class WOReadOnlyKeyValueAssociation extends WOKeyValueAssociation
    implements Cloneable {

    public WOReadOnlyKeyValueAssociation(String aKeyPath) { return null; }

    public Object clone() { return null; }

    public void setValue(Object aValue, WOComponent aComponent) {}

    public boolean isValueSettable() { return true; }

    public boolean isValueConstant() { return true; }

    protected String _debugDescription() { return null; }

    public String keyPath() { return null; }

    public String bindingInComponent(WOComponent aComponent) { return null; }
}
