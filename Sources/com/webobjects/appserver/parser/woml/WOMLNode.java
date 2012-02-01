package com.webobjects.appserver.parser.woml;
public abstract class WOMLNode{
    public WOMLNode(com.webobjects.appserver.parser.woml.WOMLPosition position){
         //TODO codavaj!!
    }

    public com.webobjects.appserver.parser.woml.WOMLPosition getPosition(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOElement getWOElement(){
        return null; //TODO codavaj!!
    }

    public void setPosition(com.webobjects.appserver.parser.woml.WOMLPosition value){
        return; //TODO codavaj!!
    }

    public void setWOElement(com.webobjects.appserver.WOElement value){
        return; //TODO codavaj!!
    }

}
