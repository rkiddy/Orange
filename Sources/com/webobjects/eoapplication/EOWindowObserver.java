package com.webobjects.eoapplication;
public class EOWindowObserver implements java.awt.event.WindowListener, com.webobjects.foundation.NSDisposable, com.webobjects.eoapplication.EOAction.Enabling{
    public static final java.lang.String ActiveWindowChangedNotification="EOActiveWindowChanged";

    public static final java.lang.String LastWindowClosedNotification="EOLastWindowClosed";

    protected EOWindowObserver(){
         //TODO codavaj!!
    }

    public void activateBestWindow(){
        return; //TODO codavaj!!
    }

    /**
     * Activates the previously active window. The user can usually trigger this method from the Window menu.
     */
    public void activatePreviousWindow(){
        return; //TODO codavaj!!
    }

    public java.awt.Window activeWindow(){
        return null; //TODO codavaj!!
    }

    public void blockActiveWindowChangedNotification(){
        return; //TODO codavaj!!
    }

    public void bringAllWindowsToFront(){
        return; //TODO codavaj!!
    }

    /**
     * Implemented to handle window observer specific action enabling and disabling.
     */
    public boolean canPerformActionNamed(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController controllerForActiveWindow(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController controllerForLatestDeactivatedWindow(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController controllerForWindow(java.awt.Window window){
        return null; //TODO codavaj!!
    }

    public void dispose(){
        return; //TODO codavaj!!
    }

    public java.awt.Window latestDeactivatedWindow(){
        return null; //TODO codavaj!!
    }

    public void minimizeActiveWindow(){
        return; //TODO codavaj!!
    }

    public java.awt.Window previousWindowToActivate(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray registeredWindows(){
        return null; //TODO codavaj!!
    }

    public void registerWindow(java.awt.Window window){
        return; //TODO codavaj!!
    }

    public void registerWindow(java.awt.Window window, com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    public void unblockActiveWindowChangedNotification(){
        return; //TODO codavaj!!
    }

    public void unregisterWindow(java.awt.Window window){
        return; //TODO codavaj!!
    }

    public void unregisterWindowOfController(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray visibleWindows(){
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

    protected void windowDidBecomeActive(java.awt.Window window){
        return; //TODO codavaj!!
    }

    protected void windowDidBecomeInactive(java.awt.Window window){
        return; //TODO codavaj!!
    }

    protected void windowDidBecomeInvisible(java.awt.Window window){
        return; //TODO codavaj!!
    }

    protected void windowDidBecomeVisible(java.awt.Window window){
        return; //TODO codavaj!!
    }

    public java.awt.Window windowForController(com.webobjects.eoapplication.EOController controller){
        return null; //TODO codavaj!!
    }

    public void windowIconified(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

    public void windowOpened(java.awt.event.WindowEvent event){
        return; //TODO codavaj!!
    }

}
