package com.webobjects.appserver;
/**
 * WORedirect is a subclass of WOComponent that may be used to force the user's browser to redirect to another URL. You should only return this component as a response to an action method and never use it in an declarations file directly. This component can be useful, for example, if you have an image map with both static and dynamic actions.
 * See Also:Serialized Form
 */
public class WORedirect extends com.webobjects.appserver.WOComponent{
    /**
     * Creates a new WORedirect.
     * Parameters:aContext - a WOContext object that represents the context of the transaction
     */
    public WORedirect(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Adds the redirect to the header of the WOResponse.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    /**
     * Sets the URL to which the user's browser should be redirected.
     */
    public void setUrl(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setURL(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Return the URL to which the user's browser should be redirected.
     */
    public java.lang.String url(){
        return null; //TODO codavaj!!
    }

}
