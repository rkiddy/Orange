
package com.webobjects.webservices.client;

import com.webobjects.foundation.NSMutableArray;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;


public class WOClientOperation {


    WOClientOperation(String n, String e) { return null; }

    public NSMutableArray returnTypes() { return null; }

    public String name() { return null; }

    public String soapAction() { return null; }

    public URL endpoint() { return null; }

    void setPortQName(QName aQName) { return null; }

    QName portQName() { return null; }

    public NSMutableArray parameters() { return null; }

    public String style() { return null; }

    public void setStyle(String aStyle) {}

    public void setSoapAction(String aString) {}

    public boolean isRPCStyle() { return true; }

    public boolean isDocumentStyle() { return true; }

    public String toString() { return null; }

    void addParameter(WOClientParameter param) { return null; }

    static  {}

    private static String RPCSTYLE;
    private static String DOCSTYLE;
    private String name;
    private String style;
    private String soapAction;
    private NSMutableArray parameters;
    private NSMutableArray returnTypes;
    private QName portQName;
    private URL endpoint;
    private boolean isRPC;

}
