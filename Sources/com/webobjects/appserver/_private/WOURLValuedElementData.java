
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.util.Random;


public class WOURLValuedElementData {


    public WOURLValuedElementData(NSData someData, String mimeType, String key) { return null; }

    public String key() { return null; }

    public String type() { return null; }

    public NSData data() { return null; }

    public boolean isTemporary() { return true; }

    public String toString() { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public String dataURL(WOContext context) { return null; }

    protected static NSData _dataValueInComponent(WOAssociation dataAssoc, WOComponent aComponent) { return null; }

    public static Object _uvedInComponent(WOAssociation keyAssoc, WOAssociation dataAssoc, WOAssociation mimeTypeAssoc, WOComponent aComponent) { return null; }

    protected static String _dataURL(WOContext aContext, WOAssociation keyAssoc, WOAssociation dataAssoc, WOAssociation mimeTypeAssoc, WOComponent aComponent) { return null; }

    public static void _appendDataURLAttributeToResponse(WOResponse aResponse, WOContext aContext, WOAssociation keyAssoc, WOAssociation dataAssoc, WOAssociation mimeTypeAssoc, String urlAttributeName, WOComponent aComponent) { return null; }

    static  {}

    String _key;
    String _mimeType;
    NSData _data;
    boolean _temporaryKey;
    static Random _random;

}
