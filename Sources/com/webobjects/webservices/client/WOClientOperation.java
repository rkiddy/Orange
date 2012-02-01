package com.webobjects.webservices.client;
/**
 * A WOClientOperation represents a single SOAP HTTP Web service operation as defined in the WSDL document used to create a WOWebServiceClient.
 */
public class WOClientOperation{
    /**
     * Returns the URL at which the service is being vended.
     */
    public java.net.URL endpoint(){
        return null; //TODO codavaj!!
    }

    /**
     * Return true if this is a document style operation (i
     * e
     * , style is "document").
     */
    public boolean isDocumentStyle(){
        return false; //TODO codavaj!!
    }

    /**
     * Return true if this is an RPC operation (i
     * e
     * , style is "RPC").
     */
    public boolean isRPCStyle(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the name of the operation.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSMutableArray containing WOClientParameters for the parameters taken by this operation. For an RPC operation, the WOClientParameters will be in the order in which the parameters are to be passed to invoke; for a document style operation, there should be only one in parameter.
     */
    public com.webobjects.foundation.NSMutableArray parameters(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSMutableArray of WOClientParameters representing the types returned by the operation. For an RPC operation, the WOClientParameters will be in the order in which the out parts are specified in the WSDL. If there are more than one out only parameters, only the first will be returned. For document style operations, there should be only one return type.
     */
    public com.webobjects.foundation.NSMutableArray returnTypes(){
        return null; //TODO codavaj!!
    }

    /**
     * Set the HTTP SoapAction header to be used when invoking the operation.
     */
    public void setSoapAction(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Set the operation style to aStyle. aStyle must be one of "RPC" or "document" (case insensitive).
     */
    public void setStyle(java.lang.String aStyle){
        return; //TODO codavaj!!
    }

    /**
     * Returns the soapAction HTTP header to be used when invoking the operation.
     */
    public java.lang.String soapAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string denoting the style of SOAP operation represented by the receiver. Will be either "RPC" or "document".
     */
    public java.lang.String style(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
