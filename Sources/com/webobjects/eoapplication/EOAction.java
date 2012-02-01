package com.webobjects.eoapplication;
/**
 * EOAction objects are abstract representations of operations the user can invoke from the user interface. An action does not specify how it appears in the user interface -- it can appear as a button, a menu item, or both.
 * Each action defines a method called the action name, that is invoked when the action triggers. An action also has a description path, which describes the category of the action and its name. For example, a Quit action's description path might be "Document/Quit". In addition, the action can have a short description that differs from the last element of the description path, for example, "Quit the Application".
 * Actions can have icons for buttons in the application and small icons for minor buttons in the user interface. To allow users to trigger actions with "hot-keys," each action has a menu accelerator, a javax.swing.KeyStroke the user can type on the keyboard.
 * Actions often appear in groups in the user interface: buttons in the same group are rendered close together and menu items in the group are rendered in separate menus like the Document, Edit, Tools, or Window menus. To group actions, EOAction defines a category priority. All actions in the same group have the same category priority. An additional parameter, the action priority defines the order in which actions appear within a group, for example, the order menu items appear within a menu.
 * An action triggers when the user clicks the corresponding user interface widget. In most cases, the action's method is dispatched to the subcontrollers that displays the action. Methods whose controller names end with ...ForControllerHierarchy return such actions. In some cases, the action's method is dispatched to the active widget, like the text field containing the cursor. Methods whose names end with ...ForFocusComponent return such actions. In other cases, the action's method is dispatched to a particular object, usually the EOApplication at the root of the controller hierarchy.
 * EOAction defines methods to create actions, access an action's parameters, manage groups of actions, and to access shared actions used in Direct to Java Client applications.
 * See Also:Serialized Form
 */
public abstract class EOAction extends javax.swing.AbstractAction{
    /**
     * The priority of the Activate Previous Window action.
     * See Also:EOAction.standardActivatePreviousWindowActionForWindowObserver(), Constant Field Values
     */
    public static final int ActivatePreviousWindowActionPriority=120;

    /**
     * The priority of the Append action.
     * See Also:EOAction.standardAppendActionForControllerHierarchy(), Constant Field Values
     */
    public static final int AppendActionPriority=510;

    /**
     * The priority of the Bring All To Front action.
     * See Also:EOAction.standardBringAllWindowsToFrontActionForWindowObserver(), Constant Field Values
     */
    public static final int BringAllWindowsToFrontActionPriority=300;

    /**
     * The priority of the Cancel action.
     * See Also:EOAction.standardCancelActionForControllerHierarchy(), Constant Field Values
     */
    public static final int CancelActionPriority=110;

    /**
     * The priority of the Clear action.
     * See Also:EOAction.standardClearActionForControllerHierarchy(), Constant Field Values
     */
    public static final int ClearActionPriority=520;

    /**
     * The priority of the Close window action.
     * See Also:EOAction.standardCloseWindowActionForControllerHierarchy(), Constant Field Values
     */
    public static final int CloseWindowActionPriority=100;

    /**
     * The priority of the Delete action.
     * See Also:EOAction.standardDeleteActionForControllerHierarchy(), EOAction.standardRemoveActionForControllerHierarchy(), EOAction.standardDeselectActionForControllerHierarchy(), Constant Field Values
     */
    public static final int DeleteActionPriority=140;

    /**
     * The String used to separate the components of a description path.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DescriptionPathSeparator="/";

    /**
     * The priority of the Document category.
     * See Also:EOAction.standardDocumentActionForControllerHierarchy(String, KeyStroke, int), Constant Field Values
     */
    public static final int DocumentCategoryPriority=100;

    /**
     * The priority of the Edit category.
     * See Also:EOAction.standardEditActionForControllerHierarchy(String, KeyStroke, int), EOAction.standardActionForFocusComponent(String, KeyStroke, int, String), Constant Field Values
     */
    public static final int EditCategoryPriority=110;

    /**
     * The priority of the Find action.
     * See Also:EOAction.standardFindActionForControllerHierarchy(), Constant Field Values
     */
    public static final int FindActionPriority=500;

