package com.webobjects.eointerface.swing;
/**
 * An EOViewLayout is an AWT layout manager which offers "spring" resizing (like Cocoa views). EOViewLayout implements the geometry options available in Interface Builder's Size inspector. The size of a Component embedded in a Container using this layout scheme will be a function of both its autosizing mask and its initial size.
 * See Also:Serialized Form
 */
public class EOViewLayout implements java.awt.LayoutManager2, java.io.Serializable{
    /**
     * This constant is used to specify that both width and height of a component may be adjusted.
     * See Also:Constant Field Values
     */
    public static final int BothSizable=48;

    /**
     * This constant is used to specify that a component's height may be adjusted.
     * See Also:Constant Field Values
     */
    public static final int HeightSizable=32;

    /**
     * This constant is used to specify that the distance between a component's right edge and that of its parent may be adjusted.
     * See Also:Constant Field Values
     */
    public static final int MaxXMargin=1;

    /**
     * This constant is used to specify that the distance between a component's bottom edge and that of its parent may be adjusted.
     * See Also:Constant Field Values
     */
    public static final int MaxYMargin=4;

    /**
     * This constant is used to specify that the distance between a component's left edge and that of its parent may be adjusted.
     * See Also:Constant Field Values
     */
    public static final int MinXMargin=2;

    /**
     * This constant is used to specify that the distance between a component's top edge and that of its parent may be adjusted.
     * See Also:Constant Field Values
     */
    public static final int MinYMargin=8;

    /**
     * This constant is used to specify that a component's width may be adjusted.
     * See Also:Constant Field Values
     */
    public static final int WidthSizable=16;

    /**
     * Constructs a new EOViewLayout.
     */
    public EOViewLayout(){
         //TODO codavaj!!
    }

    /**
     * Registers component with the EOViewLayout. constraints should be an Integer object representing the autosizing mask for component.
     */
    public void addLayoutComponent(java.awt.Component component, java.lang.Object constraints){
        return; //TODO codavaj!!
    }

    /**
     * Does nothing.
     */
    public void addLayoutComponent(java.lang.String name, java.awt.Component component){
        return; //TODO codavaj!!
    }

    /**
     * Returns the autosizing mask of a component layed out by the EOViewLayout. The mask is some bitwise combination of the following constants: MaxXMargin, MinXMargin, MaxYMargin, MinYMargin, WidthSizable, HeightSizable, and BothSizable.
     */
    public int autosizingMask(java.awt.Component component){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the alingment of the component container along the x axis.
     */
    public float getLayoutAlignmentX(java.awt.Container container){
        return 0.0f; //TODO codavaj!!
    }

    /**
     * Returns the alingment of the component container along the y axis.
     */
    public float getLayoutAlignmentY(java.awt.Container container){
        return 0.0f; //TODO codavaj!!
    }

    /**
     * Does nothing.
     */
    public void invalidateLayout(java.awt.Container container){
        return; //TODO codavaj!!
    }

    /**
     * Returns the "last known size" of a component layed out by the EOViewLayout. This size is the basis for the size adjustment of the component next time the component's parent is resized.
     */
    public java.awt.Dimension lastKnownSize(java.awt.Component component){
        return null; //TODO codavaj!!
    }

    /**
     * Lays out the subcomponents of the component container. Adjusts the locations and sizes of the subcomponents according to the autosizing masks registered for them.
     */
    public void layoutContainer(java.awt.Container container){
        return; //TODO codavaj!!
    }

    /**
     * Returns the maximum size of the component container.
     */
    public java.awt.Dimension maximumLayoutSize(java.awt.Container container){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the minimum size of the component container.
     */
    public java.awt.Dimension minimumLayoutSize(java.awt.Container container){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the preferred size of the component container.
     */
    public java.awt.Dimension preferredLayoutSize(java.awt.Container container){
        return null; //TODO codavaj!!
    }

    /**
     * Unregisters component from the EOViewLayout.
     */
    public void removeLayoutComponent(java.awt.Component component){
        return; //TODO codavaj!!
    }

    /**
     * Sets the autosizing mask of a component layed out by the EOViewLayout to autosizingMask. This information is subsequently used by the receiver to calculate the new location and dimensions of component whenever its parent is resized. The mask should be some bitwise combination of the following constants: MaxXMargin, MinXMargin, MaxYMargin, MinYMargin, WidthSizable, HeightSizable, and BothSizable.
     */
    public void setAutosizingMask(java.awt.Component component, int autosizingMask){
        return; //TODO codavaj!!
    }

    /**
     * Sets the "last known size" of a component layed out by the EOViewLayout. This size is the basis for the size adjustment of the component next time the component's parent is resized. You can use this method to explicitly register new dimensions of a component with the layout manager. This might be necessary for example if you change the location and dimension of components programmatically, without relying on the EOViewLayout.
     */
    public void setLastKnownSize(java.awt.Component component, java.awt.Dimension size){
        return; //TODO codavaj!!
    }

}
