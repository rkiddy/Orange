
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;

/**
 * @deprecated Class WONestedList is deprecated
 */

public class WONestedList extends WODynamicElement {


    public WONestedList(String aName, NSDictionary someAssociations, WOElement aTemplate) { return null; }

    private Object _objectAtIndexPathInListCurrentIndexInComponent(NSArray anIndexArray, NSArray aList, int aCurrentIndex, WOComponent aComponent) { return null; }

    public Object objectAtIndexPathInListInComponent(NSArray anIndexArray, NSArray aList, WOComponent aComponent) { return null; }

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    private void _appendToResponseInContextOrderedListLevel(WOResponse aResponse, WOContext aContext, NSArray aList, int aLevel) {}

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    private WOAssociation _list;
    private WOAssociation _item;
    private WOAssociation _displayString;
    private WOAssociation _escapeHTML;
    private WOAssociation _sublist;
    private WOAssociation _action;
    private WOAssociation _selection;
    private WOAssociation _index;
    private WOAssociation _level;
    private WOAssociation _isOrdered;
    private WOAssociation _prefix;
    private WOAssociation _suffix;
    private boolean _defaultEscapeHTML;

}
