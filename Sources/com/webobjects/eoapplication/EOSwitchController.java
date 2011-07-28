
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JComponent;


public abstract class EOSwitchController extends EOComponentController
    implements EOComponentController.ResetUserInterface {


    public EOSwitchController() { return null; }

    public EOSwitchController(EOXMLUnarchiver unarchiver) { return null; }

    public void dispose() {}

    protected void addComponentOfSubcontroller(EOComponentController controller) {}

    protected void removeComponentOfSubcontroller(EOComponentController controller) {}

    protected boolean removeTransientSubcontroller(EOController controller) { return true; }

    protected abstract JComponent newDisplayComponent();

    protected void generateComponent() {}

    public Dimension minimumComponentSize() { return null; }

    public void resetUserInterface() {}

    private EOComponentController _visibleSubcontroller() { return null; }

    private void _updateSubcontrollerVisibleStates() {}

    public void subcontrollerVisibilityDidChange(EOComponentController controller) {}

    protected void componentDidBecomeVisible() {}

    protected void componentDidBecomeInvisible() {}

    public boolean _prepareBorderComponentChange() { return true; }

    protected boolean showSubcontroller(EOComponentController controller) { return true; }

    protected boolean hideSubcontroller(EOComponentController controller) { return true; }

    protected Dimension displayComponentBorderSize() { return null; }

    public Dimension borderSize() { return null; }

    public Dimension borderedSizeForComponentSize(Dimension componentSize) { return null; }

    public Dimension componentSizeForBorderedSize(Dimension componentSize) { return null; }

    private Dimension _minimumContentSize() { return null; }

    public void subcontrollerMinimumSizeDidChange(EOComponentController controller, JComponent component, Dimension updateMinimumSize) {}

    protected NSArray switchedControllers() { return null; }

    protected NSArray borderComponents() { return null; }

    protected void showBorderComponentAtIndex(int index) {}

    protected int visibleBorderComponentIndex() { return 0; }

    protected abstract JComponent selectedBorderComponentInDisplayComponent(JComponent jcomponent);

    protected abstract void addBorderComponentForControllerToDisplayComponent(EOComponentController eocomponentcontroller, JComponent jcomponent, JComponent jcomponent1);

    protected abstract void removeBorderComponentForControllerFromDisplayComponent(EOComponentController eocomponentcontroller, JComponent jcomponent, JComponent jcomponent1, int i);

    protected abstract void showBorderComponentAtIndexInDisplayComponent(JComponent jcomponent, JComponent jcomponent1, int i);

    private EOComponentController _controllerForBorderComponent(JComponent borderComponent) { return null; }

    private JComponent _borderComponentForController(EOComponentController controller) { return null; }

    private void _prepareBorderComponentAtIndex(int index) {}

    public boolean componentShouldChange(int newIndex) { return true; }

    public void componentSwitched(int selectedIndex) {}

    static  {}

    public static final Class _CLASS;
    private NSMutableArray _switchedControllers;
    private NSMutableArray _borderComponents;
    private Dimension _borderSize;

}
