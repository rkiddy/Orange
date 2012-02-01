package com.webobjects.webservices.support;
/**
 * The WOSecurityDelegate interface defines methods that can be used to process incoming and outgoing responses and requests. Delegates are not required to implement all methods in the interface, nor must they use the implements keyword to specify that they implement the WOSecurityDelegate interface. Instead, they should declare and implement the necessary subset of these methods, and use the setSecurityDelegate method to assign the object as the security delegate. See the WS-Security specification, which describes a proposed standard in the Web service security space.
 * See Also:WOWebServiceRegistrar.setSecurityDelegate, WOWebServiceClient.setSecurityDelegate
 */
public interface WOSecurityDelegate{
    /**
     * String name of the client side request undo delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String ONFAULTCLIENTREQUEST="onFaultClientRequest";

    /**
     * String name of the client side response undo delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String ONFAULTCLIENTRESPONSE="onFaultClientResponse";

    /**
     * String name of the server side request undo delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String ONFAULTSERVERREQUEST="onFaultServerRequest";

    /**
     * String name of the server side response undo delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String ONFAULTSERVERRESPONSE="onFaultServerResponse";

    /**
     * String name of the client side request delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String PROCESSCLIENTREQUEST="processClientRequest";

    /**
     * String name of the client side response delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String PROCESSCLIENTRESPONSE="processClientResponse";

    /**
     * String name of the server side request delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String PROCESSSERVERREQUEST="processServerRequest";

    /**
     * String name of the server side response delegate method
     * See Also:Constant Field Values
     */
    static final java.lang.String PROCESSSERVERRESPONSE="processServerResponse";

    /**
     * Called during processing of an Axis fault on the client side as a request is being sent to a server. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void onFaultClientRequest(org.apache.axis.MessageContext mc);

    /**
     * Called during processing of an Axis fault on the client as the response is being returned by the Axis stack. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void onFaultClientResponse(org.apache.axis.MessageContext mc);

    /**
     * Called during processing of an Axis fault on the server as the request is being passed through Axis to the service method. A delegate might implement this method to check security header information to the outgoing response, or to remove information from the SOAP body of the response. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void onFaultServerRequest(org.apache.axis.MessageContext mc);

    /**
     * Called during processing of an Axis fault on the server as the response is being returned through the Axis stack from the service method. A delegate might implement this method to add security header information to the outgoing response, or to remove information from the SOAP body of the response. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void onFaultServerResponse(org.apache.axis.MessageContext mc);

    /**
     * Invoked during processing of a client side request as the request is sent out the Axis stack to a Web service. A delegate might implement this method to add security header information to the outgoing request. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void processClientRequest(org.apache.axis.MessageContext mc) throws org.apache.axis.AxisFault;

    /**
     * Called during processing of a client side response as the response returns to Axis from a request to a Web service. A delegate might implement this method to check security header information on the incoming response. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void processClientResponse(org.apache.axis.MessageContext mc) throws org.apache.axis.AxisFault;

    /**
     * Called during processing of a server side request as the request is being received by the Axis stack. A delegate might implement this method to check security header information on the incoming request. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void processServerRequest(org.apache.axis.MessageContext mc) throws org.apache.axis.AxisFault;

    /**
     * Called during processing of a server side response as the response is being returned by the Axis stack. A delegate might implement this method to add security header information to the outgoing response. See the WS-Security specification for details about security mechanisms and Web services.
     */
    abstract void processServerResponse(org.apache.axis.MessageContext mc) throws org.apache.axis.AxisFault;

}
