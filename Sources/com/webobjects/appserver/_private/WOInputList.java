
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.Collections;
import java.util.List;


public abstract class WOInputList extends WOInput {


    public WOInputList(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    protected boolean defaultEscapeHTML() { return true; }

    public String toString() { return null; }

    protected List listInContext(WOContext context) { return null; }

    protected Class listClassInContext(WOContext context) { return null; }

    protected void setItemValueInContext(WOContext context, Object value) {}

    protected void setIndexValueInContext(WOContext context, int index) {}

    protected String displayStringInContext(WOContext context) { return null; }

    protected String optionStringInContext(WOContext context, Object value, int index) { return null; }

    protected List selectedListInContext(WOContext context) { return null; }

    protected void setSelectionListInContext(WOContext context, List selections) {}

    protected boolean optionDisabledInContext(WOContext context) { return true; }

    protected WOAssociation _list;
    protected WOAssociation _item;
    protected WOAssociation _index;
    protected WOAssociation _displayString;
    protected WOAssociation _selections;
    protected WOAssociation _selectedValues;
    protected WOAssociation _optionDisabled;
    protected boolean _loggedSlow;

}
