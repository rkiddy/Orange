package com.webobjects.directtoweb;
/**
 * The D2WConfirmPage class provides the behavior for the confirm page Direct to Web templates, specifically BASConfirmPage, NEUConfirmPage, and WOLConfirmPage. The classes for these pages inherit directly from D2WConfirmPage and define no additional methods or variables.
 * Most of the methods in this class are accessed, via the EOKeyValueCoding interface defined in the EOControl framework) from the Direct to Web template's bindings (.wod) file. If you create a Direct to Web template from a confirm page, you can invoke the methods in this class in the same way. See the "Direct to Web" chapter of WebObjects Tools and Techniques for more information about creating a Direct to Web template.
 * See Also:Serialized Form
 */
public class D2WConfirmPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.generation.DTWGeneration, com.webobjects.directtoweb.ConfirmPageInterface{
    /**
     * Constructs a D2WConfirmPage with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WConfirmPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Cancel. If you need this method to execute custom code, use the cancel delegate.
     */
    public com.webobjects.appserver.WOComponent cancelAction() throws java.lang.Throwable{
        return null; //TODO codavaj!!
    }

    /**
     * Executes when the user clicks Confirm. To specify the confirm behavior, use the confirm delegate.
     */
    public com.webobjects.appserver.WOComponent confirmAction() throws java.lang.Throwable{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the message displayed by the confirm page.
     */
    public java.lang.String message(){
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
     * Sets the cancel delegate of the receiver. When the user clicks No in the confirm page, Direct to Web invokes the nextPage method on the cancel delegate.
     */
    public void setCancelDelegate(com.webobjects.directtoweb.NextPageDelegate nextPage){
        return; //TODO codavaj!!
    }

    /**
     * Sets the confirm delegate of the receiver. When the user clicks Yes in the confirm page, Direct to Web invokes the nextPage method on the confirm delegate.
     */
    public void setConfirmDelegate(com.webobjects.directtoweb.NextPageDelegate nextPage){
        return; //TODO codavaj!!
    }

    /**
     * Sets the message displayed by the confirm page.
     */
    public void setMessage(java.lang.String aMessage){
        return; //TODO codavaj!!
    }

}
