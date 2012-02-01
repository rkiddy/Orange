package com.webobjects.directtoweb;
/**
 * This interface is implemented by pages returned by the D2W method selectPageForEntityNamed. Use methods defined in this interface to initialize a newly created select page.
 */
public interface SelectPageInterface{
    /**
     * Returns the receiver's next page delegate.
     */
    abstract com.webobjects.directtoweb.NextPageDelegate nextPageDelegate();

    /**
     * Returns the object selected by the user.
     */
    abstract com.webobjects.eocontrol.EOEnterpriseObject selectedObject();

    /**
     * Sets the receiver's data source.
     */
    abstract void setDataSource(com.webobjects.eocontrol.EODataSource aDataSource);

    /**
     * Sets delegate object that receives call to nextPage method. When the user clicks 'Select' in the select page, Direct to Web invokes the nextPage method on nextPageDelegate. The page returned by that method call is the next page displayed. One normally uses this delegate mechanism to initialize the next page.
     */
    abstract void setNextPageDelegate(com.webobjects.directtoweb.NextPageDelegate nextPageDelegate);

    /**
     * Sets the receiver's selected object. This method can be used to set the default selected object.
     */
    abstract void setSelectedObject(com.webobjects.eocontrol.EOEnterpriseObject selectedObject);

}
