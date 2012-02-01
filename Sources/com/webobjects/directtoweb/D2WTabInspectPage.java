package com.webobjects.directtoweb;
/**
 * The D2WTabInspectPage class provides the behavior for the tab-inspect page Direct to Web templates, specifically NEUTabInspectPage and WOLTabInspectPage. The classes for these components inherit directly from D2WTabInspectPage and define no additional methods or variables.
 * Most methods are accessed, via the EOKeyValueCoding interface in EOControl, from the bindings (.wod) file of the Direct to Web template. If you create a Direct to Web template from a tab-inspect page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
public class D2WTabInspectPage extends com.webobjects.directtoweb.D2WInspectPage{
    /**
     * Constructs a D2WTabInspectPage with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WTabInspectPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Returns a String containing the number of HTML table rows spanned by the vertical rule within the current tab panel.
     */
    public java.lang.String defaultRowspan(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the tab that is being displayed.
     */
    public java.lang.String displayedTabName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the current property in the Direct to Web context of the receiver is outside the tab panel and consequently in the header.
     */
    public boolean isPropertyInHeader(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the displayed tab to the one with the specified name.
     */
    public void setDisplayedTabName(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.foundation.NSDictionary tabContents(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean tabNameIsInHeader(java.lang.String tabName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the names of the tabs displayed in the tab inspect page. This key is resolved using the rule system.
     */
    public com.webobjects.foundation.NSArray tabs(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String tabsAsString(){
        return null; //TODO codavaj!!
    }

}
