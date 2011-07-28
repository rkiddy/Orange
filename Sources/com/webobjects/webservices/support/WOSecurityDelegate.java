
package com.webobjects.webservices.support;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;

public interface WOSecurityDelegate {


    public abstract void processClientRequest(MessageContext messagecontext) throws AxisFault;

    public abstract void processClientResponse(MessageContext messagecontext) throws AxisFault;

    public abstract void processServerRequest(MessageContext messagecontext) throws AxisFault;

    public abstract void processServerResponse(MessageContext messagecontext) throws AxisFault;

    public abstract void onFaultClientRequest(MessageContext messagecontext);

    public abstract void onFaultClientResponse(MessageContext messagecontext);

    public abstract void onFaultServerRequest(MessageContext messagecontext);

    public abstract void onFaultServerResponse(MessageContext messagecontext);

    public static final String PROCESSCLIENTREQUEST = "processClientRequest";
    public static final String PROCESSCLIENTRESPONSE = "processClientResponse";
    public static final String PROCESSSERVERREQUEST = "processServerRequest";
    public static final String PROCESSSERVERRESPONSE = "processServerResponse";
    public static final String ONFAULTCLIENTREQUEST = "onFaultClientRequest";
    public static final String ONFAULTCLIENTRESPONSE = "onFaultClientResponse";
    public static final String ONFAULTSERVERREQUEST = "onFaultServerRequest";
    public static final String ONFAULTSERVERRESPONSE = "onFaultServerResponse";

}
