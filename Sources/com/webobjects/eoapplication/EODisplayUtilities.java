
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;


public class EODisplayUtilities {
    private static class _FocusComponentActivation
        implements Runnable {


        public _FocusComponentActivation(JComponent component) { return null; }

        public void run() {}

        JComponent _component;

    }



    public EODisplayUtilities() { return null; }

    public static String displayLabelForString(String string) { return null; }

    public static String localizedDisplayLabelForString(String string) { return null; }

    public static Dimension unionSize(Dimension size, Dimension anotherSize) { return null; }

    public static Dimension unionSize(int width, int height, int anotherWidth, int anotherHeight) { return null; }

    public static Dimension _unionSizeNoNewDimensionNeeded(Dimension size, Dimension anotherSize) { return null; }

    public static Dimension _unionSizeNoNewDimensionNeeded(Dimension size, int anotherWidth, int anotherHeight) { return null; }

    public static void fillTargetSizeWithUnionSize(Dimension targetSize, Dimension size, Dimension anotherSize) { return null; }

    public static boolean fillTargetSizeWithUnionSize(Dimension targetSize, int anotherWidth, int anotherHeight) { return null; }

    private static int _emptyAdjustableSpaceForLabelComponent(Component labelComponent, NSArray dependentComponents, int spaceNeeded) { return null; }

    private static int _adjustableSpaceForLabelComponent(Component labelComponent, NSArray dependentComponents, int spaceNeeded) { return null; }

    private static int _adjustSpaceByShrinkingComponents(Component labelComponent, NSArray dependentComponents, int spaceNeeded, int shrinkingHint) { return null; }

    private static int _adjustSpaceForLabelComponent(Component labelComponent, NSArray dependentComponents, int spaceNeeded) { return null; }

    public static boolean _fillMapTablesForLabelComponents(Container container, _NSMutableIntegerDictionary labelToLeftXCoordinateOffsetMapTable, _NSMutableIntegerDictionary labelToRightXCoordinateOffsetMapTable, _NSMutableIntegerKeyDictionary xCoordinateToAlignmentWidthMapTable, _NSMutableIntegerKeyDictionary xCoordinateToLabelMapTable, int leftXCoordinateOffset, int rightXCoordinateOffset) { return null; }

    public static void _fillDependentComponentsArray(Component labelComponent, NSMutableArray dependentComponents) { return null; }

    private static boolean _tryResizingParentComponent(Component labelComponent, NSArray labelDependentComponents, Container container, int additionalSpaceNeeded) { return null; }

    public static void _alignComponentsInContainerOfController(EOComponentController controller, JComponent container, boolean updateComponentMinimumSize, boolean updateSubcontrollerAreaMinimumSize) { return null; }

    public static void _alignComponentsForController(EOComponentController controller, JComponent component) { return null; }

    public static void _relocateComponents(Container component, Point location, Point originalLocation, Dimension size, Dimension originalSize, Container parent, Dimension parentSize, Dimension originalParentSize, 
            boolean revertParentSizeToOriginalSize) { return null; }

    private static boolean _componentPrefersResizing(JComponent component, int autosizingMask) { return null; }

    public static boolean componentPrefersHorizontalResizing(JComponent component) { return null; }

    public static boolean componentPrefersVerticalResizing(JComponent component) { return null; }

    private static NSArray _resizingComponentsPresentInContainer(Container container, int autosizingMask) { return null; }

    private static NSArray _horizontallyResizingComponentsPresentInContainer(Container container) { return null; }

    private static NSArray _verticallyResizingComponentsPresentInContainer(Container container) { return null; }

    private static int _integrationSpaceInContainer(Container container, boolean checkHorizontalSpace) { return null; }

    private static int _horizontalIntegrationSpaceInContainer(Container container) { return null; }

    private static int _verticalIntegrationSpaceInContainer(Container container) { return null; }

    private static void _moveComponentWithGreaterCoordinate(Component components[], int coordinate, int delta, Component ignoreComponent, boolean moveHorizontally) { return null; }

    private static int _provideSpaceByShrinkingComponents(EOComponentController controllerProvidingSizeInformation, JComponent component, int spaceNeeded, JComponent componentSpaceIsNeededFor, boolean shrinkHorizontally) { return null; }

    private static int _provideHorizontalSpaceByShrinkingComponents(EOComponentController controllerProvidingSizeInformation, JComponent component, int spaceNeeded, JComponent componentSpaceIsNeededFor) { return null; }

    private static int _provideVerticalSpaceByShrinkingComponents(EOComponentController controllerProvidingSizeInformation, JComponent component, int spaceNeeded, JComponent componentSpaceIsNeededFor) { return null; }

    private static void _updateComponentDimensionInContainer(EOComponentController controllerProvidingSizeInformation, JComponent container, JComponent component, int updateSize, boolean updateHorizontally) { return null; }

    private static Dimension _updateComponentInContainer(EOComponentController controllerProvidingSizeInformation, JComponent container, JComponent component, Dimension componentMinimumSize, boolean prefersHorizontalResizing, boolean prefersVerticalResizing, boolean revertContainerSizeToOriginalSize) { return null; }

