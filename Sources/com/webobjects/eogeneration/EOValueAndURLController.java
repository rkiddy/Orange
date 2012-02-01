package com.webobjects.eogeneration;
public abstract class EOValueAndURLController extends com.webobjects.eogeneration.EOValueController{
    public EOValueAndURLController(){
         //TODO codavaj!!
    }

    public EOValueAndURLController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns whether the receiver is currently editable. A receiver is editable if its editability is EOEditable.AlwaysEditable or its editability is EOEditable.IfSupercontrollerEditable and sending EOEditable.isEditable to the first EOEditable supercontroller of the receiver returns true.
     */
    public boolean isEditable(){
        return false; //TODO codavaj!!
    }

    public void setURLKey(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the receiver as a string that states the receiver's class name and type name, whether the receiver is connected, the number of subcontrollers, whether or not the receiver has been prepared, whether or not the receiver is visible, information about widget sizing and alignment behavior, and so on.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    public java.lang.String URLKey(){
        return null; //TODO codavaj!!
    }

}
