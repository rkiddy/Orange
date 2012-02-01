package com.webobjects.eogeneration;
public class EOTableController extends com.webobjects.eogeneration.EODefaultActionTrigger implements java.awt.event.ComponentListener, com.webobjects.eogeneration.EOWidgetController.TableWidget{
    public EOTableController(){
         //TODO codavaj!!
    }

    public EOTableController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public boolean allowsMultipleSelection(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked when the receiver's component becomes visible, giving the receiver a chance to react. EOComponentController's implementation invokes establishConnection to ensure the receiver is connected to the controller hierarchy.
     */
    protected void componentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    public void componentHidden(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
    }

    public void componentMoved(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
    }

    public void componentResized(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
    }

    public void componentShown(java.awt.event.ComponentEvent event){
        return; //TODO codavaj!!
    }

    protected javax.swing.JComponent mouseListenerViewInWidget(){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    protected javax.swing.JComponent newWidget(){
        return null; //TODO codavaj!!
    }

    public void setAllowsMultipleSelection(boolean flag){
        return; //TODO codavaj!!
    }

    public void setSortsByColumnOrder(boolean flag){
        return; //TODO codavaj!!
    }

    public boolean sortsByColumnOrder(){
        return false; //TODO codavaj!!
    }

    protected void startListeningToWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToWidget(){
        return; //TODO codavaj!!
    }

    public com.webobjects.eointerface.swing.EOTable table(){
        return null; //TODO codavaj!!
    }

}
