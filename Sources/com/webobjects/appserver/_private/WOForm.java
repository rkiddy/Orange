
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public class WOForm extends WOHTMLDynamicElement {


    public WOForm(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    public String toString() { return null; }

    protected boolean _enterFormInContext(WOContext aContext) { return true; }

    protected void _exitFormInContext(WOContext aContext, boolean wasInForm, boolean wasFormSubmitted) {}

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    private void _appendHiddenFieldsToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendChildrenToResponse(WOResponse aResponse, WOContext aContext) {}

    protected void _appendCGIActionToResponse(WOResponse aResponse, WOContext aContext) {}

    public void appendAttributesToResponse(WOResponse aResponse, WOContext aContext) {}

    protected String getActionURL(WOContext aContext) { return null; }

    protected boolean isMultipleSubmitInContext(WOContext context) { return true; }

    protected boolean addDefaultSubmitButtonInContext(WOContext context) { return true; }

    public static void setAddDefaultSubmitButtonDefault(boolean value) { return null; }

    public static boolean _addDefaultSubmitButtonDefault() { return null; }

    public String formNameInContext(WOContext context) { return null; }

    public String enctypeInContext(WOContext context) { return null; }

    public static final String FORCE_FORM_SUBMITTED_KEY = "_forceFormSubmitted";
    private WOAssociation _action;
    protected WOAssociation _href;
    private WOAssociation _multipleSubmit;
    protected WOAssociation _actionClass;
    private WOAssociation _queryDictionary;
    private NSDictionary _otherQueryAssociations;
    protected WOAssociation _directActionName;
    protected WOAssociation _addDefaultSubmitButton;
    protected static Boolean _addDefaultSubmitButtonDefault;
    protected WOAssociation _formName;
    protected WOAssociation _enctype;

}
