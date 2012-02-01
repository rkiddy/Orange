package com.webobjects.eointerface.swing;
/**
 * EOTextComponentAccess is an interface that defines an API for accessing editable text components of Swing components. It can be used by components which use a collection of multiple subcomponents, for example a label and a text field, to identify the editable text component it is using.
 * See Also:EOColumnEditor
 */
public interface EOTextComponentAccess{
    /**
     * Returns the editable text component of a component.
     */
    abstract javax.swing.text.JTextComponent textComponent();

}
