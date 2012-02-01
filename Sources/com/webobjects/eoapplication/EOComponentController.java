package com.webobjects.eoapplication;
/**
 * The EOComponentController class provides behavior for controllers that manage user interface components. A component controller has a component that represents the user interface for the controller itself (not for its subcontrollers), a subcontroller area for displaying the user interfaces for its subcontrollers, and an integration component -- a component that represents the controller when its shown in its supercontroller's user interface.
 * By default, a controller's integration component is simply the controller's component. In other words, a supercontroller adds its subcontroller's components to the subcontroller area of its component. However, the integration component can be a completely separate component. For example, the integration component for a window controller is a button that, when pushed, opens the window controller's window.
 * Also by default, a controller's subcontroller area is simply the controller's component. In the simplest case, a component controller doesn't have its own special user interface, but only serves to display the user interfaces of its subcontrollers. For example, EOComponentController's component is simply an EOView. It puts nothing in the view except its subcontroller's components. Thus, the subcontroller area is the controller's component -- the EOView. However, the subcontroller area can be a subcomponent of the controller's component. For example, an EOBoxController's component contains a border (etched or bezel, for example) which is the box controller's user interface. Its subcontroller area is a component located inside the border. This is where the box controller displays its subcontrollers.
 * To access a component controller's component, use the component method. If the component hasn't yet been created, component creates it by invoking prepareComponent. And prepareComponent, in turn, invokes generateComponent to dynamically create the component. Subclasses should override generateComponent. The EOEntityController class provides an additional way to create user interfaces by loading interface file archives.
 * To see if a controller's component has already been created, use the method isComponentPrepared. Sometimes you need to know if a component has been created, because you can't configure its behavior after its creation. For example, if you want to set a component's alignment behavior, you have to set it with the EOComponentController method setAlignsComponents before the component controller creates its component.
 * All methods which return objects that might be created dynamically with the user interface of the controller (or loaded from an interface file archive) should invoke prepareComponent first. Example:
 * A component controller is visible when its component is visible on screen. When a controller becomes visible, it ensures that it's connected to its supercontroller. However, a controller that's connected to its supercontroller isn't necessarily visible. For example, you might connect an invisible controller when you need to prepare it with data before making it visible.
 * Similarly, a controller can be "shown" or "hidden" in its supercontroller without changing the controller's visibility. The method showInSupercontroller ensures that the receiver's integration component is displayed in its supercontroller's component. This doesn't necessarily change the visibility of the controller. For example, a tab switch controller might switch to another view, but if the tab view itself isn't visible when the change occurs, the subcontroller doesn't become visible.
 * A component controller's component can have an icon and a label. The component can be represented in the user interface with icon only, label only, or with both icon and label. A component specifies which representation it prefers. A controller can prefer to be represented with an icon only, but can't require it. This is because the controller might not have an icon or a supercontroller trying to represent a subcontroller cannot deal with icons. If the controller prefers icon only and has an icon, then the controller is represented with the icon only. If the controller doesn't prefer icon only and has an icon, then the controller is represented with its icon and label. If the controller doesn't have an icon, the controller is represented with the label only.
 * A controller always has a label. If the controller's label hasn't been explicitly set, the controller tries to derive one from the entity and property information it has or derives one from its subcontrollers.
 * Subclasses of EOComponentController have complete control over how they lay out their subcontroller components. EOComponentController's implementation can lay out subcontrollers in a row or a column (the default). To change the layout direction, use the method setUsesHorizontalLayout.
 * In addition to horizontal/vertical layout behavior, a component can align its label components or not. For example, consider a controller that uses vertical layout and contains several widget controllers like EOTextFieldControllers. If the controller aligns components, it attempts to left align the widgets by giving all label components the same width. The width of the labels is known as the alignment width.
 * To specify that a controller should align components (like labels), use the method setAlignsComponents.
 * EOComponentController implements complex resizing behavior. For example, if a controller's component changes in a way that might affect its minimum size, the controller's supercontroller is notified and the supercontroller ensures that its subcontroller area is at least as big as the minimum size required to show all its subcontrollers.
 * Using the default behavior, the user interface doesn't automatically shrink. EOComponentController only resizes up to meet the minimum requirements. As much as possible it resizes components to fill the available space. A component controller can specify both horizontal and vertical resizing behavior for its component to accommodate this scheme.
 */
