package com.webobjects.eointerface.swing;
/**
 * EOForm is a subclass of EOMatrix that manages a collection of labelled text fields laid out on a grid. Each label/text field pair is an EOFormCell.
 * See Also:EOMatrix, EOFormCell, Serialized Form
 */
public class EOForm extends com.webobjects.eointerface.swing.EOMatrix implements java.awt.LayoutManager{
    /**
     * Constructs a new EOForm with rows number of rows, columns number of columns, a row spacing of rowSpacing and a column spacing of columnSpacing.
     * Parameters:rows - the number of rowscolumns - the number of columnscolumnSpacing - the column spacingrowSpacing - the row spacing
     */
    public EOForm(int rows, int columns, int columnSpacing, int rowSpacing){
         //TODO codavaj!!
    }

    /**
     * Adds a form cell to the EOForm. component has to be an EOFormCell.
     */
    public java.awt.Component add(java.awt.Component component){
        return null; //TODO codavaj!!
    }

    /**
     * Simply returns, does nothing.
     */
    public void addLayoutComponent(java.lang.String name, java.awt.Component component){
        return; //TODO codavaj!!
    }

    /**
     * Lays out the labels and text fields of the EOForm container.
     */
    public void layoutContainer(java.awt.Container container){
        return; //TODO codavaj!!
    }

    /**
     * Returns the minimum size of the form container.
     */
    public java.awt.Dimension minimumLayoutSize(java.awt.Container container){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the preferred size of the form container.
     */
    public java.awt.Dimension preferredLayoutSize(java.awt.Container container){
        return null; //TODO codavaj!!
    }

    /**
     * Simply returns, does nothing.
     */
    public void removeLayoutComponent(java.awt.Component component){
        return; //TODO codavaj!!
    }

}
