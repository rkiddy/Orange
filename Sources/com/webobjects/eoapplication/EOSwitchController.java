package com.webobjects.eoapplication;
public abstract class EOSwitchController extends com.webobjects.eoapplication.EOComponentController implements com.webobjects.eoapplication.EOComponentController.ResetUserInterface{
    public EOSwitchController(){
         //TODO codavaj!!
    }

    /**
     * Parameters:unarchiver -
     */
    public EOSwitchController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    protected abstract void addBorderComponentForControllerToDisplayComponent(com.webobjects.eoapplication.EOComponentController controller, javax.swing.JComponent borderComponent, javax.swing.JComponent displayComponent);

    protected void addComponentOfSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray borderComponents(){
        return null; //TODO codavaj!!
    }

    public java.awt.Dimension borderedSizeForComponentSize(java.awt.Dimension componentSize){
        return null; //TODO codavaj!!
    }

    public java.awt.Dimension borderSize(){
        return null; //TODO codavaj!!
    }

    protected void componentDidBecomeInvisible(){
        return; //TODO codavaj!!
    }

    protected void componentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    public boolean componentShouldChange(int newIndex){
        return false; //TODO codavaj!!
    }

    public java.awt.Dimension componentSizeForBorderedSize(java.awt.Dimension componentSize){
        return null; //TODO codavaj!!
    }

    public void componentSwitched(int selectedIndex){
        return; //TODO codavaj!!
    }

    protected java.awt.Dimension displayComponentBorderSize(){
        return null; //TODO codavaj!!
    }

    public void dispose(){
        return; //TODO codavaj!!
    }

    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    protected boolean hideSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return false; //TODO codavaj!!
    }

    public java.awt.Dimension minimumComponentSize(){
        return null; //TODO codavaj!!
    }

    protected abstract javax.swing.JComponent newDisplayComponent();

    protected abstract void removeBorderComponentForControllerFromDisplayComponent(com.webobjects.eoapplication.EOComponentController controller, javax.swing.JComponent borderComponent, javax.swing.JComponent displayComponent, int index);

    protected void removeComponentOfSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    protected boolean removeTransientSubcontroller(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    public void resetUserInterface(){
        return; //TODO codavaj!!
    }

    protected abstract javax.swing.JComponent selectedBorderComponentInDisplayComponent(javax.swing.JComponent displayComponent);

    protected void showBorderComponentAtIndex(int index){
        return; //TODO codavaj!!
    }

    protected abstract void showBorderComponentAtIndexInDisplayComponent(javax.swing.JComponent borderComponent, javax.swing.JComponent displayComponent, int index);

    protected boolean showSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return false; //TODO codavaj!!
    }

    public void subcontrollerMinimumSizeDidChange(com.webobjects.eoapplication.EOComponentController controller, javax.swing.JComponent component, java.awt.Dimension updateMinimumSize){
        return; //TODO codavaj!!
    }

    public void subcontrollerVisibilityDidChange(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray switchedControllers(){
        return null; //TODO codavaj!!
    }

    protected int visibleBorderComponentIndex(){
        return 0; //TODO codavaj!!
    }

}