public class EOComponentController extends com.webobjects.eoapplication.EOController{
    /**
     * The constant describing a bottom position.
     * See Also:Constant Field Values
     */
    public static final int Bottom=2;

    /**
     * The constant describing a bottom-left position.
     * See Also:Constant Field Values
     */
    public static final int BottomLeft=7;

    /**
     * The constant describing a bottom-right position.
     * See Also:Constant Field Values
     */
    public static final int BottomRight=8;

    /**
     * The constant describing a center position.
     * See Also:Constant Field Values
     */
    public static final int Center=0;

    /**
     * The constant describing a left position.
     * See Also:Constant Field Values
     */
    public static final int Left=3;

    /**
     * The constant describing a right position.
     * See Also:Constant Field Values
     */
    public static final int Right=4;

    /**
     * The constant describing a top position.
     * See Also:Constant Field Values
     */
    public static final int Top=1;

    /**
     * The constant describing a top-left position.
     * See Also:Constant Field Values
     */
    public static final int TopLeft=5;

    /**
     * The constant describing a top-right position.
     * See Also:Constant Field Values
     */
    public static final int TopRight=6;

    /**
     * Creates a new component controller with default parameters.
     */
    public EOComponentController(){
         //TODO codavaj!!
    }

    /**
     * Creates a new component controller with parameters retrieved from the EOXMLUnarchiver.
     * Parameters:unarchiver - the EOXMLUnarchiver providing XML arguments
     */
    public EOComponentController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Puts the keyboard focus on the component returned by firstFocusComponent.
     */
    public void activateFirstFocusComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Adds the integration component for the receiver's subcontroller, controller, to the user interface for the receiver.
     */
    protected void addComponentOfSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver attempts to align all text labels in its component (and its integrated subcontroller components).
     */
    public boolean alignsComponents(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the controller can be transient. By default, a component controller is transient only if it's an instance of EOComponentController, not an instance of a subclass.
     */
    public boolean canBeTransient(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver's component can resize horizontally.
     */
    public boolean canResizeHorizontally(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver's component can resize vertically.
     */
    public boolean canResizeVertically(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's component, creating and preparing it first if it doesn't already exist.
     */
    public javax.swing.JComponent component(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked when the receiver's component becomes invisible, giving the receiver a chance to react. EOComponentController's implementation invokes breakConnection to break the receiver's connection to the controller hierarchy.
     */
    protected void componentDidBecomeInvisible(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked when the receiver's component becomes visible, giving the receiver a chance to react. EOComponentController's implementation invokes establishConnection to ensure the receiver is connected to the controller hierarchy.
     */
    protected void componentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's default component size. This is also the size the component is set to when it's created.
     */
    public java.awt.Dimension defaultComponentSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Ensures that the size of the receiver's component, not including the subcontroller area, is at least as large as the area specified by width and height. If it isn't, the receiver resizes its component to width and height. This method is invoked by the receiver itself when its component is changed in a way that might affect the component's minimum size. For example, suppose a label is changed and requires a larger space.
     */
    public void ensureMinimumComponentSizeWithoutSubcontrollers(int width, int height){
        return; //TODO codavaj!!
    }

    /**
     * Ensures that the size of the receiver's subcontroller area is at least as large as the area specified by width and height. If it isn't, the receiver resizes its subcontroller area to width and height. This method is invoked when a subcontroller's component changes in a way that might affect its minimum size.
     */
    public void ensureMinimumSubcontrollerAreaSize(int width, int height){
        return; //TODO codavaj!!
    }

    /**
     * Returns the JComponent that should get the keyboard focus first.
     */
    public javax.swing.JComponent firstFocusComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked when it's necessary to create the receiver's component, including setting up the subcontroller area. Subclass implementations of this method usually invoke setComponent and if necessary setSubcontrollerArea. EOComponentController's default implementation creates an empty EOView to hold subcontroller components.
     * The layout mechanisms used to integrate the components of controllers expect that the component is generated with the minimum size possible.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Handles a special case for components assigned through key-value coding.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Invokes hideSubcontroller on the supercontroller to deactivate the receiver's user interface. Returns whether the controller was successfully hidden or not. If the receiver is a root component controller, this method also makes the receiver invisible. For example, a window controller which is a root component controller simply closes.
     */
    public boolean hideInSupercontroller(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is used to attempt to hide a subcontroller's user interface inside the component of the receiver. Returns whether the subcontroller was successfully hidden or not. EOComponentController's implementation simply returns false. This is because most controllers can't hide their subcontrollers.
     * For example switch controllers override this method in a meaningful way: They can simply activate another subcontroller. Do not invoke this method directly, use hideInSupercontroller instead.
     */
    protected boolean hideSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's icon. The icon is usually used by supercontrollers which integrate the controller to create a representation of the controller.
     */
    public javax.swing.Icon icon(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the inset area around this controller's component.
     */
    public java.awt.Insets insets(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the component used as the integration component in the receiver's supercontroller to represent the receiver. EOComponentController returns its component by default. Subclasses can override this method to return a placeholder component, for example an activation button.
     */
    public javax.swing.JComponent integrationComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked by the receiver's supercontroller when the receiver's integration component becomes invisible, giving the receiver a chance to react. EOComponentController's implementation sets the receiver's visibility to be false, because by default the integration component is identical to the component.
     */
    protected void integrationComponentDidBecomeInvisible(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked by the receiver's supercontroller when the receiver's integration component becomes visible, giving the receiver a chance to react. EOComponentController's implementation sets the receiver's visibility to be true, because by default the integration component is identical to the component.
     */
    protected void integrationComponentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver's component is prepared.
     */
    protected boolean isComponentPrepared(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver is a root component controller. A component controller is a root component controller if its supercontroller is not an instance of EOComponentController.
     */
    public boolean isRootComponentController(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver's component is visible or not. A component controller is visible if its component is on the screen. Note, showing a subcontroller in its supercontroller doesn't necessarily mean that it is visible. For example, you can show a component in a tab view, but the component won't be visible unless the tab view is visible.
     */
    public boolean isVisible(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's label. If the label is not explicitly set, EOComponentController's implementation attempts to derive a label from its subcontrollers. The label is usually used by supercontrollers which integrate the controller to create a representation of the controller.
     */
    public java.lang.String label(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JComponent that will get the keyboard focus last during focus traversal.
     */
    public javax.swing.JComponent lastFocusComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Makes the receiver's user interface invisible. If the receiver's supercontroller is a component controller, makes the receiver invisible by making the receiver's supercontroller invisible. Otherwise, invokes hideInSupercontroller.
     */
    public boolean makeInvisible(){
        return false; //TODO codavaj!!
    }

    /**
     * Makes the receiver's user interface visible. Establishes the receiver's connection to its supercontrollers and invokes showInSupercontroller. If the receiver's supercontroller is a component controller, it also attempts to make the supercontroller visible.
     */
    public boolean makeVisible(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the current minimum size required to display the receiver's component, including the size required for its subcontroller area.
     */
    public java.awt.Dimension minimumComponentSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the current minimum size required to display the receiver's component, excluding the subcontroller area.
     */
    public java.awt.Dimension minimumComponentSizeWithoutSubcontrollers(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the minimum size required to display the receiver's integration component. EOComponentController returns its minimum component size by default. Subclasses can override this method to return the minimum size of a placeholder component, for example an activation button.
     */
    public java.awt.Dimension minimumIntegrationComponentSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the minimum size of the subcontroller area to display the receiver's subcontrollers.
     */
    public java.awt.Dimension minimumSubcontrollerAreaSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver prefers to represent itself with only an icon or with an icon and a label.
     */
    public boolean prefersIconOnly(){
        return false; //TODO codavaj!!
    }

    /**
     * Prepares the receiver's component for display. If not already created, creates the component and integrates the subcontroller components.
     */
    protected void prepareComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Removes the user interface for the receiver's subcontroller, controller, from the receiver's user interface and informs controller that its integration component became invisible.
     */
    protected void removeComponentOfSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return; //TODO codavaj!!
    }

    /**
     * See the method description for removeTransientSubcontroller in the EOController class specification. EOComponentController's implementation performs additional user interface cleanup for controllers that become transient.
     */
    protected boolean removeTransientSubcontroller(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver attempts to align all text labels in its component (and its integrated subcontroller components). Throws an IllegalStateException if the receiver's component is already prepared. In other words, you can only set the alignment behavior before the component is generated.
     */
    public void setAlignsComponents(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver's component can resize horizontally. Throws an IllegalStateException if the receiver's component is already prepared. In other words, you can only set the horizontal resizing behavior before the component is generated.
     */
    public void setCanResizeHorizontally(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver's component can resize vertically. Throws an IllegalStateException if the receiver's component is already prepared. In other words, you can only set the vertical resizing behavior before the component is generated.
     */
    public void setCanResizeVertically(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's component. The component has to be a JComponent or a Window (in which case the content view (excpected to be a JComponent) of the window is used as component), otherwise this method throws an IllegalArgumentException. The component is usually a Window if it is loaded from an interface file created in Interface Builder (in which case the file's owner's component outlet usually points to the window, not its content view).
     */
    public void setComponent(java.awt.Component component){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's default component size.
     */
    public void setDefaultComponentSize(java.awt.Dimension size){
        return; //TODO codavaj!!
    }

    /**
     * Sets the JComponent that should get the keyboard focus during activateFirstFocusComponent.
     */
    public void setFirstFocusComponent(javax.swing.JComponent component){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's icon.
     */
    public void setIcon(javax.swing.Icon icon){
        return; //TODO codavaj!!
    }

    /**
     * Sets the inset area around this controller's component. Throws an IllegalStateException if the component is already prepared.
     */
    public void setInsets(java.awt.Insets insets){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's label.
     */
    public void setLabel(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Sets the JComponent that will get the keyboard focus last during focus traversal.
     */
    public void setLastFocusComponent(javax.swing.JComponent component){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver prefers to represent itself with only an icon or with an icon and a label.
     */
    public void setPrefersIconOnly(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's subcontroller area, the component that holds the subcontroller integration comonents.
     */
    public void setSubcontrollerArea(javax.swing.JComponent component){
        return; //TODO codavaj!!
    }

    /**
     * Sets the tool tip text used for the controller's component.
     */
    public void setToolTip(java.lang.String toolTip){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the receiver uses horizontal or vertical layout. Throws an IllegalStateException if the receiver's component is already prepared. In other words, you can only set the layout direction before the component is generated.
     */
    public void setUsesHorizontalLayout(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the visibility of the receiver according to flag. Invokes componentDidBecomeVisible or componentDidBecomeInvisible to notify the receiver that its visibility changed and to give the receiver the opportunity to react appropriately. Also notifies the receiver's ancestors that a subcontroller's visibility has changed, giving the supercontrollers the opportunity to respond.
     * If flag is true, this method disposes of transient receivers after making them visible.
     */
    public void setVisible(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Invokes showSubcontroller on the supercontroller to activate the receiver's user interface. Returns whether the controller was successfully shown or not. If the receiver is a root component controller, this method also makes the receiver visible.
     * Note that invoking this method doesn't necessarily change the visibility of the receiver. For example, a switch controller might switch the component it displays, but if the switch controller isn't visible, the subcontroller doesn't become visible when it's shown.
     */
    public boolean showInSupercontroller(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is used to ensure that a subcontroller's user interface is shown inside the component of the receiver (which does not necessarily mean that it's visible on the screen). Returns whether the subcontroller was successfully shown or not. EOComponentController's implementation simply returns true: Since the integration components for subcontrollers are added to a controller's component automatically, the subcontrollers are already shown.
     * For example, switch controllers override this method in a meaningful way: To show one subcontroller, the tab switch controller hides another. Do not invoke this method directly, use showInSupercontroller instead.
     */
    protected boolean showSubcontroller(com.webobjects.eoapplication.EOComponentController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's subcontroller area. EOComponentController returns its component by default.
     */
    public javax.swing.JComponent subcontrollerArea(){
        return null; //TODO codavaj!!
    }

    /**
     * Updates the receiver's user interface to accommodate a change to a subcontroller's minimum size. This method is invoked by subcontrollers when they change in a way that might affect their component's minimum size. A subcontroller sends this method with itself, its integration component, and its new minimum size as the arguments. The expectation is that the supercontroller will make space for the subcontroller if it needs to.
     */
    public void subcontrollerMinimumSizeDidChange(com.webobjects.eoapplication.EOComponentController controller, javax.swing.JComponent component, java.awt.Dimension updateMinimumSize){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from addSubcontroller when a subcontroller is added to a controller. If the receiver's component has already been created, integrates the subcontroller's integration component (if any) to its component right away, otherwise waits until it becomes visible.
     */
    protected void subcontrollerWasAdded(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from removeSubcontroller when a subcontroller is removed from a controller. If the receiver's component has already been created, removes the subcontroller's integration component (if any) from its component.
     */
    protected void subcontrollerWasRemoved(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    /**
     * Returns the tool tip text used for the controller's component.
     */
    public java.lang.String toolTip(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the component that will be used to display tool tip text.
     */
    protected javax.swing.JComponent toolTipComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a string that states the receiver's class name and type name, whether the receiver is connected, the number of subcontrollers, whether or not the receiver has been prepared, whether or not the receiver is visible, information about widget sizing and alignment behavior, and so on.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the receiver uses horizontal or vertical layout.
     */
    public boolean usesHorizontalLayout(){
        return false; //TODO codavaj!!
    }

    /**
     * The EOComponentController.Modal interface identifies controllers that can run modal user interfaces (modal dialogs).
     */
    public static interface Modal{
        /**
         * Invoked by subcontrollers to finish a modal session (to close a modal dialog).
         */
        abstract void finishModal();

        /**
         * Returns whether the controller actually runs a modal user interface or not.
         */
        abstract boolean isModal();

    }
    /**
     * The EOComponentController.Activation interface identifies controllers that which have components can be explicitly activated (for example window controllers).
     */
    public static interface Activation{
        /**
         * Invoked to explicitly activate a controller's component.
         */
        abstract boolean activate();

    }
    /**
     * The EOComponentController.ActionCollector interface identifies controllers that display actions of subcontrollers collectively (for example in tool bars).
     */
    public static interface ActionCollector{
        /**
         * Returns an array of all actions collected from subcontrollers.
         */
        abstract com.webobjects.foundation.NSArray collectedActions();

    }
    /**
     * The EOComponentController.EndEditing interface identifies controllers that edit data objects and might need to flush uncommitted user changes.
     */
    public static interface EndEditing{
        /**
         * Ensures that all current edits in the user interface are flushed to the underlying data objects.
         */
        abstract boolean endEditing();

    }
    /**
     * The EOComponentController.ResetUserInterface interface identifies controllers that have components that can reset their interface to an original state (for example switch controllers).
     */
    public static interface ResetUserInterface{
        /**
         * Invoked to explicitly reset a controller's user interface to an original state.
         */
        abstract void resetUserInterface();

    }
}
