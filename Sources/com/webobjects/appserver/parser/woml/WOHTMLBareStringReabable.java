package com.webobjects.appserver.parser.woml;
public class WOHTMLBareStringReabable extends com.webobjects.appserver._private.WOHTMLBareString{
    public WOHTMLBareStringReabable(java.lang.String aString){
         //TODO codavaj!!
    }

    public void appendString(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is invoked in WOElement objects in the request-handling phase when objects involved in the current transaction append their HTML content to the transaction's WOResponse object. If the WOElement has children WOElements, it should invoke this method on them in turn. WOElement's default implementation of this method does nothing.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    public java.lang.String getString(){
        return null; //TODO codavaj!!
    }

    public void setString(java.lang.String value){
        return; //TODO codavaj!!
    }

}
