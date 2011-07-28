
package com.webobjects.appserver.parser.woml.namespaces;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver._private.WOMutableDeclaration;
import com.webobjects.appserver.parser.woml.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;
import java.util.*;

public class WOMLWebObjectsQualifierNamespace
    implements WOMLNamespace {


    public WOMLWebObjectsQualifierNamespace(String namespace) { return null; }

    public String getNamespaceId() { return null; }

    public boolean canGenerateElement(WOMLElement element) { return true; }

    public WOElement generateElement(WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) { return null; }

    public void contributeToDeclaration(WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) {}

    private String namespaceId;

}
