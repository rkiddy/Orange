
package com.webobjects.eoapplication.client;

import com.webobjects.eoapplication.EOComponentController;
import com.webobjects.foundation._NSUtilities;
import java.awt.Container;
import javax.swing.JComponent;


public class EOAppletController extends EOComponentController {


    public EOAppletController(EOApplet applet) { return null; }

    protected boolean _preferredCanResizeHorizontally() { return true; }

    protected boolean _preferredCanResizeVertically() { return true; }

    public void setVisible(boolean flag) {}

    public boolean showInSupercontroller() { return true; }

    protected void setApplet(EOApplet applet) {}

    public EOApplet applet() { return null; }

    static  {}

    public static final Class _CLASS;
    private EOApplet _applet;

}
