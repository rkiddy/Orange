
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public abstract class EOWindowController extends EOComponentController
    implements ActionListener, EOComponentController.Activation {
    public static interface _Toobar {


        public abstract boolean _isToolbar();



        public static final Class _CLASS = null;

    }



    protected static Dimension generateBorderSizeForRootPaneContainerClass(Class rootPaneContainerWindowClass, boolean useMenuBar) { return null; }

    protected static void _windowRepresentationChanged(Window window) { return null; }

    public EOWindowController() { return null; }

    public EOWindowController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    protected boolean removeTransientSubcontroller(EOController controller) { return true; }

    public void setUsesActivationButton(boolean flag) {}

    public boolean usesActivationButton() { return true; }

    public void setUsesActivationAction(boolean flag) {}

    public boolean usesActivationAction() { return true; }

    public void setWindowPosition(int position) {}

    public int windowPosition() { return 0; }

    public void setUsesUserDefaultsWindowSize(boolean flag) {}

    public boolean usesUserDefaultsWindowSize() { return true; }

    public void setUsesUserDefaultsWindowLocation(boolean flag) {}

    public boolean usesUserDefaultsWindowLocation() { return true; }

    protected Insets _preferredInsets() { return null; }

    protected void componentDidBecomeInvisible() {}

    protected void generateComponent() {}

    protected boolean componentShouldBeResizable(JComponent component) { return true; }

    public JComponent integrationComponent() { return null; }

    public Dimension minimumIntegrationComponentSize() { return null; }

    protected Dimension windowBorderSize() { return null; }

    public Dimension borderSize() { return null; }

    public Dimension borderedSizeForComponentSize(Dimension componentSize) { return null; }

    public Dimension componentSizeForBorderedSize(Dimension componentSize) { return null; }

    protected NSArray defaultActions() { return null; }

    public abstract void activateWindow();

    private void startListeningToButton() {}

    private void stopListeningToButton() {}

    private void setButton(JButton button) {}

    private JButton button() { return null; }

    public boolean activate() { return true; }

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS = null;
    public static final String _PersistentWindowXParameter = "_EOWindowX";
    public static final String _PersistentWindowYParameter = "_EOWindowY";
    public static final String _PersistentWindowWidthParameter = "_EOWindowWidth";
    public static final String _PersistentWindowHeightParameter = "_EOWindowHeight";
    private static NSMutableDictionary _windowClassToBorderSizeMapTable;
    private boolean _usesActivationButton;
    private boolean _usesActivationAction;
    private JButton _button;
    private int _windowPosition;
    private Dimension _borderSize;
    private boolean _usesUserDefaultsWindowSize;
    private boolean _usesUserDefaultsWindowLocation;

}
