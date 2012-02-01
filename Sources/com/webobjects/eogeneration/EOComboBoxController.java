package com.webobjects.eogeneration;
public class EOComboBoxController extends com.webobjects.eogeneration.EOTitlesController implements com.webobjects.eogeneration.EOWidgetController.QueryWidget{
    public EOComboBoxController(){
         //TODO codavaj!!
    }

    public EOComboBoxController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public boolean isQueryWidget(){
        return false; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    protected javax.swing.JComponent newWidget(){
        return null; //TODO codavaj!!
    }

    protected boolean preferredUsesLabelComponent(){
        return false; //TODO codavaj!!
    }

    public void setIsQueryWidget(boolean flag){
        return; //TODO codavaj!!
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
