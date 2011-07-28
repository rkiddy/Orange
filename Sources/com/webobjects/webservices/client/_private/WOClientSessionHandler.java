
package com.webobjects.webservices.client._private;

import com.webobjects.foundation.NSLog;
import javax.xml.namespace.QName;
import org.apache.axis.*;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;

public class WOClientSessionHandler extends BasicHandler {


    public WOClientSessionHandler() { return null; }

    public void invoke(MessageContext context) throws AxisFault {}

    public void doClient(MessageContext context) throws AxisFault {}

    public void onFault(MessageContext msgContext) {}

    static  {}

    private static final long serialVersionUID = 0x7a3c35d4L;
    public static final QName sessionHeaderQName;
    public static final QName instanceHeaderQName;

}
