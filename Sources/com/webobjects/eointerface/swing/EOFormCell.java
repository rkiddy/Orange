
package com.webobjects.eointerface.swing;

import com.webobjects.foundation.NSDisposable;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;


public class EOFormCell extends JComponent
    implements EOTextComponentAccess, NSDisposable {


    public EOFormCell() { return null; }

    public void dispose() {}

    public JTextComponent textComponent() { return null; }

    public EOTextField fieldComponent() { return null; }

    public EOTextField titleComponent() { return null; }

    public void setTitle(String title) {}

    public String title() { return null; }

    public void setTitleWidth(int width) {}

    public int titleWidth() { return 0; }

    public void addActionListener(ActionListener listener) {}

    public void removeActionListener(ActionListener listener) {}

    static  {}

    private static final long serialVersionUID = 0xb35c01cfL;
    public static final Class _CLASS;
    private EOTextField _title;
    private EOTextField _field;

}
