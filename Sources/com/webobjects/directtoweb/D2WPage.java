package com.webobjects.directtoweb;
/**
 * D2WPage is the parent class for the Direct to Web templates. It provides support for the next page mechanism, which determines the behavior when the user leaves the page. It also provides methods used by most or all of the Direct to Web templates, such as a data source, the page wrapper name, and a flag to indicate whether to show the cancel button or not. Most methods are accessed via the EOKeyValueCoding interface in the EOControl framework from the bindings (.wod) file of the Direct to Web templates. If you create your own Direct to Web template, you can invoke the methods in this class in the same way. See the "Direct to Web" chapter of WebObjects Tools and Techniques for more information about creating a Direct to Web template.
 * See Also:Serialized Form
 */
public class D2WPage extends com.webobjects.directtoweb.D2WComponent{
    /**
     * Constructs a new D2WPage with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public D2WPage(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public boolean alternateRowColor(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the EODataSource, defined in the EOControl Framework, containing the objects displayed on the page or the objects that match the query for the query page subclasses.
     */
    public com.webobjects.eocontrol.EODataSource dataSource(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public java.lang.String descriptionForResponse(com.webobjects.appserver.WOResponse r, com.webobjects.appserver.WOContext c){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.foundation.NSMutableDictionary extraBindings(){
        return null; //TODO codavaj!!
    }

    public void finalize() throws java.lang.Throwable{
        return; //TODO codavaj!!
    }

    /**
     * Returns the next page of the receiver, a WOComponent, or null, if no next page has been specified. Typically, this is invoked when the user leaves the page; the exact conditions under which it is invoked depends on the subclass of D2WPage that uses it. See the specification for the specific subclass for more information. You can override this method to customize the D2WPage behavior when the user leaves the page.
     */
    public com.webobjects.appserver.WOComponent nextPage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the next page delegate of the receiver, an object, or null, if no next page delegate has been specified. Typically, the nextPage method is invoked on the next page delegate, if it has been specified, when the user leaves the page; the exact conditions under which it is invoked depends on the subclass of D2WPage that uses it. See the specification for the specific subclass for more information. If you do not specify a next page delegate, Direct to Web displays the WOComponent returned by the nextPage method. You can override the nextPageDelegate method or use the setNextPageDelegate method to customize the D2WPage behavior when the user leaves the page.
     */
    public com.webobjects.directtoweb.NextPageDelegate nextPageDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the page wrapper component in which the receiver appears. This key is resolved using the rule system.
     */
    public java.lang.String pageWrapperName(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public com.webobjects.appserver.WOAssociation replacementAssociationForAssociation(com.webobjects.appserver.WOAssociation oldAssociation, java.lang.String oldBinding, com.webobjects.directtoweb.generation.DTWTemplate aTemplate, com.webobjects.appserver.WOContext aContext){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the EODataSource, defined in the EOControl Framework, containing the objects displayed on the page.
     */
    public void setDataSource(com.webobjects.eocontrol.EODataSource newValue){
        return; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void setExtraBindings(com.webobjects.foundation.NSMutableDictionary extraBindings){
        return; //TODO codavaj!!
    }

    /**
     * Sets the page that displays when the user clicks Return in the page.
     */
    public void setNextPage(com.webobjects.appserver.WOComponent nextPage){
        return; //TODO codavaj!!
    }

    /**
     * Sets the next page delegate of the receiver to the specified delegate. Typically, the nextPage method is invoked on the next page delegate, if it has been specified, when the user leaves the page; the exact conditions under which it is invoked depends on the subclass of D2WPage that uses it. See the specification for the specific subclass for more information.
     */
    public void setNextPageDelegate(com.webobjects.directtoweb.NextPageDelegate nextPageDelegate){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether or not the Cancel button is displayed on the page of the receiver.
     */
    public boolean showCancel(){
        return false; //TODO codavaj!!
    }

}
