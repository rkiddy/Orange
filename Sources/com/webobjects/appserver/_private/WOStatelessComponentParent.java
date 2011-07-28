
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;


public class WOStatelessComponentParent extends WOComponent {


    public WOStatelessComponentParent(WOContext aContext) { return null; }

    public boolean synchronizesVariablesWithBindings() { return true; }

    public NSArray bindingKeys() { return null; }

    public WOAssociation _associationWithName(String aBindingName) { return null; }

    public boolean canGetValueForBinding(String aBindingName) { return true; }

    public boolean canSetValueForBinding(String aBindingName) { return true; }

    public boolean hasBinding(String aBindingName) { return true; }

    public Object valueForBinding(String key) { return null; }

    public void setValueForBinding(Object value, String key) {}

    static final long serialVersionUID = 0xc57593d9L;
    private NSMutableDictionary _bindings;

}
