package com.webobjects.directtoweb;
/**
 * The D2WPlainListPage class provides the behavior for the plain-list page Direct to Web templates, specifically BASPlainListPage, NEUPlainListPage, and WOLPlainListPage. The classes for these components inherit directly from D2WPlainListPage and define no additional methods or variables.
 * Most of the methods in this class are accessed, via the EOKeyValueCoding interface defined in the EOControl framework, from the bindings (.wod) file of the Direct to Web template. If you create a Direct to Web template from a plain-list page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
public class D2WPlainListPage extends com.webobjects.directtoweb.D2WListPage{
    /**
     * Creates an instance of D2WPlainListPage with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:D2WListPage.D2WListPage(WOContext)
     */
    public D2WPlainListPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Contributes to the template method that corresponds to the method sortKeyList.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String componentsForSortKeyList(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the local context to the specified D2WContext.
     * The current implementation sets the number of objects per batch of the display group.
     * The implementation is subject to change in future releases.
     */
    public void setLocalContext(com.webobjects.directtoweb.D2WContext newValue){
        return; //TODO codavaj!!
    }

    /**
     * Gets the list of property keys that can be used to sort the displayed objects of the receiver.
     */
    public com.webobjects.foundation.NSArray sortKeyList(){
        return null; //TODO codavaj!!
    }

}
