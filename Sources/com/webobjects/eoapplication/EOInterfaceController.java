
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation._NSStringUtilities;
import com.webobjects.foundation._NSUtilities;


public abstract class EOInterfaceController extends EODocumentController {


    public EOInterfaceController() { return null; }

    public EOInterfaceController(EOXMLUnarchiver unarchiver) { return null; }

    public EOInterfaceController(EOEditingContext editingContext) { return null; }

    public EOInterfaceController(EOEditingContext editingContext, String archiveName) { return null; }

    public String archiveName() { return null; }

    protected String _derivedLabel() { return null; }

    protected void generateComponent() {}

    static  {}

    public static final Class _CLASS;

}
