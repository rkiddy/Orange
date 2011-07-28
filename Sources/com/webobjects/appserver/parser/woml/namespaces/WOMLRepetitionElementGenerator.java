
package com.webobjects.appserver.parser.woml.namespaces;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WOMutableDeclaration;
import com.webobjects.appserver.parser.woml.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;
import java.util.Map;


public class WOMLRepetitionElementGenerator extends WOMLGenericElementGenerator {


    public WOMLRepetitionElementGenerator() { return null; }

    protected Map getElementAssociationsForContribution(WOMLAbstractNamespace namespace, WOMLElement element, WOAssociationFactory associationFactory) { return null; }

    public WOElement generateElement(WOMLAbstractNamespace namespace, WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException { return null; }

    public void contributeToDeclaration(WOMLAbstractNamespace namespace, WOMLElement element, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException {}

    static  {}

    public static final String ATTRIBUTE_REPEAT_TAG = "repeatTag";
    private static final String WOREPETITION_ATTRIBUTES[];

}
