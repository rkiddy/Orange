package com.webobjects.directtoweb;
/**
 * The D2WComponent class is the parent class for the Direct to Web templates and the property-level components. The components access a Direct to Web context with the d2wContext method. The D2WComponent class also defines several keys that are used in the binding (.wod) files for the Direct to Web templates. In addition, D2WComponent defines an action method, showWebAssistant, that opens the Web Assistant in the user's Web browser.
 * See Also:Serialized Form
 */
public class D2WComponent extends com.webobjects.appserver.WOComponent implements com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * This constant is intentionally undocumented.
     * See Also:Constant Field Values
     */
    public static final java.lang.String currentObjectKey="currentObject";

    /**
     * Constructs a D2WComponent with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WComponent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String allEntities(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.Integer allowCollapsing(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public int applicationPort(){
        return 0; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public int assistantPort(){
        return 0; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.eoaccess.EOAttribute attribute(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the background color for the header rows of tables rendered by Direct to Web.
     */
    public java.lang.String backgroundColorForHeaderRow(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String backgroundColorForPage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the background color for tables rendered in this component. This key is resolved using the rule system.
     */
    public java.lang.String backgroundColorForTable(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String backgroundColorForTableDark(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String backgroundColorForTableLight(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String color(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String currentSettings(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the URL for the current page.
     */
    public java.lang.String currentUrl(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Direct to Web context of the receiver.
     */
    public com.webobjects.directtoweb.D2WContext d2wContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the number of visible entities in the Direct to Web context of the receiver incremented by one.
     */
    public java.lang.String d2wContextVisibleEntityNamesCountPlus1(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the number of HTML table rows spanned by the vertical rule in the page containing the Direct to Web context in which the rule of the receiver fires.
     * The query and inspect pages in the WebObjects look use this method.
     */
    public java.lang.String defaultRowspan(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the name of a property that represents the destination object of the current relationship in the Direct to Web context of the receiver. Returns null if the current property in the Direct to Web context of the component is not a relationship. The name is derived from the key for one of the properties of the destination entity that can be used to represent that entity. For example, the representative key for Studio could be name. This method determines the key using the rule system. To convert the key to a user-presentable name, the method capitalizes lowercase words and inserts spaces between words with mixed case (for example, "firstName" becomes "First Name").
     */
    public java.lang.String displayNameForKeyWhenRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing a user-presentable name for the current property in the Direct to Web context of the component. The method derives the name from the property key by capitalizing lowercase words and inserting spaces between words with mixed case (for example, "firstName" becomes "First Name").
     */
    public java.lang.String displayNameForProperty(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the keys (Strings) for all visible properties of the current entity in the components Direct to Web context. The method determines the result using the rule system.
     * You can hide a property or make it visible with the Web Assistant.
     */
    public com.webobjects.foundation.NSArray displayPropertyKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String dynamicPages(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the current entity in the Direct to Web context of the receiver. The EOEntity class is defined in the EOAccess Framework.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the name of the entity displayed by this component.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String formatter(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    protected java.lang.String generationReplacementFor(java.lang.String variableName){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String generationReplacementForCurrentObject(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean hasCustomKey(java.lang.String customKey){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the Direct to Web context of the receiver has an entity.
     */
    public boolean hasEntity(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean hasNoColor(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOComponent homeClicked(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the URL of the home page (the Main component) of the application.
     */
    public java.lang.String homeHref(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether the current entity in the Direct to Web context of the receiver can be modified or not. You can specify if an entity can be modified using the Web Assistant.
     */
    public boolean isEntityReadOnly(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isEntityReadOnly(com.webobjects.eoaccess.EOEntity e){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isLiveAssistantEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isNotBoldAsBoolean(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isNotItalicAsBoolean(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the property in the Direct to Web context of the receiver is an attribute (and not a relationship).
     */
    public boolean isPropertyAnAttribute(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isWebAssistantActive(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isWebAssistantConnected(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean isWebAssistantEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public static java.lang.String keyForGenerationReplacementForVariableNamed(java.lang.String variableName){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String keyWhenRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the URL for the last page.
     */
    public java.lang.String lastUrl(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String length(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is deprecated. Use d2wContext instead.
     */
    public com.webobjects.directtoweb.D2WContext localContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Logout in the menu bar. Terminates current session and returns the home page (Main) WOComponent.
     */
    public com.webobjects.appserver.WOComponent logout(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOEnterpriseObject, defined in the EOControl Framework, displayed by this component.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject object(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the current property for the object that the receiver displays. For example, if the current entity in the Direct to Web context of the component is "Movie" and the current property key is "title", this returns the title of the movie displayed in this component.
     */
    public java.lang.Object objectPropertyValue(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean objectPropertyValueIsNonNull(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String pageTitle(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.Object property(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key corresponding to the current property in the Direct to Web context of the receiver.
     */
    public java.lang.String propertyKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the name of the class for the values of the current attribute (for example, "NSString"). Returns null if the current property in the Direct to Web context of the component is not an attribute.
     */
    public java.lang.String propertyValueClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EORelationship, defined in the EOAccess Framework, for the current property in the Direct to Web context of the receiver, or null if the property is not a relationship.
     */
    public com.webobjects.eoaccess.EORelationship relationship(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String resourcePathURL(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String sessionID(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setCurrentSettings(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setDynamicPages(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setEntities(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setEntity(com.webobjects.eoaccess.EOEntity newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setEntityName(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the Direct to Web context for this component to newValue.
     */
    public void setLocalContext(com.webobjects.directtoweb.D2WContext newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the EOEnterpriseObject, defined in the EOControl Framework, that the receiver manipulates to the specified object.
     */
    public void setObject(com.webobjects.eocontrol.EOEnterpriseObject eo){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setPropertyKey(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setResourcePathURL(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setTask(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setTasks(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the banner should be shown in this component. If the component is an embedded component, the banner is not shown.
     */
    public boolean showBanner(){
        return false; //TODO codavaj!!
    }

    public com.webobjects.appserver.WOComponent showWebAssistant(){
        return null; //TODO codavaj!!
    }

    /**
     * The name of an action method that is called when the user clicks a submit button within the form. This action method is used in the tab panel components, NEUTabInspectPage and WOLTabInspectPage, to specify the submitActionName binding of the WOTabPanel.
     */
    public java.lang.String submitActionName(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String target(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the current task in the Direct to Web context of the receiver.
     */
    public java.lang.String task(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String tasks(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray of the names of entities visible in the application. You can choose which entities are visible using the Web Assistant.
     */
    public com.webobjects.foundation.NSArray visibleEntityNames(){
        return null; //TODO codavaj!!
    }

}
