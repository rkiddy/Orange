
package com.webobjects.eointerface.swing;

import com.webobjects.foundation.*;
import java.awt.*;
import java.io.Serializable;
import javax.swing.JComponent;

public class EOViewLayout
    implements LayoutManager2, Serializable {
    private static class _EOViewLayoutData
        implements Serializable {


        private _EOViewLayoutData() { return null; }

        _EOViewLayoutData(_cls1 x0) { return null; }

        public Dimension lastKnownSize;
        public Integer springConstraint;

    }



    protected static int _horizontalSpringCount(int springs) { return null; }

    protected static int _verticalSpringCount(int springs) { return null; }

    public static Dimension _sizeOfComponentIfContainerIsResized(Component component, Dimension newContainerSize) { return null; }

    public static Dimension _sizeOfContainerToResizeComponentWithAutosizingMaskToNewSize(Dimension containerSize, Dimension componentSize, int autosizingMask, Dimension newComponentSize) { return null; }

    private static NSMutableDictionary _nonJComponentDataToStoreDataForComponent(Component component) { return null; }

    public static void _setAutosizingMaskAndLastKnownSize(Component component, int autosizingMask) { return null; }

    public static void _setAutosizingMask(Component component, int autosizingMask) { return null; }

    public static int _autosizingMask(Component component) { return null; }

    public static void _setLastKnownSizeIfNotAlreadySpecified(Component component) { return null; }

    public static void _setLastKnownSize(Component component) { return null; }

    public static void _setLastKnownSize(Component component, Dimension size) { return null; }

    public static Dimension _lastKnownSize(Component component) { return null; }

    public static void _forceLayout(Container container) { return null; }

    public static void _blockLayout(Container container) { return null; }

    public static void _unblockLayout(Container container) { return null; }

    public EOViewLayout() { return null; }

    protected NSMutableDictionary _nonJComponentData() { return null; }

    public void setAutosizingMask(Component component, int autosizingMask) {}

    public int autosizingMask(Component component) { return 0; }

    public void setLastKnownSize(Component component, Dimension size) {}

    public Dimension lastKnownSize(Component component) { return null; }

    private _NSMutableIntegerDictionary _blockLayoutCounters() { return null; }

    public void _blockLayoutOfContainer(Container container) {}

    public void _unblockLayoutOfContainer(Container container) {}

    public boolean _isLayoutOfContainerBlocked(Container container) { return true; }

    public void addLayoutComponent(String s, Component component1) {}

    public void addLayoutComponent(Component component, Object constraints) {}

    public void removeLayoutComponent(Component component) {}

    public float getLayoutAlignmentX(Container container) { return null; }

    public float getLayoutAlignmentY(Container container) { return null; }

    public void invalidateLayout(Container container1) {}

    public Dimension maximumLayoutSize(Container container) { return null; }

    public Dimension minimumLayoutSize(Container container) { return null; }

    public Dimension preferredLayoutSize(Container container) { return null; }

    public void layoutContainer(Container container) {}

    public static boolean _isComponentToTrace(Component component) { return null; }

    public static void _debug(String message) { return null; }

    public static void _debug(Component component, String message) { return null; }

    public static String _stringForComponent(Component component) { return null; }

    public static String _stringForDimension(Dimension dimension) { return null; }

    public static String _stringForRect(Rectangle rect) { return null; }

    static  {}

    private static final long serialVersionUID = 0x8865f8e4L;
    public static final Class _CLASS;
    public static final int MaxXMargin = 1;
    public static final int MinXMargin = 2;
    public static final int MaxYMargin = 4;
    public static final int MinYMargin = 8;
    public static final int WidthSizable = 16;
    public static final int HeightSizable = 32;
    public static final int BothSizable = 48;
    public static final int _AllHorizontalMask = 19;
    public static final int _AllVerticalMask = 44;
    private static final String _SpringsKey = "_EOSpringsKey";
    private static final String _LastKnownSizeKey = "_EOLastKnownSizeKey";
    private NSMutableDictionary _nonJComponentData;
    private _NSMutableIntegerDictionary _blockLayoutCounters;
    private static boolean _debug;

}
