
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;


public class EOComponentController extends EOController {
    public static interface ResetUserInterface {


        public abstract void resetUserInterface();



        public static final Class _CLASS = null;

    }

    public static interface ActionCollector {


        public abstract NSArray collectedActions();



        public static final Class _CLASS = null;

    }

    public static interface EndEditing {


        public abstract boolean endEditing();



        public static final Class _CLASS = null;

    }

    public static interface Activation {


        public abstract boolean activate();



        public static final Class _CLASS = null;

    }

    public static interface Modal {


        public abstract boolean isModal();

        public abstract void finishModal();



        public static final Class _CLASS = null;

    }



    public EOComponentController() { return null; }

    public EOComponentController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    public boolean canBeTransient() { return true; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public boolean isRootComponentController() { return true; }

    protected boolean _isComponentControllerWithIntegrationComponent(EOController controller) { return true; }

    protected void _alignComponents() {}

    protected void _addComponentOfSubcontroller(EOComponentController controller, boolean controllerBecomesVisible) {}

    protected void _addComponentsOfAllSubcontrollers() {}

    protected void addComponentOfSubcontroller(EOComponentController controller) {}

    protected void removeComponentOfSubcontroller(EOComponentController controller) {}

    protected void subcontrollerWasAdded(EOController controller) {}

    protected void subcontrollerWasRemoved(EOController controller) {}

    protected boolean removeTransientSubcontroller(EOController controller) { return true; }

    public void setLabel(String string) {}

    protected String _derivedLabel() { return null; }

    public String label() { return null; }

    public void setIcon(Icon icon) {}

    public Icon icon() { return null; }

    public void setPrefersIconOnly(boolean flag) {}

    public boolean prefersIconOnly() { return true; }

    public String _preferredLabel() { return null; }

    public Icon _preferredIcon() { return null; }

    public void setToolTip(String toolTip) {}

    public String toolTip() { return null; }

    public void setUsesHorizontalLayout(boolean flag) {}

    public boolean usesHorizontalLayout() { return true; }

    public void setCanResizeHorizontally(boolean flag) {}

    public boolean canResizeHorizontally() { return true; }

    public void setCanResizeVertically(boolean flag) {}

    public boolean canResizeVertically() { return true; }

    public void setInsets(Insets insets) {}

    public Insets insets() { return null; }

    public void setAlignsComponents(boolean flag) {}

    public boolean alignsComponents() { return true; }

    public void setDefaultComponentSize(Dimension size) {}

    public void _setDefaultComponentSize(int width, int height) {}

    public Dimension defaultComponentSize() { return null; }

    public int _defaultComponentWidth(int suggestedWidth) { return 0; }

    public int _defaultComponentHeight(int suggestedHeight) { return 0; }

    public Dimension _defaultComponentSize(int suggestedWidth, int suggestedHeight) { return null; }

    public Dimension _defaultSubcontrollerAreaSize() { return null; }

    protected void _raiseBecauseOfIllegalPropertyChangeAfterComponentPreparation(String propertyDescription) {}

    protected boolean _preferredCanResizeHorizontally() { return true; }

    protected boolean _preferredCanResizeVertically() { return true; }

    protected Insets _preferredInsets() { return null; }

    protected boolean _isUsedInModalContext() { return true; }

    protected Modal _controllerCreatingModalContext() { return null; }

    protected void generateComponent() {}

    protected JComponent toolTipComponent() { return null; }

    private void _applyToolTip(String toolTip) {}

    protected void prepareComponent() {}

    void _setComponentIsPrepared() { return null; }

    protected boolean isComponentPrepared() { return true; }

    void _setComponentUsed(boolean flag) { return null; }

    private boolean _isComponentUsed() { return true; }

    public JComponent integrationComponent() { return null; }

    public Dimension minimumIntegrationComponentSize() { return null; }

    public void setComponent(Component component) {}

    public JComponent component() { return null; }

    protected void _invalidateCalculatedMiniumumSizes(boolean invalidateSupercontrollerMinimumSizes) {}

    protected void _setCalculatedMinimumComponentSize(Dimension size) {}

    protected Dimension _calculatedMinimumComponentSize() { return null; }

    public Dimension minimumComponentSize() { return null; }

    public Dimension minimumComponentSizeWithoutSubcontrollers() { return null; }

    public void ensureMinimumComponentSizeWithoutSubcontrollers(int width, int height) {}

    public void setSubcontrollerArea(JComponent component) {}

    JComponent _subcontrollerArea() { return null; }

    public JComponent subcontrollerArea() { return null; }

    protected void _setCalculatedMinimumSubcontrollerAreaSize(Dimension size) {}

    protected Dimension _calculatedMinimumSubcontrollerAreaSize() { return null; }

    public Dimension minimumSubcontrollerAreaSize() { return null; }

    public void ensureMinimumSubcontrollerAreaSize(int width, int height) {}

    public void setFirstFocusComponent(JComponent component) {}

    public JComponent firstFocusComponent() { return null; }

    public void setLastFocusComponent(JComponent component) {}

    public JComponent lastFocusComponent() { return null; }

    public void activateFirstFocusComponent() {}

    void _integrationComponentDidChangeVisibility(boolean flag) { return null; }

    protected void _integrationComponentWouldHaveBecomeVisibleIfAvailable() {}

    protected void _integrationComponentWouldHaveBecomeInvisibleIfAvailable() {}

    protected void integrationComponentDidBecomeVisible() {}

    protected void integrationComponentDidBecomeInvisible() {}

    protected void componentDidBecomeVisible() {}

    protected void componentDidBecomeInvisible() {}

    public void setVisible(boolean flag) {}

    public boolean isVisible() { return true; }

    protected boolean _hasEverBeenVisible() { return true; }

    public boolean makeVisible() { return true; }

    public boolean makeInvisible() { return true; }

    protected boolean showSubcontroller(EOComponentController controller) { return true; }

    protected boolean hideSubcontroller(EOComponentController controller) { return true; }

    public boolean showInSupercontroller() { return true; }

    public boolean hideInSupercontroller() { return true; }

    public boolean _shouldAddSubcontrollerComponents() { return true; }

    public boolean _shouldUpdateInSupercontrollerComponent() { return true; }

    protected void _sizeComponentToMinimumSize(int minimumWidth, int minimumHeight) {}

    protected void _sizeComponentToMinimumSize(Dimension minimumSize) {}

    public void subcontrollerMinimumSizeDidChange(EOComponentController controller, JComponent component, Dimension updateMinimumSize) {}

    public NSArray _componentSizesOfAddedComponents() { return null; }

    public boolean _canFillUpSpaceForIntegration(Component component) { return true; }

    public Dimension _minimumSizeForComponent(Component component) { return null; }

    protected EOComponentController _controllerForComponent(JComponent component) { return null; }

    protected void _startUserInterfaceUpdateNotifications() {}

    protected void _stopUserInterfaceUpdateNotifications() {}

    protected void _updateUserInterface() {}

    protected boolean _needsUserInterfaceUpdateNotifications() { return true; }

    public final void _userInterfaceNotification(Object unusedArgument) { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS = null;
    public static final int Center = 0;
    public static final int Top = 1;
    public static final int Bottom = 2;
    public static final int Left = 3;
    public static final int Right = 4;
    public static final int TopLeft = 5;
    public static final int TopRight = 6;
    public static final int BottomLeft = 7;
    public static final int BottomRight = 8;
    public static final int _UserInterfaceUpdateRunLoopOrdering = 0x927c0;
    private static final NSSelector _userInterfaceNotificationSelector;
    private String _label;
    private Icon _icon;
    private boolean _prefersIconOnly;
    private String _toolTip;
    private boolean _componentPrepared;
    private EOController _onlyAllowedSubcontrollerForComponentUpdate;
    private boolean _componentUsed;
    private boolean _isVisible;
    private boolean _hasEverBeenVisible;
    private JComponent _component;
    private JComponent _subcontrollerArea;
    private JComponent _firstFocusComponent;
    private JComponent _lastFocusComponent;
    private boolean _canResizeHorizontally;
    private boolean _canResizeVertically;
    private Insets _insets;
    private boolean _usesHorizontalLayout;
    private boolean _alignsComponents;
    private boolean _aligningComponentsBlocked;
    private Dimension _realMinimumComponentSize;
    private Dimension _realMinimumSubcontrollerAreaSize;
    private Dimension _calculatedMinimumComponentSize;
    private Dimension _calculatedMinimumSubcontrollerAreaSize;
    private Dimension _defaultComponentSize;
    private boolean _registeredForUserInterfaceUpdateNotification;

}
