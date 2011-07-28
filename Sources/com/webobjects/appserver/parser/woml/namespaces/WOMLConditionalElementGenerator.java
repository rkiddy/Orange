
package com.webobjects.appserver.parser.woml.namespaces;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver._private.*;
import com.webobjects.appserver.parser.woml.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;


public class WOMLConditionalElementGenerator extends WOMLGenericElementGenerator {


    public WOMLConditionalElementGenerator() { return null; }

    public WOElement generateElement(WOMLAbstractNamespace namespace, WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException { return null; }

    public void contributeToDeclaration(WOMLAbstractNamespace namespace, WOMLElement element, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException {}

    static  {}

    protected static final String CONDITION_RESULT_PREFIX = "generatedCondition";
    protected static int CONDITION_ID;

}