    private static Dimension _integrateComponentIntoContainerByLayingOutHorizontally(EOComponentController controllerProvidingSizeInformation, JComponent container, boolean insertDelimitingSpace, JComponent component, Dimension componentMinimumSize, boolean prefersHorizontalResizing, boolean prefersVerticalResizing, boolean revertContainerSizeToOriginalSize) { return null; }

    private static Dimension _integrateComponentIntoContainerByLayingOutVertically(EOComponentController controllerProvidingSizeInformation, JComponent container, boolean insertDelimitingSpace, JComponent component, Dimension componentMinimumSize, boolean prefersHorizontalResizing, boolean prefersVerticalResizing, boolean revertContainerSizeToOriginalSize) { return null; }

    public static void updateComponentInContainer(EOComponentController controllerProvidingSizeInformation, JComponent updateComponent, Dimension updateMinimumSize, boolean prefersHorizontalResizing, boolean prefersVerticalResizing, JComponent container, boolean layoutIsHorizontal) { return null; }

    public static void updateComponentInController(EOComponentController controller, JComponent updateComponent, Dimension updateMinimumSize, boolean prefersHorizontalResizing, boolean prefersVerticalResizing, boolean useSubcontrollerArea, boolean layoutIsHorizontal) { return null; }

    public static Dimension minimumComponentSizeWithIntegratedComponents(EOComponentController controller, Dimension minimumComponentSizeWithoutIntegratedComponents, Dimension minimumSubcontrollerAreaSize, NSArray integratedComponentSizes, boolean layoutIsHorizontal) { return null; }

    public static Dimension minimumComponentSizeWithIntegratedComponents(EOComponentController controller, Dimension minimumComponentSizeWithoutIntegratedComponents, Dimension minimumSubcontrollerAreaSize, NSArray integratedComponentSizes) { return null; }

    public static Dimension minimumSubcontrollerAreaSizeWithIntegratedComponents(Dimension minimumSubcontrollerAreaSize, NSArray integratedComponentSizes, boolean layoutIsHorizontal) { return null; }

    public static void integrateTransientSubcontrollerComponentForController(EOComponentController controller, EOComponentController subcontroller, Dimension minimumSubcontrollerAreaSizeBeforeForgettingTransientController, boolean layoutIsHorizontal) { return null; }

    public static void removeComponentFromParentContainer(Component component) { return null; }

    public static void tryToRemoveComponent(Component component) { return null; }

    public static void _activateFocusComponent(JComponent component, boolean delayed) { return null; }

    public static String _titleOfWindow(Object window) { return null; }

    public static void _activateWindow(Window window) { return null; }

    public static void activateWindow(Window window, boolean tryActivatingDelayed) { return null; }

    public static boolean activateWindowIfVisible(Window window) { return null; }

    private static int _windowOffsetSize() { return null; }

    public static void locateWindow(Window window, Dimension size, Point location) { return null; }

    public static void locateWindow(Window window, Dimension size, int windowPosition, int numberOfOffsets) { return null; }

    public static void relocateWindow(Window window, Dimension size, int windowPosition) { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String ComponentAlignmentLabelMarker = "ComponentAlignmentLabelMarker";
    public static final String ComponentAlignmentContainerMarker = "ComponentAlignmentContainerMarker";
    public static final String ComponentAlignmentMinimumWidthKey = "ComponentAlignmentMinimumWidth";
    private static final int _MinimumWindowOffsetSize = 10;
    private static int _windowOffsetSize;
    public static final Point _nullPoint;
    public static final Dimension _nullSize;
    public static final Insets _nullInsets;
    public static final int _MaxYMargin_MaxXMargin = 5;
    public static final int _MaxYMargin_MinXMargin = 6;
    public static final int _MaxYMargin_MinXMargin_MaxXMargin = 7;
    public static final int _MaxYMargin_WidthSizable = 20;
    public static final int _MinYMargin_MaxXMargin = 9;
    public static final int _MinYMargin_MinXMargin = 10;
    public static final int _MinYMargin_WidthSizable = 24;
    public static final int _MinYMargin_HeightSizable = 40;
    public static final int _MaxXMargin_HeightSizable = 33;
    public static final int _MaxXMargin_WidthSizable = 17;
    public static final int _MaxXMargin_MinYMargin_MaxYMargin = 13;
    public static final int _MinXMargin_HeightSizable = 34;
    public static final int _MinXMargin_WidthSizable = 18;
    public static final int _MinYMargin_MaxYMargin = 12;
    public static final int _MinXMargin_MaxXMargin = 3;
    public static final int _MaxXMargin_WidthSizable_HeightSizable = 49;
    public static final int _MinXMargin_WidthSizable_HeightSizable = 50;
    public static final int _MinXMargin_MaxXMargin_MinYMargin = 11;
    public static final int _MinXMargin_MaxXMargin_MaxYMargin = 7;
    private static final NSSelector _activateWindowSelector;

}
