
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.List;


public class WORepetition extends WODynamicGroup {


    public WORepetition(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    public String toString() { return null; }

    public void _prepareForIterationWithIndex(int anIndex, int aCount, NSArray aListNSArray, List aListVector, WOContext aContext, WOComponent aComponent) {}

    public void _cleanupAfterIteration(WOContext aContext, WOComponent aComponent, int count) {}

    public int count(NSArray aListNSArray, List aListVector) { return 0; }

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    static String _indexStringForSenderAndElement(String aSenderId, String anElementId) { return null; }

    static String _indexOfChosenItemForRequestInContext(WORequest aRequest, WOContext aContext) { return null; }

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    WOAssociation _list;
    WOAssociation _item;
    WOAssociation _count;
    WOAssociation _index;

}
