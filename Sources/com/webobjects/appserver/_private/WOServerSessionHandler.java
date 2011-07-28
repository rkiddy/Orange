
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSLog;
import javax.xml.namespace.QName;
import org.apache.axis.*;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;


public class WOServerSessionHandler extends BasicHandler {


    public WOServerSessionHandler() { return null; }

    public void invoke(MessageContext context) throws AxisFault {}

    public void doServer(MessageContext context) throws AxisFault {}

    public void onFault(MessageContext msgContext) {}

    static  {}

    private static final long serialVersionUID = 0xdec97f7eL;
    public static final QName sessionHeaderQName;
    public static final QName instanceHeaderQName;

}
