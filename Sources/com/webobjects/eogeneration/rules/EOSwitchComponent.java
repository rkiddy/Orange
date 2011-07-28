
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.foundation.*;

public class EOSwitchComponent extends WODynamicElement {
    static class EOKeyValueAssociation extends WOAssociation {


        public EOKeyValueAssociation(EOSwitchComponent target) { return null; }

        public Object valueInComponent(WOComponent aComponent) { return null; }

        public void setValue(Object aValue, WOComponent aComponent) {}

        public boolean isValueSettable() { return true; }

        public boolean isValueConstant() { return true; }

        public String keyPath() { return null; }

        public String bindingInComponent(WOComponent aComponent) { return null; }

        protected EOSwitchComponent _target;

    }



    public EOSwitchComponent(String aName, NSDictionary associations, WOElement aTemplate) { return null; }

    public synchronized void appendToResponse(WOResponse aResponse, WOContext aContext) { return null; }

    public WOElement _realComponentWithName(String aName, WOContext aContext, D2WContext d2wContext) { return null; }

    public static final String ComponentNameKey = "componentNameKey";
    public static final String ComponentName = "componentName";
    public static final String D2WContextKey = "d2wContext";
    WOAssociation _componentNameKeyAssociation;
    WOAssociation _componentNameAssociation;
    WOAssociation _d2wContextAssociation;
    NSMutableDictionary _associations;
    D2WContext _d2wContext;
    NSMutableDictionary _componentCache;
    WOElement _template;

}
