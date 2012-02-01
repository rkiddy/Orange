package com.webobjects.directtoweb;
/**
 * This Direct to Web reusable component displays an inspect component. See the "Direct to Web" chapter of WebObjects Tools and Techniques for information about the behavior and appearance of this component. Synopsis D2WInspect { [action=anAction;] [displayKeys=keyArray;] entityName=nameString; object=anEnterpriseObject; [pageConfiguration=configurationName;] }; Bindings action - the action method to invoke when the user clicks Return. displayKeys - the properties of the entity to inspect (NSArray). You can also represent the array as a string: "(prop1, prop2, ...)". entityName - the name of the entity for this record (String). object - the object inspected by this component. pageConfiguration - the named configuration containing the Web Assistant settings for this component (String). If this binding is not specified, the "*all*" configuration for the inspect task and the entityName entity is used. See the "Direct to Web" chapter of WebObjects Tools and Techniques for more information about named configurations. Example myInspect : D2WInspect { entityName = "Movie"; object = displayGroup.selectedObject; action = inspectAction; }
 * See Also:Serialized Form
 */
public class D2WInspect extends com.webobjects.directtoweb.D2WEmbeddedComponent{
    /**
     * Constructs a D2WInspect with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WInspect(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

}
