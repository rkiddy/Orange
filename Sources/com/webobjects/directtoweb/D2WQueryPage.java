package com.webobjects.directtoweb;
/**
 * The D2WQueryPage class provides the behavior for the query page Direct to Web templates: BASQueryPage, NEUQueryPage, and WOLQueryPage. The classes for these components inherit directly from D2WQueryPage and define no additional methods or variables.
 * Most of the methods in this class are accessed, via the EOKeyValueCoding interface defined in the EOControl framework, from the bindings (.wod) file of the Direct to Web template. If you create a Direct to Web template from a query page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
public class D2WQueryPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.QueryPageInterface, com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * The WODisplayGroup object that performs the query.
     */
    public com.webobjects.appserver.WODisplayGroup displayGroup;

    /**
     * Creates an instance of D2WQueryPage with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WPage.D2WPage(WOContext)
     */
    public D2WQueryPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Gets the maximum number of objects matching the query that the display group fetches. The fetch limit is used by the fetch specification.
     */
    public int fetchLimit(){
        return 0; //TODO codavaj!!
    }

    /**
     * Gets a String containing the state of the fetch specification options: isDeep, usesDistinct, refreshesRefetchedObjects, and fetchLimit.
     */
    public java.lang.String fetchSpecOptions(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether fetches should include sub-entities of the entity of the query fetch specification. Defaults to false. Is used by the fetch specification.
     */
    public boolean isDeep(){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the qualifier from query values of the display group.
     */
    public com.webobjects.eocontrol.EOQualifier qualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Search in the query page. Override nextPageDelegate to specify the search behavior.
     */
    public com.webobjects.appserver.WOComponent queryAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns the receiver's EODataSource (defined in the EOControl Framework).
     */
    public com.webobjects.eocontrol.EODataSource queryDataSource(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether existing objects are overwritten with fetched values when they have been updated or changed. Defaults to false. Is used by the fetch specification.
     */
    public boolean refreshRefetchedObjects(){
        return false; //TODO codavaj!!
    }

    /**
     * Replace the binding queryAction.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the query data source to the specified data source.
     */
    public void setQueryDataSource(com.webobjects.eocontrol.EODataSource newValue){
        return; //TODO codavaj!!
    }

    /**
     * Indicates whether duplicate objects or records are removed after fetching. Defaults to false. Is used by the fetch specification.
     */
    public boolean usesDistinct(){
        return false; //TODO codavaj!!
    }

}
