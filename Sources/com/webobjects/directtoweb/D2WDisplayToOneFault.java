package com.webobjects.directtoweb;
/**
 * This property-level component displays a hyperlink representing a to-one relationship. The hyperlink navigates to an inspect page displaying the destination object of the relationship.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * See Also:Serialized Form
 */
public class D2WDisplayToOneFault extends com.webobjects.directtoweb.D2WStatelessComponent implements com.webobjects.directtoweb.generation.DTWGeneration{
    public D2WDisplayToOneFault(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    public java.lang.String helpString(){
        return null; //TODO codavaj!!
    }

    public java.lang.String methodNameForShouldDisplay(){
        return null; //TODO codavaj!!
    }

    public java.lang.String methodNameForToOneAction(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    public boolean shouldDisplay(){
        return false; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOComponent toOneAction(){
        return null; //TODO codavaj!!
    }

}
