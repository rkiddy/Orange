package com.webobjects.directtoweb;
/**
 * This Direct to Web reusable component displays an edit component.
 * Synopsis
 * D2WEdit { [action=anAction;] [displayKeys=keyArray;] entityName=nameString; object=anEnterpriseObject; [pageConfiguration=configurationName;] };
 * Bindings
 * action - the action method to invoke when the user clicks Save or Cancel. This method is invoked after the object is saved or discarded.
 * displayKeys - the properties of the entity to edit (NSArray). You can also represent the array as a string: "(prop1, prop2, ...)".
 * entityName - the name of the entity for this record (String).
 * object - the object edited by this component.
 * pageConfiguration - the named configuration containing the Web Assistant settings for this component (String).
 * If this binding is not specified, the "*all*" configuration for the edit task and the entityName entity is used.
 * Example: myEdit : D2WEdit { entityName = "Movie"; object = displayGroup.selectedObject; action = editAction; pageConfiguration = "userEditMovieConfig"; }
 * See Also:Serialized Form
 */
public class D2WEdit extends com.webobjects.directtoweb.D2WEmbeddedComponent{
    /**
     * Constructs a D2WEdit with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WEdit(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

}
