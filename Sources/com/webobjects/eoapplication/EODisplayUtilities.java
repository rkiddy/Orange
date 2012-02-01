package com.webobjects.eoapplication;
public class EODisplayUtilities{
    public static final java.lang.String ComponentAlignmentContainerMarker="ComponentAlignmentContainerMarker";

    public static final java.lang.String ComponentAlignmentLabelMarker="ComponentAlignmentLabelMarker";

    public static final java.lang.String ComponentAlignmentMinimumWidthKey="ComponentAlignmentMinimumWidth";

    public EODisplayUtilities(){
         //TODO codavaj!!
    }

    public static void activateWindow(java.awt.Window window, boolean tryActivatingDelayed){
        return; //TODO codavaj!!
    }

    public static boolean activateWindowIfVisible(java.awt.Window window){
        return false; //TODO codavaj!!
    }

    public static boolean componentPrefersHorizontalResizing(javax.swing.JComponent component){
        return false; //TODO codavaj!!
    }

    public static boolean componentPrefersVerticalResizing(javax.swing.JComponent component){
        return false; //TODO codavaj!!
    }

    public static java.lang.String displayLabelForString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    public static void fillTargetSizeWithUnionSize(java.awt.Dimension targetSize, java.awt.Dimension size, java.awt.Dimension anotherSize){
        return; //TODO codavaj!!
    }

    public static boolean fillTargetSizeWithUnionSize(java.awt.Dimension targetSize, int anotherWidth, int anotherHeight){
        return false; //TODO codavaj!!
    }

    public static void integrateTransientSubcontrollerComponentForController(com.webobjects.eoapplication.EOComponentController controller, com.webobjects.eoapplication.EOComponentController subcontroller, java.awt.Dimension minimumSubcontrollerAreaSizeBeforeForgettingTransientController, boolean layoutIsHorizontal){
        return; //TODO codavaj!!
    }

    public static java.lang.String localizedDisplayLabelForString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    public static void locateWindow(java.awt.Window window, java.awt.Dimension size, int windowPosition, int numberOfOffsets){
        return; //TODO codavaj!!
    }

    public static void locateWindow(java.awt.Window window, java.awt.Dimension size, java.awt.Point location){
        return; //TODO codavaj!!
    }

    public static java.awt.Dimension minimumComponentSizeWithIntegratedComponents(com.webobjects.eoapplication.EOComponentController controller, java.awt.Dimension minimumComponentSizeWithoutIntegratedComponents, java.awt.Dimension minimumSubcontrollerAreaSize, com.webobjects.foundation.NSArray integratedComponentSizes){
        return null; //TODO codavaj!!
    }

    public static java.awt.Dimension minimumComponentSizeWithIntegratedComponents(com.webobjects.eoapplication.EOComponentController controller, java.awt.Dimension minimumComponentSizeWithoutIntegratedComponents, java.awt.Dimension minimumSubcontrollerAreaSize, com.webobjects.foundation.NSArray integratedComponentSizes, boolean layoutIsHorizontal){
        return null; //TODO codavaj!!
    }

    public static java.awt.Dimension minimumSubcontrollerAreaSizeWithIntegratedComponents(java.awt.Dimension minimumSubcontrollerAreaSize, com.webobjects.foundation.NSArray integratedComponentSizes, boolean layoutIsHorizontal){
        return null; //TODO codavaj!!
    }

    public static void relocateWindow(java.awt.Window window, java.awt.Dimension size, int windowPosition){
        return; //TODO codavaj!!
    }

    public static void removeComponentFromParentContainer(java.awt.Component component){
        return; //TODO codavaj!!
    }

    public static void tryToRemoveComponent(java.awt.Component component){
        return; //TODO codavaj!!
    }

    public static java.awt.Dimension unionSize(java.awt.Dimension size, java.awt.Dimension anotherSize){
        return null; //TODO codavaj!!
    }

    public static java.awt.Dimension unionSize(int width, int height, int anotherWidth, int anotherHeight){
        return null; //TODO codavaj!!
    }

    public static void updateComponentInContainer(com.webobjects.eoapplication.EOComponentController controllerProvidingSizeInformation, javax.swing.JComponent updateComponent, java.awt.Dimension updateMinimumSize, boolean prefersHorizontalResizing, boolean prefersVerticalResizing, javax.swing.JComponent container, boolean layoutIsHorizontal){
        return; //TODO codavaj!!
    }

    public static void updateComponentInController(com.webobjects.eoapplication.EOComponentController controller, javax.swing.JComponent updateComponent, java.awt.Dimension updateMinimumSize, boolean prefersHorizontalResizing, boolean prefersVerticalResizing, boolean useSubcontrollerArea, boolean layoutIsHorizontal){
        return; //TODO codavaj!!
    }

}
