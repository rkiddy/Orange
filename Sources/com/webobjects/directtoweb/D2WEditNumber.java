package com.webobjects.directtoweb;
/**
 * D2WEditNumber is a property-level component that provides a text field for the user to enter a number. It also converts the entered text into a Number object with the help of a formatter that you can specify.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant or Rule Editor to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to edit a property, use D2WCustomComponent.
 * See Also:D2WCustomComponent, Serialized Form
 */
public class D2WEditNumber extends com.webobjects.directtoweb.EditComponent implements com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * Creates an instance of D2WEditNumber with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:EditComponent.EditComponent(WOContext)
     */
    public D2WEditNumber(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Provides the useDecimalNumber value for a WOTextField. Returns whether the attribute is a decimal number.
     * The current implementation returns false if the class name of the attribute is equal to "java.lang.Number"; true otherwise.
     * The implementation is subject to change in future releases.
     */
    public boolean isDecimalNumber(){
        return false; //TODO codavaj!!
    }

    /**
     * Replaces the binding isDecimalNumber.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

}
