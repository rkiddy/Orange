package com.webobjects.webservices.client;
/**
 * A WOClientParameter represents a parameter to a SOAP HTTP Web service invocation as defined in the WSDL document used to create the associated WOWebServiceClient.
 * See Also:QName, ParameterMode
 */
public class WOClientParameter{
    public boolean equals(java.lang.Object anObject){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the name of the parameter.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the ParameterMode for this parameter. This indicates whether the parameter is an in, inout, or out parameter.
     */
    public javax.xml.rpc.ParameterMode parameterMode(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a QName object indicating the type for this parameter.
     */
    public java.lang.Object typeQName(){
        return null; //TODO codavaj!!
    }

}
