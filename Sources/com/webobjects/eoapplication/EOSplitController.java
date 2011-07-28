
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class EOSplitController extends EOComponentController
    implements EOComponentController.ResetUserInterface {
    private class _SplitPane extends JSplitPane
        implements MouseListener {


        public _SplitPane(boolean horizontalLayout, boolean continuousLayout, double resizeWeight, boolean oneTouchExpandable) { return null; }

        protected void addImpl(Component component, Object constraints, int index) {}

        private void _removeDividerIfNecessary(Component component) {}

        public void remove(Component component) {}

        public void removeAll() {}

        public void remove(int index) {}

        public void mouseClicked(MouseEvent mouseevent) {}

        public void mouseEntered(MouseEvent event) {}

        public void mouseExited(MouseEvent event) {}

        public void mousePressed(MouseEvent mouseevent) {}

        public void mouseReleased(MouseEvent mouseevent) {}

        public void setDividerLocation(int location) {}

        private boolean _checkDividerLocation;
        private Component _dividerComponent;
        final EOSplitController this$0;

    }



    public EOSplitController() { return null; }

    public EOSplitController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void addComponentOfSubcontroller(EOComponentController controller) {}

    protected void removeComponentOfSubcontroller(EOComponentController controller) {}

    protected boolean removeTransientSubcontroller(EOController controller) { return true; }

    private JComponent _newSnapComponent() { return null; }

    private JComponent _topOrLeftSnapComponent() { return null; }

    private JComponent _bottomOrRightSnapComponent() { return null; }

    protected void generateComponent() {}

    public Dimension minimumComponentSize() { return null; }

    public void resetUserInterface() {}

    public void subcontrollerMinimumSizeDidChange(EOComponentController controller, JComponent component, Dimension updateMinimumSize) {}

    public void setUsesContinuousLayout(boolean usesContinuousLayout) {}

    public boolean usesContinuousLayout() { return true; }

    public void setResizeWeight(double resizeWeight) {}

    public double resizeWeight() { return null; }

    public void setAllowsOneTouchExpandable(boolean allowsOneTouchExpandable) {}

    public boolean allowsOneTouchExpandable() { return true; }

    public void setAllowsSnapToZero(boolean allowsSnapToZero) {}

    public boolean allowsSnapToZero() { return true; }

    static JComponent access$000(EOSplitController x0) { return null; }

    static JComponent access$100(EOSplitController x0) { return null; }

    static JComponent access$200(EOSplitController x0) { return null; }

    static JComponent access$300(EOSplitController x0) { return null; }

    static  {}

    public static final Class _CLASS;
    private boolean _usesContinuousLayout;
    private double _resizeWeight;
    private boolean _allowsOneTouchExpandable;
    private boolean _allowsSnapToZero;
    private JComponent _topOrLeftComponent;
    private JComponent _bottomOrRightComponent;
    private JComponent _topOrLeftSnapComponent;
    private JComponent _bottomOrRightSnapComponent;


    static JComponent access$000(EOSplitController x0) { return null; }

    static JComponent access$100(EOSplitController x0) { return null; }

    static JComponent access$200(EOSplitController x0) { return null; }

    static JComponent access$300(EOSplitController x0) { return null; }
}
