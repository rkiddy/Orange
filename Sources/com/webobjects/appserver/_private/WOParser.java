
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver.WOElement;
import com.webobjects.appserver.parser.WOComponentTemplateParser;
import com.webobjects.appserver.parser.WOHTMLFormatException;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.appserver.parser.woml.WOMLNamespaceProvider;
import com.webobjects.foundation.NSArray;

/**
 * @deprecated Class WOParser is deprecated
 */

public abstract class WOParser extends WOComponentTemplateParser {

    public WOParser(String referenceName, String HTMLString, String declarationString, NSArray languages, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) { return null; }

    public abstract WOElement parse() throws ClassNotFoundException, WODeclarationFormatException, WOHTMLFormatException;
}
