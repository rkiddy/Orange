package com.webobjects.directtoweb;
/**
 * This interface is implemented by pages returned by the D2W method errorPageForEntityNamed. Use methods defined in this interface to initialize a newly created error page.
 */
public interface ErrorPageInterface{
    /**
     * Sets the message displayed by the error page.
     */
    abstract void setMessage(java.lang.String errorMessage);

    /**
     * Sets page to display when the user clicks 'Return' in the error page.
     */
    abstract void setNextPage(com.webobjects.appserver.WOComponent nextPage);

}
