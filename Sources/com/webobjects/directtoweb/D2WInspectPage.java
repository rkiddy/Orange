package com.webobjects.directtoweb;
/**
 * The D2WInspectPage class provides behavior for the inspect page and edit page Direct to Web templates, specifically BASInspectPage, NEUInspectPage, and WOLInspectPage. The classes for these pages inherit directly from D2WInspectPage and define no additional methods or variables. Most methods are accessed, via the EOKeyValueCoding interface defined in the EOControl framework, from the Direct to Web template bindings (.wod) file. If you create a Direct to Web template from an error page, you can invoke the methods in this class in the same way. See the "Direct to Web" chapter of WebObjects Tools and Techniques for more information about creating a Direct to Web template.
 * See Also:Serialized Form
 */
public class D2WInspectPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.generation.DTWGeneration, com.webobjects.directtoweb.InspectPageInterface, com.webobjects.directtoweb.EditPageInterface{
    /**
     * Contains an error message displayed on the inspect page.
     */
    public java.lang.String errorMessage;

    /**
     * Constructs a D2WInspectPage with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WInspectPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void awake(){
        return; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Cancel. It discards the edits on the page. You can specify the component this displays by overriding nextPage. You can also specify custom behavior for this action by overriding nextPageDelegate; in this case, nextPage is ignored.
     */
    public com.webobjects.appserver.WOComponent cancelAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Delete. Dletes the object that the page is inspecting or editing. Override nextPage to specify the component this action displays. You can also specify custom behavior for this action by overriding nextPageDelegate; in this case, nextPage is ignored.
     */
    public com.webobjects.appserver.WOComponent deleteAction() throws java.lang.Throwable{
        return null; //TODO codavaj!!
    }

    /**
     * This action method executes when the user clicks Edit in an inspect page. It creates an edit page for the inspected object.
     */
    public com.webobjects.appserver.WOComponent editAction(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String implementedInterface(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Return in an inspect page. Override this method to specify the component this action displays. You can also specify custom behavior for this action by overriding nextPageDelegate instead.
     */
    public com.webobjects.appserver.WOComponent nextPage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Object displayed by the inspect or edit page.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject object(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setEditingContext(com.webobjects.eocontrol.EOEditingContext newEditingContext){
        return; //TODO codavaj!!
    }

    /**
     * Sets the object displayed by the inspect or edit page.
     */
    public void setObject(com.webobjects.eocontrol.EOEnterpriseObject eo){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void sleep(){
        return; //TODO codavaj!!
    }

    /**
     * This action method executes when the user clicks Save on the edit page. It saves the edits to the database.
     */
    public com.webobjects.appserver.WOComponent submitAction() throws java.lang.Throwable{
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void validationFailedWithException(java.lang.Throwable theException, java.lang.Object theValue, java.lang.String theKeyPath){
        return; //TODO codavaj!!
    }

}
