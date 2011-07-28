
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.swing.EOTextField;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.Color;
import java.awt.Font;

public class EOStaticLabelController extends EOComponentController {


    public EOStaticLabelController() { return null; }

    public EOStaticLabelController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public boolean canBeTransient() { return true; }

    protected Font _preferredFont() { return null; }

    protected int _preferredAlignment() { return 0; }

    public void setAlignment(int alignment) {}

    public int alignment() { return 0; }

    public void setColor(Color color) {}

    public Color color() { return null; }

    public void setFont(Font font) {}

    public Font font() { return null; }

    public void setLabel(String string) {}

    protected boolean _preferredCanResizeVertically() { return true; }

    protected void generateComponent() {}

    static  {}

    public static final Class _CLASS;
    private int _alignment;
    private Color _color;
    private Font _font;

}
