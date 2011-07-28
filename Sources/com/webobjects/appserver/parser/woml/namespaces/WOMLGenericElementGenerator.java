
package com.webobjects.appserver.parser.woml.namespaces;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WOMutableDeclaration;
import com.webobjects.appserver.parser.woml.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;
import java.util.*;


public class WOMLGenericElementGenerator
    implements WOMLAbstractNamespace.WOMLElementGenerator {


    public WOMLGenericElementGenerator() { return null; }

    protected Map getElementAssociationsForContribution(WOMLAbstractNamespace namespace, WOMLElement element, WOAssociationFactory associationFactory) { return null; }

    protected boolean shouldContributeAssociation(WOMLAbstractNamespace namespace, WOMLElement element, WOMutableDeclaration declaration, NSArray languages, String name, WOAssociation association) { return true; }

    public WOElement generateElement(WOMLAbstractNamespace namespace, WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException { return null; }

    public void contributeToDeclaration(WOMLAbstractNamespace namespace, WOMLElement element, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException {}

    public static final String ELEMENT_NAME_ASSOCIATION = "elementName";

}
