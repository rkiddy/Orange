package com.webobjects.eogeneration;
public abstract class EOValueController extends com.webobjects.eogeneration.EOAssociationController{
    public EOValueController(){
         //TODO codavaj!!
    }

    public EOValueController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the controller can be transient. By default, a component controller is transient only if it's an instance of EOComponentController, not an instance of a subclass.
     */
    public boolean canBeTransient(){
        return false; //TODO codavaj!!
    }

    public void setValueKey(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the receiver as a string that states the receiver's class name and type name, whether the receiver is connected, the number of subcontrollers, whether or not the receiver has been prepared, whether or not the receiver is visible, information about widget sizing and alignment behavior, and so on.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    public java.lang.String valueKey(){
        return null; //TODO codavaj!!
    }

}