    /**
     * The priority of the Help action.
     * See Also:Constant Field Values
     */
    public static final int HelpActionPriority=100;

    /**
     * The priority of the Help category.
     * See Also:Constant Field Values
     */
    public static final int HelpCategoryPriority=140;

    /**
     * The priority of the Info action.
     * See Also:Constant Field Values
     */
    public static final int InfoActionPriority=110;

    /**
     * The priority of the Insert action.
     * See Also:EOAction.standardInsertActionForControllerHierarchy(), EOAction.standardInsertWithTaskActionForControllerHierarchy(), EOAction.standardAddActionForControllerHierarchy(), EOAction.standardSelectActionForControllerHierarchy(), Constant Field Values
     */
    public static final int InsertActionPriority=100;

    /**
     * The priority of the List action.
     * See Also:EOAction.standardOpenWithTaskActionForControllerHierarchy(), Constant Field Values
     */
    public static final int ListActionPriority=120;

    /**
     * The priority of the Minimize Window action.
     * See Also:EOAction.standardMinimizeActiveWindowActionForWindowObserver(), Constant Field Values
     */
    public static final int MinimizeActiveWindowActionPriority=110;

    /**
     * The priority of the Modal actions category.
     * See Also:EOAction.standardCancelActionForControllerHierarchy(), EOAction.standardOkActionForControllerHierarchy(), EOAction.standardOkAndSaveActionForControllerHierarchy(), Constant Field Values
     */
    public static final int ModalActionsCategoryPriority=500;

    /**
     * The priority of the actions to navigate around in the user interface
     * See Also:EOWindowController.defaultActions(), Constant Field Values
     */
    public static final int NavigationActionPriority=100;

    /**
     * The priority of the Navigation actions category.
     * See Also:EOWindowController.defaultActions(), Constant Field Values
     */
    public static final int NavigationActionsCategoryPriority=310;

    /**
     * The priority of actions that create multiple windows.
     * See Also:Constant Field Values
     */
    public static final int NewMultipleWindowActionPriority=100;

    /**
     * The priority of actions that create single windows.
     * See Also:Constant Field Values
     */
    public static final int NewSingleWindowActionPriority=300;

    /**
     * The priority of the actions sent to business objects.
     * See Also:Constant Field Values
     */
    public static final int ObjectActionPriority=100;

    /**
     * The priority of the Object actions category.
     * See Also:Constant Field Values
     */
    public static final int ObjectActionsCategoryPriority=300;

    /**
     * The priority of the Okay action.
     * See Also:EOAction.standardOkActionForControllerHierarchy(), EOAction.standardOkAndSaveActionForControllerHierarchy(), Constant Field Values
     */
    public static final int OkayActionPriority=120;

    /**
     * The priority of the Open action.
     * See Also:EOAction.standardOpenWithTaskActionForControllerHierarchy(), Constant Field Values
     */
    public static final int OpenActionPriority=110;

    /**
     * The priority of the pasteboard Copy action.
     * See Also:EOAction.standardEditActionsForFocusComponent(), Constant Field Values
     */
    public static final int PasteboardCopyActionPriority=310;

    /**
     * The priority of the pasteboard Cut action.
     * See Also:EOAction.standardEditActionsForFocusComponent(), Constant Field Values
     */
    public static final int PasteboardCutActionPriority=300;

    /**
     * The priority of the pasteboard Delete action.
     * See Also:EOAction.standardEditActionsForFocusComponent(), Constant Field Values
     */
    public static final int PasteboardDeleteActionPriority=330;

    /**
     * The priority of the pasteboard Paste action.
     * See Also:EOAction.standardEditActionsForFocusComponent(), Constant Field Values
     */
    public static final int PasteboardPasteActionPriority=320;

    /**
     * The priority of the pasteboard Select All action.
     * See Also:EOAction.standardEditActionsForFocusComponent(), Constant Field Values
     */
    public static final int PasteboardSelectAllActionPriority=340;

