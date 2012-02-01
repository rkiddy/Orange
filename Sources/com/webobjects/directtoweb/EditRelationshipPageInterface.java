package com.webobjects.directtoweb;
/**
 * This interface is implemented by pages returned by the D2W method editRelationshipPageForEntityNamed. Use methods defined in this interface to initialize a newly created edit-relationship page.
 */
public interface EditRelationshipPageInterface{
    /**
     * Sets the object and relationship to edit. For example, to edit a movie's toStudio relationship, set eo to a Movie object and relationshipKey to "toStudio".
     */
    abstract void setMasterObjectAndRelationshipKey(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String relationshipKey);

    /**
     * Sets page to display when the user clicks 'Return' in the edit-relationship page. If the new page needs to be initialized, use the method setNextPageDelegate instead.
     */
    abstract void setNextPage(com.webobjects.appserver.WOComponent nextPage);

    /**
     * Sets delegate object that receives call to nextPage method. When the user clicks 'Return' in the edit-relationship page, Direct to Web invokes the nextPage method on nextPageDelegate. The page returned by that method call is the next page displayed. One normally uses this delegate mechanism to initialize the next page.
     */
    abstract void setNextPageDelegate(com.webobjects.directtoweb.NextPageDelegate nextPageDelegate);

}
