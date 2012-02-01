package com.webobjects.directtoweb;
/**
 * The D2WEditRelationshipPage class provides the behavior for the edit-relationship page Direct to Web templates: BASEditRelationshipPage, NEUEditRelationshipPage, and WOLEditRelationshipPage. The classes for these components inherit directly from D2WEditRelationshipPage and define no additional methods or variables.
 * Most methods are accessed, via the EOKeyValueCoding interface defined in the EOControl framework, from the Direct to Web template's bindings (.wod) file. If you create a Direct to Web template from an edit-relationship page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
public class D2WEditRelationshipPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.EditRelationshipPageInterface, com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * The iteration variable bound to the item attribute of the WOBrowser on the edit-relationship page.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject browserItem;

    /**
     * Contains the selections the user chooses with the WOBrowser on the edit-relationship page.
     */
    public com.webobjects.foundation.NSArray browserSelections;

    /**
     * Returns true if the relationship is a to-many relationship or false if the relationship is a to-one relationship.
     */
    public boolean isRelationshipToMany;

    /**
     * This constant is intentionally undocumented.
     * See Also:Constant Field Values
     */
    public static final int LIST=1;

    /**
     * This constant is intentionally undocumented.
     * See Also:Constant Field Values
     */
    public static final int NEW=2;

    /**
     * This constant is intentionally undocumented.
     * See Also:Constant Field Values
     */
    public static final int QUERY=0;

    /**
     * Contains the display group with the relationship destination objects.
     */
    public com.webobjects.appserver.WODisplayGroup relationshipDisplayGroup;

    /**
     * Contains the data source that holds the possible destination objects for the relationship.
     */
    public com.webobjects.eocontrol.EODataSource selectDataSource;

    /**
     * Constructs a D2WEditRelationshipPage with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WEditRelationshipPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void awake(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a String containing a user-presentable name corresponding to the browserItem variable of the receiver. This string appears in the WOBrowser of the edit-relationship page.
     */
    public java.lang.String browserStringForItem(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String displayKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not the select component appears in the lower half of the edit-relationship page. Recall that the select component is actually a list component.
     */
    public boolean displayList(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a String containing a user-presentable name for the relationship edited by the receiver. The method derives the result by capitalizing the first character of the key for the relationship.
     */
    public java.lang.String displayNameForRelationshipKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not the edit component appears in the lower half of the edit-relationship page. The edit component allows the user to enter properties for a new destination object for the relationship.
     */
    public boolean displayNew(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether or not the query component appears in the lower half of the edit-relationship page. The query component allows the user to query for destination objects to add to the relationship.
     */
    public boolean displayQuery(){
        return false; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Search. Returns an edit-relationship page with an embedded query component.
     */
    public com.webobjects.appserver.WOComponent displayQueryAction(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean editingContextShouldValidateChanges(com.webobjects.eocontrol.EOEditingContext editingContext){
        return false; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks New in the edit-relationship page. Returns an edit-relationship page with an embedded edit component.
     */
    public com.webobjects.appserver.WOComponent newObjectAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOEnterpriseObject, defined in the EOControl Framework, that is created when the user clicks New. The edit component of the edit-relationship page edits this object.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject newObjectInRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOEnterpriseObject, defined in the EOControl Framework, that is added to the relationship edited by the receiver. This is also the object the user selects in the select component.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject objectToAddToRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks the Search button in the query component of the edit-relationship page. Returns an edit-relationship page with a select component.
     */
    public com.webobjects.appserver.WOComponent queryAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Remove in an edit-relationship page for a to-many relationship.
     */
    public com.webobjects.appserver.WOComponent removeFromToManyRelationshipAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Remove in an edit-relationship page for a to-one relationship.
     */
    public com.webobjects.appserver.WOComponent removeFromToOneRelationshipAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Return. It saves the edited relationship to the database. Override nextPage to specify the component this action displays. You can also specify custom behavior for this action by overriding nextPageDelegate; in this case, nextPage is ignored.
     */
    public com.webobjects.appserver.WOComponent returnAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks the Save in the edit component of the edit-relationship page. The edit component appears in the page when the user creates a new destination object for the relationship.
     */
    public com.webobjects.appserver.WOComponent saveAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks the Select button next to an object in the select component. The select component appears in the edit-relationship page after the user performs a query.
     */
    public com.webobjects.appserver.WOComponent selectAction(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    protected void setEditingContext(com.webobjects.eocontrol.EOEditingContext newEditingContext){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setMasterObjectAndRelationshipKey(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String relationshipKey){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setNewObjectInRelationship(java.lang.Object arg){
        return; //TODO codavaj!!
    }

    /**
     * Sets the object that is added to the relationship. This is also the object that the user selects in the select component of the edit-relationship page.
     */
    public void setObjectToAddToRelationship(com.webobjects.eocontrol.EOEnterpriseObject newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void sleep(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a String representing the destination object of the relationship edited by the receiver if the relationship is a to-one relationship. Otherwise returns null.
     */
    public java.lang.String toOneDescription(){
        return null; //TODO codavaj!!
    }

}
