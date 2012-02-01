package com.webobjects.directtoweb;
/**
 * This interface is implemented by pages returned by the D2W method queryPageForEntityNamed. Use methods defined in this interface to initialize a newly created query page.
 */
public interface QueryPageInterface{
    /**
     * Returns the receiver's EODataSource (defined in the EOControl Framework).
     */
    abstract com.webobjects.eocontrol.EODataSource queryDataSource();

    /**
     * Sets delegate object that receives call to nextPage method. When the user clicks 'Query' in the query page, Direct to Web invokes the nextPage method on nextPageDelegate. The page returned by that method call is the next page displayed. One normally uses this delegate mechanism to initialize the next page. Within the code of the nextPage method you can get the query data source using the method queryDataSource.
     */
    abstract void setNextPageDelegate(com.webobjects.directtoweb.NextPageDelegate nextPageDelegate);

}
