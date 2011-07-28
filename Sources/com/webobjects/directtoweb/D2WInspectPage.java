
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOGeneralAdaptorException;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSForwardException;
import com.webobjects.foundation.NSValidation;


public class D2WInspectPage extends D2WPage
    implements DTWGeneration, InspectPageInterface, EditPageInterface {


    public D2WInspectPage(WOContext aContext) { return null; }

    public void setObject(EOEnterpriseObject eo) {}

    public EOEnterpriseObject object() { return null; }

    public String implementedInterface() { return null; }

    public WOComponent nextPage() { return null; }

    boolean tryToSaveChanges(boolean validateObject) throws Throwable { return null; }

    public WOComponent submitAction() throws Throwable { return null; }

    public WOComponent editAction() { return null; }

    public WOComponent deleteAction() throws Throwable { return null; }

    public WOComponent cancelAction() { return null; }

    public void awake() {}

    public void sleep() {}

    public void setEditingContext(EOEditingContext newEditingContext) {}

    public void validationFailedWithException(Throwable theException, Object theValue, String theKeyPath) {}

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xee5ecac3L;
    public String errorMessage;
    private EOEditingContext _context;
    private String _validationExceptionString;
    private boolean _wasGenerated;

}
