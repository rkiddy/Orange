
package com.webobjects.eointerface.swing;

import com.webobjects.foundation._NSUtilities;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class EOTextField extends JTextField {


    public EOTextField() { return null; }

    public boolean isFocusTraversable() { return true; }

    protected void processMouseEvent(MouseEvent event) {}

    protected void processMouseMotionEvent(MouseEvent event) {}

    public void setSelectable(boolean selectable) {}

    public boolean isSelectable() { return true; }

    static  {}

    public static final Class _CLASS;
    private boolean _isSelectable;

}
