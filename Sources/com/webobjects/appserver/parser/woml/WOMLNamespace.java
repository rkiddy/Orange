
package com.webobjects.appserver.parser.woml;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver._private.WOMutableDeclaration;
import com.webobjects.foundation.NSArray;


public interface WOMLNamespace {

    public abstract String getNamespaceId();

    public abstract boolean canGenerateElement(WOMLElement womlelement);

    public abstract WOElement generateElement(WOMLElement womlelement, WOElement woelement, WOMutableDeclaration womutabledeclaration, NSArray nsarray, WOAssociationFactory woassociationfactory) throws WOMLElementGenerationException;

    public abstract void contributeToDeclaration(WOMLElement womlelement, WOElement woelement, WOMutableDeclaration womutabledeclaration, NSArray nsarray, WOAssociationFactory woassociationfactory) throws WOMLElementGenerationException;
}
