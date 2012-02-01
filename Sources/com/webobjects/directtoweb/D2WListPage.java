package com.webobjects.directtoweb;
/**
 * The D2WListPage class provides the behavior for the list page and select page Direct to Web templates, specifically BASListPage, NEUListPage, and WOLListPage. The classes for these components inherit directly from D2WListPage and define no additional methods or variables.
 * D2WPlainListPage also inherits from this class.
 * Most of the methods in this class are accessed, via the EOKeyValueCoding interface defined in the EOControl framework, from the bindings (.wod) file of the Direct to Web template. If you create a Direct to Web template from a list page or select page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
public class D2WListPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.generation.DTWGeneration, com.webobjects.directtoweb.ListPageInterface, com.webobjects.directtoweb.SelectPageInterface{
    /**
     * Creates an instance of D2WListPage with the specified context. Registers for "editingContextDidSaveChanges" notifications.
     * Parameters:aContext - instance of WOContextSee Also:D2WListPage.editingContextDidSaveChanges(NSNotification), D2WPage.D2WPage(WOContext), NSNotificationCenter
     */
    public D2WListPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Gets the alternating row background color. Is provided as a convenience for subclasses.
     * The current implementation returns "#FFFF00" if the task is "select" and the object is selected in the display group; the value of the method alternatingColorForRow otherwise.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String alternatingColorForRow(){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches on the display group if the editing context did save changes recently.
     */
    public void appendToResponse(com.webobjects.appserver.WOResponse r, com.webobjects.appserver.WOContext c){
        return; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks 'Return' in the list page. You can specify custom behavior for this action by overriding the method nextPage. You can also specify custom behavior for this action by overriding the method nextPageDelegate; in this case, the method nextPage is ignored.
     */
    public com.webobjects.appserver.WOComponent backAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the row background color. Is provided as a convenience for subclasses.
     * The current implementation return "#FFFF00" if the task is "select" and the object is selected in the display group; the value of the method alternatingColorForRow otherwise.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String backgroundColorForRow(){
        return null; //TODO codavaj!!
    }

    /**
     * Contributes to the template method that corresponds to the method backgroundColorForRow.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String backgroundColorForRowMethod(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the default sort key.
     * The current implementation takes the first attribute in the display property keys.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String defaultSortKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks the delete button next to an object on the list page. Creates and returns an inspect page for the object.
     */
    public com.webobjects.appserver.WOComponent deleteObjectAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the display group that contains the objects listed on the page.
     */
    public com.webobjects.appserver.WODisplayGroup displayGroup(){
        return null; //TODO codavaj!!
    }

    /**
     * Handles notifications when the editing context did save changes.
     */
    public void editingContextDidSaveChanges(com.webobjects.foundation.NSNotification notif){
        return; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks the edit button next to an object on the list page. Creates and returns an inspect page for the object.
     */
    public com.webobjects.appserver.WOComponent editObjectAction(){
        return null; //TODO codavaj!!
    }

    public void finalize() throws java.lang.Throwable{
        return; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks the inspect button next to an object on the list page. Creates and returns an inspect page for the object.
     */
    public com.webobjects.appserver.WOComponent inspectObjectAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether the entity displayed on this page can be modified.
     * The current implementation returns true if the value for the key "readOnly" in the D2WContext is D2WModel.One; false otherwise.
     * The implementation is subject to change in future releases.
     */
    public boolean isEntityReadOnly(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether the list displayed contains no objects.
     */
    public boolean isListEmpty(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether the page is a select page.
     * The current implementation returns true if the task in the D2WContext equals "select"; false otherwise.
     * The implementation is subject to change in future releases.
     */
    public boolean isSelecting(){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the total number of objects in the display group. This is not the number of objects shown on the page, which depends on the batch size of the display group.
     */
    public int listSize(){
        return 0; //TODO codavaj!!
    }

    /**
     * Gets the batch size of the display group.
     * The current implementation parses the value for the key "batchSize" in the D2WContext and returns the int if parsing succeeds; 10 otherwise.
     * The implementation is subject to change in future releases.
     */
    public int numberOfObjectsPerBatch(){
        return 0; //TODO codavaj!!
    }

    /**
     * Replaces the following bindings: isListEmpty, d2wContext.propertyKey, d2wContext.justification, d2wContext.displayNameForProperty, object, displayedObjects.
     * May also replace the bindings showCancel and selectObjectAction.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the selected object of the display group.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject selectedObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks 'Select' next to one of the objects on the select page. You can specify custom behavior for this action by overriding the method nextPageDelegate.
     */
    public com.webobjects.appserver.WOComponent selectObjectAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the row background color to the specified value.
     * The current implementation does nothing.
     * The implementation is subject to change in future releases.
     */
    public void setBackgroundColorForRow(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the data source to the specified data source. Also sets the data source of the display group and fetches.
     */
    public void setDataSource(com.webobjects.eocontrol.EODataSource dataSource){
        return; //TODO codavaj!!
    }

    /**
     * Sets the local context to the specified D2WContext.
     * The current implementation also supports sorting the first column of the List Page and affects the display of sort icons.
     * The implementation is subject to change in future releases.
     */
    public void setLocalContext(com.webobjects.directtoweb.D2WContext newValue){
        return; //TODO codavaj!!
    }

    /**
     * Selects the object in the display group if the specified object is not null; clears the selection of the display group otherwise.
     */
    public void setSelectedObject(com.webobjects.eocontrol.EOEnterpriseObject selectedObject){
        return; //TODO codavaj!!
    }

}
