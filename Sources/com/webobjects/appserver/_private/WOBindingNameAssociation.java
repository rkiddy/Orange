
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOComponent;
import com.webobjects.eocontrol.EOEventCenter;
import com.webobjects.foundation.*;


public class WOBindingNameAssociation extends WOAssociation
    implements Cloneable {


    public Object clone() { return null; }

    public String toString() { return null; }

    protected boolean _hasBindingInParent(WOComponent theParent) { return true; }

    public Object valueInComponent(WOComponent aComponent) { return null; }

    public void setValue(Object aValue, WOComponent aComponent) {}

    public void _setValueNoValidation(Object aValue, WOComponent aComponent) {}

    public WOBindingNameAssociation(String keyPath) { return null; }

    public boolean isValueSettable() { return true; }

    public boolean isValueConstant() { return true; }

    public boolean isValueSettableInComponent(WOComponent aComponent) { return true; }

    public boolean isValueConstantInComponent(WOComponent aComponent) { return true; }

    public boolean _isImplementedForComponent(WOComponent aComponent) { return true; }

    public String keyPath() { return null; }

    public String bindingInComponent(WOComponent aComponent) { return null; }

    public String _parentBindingName;
    private String _keyPath;

}
