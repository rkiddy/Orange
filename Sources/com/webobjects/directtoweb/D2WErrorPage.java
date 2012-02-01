package com.webobjects.directtoweb;
/**
 * The D2WErrorPage class provides behavior for the error page Direct to Web templates, specifically BASErrorPage, NEUErrorPage, and WOLErrorPage. The classes for these pages inherit directly from D2WErrorPage and define no additional methods or variables. Most methods are accessed, via the EOKeyValueCoding interface defined in EOControl, from the bindings (.wod) file of the Direct to Web template. If you create a Direct to Web template from an error page, you can invoke the methods in this class in the same way.
 * See Also:Serialized Form
 */
public class D2WErrorPage extends com.webobjects.directtoweb.D2WPage implements com.webobjects.directtoweb.ErrorPageInterface, com.webobjects.directtoweb.generation.DTWGeneration{
    /**
     * Constructs a D2WErrorPage with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WErrorPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Return. Override nextPage to specify the component this action displays. Or, override nextPageDelegate, in which case nextPage is ignored.
     */
    public com.webobjects.appserver.WOComponent cancelAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing a truncated version of the error message that fits on a single line.
     */
    public java.lang.String firstLineOfMessage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing a version of the error message with line breaks added so that it fits on the page.
     */
    public java.lang.String formattedMessage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether nextPage or nextPageDelegate has been set. If so, the error page can go to another page when the user clicks Return. Otherwise, the error page displays a hyperlink that starts a new session.
     */
    public boolean hasNextPage(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the message displayed by the error page.
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
     * Description copied from interface:
     * Sets the message displayed by the error page.
     */
    public void setMessage(java.lang.String newValue){
        return; //TODO codavaj!!
    }

}
