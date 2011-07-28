
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

public class WODynamicGroup extends WODynamicElement {


    public static WODynamicGroup EmptyGroup() { return null; }

    public WODynamicGroup(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    public WODynamicGroup(String aName, NSDictionary someAssociations, NSMutableArray children) { return null; }

    private void _initChildrenFromTemplate(WOElement template) {}

    public NSMutableArray childrenElements() { return null; }

    protected void addChildElement(Object anElement) {}

    public boolean hasChildrenElements() { return true; }

    public void takeChildrenValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeChildrenAction(WORequest aRequest, WOContext aContext) { return null; }

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendChildrenToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public String toString() { return null; }

    static  {}

    protected NSMutableArray _children;
    private static final WODynamicGroup _EmptyGroup;

}
