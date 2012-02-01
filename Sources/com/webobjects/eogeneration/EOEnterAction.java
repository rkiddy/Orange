package com.webobjects.eogeneration;
/**
 * See Also:Serialized Form
 */
public abstract class EOEnterAction extends com.webobjects.eoapplication.EOAction{
    public EOEnterAction(java.lang.String descriptionPath, java.lang.String shortDescription, javax.swing.Icon icon, javax.swing.Icon smallIcon, javax.swing.KeyStroke menuAccelerator, int categoryPriority, int actionPriority, java.lang.String name){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is called when an action is triggered, that is, the user presses the action's button or selects its menu item. This method must be overridden by subclasses.
     */
    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    protected abstract boolean canPerformAction(java.lang.String name);

    protected abstract void performAction(java.lang.String name);

    public static com.webobjects.eoapplication.EOAction standardActionForHelpWindowActivation(javax.swing.KeyStroke menuAccelerator, boolean multipleWindowsAvailable, java.lang.String taskName){
        return null; //TODO codavaj!!
    }

    public static com.webobjects.eoapplication.EOAction standardActionForInsertWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public static com.webobjects.eoapplication.EOAction standardActionForListWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public static com.webobjects.eoapplication.EOAction standardActionForOpenWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public static com.webobjects.eoapplication.EOAction standardActionForQueryWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public static com.webobjects.eoapplication.EOAction standardActionForToolWindowActivation(javax.swing.KeyStroke menuAccelerator, boolean multipleWindowsAvailable, java.lang.String taskName){
        return null; //TODO codavaj!!
    }

    public static com.webobjects.eoapplication.EOAction standardActionForWindowActivation(java.lang.String descriptionPath, java.lang.String shortDescription, javax.swing.KeyStroke menuAccelerator, int categoryPriority, int actionPriority, java.lang.String taskName){
        return null; //TODO codavaj!!
    }

}
