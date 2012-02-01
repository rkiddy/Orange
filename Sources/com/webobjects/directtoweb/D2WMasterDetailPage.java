package com.webobjects.directtoweb;
/**
 * The D2WMasterDetailPage class provides the behavior for the master-detail page Direct to Web templates, specifically BASMasterDetailPage, NEUMasterDetailPage, and WOLMasterDetailPage. The classes for these pages inherit directly from D2WMasterDetailPage and define no additional methods or variables.
 * Most methods are accessed, via the EOKeyValueCoding interface defined in the EOControl framework, from the bindings (.wod) file of the Direct to Web template. If you create a Direct to Web template from a master-detail page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
public class D2WMasterDetailPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.ListPageInterface{
    public com.webobjects.eocontrol.EOEnterpriseObject selectedObject;

    /**
     * Constructs a D2WMasterDetailPage with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WMasterDetailPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use listReturnAction instead.
     */
    public com.webobjects.appserver.WOComponent backAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the user has selected an object in the select component of the master-detail page. When this condition is true, the edit component appears in the lower half of the master-detail page.
     */
    public boolean isObjectSelected(){
        return false; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Return in the master-detail page. Override nextPage to specify the component this action displays. You can also specify custom behavior for this action by overriding nextPageDelegate; in this case, nextPage is ignored.
     */
    public com.webobjects.appserver.WOComponent listReturnAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the next page delegate for the edit component on the master-detail page. Direct to Web invokes the nextPage method on this object when the user clicks Cancel in the edit component.
     */
    public com.webobjects.directtoweb.NextPageDelegate masterDetailPageDelegate(){
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
     * Returns the next page delegate, an object implementing the NextPageDelegate interface, for the select component on the master-detail page. Direct to Web invokes the nextPage method on this object when the user selects the record to edit.
     */
    public com.webobjects.directtoweb.NextPageDelegate selectPageDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setEditPageDelegate(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setSelectPageDelegate(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

}
