
package com.webobjects.appserver.parser;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.*;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.StringTokenizer;


public class WOHTMLWebObjectTag {


    private void extractName(String webobject) throws WOHTMLFormatException {}

    public WOHTMLWebObjectTag() { return null; }

    public WOHTMLWebObjectTag(String webobject, WOHTMLWebObjectTag myParent) throws WOHTMLFormatException { return null; }

    public String name() { return null; }

    public WOHTMLWebObjectTag parentTag() { return null; }

    public boolean isTopLevel() { return true; }

    public NSArray children() { return null; }

    public WOElement template() { return null; }

    public void addChildElement(Object object) {}

    public WOElement dynamicElement(NSDictionary declarations, NSArray languages) throws WODeclarationFormatException, ClassNotFoundException { return null; }

    private static WOElement _componentReferenceWithClassNameDeclarationAndTemplate(String aClassName, WODeclaration aDeclaration, WOElement template, NSArray languages) throws ClassNotFoundException { return null; }

    private static WOElement _elementWithClass(Class aClass, WODeclaration aDeclaration, WOElement template) { return null; }

    private static WOElement _elementWithDeclaration(WODeclaration aDeclaration, String aDeclarationName, WOElement template, NSArray languages) throws ClassNotFoundException, WODeclarationFormatException { return null; }

    private String _name;
    private WOHTMLWebObjectTag _parent;
    private NSMutableArray _children;

}
