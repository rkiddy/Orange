package com.webobjects.directtoweb;
/**
 * This Direct to Web reusable component displays a list component. See the "Direct to Web" chapter of WebObjects Tools and Techniques for information about the behavior and appearance of this component. Synopsis D2WList { [action=anAction;] dataSource=aDataSource; | list=anArray; [displayKeys=keyArray;] entityName=nameString; [pageConfiguration=aConfiguration;] }; Bindings action - the action method to invoke when the user clicks Return. dataSource - an EODataSource containing the objects to display as a list. list - an array containing the objects to display as a list. displayKeys - the properties of the entity to list (NSArray). You can also represent the array as a string: "(prop1, prop2, ...)". entityName - the name of the entity for this record (String). pageConfiguration - the named configuration containing the Web Assistant settings for this component (String). If this binding is not specified, the "*all*" configuration for the list task and the entityName entity is used. See the "Direct to Web" chapter of WebObjects Tools and Techniques for more information about named configurations. Example myList : D2WList { entityName = "Movie"; dataSource = displayGroup.dataSource; pageConfiguration = "myListMovieConfig"; }
 * See Also:Serialized Form
 */
public class D2WList extends com.webobjects.directtoweb.D2WEmbeddedComponent{
    /**
     * Constructs a D2WList with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WList(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Returns the EODataSource containing the objects displayed on the page.
     */
    public com.webobjects.eocontrol.EODataSource dataSource(){
        return null; //TODO codavaj!!
    }

    public void setDataSource(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

}
