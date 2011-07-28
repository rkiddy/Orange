
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EORelationship;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import java.util.Enumeration;


public class D2WQueryAnyField extends QueryComponent {


    public D2WQueryAnyField(WOContext aContext) { return null; }

    public D2WContext relationshipContext() { return null; }

    public void reset() {}

    public NSArray relationshipContextDisplayAttributesKeys() { return null; }

    public String selectedKey() { return null; }

    public String variableNameForKeyList() { return null; }

    public String componentsForKeyList() { return null; }

    public String componentsForDisplayKeyList() { return null; }

    public void setSelectedKey(String s) {}

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0x8c330db6L;
    private NSMutableArray _displayAttributeKeys;
    private D2WContext _relationshipContext;

}
