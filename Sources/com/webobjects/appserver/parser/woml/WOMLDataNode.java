package com.webobjects.appserver.parser.woml;
public abstract class WOMLDataNode extends com.webobjects.appserver.parser.woml.WOMLTextNode{
    public WOMLDataNode(com.webobjects.appserver.parser.woml.WOMLPosition position){
         //TODO codavaj!!
    }

    public abstract java.lang.String getOutputPrefix();

    public abstract java.lang.String getOutputSuffix();

    public java.lang.String getOutputText(){
        return null; //TODO codavaj!!
    }

    public boolean getShouldEmitEnd(){
        return false; //TODO codavaj!!
    }

    public boolean getShouldEmitStart(){
        return false; //TODO codavaj!!
    }

    public void setShouldEmitEnd(boolean value){
        return; //TODO codavaj!!
    }

    public void setShouldEmitStart(boolean value){
        return; //TODO codavaj!!
    }

}
