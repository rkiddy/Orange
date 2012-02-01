package com.webobjects.directtoweb;
/**
 * The EditRelationship class provides an implementation of the replacementAssociationForAssociation method to components that implement the editing of relationships.
 * See Also:D2WEditToManyRelationship, D2WEditToOneRelationship, Serialized Form
 */
public class EditRelationship extends com.webobjects.directtoweb.D2WComponent implements com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * Creates an instance of EditRelationship with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WComponent.D2WComponent(WOContext)
     */
    public EditRelationship(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Replaces the associations that are pertinent to editing relationships.
     * The bindings include d2wContext.relationship.name, object, and keyWhenRelationship.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

}