    /**
     * The priority of the Quit action.
     * See Also:EOAction.standardQuitActionForApplication(), Constant Field Values
     */
    public static final int QuitActionPriority=500;

    /**
     * The priority of the Redo action.
     * See Also:EOAction.standardRedoActionForControllerHierarchy(), Constant Field Values
     */
    public static final int RedoActionPriority=110;

    /**
     * The priority of the Refresh action.
     * See Also:EOAction.standardRefreshActionForApplication(), Constant Field Values
     */
    public static final int RefreshActionPriority=340;

    /**
     * The priority of the Revert action.
     * See Also:EOAction.standardRevertActionForControllerHierarchy(), Constant Field Values
     */
    public static final int RevertActionPriority=330;

    /**
     * The priority of the Save action.
     * See Also:EOAction.standardSaveActionForControllerHierarchy(), Constant Field Values
     */
    public static final int SaveActionPriority=300;

    /**
     * The priority of the Save All action.
     * See Also:EOAction.standardSaveAllActionForApplication(), Constant Field Values
     */
    public static final int SaveAllActionPriority=320;

    /**
     * The priority of the Save As action.
     * See Also:EOAction.standardSaveAsActionForControllerHierarchy(), Constant Field Values
     */
    public static final int SaveAsActionPriority=310;

    /**
     * The priority of the Search action.
     * See Also:Constant Field Values
     */
    public static final int SearchActionPriority=130;

    /**
     * The priority of the Tools category.
     * See Also:Constant Field Values
     */
    public static final int ToolsCategoryPriority=120;

    /**
     * The priority of the Undo action.
     * See Also:EOAction.standardUndoActionForControllerHierarchy(), Constant Field Values
     */
    public static final int UndoActionPriority=100;

    /**
     * The priority of the Windows category.
     * See Also:EOAction.standardCloseWindowActionForControllerHierarchy(), Constant Field Values
     */
    public static final int WindowCategoryPriority=130;

    /**
     * Constructs a new EOAction as specified by the arguments.
     * Parameters:actionName - the name of the action methoddescriptionPath - the description path of the actionshortDescription - the short description of the actionicon - the icon of the actionsmallIcon - the small icon of the actionmenuAccelerator - the menu accelerator of the actioncategoryPriority - the category priority of the actionactionPriority - the action priority of the actionSee Also:EOAction.actionName(), EOAction.descriptionPath(), EOAction.shortDescription(), EOAction.icon(), EOAction.smallIcon(), EOAction.menuAccelerator(), EOAction.categoryPriority(), EOAction.actionPriority()
     */
    public EOAction(java.lang.String actionName, java.lang.String descriptionPath, java.lang.String shortDescription, javax.swing.Icon icon, javax.swing.Icon smallIcon, javax.swing.KeyStroke menuAccelerator, int categoryPriority, int actionPriority){
         //TODO codavaj!!
    }

