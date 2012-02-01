package com.webobjects.webservices.generation;
/**
 * This component is used to dynamically generate WSDL based on D2WContext information for an operation. The portions of the WSDL specific to the operationName defined in this template's D2WContext are added to the WSDL generated for the service the operation is part of.
 * See Also:Serialized Form
 */
public class WOOperationWSDLTemplate extends com.webobjects.appserver.WOComponent{
    public WOOperationWSDLTemplate(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Returns the template's D2WContext.
     */
    public com.webobjects.directtoweb.D2WContext d2wContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the operation's input part names.
     */
    public com.webobjects.foundation.NSArray inputPartNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the local part of the operation input message name.
     */
    public java.lang.String operationInputName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the operation name.
     */
    public java.lang.String operationName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the local part of the operation output message name.
     */
    public java.lang.String operationOutputName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the content that will be added the WSDL types element of the service this operation is grouped in.
     */
    public java.lang.String operationTypesSchema(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the additional namespace attributes that will be added the WSDL defenition element of the service this operation is grouped in.
     */
    public java.lang.String otherNamespaces(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the WSDL parameterOrder attribute for the operation definition. This is a space delimited array of string input part names.
     */
    public java.lang.String parameterOrder(){
        return null; //TODO codavaj!!
    }

    /**
     * Accessor for partName.
     */
    public java.lang.String partName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the type attribute for the input part identified by the name of the current argument name reflected in partName().
     */
    public java.lang.String partType(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the location URL of the soap:address element of the WSDL generated for the service this operation is grouped in. This is only used when freezing WSDL for an operation.
     */
    public java.lang.String serviceLocationURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the template's D2WContext.
     */
    public void setD2wContext(com.webobjects.directtoweb.D2WContext context){
        return; //TODO codavaj!!
    }

    /**
     * Sets the input part names.
     */
    public void setInputPartNames(com.webobjects.foundation.NSArray names){
        return; //TODO codavaj!!
    }

    /**
     * Sets the operation name.
     */
    public void setOperationName(java.lang.String newOperationName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the content that will be added the WSDL types element of the service this operation is grouped in.
     */
    public void setOperationTypesSchema(java.lang.String newOperationTypesSchema){
        return; //TODO codavaj!!
    }

    /**
     * Sets the additional namespace attributes that will be added the WSDL defenition element of the service this operation is grouped in.
     */
    public void setOtherNamespaces(java.lang.String newOtherNamespaces){
        return; //TODO codavaj!!
    }

    /**
     * Accessor for partName.
     */
    public void setPartName(java.lang.String newPartName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the location URL of the soap:address element of the WSDL generated for the service this operation is grouped in. This is only used when freezing WSDL for an operation.
     */
    public void setServiceLocationURL(java.lang.String newServiceLocationURL){
        return; //TODO codavaj!!
    }

    /**
     * Sets the target namespace string for this operation's definitions.
     */
    public void setTargetNamespace(java.lang.String newTargetNamespace){
        return; //TODO codavaj!!
    }

    /**
     * Returns the target namespace string for this operation's definitions.
     */
    public java.lang.String targetNamespace(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the operation input message name.
     */
    public java.lang.String tnsOperationInputName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the operation output message name.
     */
    public java.lang.String tnsOperationOutputName(){
        return null; //TODO codavaj!!
    }

}
