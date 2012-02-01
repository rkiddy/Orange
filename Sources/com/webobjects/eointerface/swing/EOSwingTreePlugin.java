package com.webobjects.eointerface.swing;
public class EOSwingTreePlugin extends com.webobjects.eointerface.EOTreeAssociation.TreePlugin implements javax.swing.event.TreeWillExpandListener, javax.swing.event.TreeSelectionListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting{
    public EOSwingTreePlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Removes the receiver from its EOAssociation and display object. Subclasses should override this method to clear references to the display object and association and invoke super's implementation at the end.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overridden by subclasses to attach the receiver to its display object, and to otherwise configure the display object. Subclasses should invoke super's implementation after establishing their own connections.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    public void setRootObject(java.lang.Object root){
        return; //TODO codavaj!!
    }

    public void setRootObjectChildren(com.webobjects.foundation.NSArray objects){
        return; //TODO codavaj!!
    }

    /**
     * Set the formatter for this plugin's text component.
     */
    public void setValueFormatter(java.lang.Object formatter){
        return; //TODO codavaj!!
    }

    public void treeWillCollapse(javax.swing.event.TreeExpansionEvent event) throws javax.swing.tree.ExpandVetoException{
        return; //TODO codavaj!!
    }

    public void treeWillExpand(javax.swing.event.TreeExpansionEvent event) throws javax.swing.tree.ExpandVetoException{
        return; //TODO codavaj!!
    }

    public void valueChanged(javax.swing.event.TreeSelectionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns the Format for this plugin's text component.
     */
    public java.lang.Object valueFormatter(){
        return null; //TODO codavaj!!
    }

}
