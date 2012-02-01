package com.webobjects.eogeneration;
public abstract class EOWidgetController extends com.webobjects.eoapplication.EOComponentController{
    public EOWidgetController(){
         //TODO codavaj!!
    }

    public EOWidgetController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked when it's necessary to create the receiver's component, including setting up the subcontroller area. Subclass implementations of this method usually invoke setComponent and if necessary setSubcontrollerArea. EOComponentController's default implementation creates an empty EOView to hold subcontroller components.
     * The layout mechanisms used to integrate the components of controllers expect that the component is generated with the minimum size possible.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    public boolean highlightsLabel(){
        return false; //TODO codavaj!!
    }

    public javax.swing.JComponent labelComponent(){
        return null; //TODO codavaj!!
    }

    public int labelComponentAlignment(){
        return 0; //TODO codavaj!!
    }

    public int labelComponentPosition(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the receiver's alignment width, the minimum width used for text labels in its component (and its integrated subcontroller components).
     */
    public int labelComponentWidth(){
        return 0; //TODO codavaj!!
    }

    public java.awt.Dimension minimumWidgetSize(){
        return null; //TODO codavaj!!
    }

    protected javax.swing.JComponent newLabelComponent(java.lang.String label, int minimumWidth, boolean appendColon, int alignment, boolean highlightLabel){
        return null; //TODO codavaj!!
    }

    protected abstract javax.swing.JComponent newWidget();

    protected int preferredLabelComponentPosition(){
        return 0; //TODO codavaj!!
    }

    protected boolean preferredUsesLabelComponent(){
        return false; //TODO codavaj!!
    }

    protected int preferredWidgetAutosizingMask(){
        return 0; //TODO codavaj!!
    }

    protected void setAlignmentForWidget(javax.swing.JComponent widget, int alignment){
        return; //TODO codavaj!!
    }

    public void setHighlightsLabel(boolean flag){
        return; //TODO codavaj!!
    }

    public void setLabelComponent(javax.swing.JComponent labelComponent){
        return; //TODO codavaj!!
    }

    public void setLabelComponentAlignment(int alignment){
        return; //TODO codavaj!!
    }

    public void setLabelComponentPosition(int position){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's alignment width, the minimum width used for text labels in its component (and its integrated subcontroller components). Throws an IllegalStateException if the receiver's component is already prepared. In other words, you can only set the alignment behavior before the component is generated.
     */
    public void setLabelComponentWidth(int labelComponentWidth){
        return; //TODO codavaj!!
    }

    public void setMinimumWidgetSize(java.awt.Dimension size){
        return; //TODO codavaj!!
    }

    public void setUsesLabelComponent(boolean flag){
        return; //TODO codavaj!!
    }

    public void setWidget(javax.swing.JComponent widget){
        return; //TODO codavaj!!
    }

    public void setWidgetAlignment(int alignment){
        return; //TODO codavaj!!
    }

    protected void startListeningToWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToWidget(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the component that will be used to display tool tip text.
     */
    protected javax.swing.JComponent toolTipComponent(){
        return null; //TODO codavaj!!
    }

    public boolean usesLabelComponent(){
        return false; //TODO codavaj!!
    }

    public javax.swing.JComponent widget(){
        return null; //TODO codavaj!!
    }

    public int widgetAlignment(){
        return 0; //TODO codavaj!!
    }

    public static interface DefaultAction{
        abstract void defaultAction();

        public static interface CommonWidgetHandler{
            abstract boolean canTakeResposibilityForDefaultActionWithActionWidget(javax.swing.JComponent actionWidget);

            abstract void takeResposibilityForDefaultActionWithActionWidget(javax.swing.JComponent actionWidget);

        }
    }
    public static interface QueryWidget{
        abstract boolean isQueryWidget();

        abstract void setIsQueryWidget(boolean flag);

    }
    public static interface FormatWidget{
        abstract java.lang.Class formatClass();

        abstract java.lang.String formatPattern();

        abstract boolean isFormatAllowed();

        abstract void setFormatAllowed(boolean flag);

        abstract void setFormatClass(java.lang.Class formatClass);

        abstract void setFormatPattern(java.lang.String formatPattern);

    }
    public static interface TableWidget{
        abstract boolean allowsMultipleSelection();

        abstract void setAllowsMultipleSelection(boolean flag);

        abstract com.webobjects.eointerface.swing.EOTable table();

    }
}
