
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSValidation;


public class EditComponent extends D2WStatelessComponent
    implements DTWGeneration {


    public EditComponent(WOContext aContext) { return null; }

    public Object value() { return null; }

    public void setValue(Object anObject) {}

    public Object validateTakeValueForKeyPath(Object anObject, String aPath) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public void validationFailedWithException(Throwable theException, Object theValue, String theKeyPath) {}

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xa2aaf268L;

}
