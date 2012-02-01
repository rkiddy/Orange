package com.webobjects.eoapplication;
public abstract class EOSimpleWindowController extends com.webobjects.eoapplication.EOWindowController implements java.awt.event.WindowListener, java.awt.event.ComponentListener, com.webobjects.eoapplication.EOComponentController.ResetUserInterface{
    public EOSimpleWindowController(){
         //TODO codavaj!!
    }

    /**
     * Parameters:unarchiver -
     */
    public EOSimpleWindowController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public void activateWindow(){
        return; //TODO codavaj!!
    }

    protected void addComponentOfSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    public boolean closeWindow(){
        return false; //TODO codavaj!!
    }

    protected void componentDidBecomeInvisible(){
        return; //TODO codavaj!!
    }

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

    public void deactivateWindow(){
        return; //TODO codavaj!!
    }

    public void dispose(){
        return; //TODO codavaj!!
    }

    public boolean disposeIfDeactivated(){
        return false; //TODO codavaj!!
    }

    protected void integrationComponentDidBecomeInvisible(){
        return; //TODO codavaj!!
    }

    protected void integrationComponentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    public boolean makeVisible(){
        return false; //TODO codavaj!!
    }

    protected java.awt.Window newWindow(){
        return null; //TODO codavaj!!
    }

    protected abstract java.awt.Window newWindow(javax.swing.JComponent component);

    public void resetUserInterface(){
        return; //TODO codavaj!!
    }

    public void setDisposeIfDeactivated(boolean flag){
        return; //TODO codavaj!!
    }

    public void setLabel(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setWindow(java.awt.Window window){
        return; //TODO codavaj!!
    }

    protected abstract void setWindowResizable(java.awt.Window window, boolean flag);

    protected abstract void setWindowTitle(java.awt.Window window, java.lang.String title);

    protected void startListeningToWindow(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToWindow(){
        return; //TODO codavaj!!
    }

    public void subcontrollerEditedDidChange(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    public void subcontrollerMinimumSizeDidChange(com.webobjects.eoapplication.EOComponentController controller, javax.swing.JComponent component, java.awt.Dimension updateMinimumSize){
        return; //TODO codavaj!!
    }

    protected java.awt.Dimension verifyContentMinimumSize(java.awt.Window window, java.awt.Dimension size){
        return null; //TODO codavaj!!
    }

    public java.awt.Window window(){
        return null; //TODO codavaj!!
    }

    public void windowActivated(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

    public void windowClosed(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

    public void windowClosing(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

    public void windowDeactivated(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

    public void windowDeiconified(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

    public void windowIconified(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

    public void windowOpened(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

}
