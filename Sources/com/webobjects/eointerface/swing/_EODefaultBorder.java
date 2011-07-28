
package com.webobjects.eointerface.swing;

import com.webobjects.foundation._NSUtilities;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.*;


public class _EODefaultBorder extends AbstractBorder {


    public _EODefaultBorder(String title, boolean drawBorder, String fontName, int size, int style) { return null; }

    public _EODefaultBorder(String title, boolean drawBorder, Font font) { return null; }

    public void setFont(Font font) {}

    public Font font() { return null; }

    public void paintBorder(Component component, Graphics graphics, int x, int y, int width, int height) {}

    public Insets getBorderInsets(Component component) { return null; }

    public boolean isBorderOpaque() { return true; }

    static  {}

    private static final long serialVersionUID = 0x83a173dfL;
    public static final Class _CLASS;
    private static final Border _border;
    private String _title;
    private Font _font;
    private boolean _drawBorder;

}
