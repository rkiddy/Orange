package com.webobjects.appserver.parser.woml;
public class WOMLComment extends com.webobjects.appserver.WOElement{
    public WOMLComment(java.lang.String aString, java.lang.String commentStartPrefix, java.lang.String commentEndSuffix){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is invoked in WOElement objects in the request-handling phase when objects involved in the current transaction append their HTML content to the transaction's WOResponse object. If the WOElement has children WOElements, it should invoke this method on them in turn. WOElement's default implementation of this method does nothing.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse aResponse, com.webobjects.appserver.WOContext aContext){
        return; //TODO codavaj!!
    }

    public boolean isEnd(){
        return false; //TODO codavaj!!
    }

    public boolean isStart(){
        return false; //TODO codavaj!!
    }

}
