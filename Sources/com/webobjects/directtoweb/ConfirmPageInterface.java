package com.webobjects.directtoweb;
/**
 * This interface is implemented by pages returned by the D2W method confirmPageForEntityNamed. Use methods defined in this interface to initialize a newly created confirm page.
 */
public interface ConfirmPageInterface{
    /**
     * Sets the receiver's cancel delegate. When the user clicks 'No' in the confirm page, Direct to Web invokes the nextPage method on the cancel delegate. The page returned by that method call is the next page displayed. One normally uses this delegate mechanism to initialize the next page.
     */
    abstract void setCancelDelegate(com.webobjects.directtoweb.NextPageDelegate cancelDelegate);

    /**
     * Sets the receiver's confirm delegate. When the user clicks 'Yes' in the confirm page, Direct to Web invokes the nextPage method on the confirm delegate. The page returned by that method call is the next page displayed. One normally uses this delegate mechanism to initialize the next page.
     */
    abstract void setConfirmDelegate(com.webobjects.directtoweb.NextPageDelegate confirmDelegate);

    /**
     * Sets the message displayed by the confirm page.
     */
    abstract void setMessage(java.lang.String aMessage);

}
