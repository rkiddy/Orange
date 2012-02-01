package com.webobjects.eointerface.swing;
/**
 * EOTextField is a subclass of javax.swing.JTextField that adds the notion of selectability (so that text fields can be selectable, but not editable).
 * See Also:Serialized Form
 */
public class EOTextField extends javax.swing.JTextField{
    /**
     * Constructs a new EOTextField which is configured to be selectable by default.
     */
    public EOTextField(){
         //TODO codavaj!!
    }

    /**
     * Returns whether the user can navigate to this component with the Tab or Shift-Tab keys. EOTextFields can only be traversed if they are selectable.
     */
    public boolean isFocusTraversable(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's selectable state.
     */
    public boolean isSelectable(){
        return false; //TODO codavaj!!
    }

    /**
     * Prevents mouse events from being processed if the receiver is not selectable.
     */
    protected void processMouseEvent(java.awt.event.MouseEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Prevents mouse motion events from being processed if the receiver is not selectable.
     */
    protected void processMouseMotionEvent(java.awt.event.MouseEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's selectable state.
     */
    public void setSelectable(boolean selectable){
        return; //TODO codavaj!!
    }

}
