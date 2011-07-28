
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOBindingNameAssociation;
import com.webobjects.appserver._private.WOConstantValueAssociation;
import com.webobjects.appserver._private.WOStatelessComponentParent;
import com.webobjects.foundation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;


public class WODirectAction extends WOAction
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions, NSValidation {


    public WODirectAction(WORequest aRequest) { return null; }

    public String getSessionIDForRequest(WORequest aRequest) { return null; }

    public WOActionResults defaultAction() { return null; }

    public WOActionResults performActionNamed(String anActionName) { return null; }

    public void takeFormValueArraysForKeyArray(NSArray aKeyArray) {}

    public void takeFormValuesForKeyArray(NSArray aKeyArray) {}

    public WOActionResults _componentAction() { return null; }

    public static final String actionText = "Action";

}
