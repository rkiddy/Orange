
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;


public class WOImage extends WOHTMLURLValuedElement {


    public WOImage(String aName, NSDictionary someAssociations, WOElement template) { return null; }

    static void _appendFilenameToResponseInContext(WOResponse aResponse, WOContext aContext, WOAssociation aFrameworkAssociation, WOAssociation aFilenameAssociation, WOAssociation aWidthAssociation, WOAssociation aHeightAssociation) {}

    static void _appendImageSizetoResponseInContext(WOResponse aResponse, WOContext aContext, WOAssociation aWidthAssociation, WOAssociation aHeightAssociation) {}

    protected boolean hasContent() { return true; }

    protected void _appendFilenameToResponse(WOResponse aResponse, WOContext aContext) {}

    public String toString() { return null; }

    private WOAssociation _width;
    private WOAssociation _height;

}
