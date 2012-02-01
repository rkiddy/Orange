package com.webobjects.eogeneration;
public class EOOneValueEnumerationController extends com.webobjects.eogeneration.EOEnumerationController implements java.awt.event.ActionListener, com.webobjects.eogeneration.EOWidgetController.QueryWidget{
    public EOOneValueEnumerationController(){
         //TODO codavaj!!
    }

    public EOOneValueEnumerationController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns true if the receiver can perform the action method (sent by an EOAction object) named actionName, false otherwise. An EOController's implementation of this method generally returns false if the receiver doesn't have an action named actionName or if the actionName action is explicitly disabled.
     */
    public boolean canPerformActionNamed(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    public void deselect(){
        return; //TODO codavaj!!
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

    public void setIsQueryWidget(boolean flag){
        return; //TODO codavaj!!
    }

    protected void startListeningToWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToWidget(){
        return; //TODO codavaj!!
    }

}
