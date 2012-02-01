package com.webobjects.directtoweb;
/**
 * The D2WQueryAllEntitiesPage class provides the behavior for the query-all page Direct to Web templates, specifically BASQueryAllEntitesPage, NEUQueryAllPage, and WOLQueryAllPage. The classes for these components inherit directly from D2WQueryAllEntitiesPage and define no additional methods or variables.
 * Most of the methods in this class are accessed, via the EOKeyValueCoding interface defined in the EOControl framework, from the bindings (.wod) file of the Direct to Web template. If you create a Direct to Web template from a query-all page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
class D2WQueryAllEntitiesPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.QueryAllPageInterface, com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * The WODisplayGroup object that performs the query.
     */
    public com.webobjects.appserver.WODisplayGroup displayGroup;

    /**
     * Creates an instance of D2WQueryAllEntitiesPage with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WPage.D2WPage(WOContext)
     */
    public D2WQueryAllEntitiesPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Is invoked when a user clicks the search button next to an entity in the query-all page. Creates and returns a list page displaying objects that match the query.
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
     * Replace the bindings queryAction and showRegularQueryAction.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when a user clicks the More Options button next to an entity. Creates and returns a query page for the entity.
     */
    public com.webobjects.appserver.WOComponent showRegularQueryAction(){
        return null; //TODO codavaj!!
    }

}
