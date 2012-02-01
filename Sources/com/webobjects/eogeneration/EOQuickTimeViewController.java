package com.webobjects.eogeneration;
public class EOQuickTimeViewController extends com.webobjects.eogeneration.EOAssociationController{
    public EOQuickTimeViewController(){
         //TODO codavaj!!
    }

    public EOQuickTimeViewController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the controller can be transient. By default, a component controller is transient only if it's an instance of EOComponentController, not an instance of a subclass.
     */
    public boolean canBeTransient(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns whether the receiver is currently editable. A receiver is editable if its editability is EOEditable.AlwaysEditable or its editability is EOEditable.IfSupercontrollerEditable and sending EOEditable.isEditable to the first EOEditable supercontroller of the receiver returns true.
     */
    public boolean isEditable(){
        return false; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    protected javax.swing.JComponent newWidget(){
        return null; //TODO codavaj!!
    }

    public int quickTimeCanvasResizing(){
        return 0; //TODO codavaj!!
    }

    public void setQuickTimeCanvasResizing(int quickTimeCanvasResizing){
        return; //TODO codavaj!!
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
