package com.webobjects.directtoweb;
/**
 * See Also:Serialized Form
 */
public class D2WEditToOneFault extends com.webobjects.directtoweb.D2WDisplayToOne implements com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * Creates an instance of D2WEditToOneFault with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WDisplayToOne.D2WDisplayToOne(WOContext)
     */
    public D2WEditToOneFault(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Provides the action for a WOImageButton. Returns an edit-relationship page for the target entity.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOComponent editRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the alt and name values for a WOImageButton. Returns a brief description of the action.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String helpString(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the name of the template method that corresponds to the method editRelationship.
     * The current implementation returns the concatenation of "edit", the property key, and "Action".
     * The implementation is subject to change in future releases.
     */
    public java.lang.String methodNameForEditRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Replaces the bindings toOneDescription and editRelationship.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

}
