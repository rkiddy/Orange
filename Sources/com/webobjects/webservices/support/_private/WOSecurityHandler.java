
package com.webobjects.webservices.support._private;

import com.webobjects.foundation.NSLog;
import com.webobjects.foundation._NSDelegate;
import com.webobjects.webservices.support.WOSecurityDelegate;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class WOSecurityHandler extends BasicHandler {


    public WOSecurityHandler() { return null; }

    public void setDelegate(Object aDelegate) {}

    public void invoke(MessageContext context) throws AxisFault {}

    public void doClient(MessageContext context) throws AxisFault {}

    public void doServer(MessageContext context) throws AxisFault {}

    public void onFault(MessageContext context) {}

    public void undoClient(MessageContext context) {}

    public void undoServer(MessageContext context) {}

    private static final long serialVersionUID = 0xa167e94eL;
    private _NSDelegate securityDelegate;

}
