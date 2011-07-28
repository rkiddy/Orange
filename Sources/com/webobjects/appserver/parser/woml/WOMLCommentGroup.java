
package com.webobjects.appserver.parser.woml;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WODynamicGroup;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

public class WOMLCommentGroup extends WODynamicGroup {

    public WOMLCommentGroup(String name, NSDictionary someAssociations, WOElement template) { return null; }

    public WOMLCommentGroup(String name, NSDictionary someAssociations, NSMutableArray children) { return null; }

    public void appendChildrenToResponse(WOResponse response, WOContext context) {}

    public WOActionResults invokeChildrenAction(WORequest request, WOContext context) { return null; }

    public void takeChildrenValuesFromRequest(WORequest request, WOContext context) {}
}
