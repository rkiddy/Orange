package com.webobjects.directtoweb;
/**
 * The D2WDisplayDate class is a property-level component that displays a hyperlink.
 * Property-level components are not accessed programmatically. Instead, you use the Web Assistant to choose the property-level component that Direct to Web uses to display a property on a particular entity and task page.
 * If you want to create a property-level component to display a property, use D2WCustomComponent.
 * See Also:D2WCustomComponent, Serialized Form
 */
public class D2WDisplayHyperlink extends com.webobjects.directtoweb.D2WStatelessComponent{
    /**
     * Creates an instance of D2WDisplayHyperlink with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WStatelessComponent.D2WStatelessComponent(WOContext)
     */
    public D2WDisplayHyperlink(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Provides the action for a WOHyperlink.
     */
    public com.webobjects.appserver.WOComponent hyperlinkAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template method that corresponds to the method hyperlinkAction.
     * The current implementation concatenates "hyperlinkTo", the property key, and "Action".
     * The implementation is subject to change in future releases.
     */
    public java.lang.String methodNameForHyperlink(){
        return null; //TODO codavaj!!
    }

    /**
     * Replaces the binding hyperlinkAction.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

}