    /**
     * Returns whether or not an action can trigger, which depends on the state of controllers in the controller hierarchy. For example, a Save action for an unedited document can usually not trigger.
     */
    public boolean actionCanBePerformedInContextOfController(com.webobjects.eoapplication.EOController controller){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a new action (an EOAction object) as specified by the arguments. When this action triggers, it is dispatched to the subcontrollers of the controller that displays it. If sendsActionToAllControllers is true, the action is dispatched to all subcontrollers of the controller that displays the action. Otherwise, the action is dispatched only to the first subcontroller that responds to it.
     */
    public static com.webobjects.eoapplication.EOAction actionForControllerHierarchy(java.lang.String actionName, java.lang.String descriptionPath, java.lang.String shortDescription, javax.swing.Icon icon, javax.swing.Icon smallIcon, javax.swing.KeyStroke menuAccelerator, int categoryPriority, int actionPriority, boolean sendsActionToAllControllers){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new action (an EOAction object) as specified by the arguments. When this action triggers, it is dispatched to the active widget (for example, the text field containing the cursor). The enabledKeyOnFocusComponent specifies the name of the field or method, resolved by key-value coding, specifying whether the action is enabled for the focus component (for example, "editable" for the action "cut").
     */
    public static com.webobjects.eoapplication.EOAction actionForFocusComponent(java.lang.String actionName, java.lang.String descriptionPath, java.lang.String shortDescription, javax.swing.Icon icon, javax.swing.Icon smallIcon, javax.swing.KeyStroke menuAccelerator, int categoryPriority, int actionPriority, java.lang.String enabledKeyOnFocusComponent){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new action (an EOAction object) as specified by the arguments. When this action triggers, it is dispatched directly to the one object specified when invoking this method. To create an action that gets dispatched to the application object, set object to EOApplication.sharedApplication().
     */
    public static com.webobjects.eoapplication.EOAction actionForObject(java.lang.String actionName, java.lang.String descriptionPath, java.lang.String shortDescription, javax.swing.Icon icon, javax.swing.Icon smallIcon, javax.swing.KeyStroke menuAccelerator, int categoryPriority, int actionPriority, java.lang.Object object){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new action (an EOAction object) as specified by the arguments. When this action triggers, it is dispatched to the supercontrollers of the controller that displays it. If sendsActionToAllControllers is true, the action is dispatched to all supercontrollers of the controller that displays the action. Otherwise, the action is dispatched only to the first supercontroller that responds to it.
     */
    public static com.webobjects.eoapplication.EOAction actionForSupercontrollers(java.lang.String actionName, java.lang.String descriptionPath, java.lang.String shortDescription, javax.swing.Icon icon, javax.swing.Icon smallIcon, javax.swing.KeyStroke menuAccelerator, int categoryPriority, int actionPriority, boolean sendsActionToAllControllers){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the method that executes when the receiver triggers.
     */
    public java.lang.String actionName(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is called when an action is triggered, that is, the user presses the action's button or selects its menu item. This method must be overridden by subclasses.
     */
    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's action priority, which determines the order in which its button or menu item appears within a category.
     */
    public int actionPriority(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the receiver's title, the last component of the receiver's description path.
     */
    public java.lang.String actionTitle(){
        return null; //TODO codavaj!!
    }

    /**
     * See the method description for addPropertyChangeListener in Sun's documentation for javax.swing.AbstractAction.
     */
    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's category priority, which determines the order in which the group of buttons or menu items that contains the receiver appears.
     */
    public int categoryPriority(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the receiver's menu hierarchy path, for example Document/Quit.
     */
    public java.lang.String descriptionPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the separate components of the receiver's menu hierarchy path.
     */
    public com.webobjects.foundation.NSArray descriptionPathComponents(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether some object "is equal to" this one.
     */
    public boolean equals(java.lang.Object comparisionObject){
        return false; //TODO codavaj!!
    }

    /**
     * See the method description for firePropertyChange in Sun's documentation for javax.swing.AbstractAction.
     */
    protected void firePropertyChange(java.lang.String propertyName, java.lang.Object oldValue, java.lang.Object newValue){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's icon.
     */
    public javax.swing.Icon icon(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a KeyStroke given the numerical key code keyCode with the appropriate modifier for the client operating system (usually CTRL_MASK). See Sun's javax.swing.KeyStroke documentation for more information.
     */
    public static javax.swing.KeyStroke keyStrokeWithKeyCode(int keyCode){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a KeyStroke given the numerical key code keyCode and the modifier mask modifiers. This method adds the appropriate modifier for the client operating system (usually CTRL_MASK). See Sun's javax.swing.KeyStroke documentation for more information.
     */
    public static javax.swing.KeyStroke keyStrokeWithKeyCodeAndModifiers(int keyCode, int modifiers){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a KeyStroke given the numerical key code keyCode with the SHIFT modifier. This method also adds the appropriate modifier for the client operating system (usually CTRL_MASK). See Sun's javax.swing.KeyStroke documentation for more information.
     */
    public static javax.swing.KeyStroke keyStrokeWithKeyCodeAndShiftModifier(int keyCode){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a KeyStroke for the String keyStrokeDescription. This method adds the appropriate modifier for the client operating system (usually CTRL_MASK). See Sun's javax.swing.KeyStroke documentation for more information.
     */
    public static javax.swing.KeyStroke keyStrokeWithString(java.lang.String keyStrokeDescription){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the KeyStroke the user can type to invoke the receiver instead of selecting it from the menu.
     */
    public javax.swing.KeyStroke menuAccelerator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing all of the actions in actionArray1 and actionArray2 with duplicate actions removed.
     */
    public static com.webobjects.foundation.NSArray mergedActions(com.webobjects.foundation.NSArray actions1, com.webobjects.foundation.NSArray actions2){
        return null; //TODO codavaj!!
    }

    /**
     * See the method description for removePropertyChangeListener in Sun's documentation for javax.swing.AbstractAction.
     */
    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener){
        return; //TODO codavaj!!
    }

    /**
     * Sets the name of the method that executes when the receiver triggers.
     */
    public void setActionName(java.lang.String actionName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's action priority, which determines the order in which its button or menu item appears within a category.
     */
    public void setActionPriority(int priority){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's category priority, which determines the order in which the group of buttons or menu items that contains the receiver appears.
     */
    public void setCategoryPriority(int priority){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's menu hierarchy path to descriptionPath, for example Document/Quit.
     */
    public void setDescriptionPath(java.lang.String descriptionPath){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's icon to icon.
     */
    public void setIcon(javax.swing.Icon icon){
        return; //TODO codavaj!!
    }

    /**
     * Sets the KeyStroke the user can type to invoke the receiver instead of selecting it from a menu.
     */
    public void setMenuAccelerator(javax.swing.KeyStroke menuAccelerator){
        return; //TODO codavaj!!
    }

    /**
     * Sets the action's short description to string. The short description appears in buttons and pop-up menu items. If shortDescription is null, the receiver's title is displayed instead.
     */
    public void setShortDescription(java.lang.String string){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's small icon used for some small buttons in the user interface.
     */
    public void setSmallIcon(javax.swing.Icon icon){
        return; //TODO codavaj!!
    }

    public void setToolTip(java.lang.String toolTip){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's short description, which is displayed in buttons and pop-up menu items. If the short description is set to null or has not been assigned, shortDescription returns the action's title.
     */
    public java.lang.String shortDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's small icon used for some small buttons in the user interface. By default, the small icon is not displayed for such buttons; the short description is displayed instead.
     */
    public javax.swing.Icon smallIcon(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a sorted NSArray containing the specified actions. The actions are sorted first on the category priority, then on the action priority, and finally on the description path.
     */
    public static com.webobjects.foundation.NSArray sortedActions(com.webobjects.foundation.NSArray actions){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action as specified by the arguments. When the action triggers, it is dispatched to the focus component (for example, the active text field) The action's category priority is EOAction.EditCategoryPriority, so the action is grouped with the other edit actions.
     */
    public static com.webobjects.eoapplication.EOAction standardActionForFocusComponent(java.lang.String actionName, javax.swing.KeyStroke menuAccelerator, int actionPriority, java.lang.String enabledKeyOnFocusComponent){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the activatePreviousWindow method, which is dispatched directly to the window observer object of the application.
     */
    public static com.webobjects.eoapplication.EOAction standardActivatePreviousWindowActionForWindowObserver(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the add method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardAddActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the append method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardAppendActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the bringAllWindowsToFront method, which is dispatched directly to the window observer object of the application.
     */
    public static com.webobjects.eoapplication.EOAction standardBringAllWindowsToFrontActionForWindowObserver(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the cancel method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardCancelActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the clear method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardClearActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the closeWindow method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardCloseWindowActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the delete method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardDeleteActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the deselect method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardDeselectActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an action with the method name actionName, menu accelerator menuAccelerator, and action priority actionPriority. When the action triggers, it is dispatched directly to the EOApplication object at the top of the controller hierarchy. The action's category priority is EOAction.DocumentCategoryPriority, so the action is grouped with the other document actions.
     */
    public static com.webobjects.eoapplication.EOAction standardDocumentActionForApplication(java.lang.String actionName, javax.swing.KeyStroke menuAccelerator, int actionPriority){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an action as specified by the arguments. When the action triggers, it is dispatched to the subcontrollers of the controller that displays it. The action's category priority is EOAction.DocumentCategoryPriority, so the action is grouped with the other document actions.
     */
    public static com.webobjects.eoapplication.EOAction standardDocumentActionForControllerHierarchy(java.lang.String actionName, javax.swing.KeyStroke menuAccelerator, int actionPriority){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an action as specified by the arguments. The baseTitle parameter is the name of the action as it appears in the user interface and is used for both the short description and the action title. When the action triggers, it is dispatched to the subcontrollers of the controller that displays it. The action's category priority is EOAction.DocumentCategoryPriority, so the action is grouped with the other document actions.
     */
    public static com.webobjects.eoapplication.EOAction standardDocumentActionForControllerHierarchy(java.lang.String actionName, java.lang.String baseTitle, javax.swing.KeyStroke menuAccelerator, int actionPriority){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an action as specified by the arguments. When the action triggers, it is dispatched to the subcontrollers of the controller that displays it. The action's category priority is EOAction.EditCategoryPriority, so the action is grouped with the other edit actions.
     */
    public static com.webobjects.eoapplication.EOAction standardEditActionForControllerHierarchy(java.lang.String actionName, javax.swing.KeyStroke menuAccelerator, int actionPriority){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing shared actions for the cut, copy, paste and selectAll actions. When these actions trigger, they are dispatched to the focus component.
     */
    public static com.webobjects.foundation.NSArray standardEditActionsForFocusComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the find method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardFindActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the insert method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardInsertActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the insertWithTask method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardInsertWithTaskActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the minimizeActiveWindow method, which is dispatched directly to the window observer object of the application.
     */
    public static com.webobjects.eoapplication.EOAction standardMinimizeActiveWindowActionForWindowObserver(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the ok method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardOkActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the ok method, displayed as a Save action, which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardOkAndSaveActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the openWithTask method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardOpenWithTaskActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the quit method, which is dispatched directly to the EOApplication object at the top of the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardQuitActionForApplication(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the redo method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardRedoActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the collectChangesFromServer method, displayed as a Refresh action, which is dispatched directly to the EOApplication object at the top of the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardRefreshActionForApplication(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the remove method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardRemoveActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the revert method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardRevertActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the save method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardSaveActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the saveAll method, which is dispatched directly to the EOApplication object at the top of the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardSaveAllActionForApplication(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the saveAs method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardSaveAsActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the select method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardSelectActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a shared action (an EOAction object) for the undo method which is dispatched in the controller hierarchy.
     */
    public static com.webobjects.eoapplication.EOAction standardUndoActionForControllerHierarchy(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toolTip(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a string that states the receiver's method name, description path, category priority, and action priority.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * The EOAction.Enabling interface defines a method, canPerformActionNamed, which allows an action receiver to specify if an action (sent by an EOAction object) is enabled for the receiver.
     */
    public static interface Enabling{
        /**
         * Returns true if the receiver can perform the action method (sent by an EOAction object) named actionName, false otherwise. An EOController's implementation of this method generally returns false if the receiver doesn't have an action named actionName or if the actionName action is explicitly disabled.
         */
        abstract boolean canPerformActionNamed(java.lang.String actionName);

    }
    /**
     * If an EOAction object implements the EOAction.ActiveWindowDependentAction interface, it is given the opportunity to update its settings (like the menu accelerator) when the user switches the active window.
     */
    public static interface ActiveWindowDependentAction{
        /**
         * Allows the EOAction to update its settings in the context of the specified controller (which is the controller of the currently active window).
         */
        abstract void updateInContextOfActiveWindowController(com.webobjects.eoapplication.EOController controller);

    }
}
