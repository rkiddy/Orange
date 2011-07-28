
package com.webobjects.appserver.parser.woml.namespaces;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver._private.WOMutableDeclaration;
import com.webobjects.appserver.parser.woml.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;
import java.util.*;

public class WOMLDefaultNamespace
    implements WOMLNamespace {


    public WOMLDefaultNamespace(String aNamespaceId) { return null; }

    public WOMLDefaultNamespace(String aNamespaceId, boolean includeNamespaceInAttributes) { return null; }

    public String getNamespaceId() { return null; }

    public boolean getIncludeNamespaceInAttributes() { return true; }

    public boolean canGenerateElement(WOMLElement element) { return true; }

    public WOElement generateElement(WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException { return null; }

    public void contributeToDeclaration(WOMLElement element, WOElement template, WOMutableDeclaration declaration, NSArray languages, WOAssociationFactory associationFactory) throws WOMLElementGenerationException {}

    private String namespaceId;
    private boolean includeNamespaceInAttributes;

}
