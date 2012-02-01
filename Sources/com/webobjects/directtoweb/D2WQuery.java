package com.webobjects.directtoweb;
/**
 * This Direct to Web reusable component displays a query component. See the "Direct to Web" chapter of WebObjects Tools and Techniques for information about the behavior and appearance of this component. Synopsis D2WQuery { [action=anAction;] [displayKeys=keyArray;] entityName=nameString; queryDataSource=aDataSource; [pageConfiguration=configurationName;] }; Bindings action - the action method to invoke when the user clicks Search DB. Is invoked after the D2WQuery component fetches the objects matching the query. displayKeys - the properties of the entity to query (NSArray). You can also represent the array as a string: "(prop1, prop2, ...)". entityName - the name of the entity for this record (String). queryDataSource - an EODataSource containing the objects matching the query. pageConfiguration - the named configuration containing the Web Assistant settings for this component (String). If this binding is not specified, the "*all*" configuration for the query task and the entityName entity is used. See the "Direct to Web" chapter of WebObjects Tools and Techniques for more information about named configurations. Example myQuery : D2WQuery { entityName = "Movie"; displayKeys = "(title, roles)"; queryDataSource = displayGroup.dataSource; action = displayGroup.fetch; }
 * See Also:Serialized Form
 */
public class D2WQuery extends com.webobjects.directtoweb.D2WEmbeddedComponent{
    /**
     * Constructs a D2WQuery with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WQuery(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Returns the new page delegate.
     */
    public com.webobjects.directtoweb.NextPageDelegate newPageDelegate(){
        return null; //TODO codavaj!!
    }

}
