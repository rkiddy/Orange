package com.webobjects.eogeneration;
public abstract class EOFormatValueController extends com.webobjects.eogeneration.EOValueController implements com.webobjects.eogeneration.EOWidgetController.FormatWidget{
    public EOFormatValueController(){
         //TODO codavaj!!
    }

    public EOFormatValueController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public java.lang.Class formatClass(){
        return null; //TODO codavaj!!
    }

    protected java.text.Format formatForAssociation(){
        return null; //TODO codavaj!!
    }

    public java.lang.String formatPattern(){
        return null; //TODO codavaj!!
    }

    public boolean isFormatAllowed(){
        return false; //TODO codavaj!!
    }

    public void setFormatAllowed(boolean flag){
        return; //TODO codavaj!!
    }

    public void setFormatClass(java.lang.Class formatClass){
        return; //TODO codavaj!!
    }

    public void setFormatPattern(java.lang.String formatPattern){
        return; //TODO codavaj!!
    }

}
