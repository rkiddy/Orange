package com.webobjects.directtoweb;
/**
 * This interface is implemented by pages returned by the D2W method inspectPageForEntityNamed. Use methods defined in this interface to initialize a newly created inspect page.
 */
public interface InspectPageInterface{
    /**
     * Sets page to display when the user clicks 'Return' in the inspect page. If the new page needs to be initialized, use the method setNextPageDelegate instead.
     */
    abstract void setNextPage(com.webobjects.appserver.WOComponent nextPage);

    /**
     * Sets delegate object that receives call to nextPage method. When the user clicks 'Return' in the inspect page, Direct to Web invokes the nextPage method on nextPageDelegate. The page returned by that method call is the next page displayed. One normally uses this delegate mechanism to initialize the next page.
     */
    abstract void setNextPageDelegate(com.webobjects.directtoweb.NextPageDelegate nextPageDelegate);

    /**
     * Sets the object displayed by the inspect page.
     */
    abstract void setObject(com.webobjects.eocontrol.EOEnterpriseObject eo);

}
