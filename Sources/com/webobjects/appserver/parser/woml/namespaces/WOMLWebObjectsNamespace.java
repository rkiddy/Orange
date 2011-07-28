
package com.webobjects.appserver.parser.woml.namespaces;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver._private.WOMutableDeclaration;
import com.webobjects.appserver.parser.woml.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;


public class WOMLWebObjectsNamespace extends WOMLAbstractNamespace {


    public WOMLWebObjectsNamespace(String namespaceId) { return null; }

    public String getComponentIdentifierAttributeName() { return null; }

    public void contributeToDeclaration(WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException {}

    public static final String ATTRIBUTE_COMPONENT = "component";

}
