package com.webobjects.directtoweb;
/**
 * This Direct to Web reusable component displays a select component.
 * Synopsis
 * D2WSelect { [action=anAction;] dataSource=aDataSource | list=anArray; [displayKeys=keyArray;] entityName=nameString; [pageConfiguration=configurationName;] selectedObject=anObject; };
 * Bindings
 * action - the action method to invoke when the user clicks Select or Return.
 * dataSource - an EODataSource containing the objects the user can select from.
 * list - an array containing the objects to display as a list.
 * displayKeys - the properties of the entity to select (NSArray). You can also represent the array as a string: "(prop1, prop2, ...)".
 * entityName - the name of the entity for this record (String).
 * pageConfiguration - the named configuration containing the Web Assistant settings for this component (String).
 * If this binding is not specified, the "*all*" configuration for the select task and the entityName entity is used.
 * selectedObject - the object the user selects with this component or null if no object is selected.
 * Example mySelect : D2WSelect { entityName = "Movie"; selectedObject = displayGroup.selectedObject; dataSource = displayGroup.dataSource; action = selectAction; }
 * See Also:Serialized Form
 */
public class D2WSelect extends com.webobjects.directtoweb.D2WEmbeddedComponent{
    /**
     * Constructs a D2WSelect with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WSelect(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Returns the EODataSource containing the objects displayed on the page.
     */
    public com.webobjects.eocontrol.EODataSource dataSource(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the new page delegate.
     */
    public com.webobjects.directtoweb.NextPageDelegate newPageDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the settings for the page.
     */
    public java.lang.Object selectSettings(){
        return null; //TODO codavaj!!
    }

    public void setDataSource(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

}
