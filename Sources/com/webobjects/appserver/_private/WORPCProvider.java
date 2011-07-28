
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import javax.xml.namespace.QName;
import javax.xml.soap.Name;
import org.apache.axis.Constants;
import org.apache.axis.MessageContext;
import org.apache.axis.constants.Style;
import org.apache.axis.description.*;
import org.apache.axis.handlers.soap.SOAPService;
import org.apache.axis.message.*;
import org.apache.axis.providers.java.JavaProvider;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;
import org.apache.axis.utils.Messages;

public class WORPCProvider extends JavaProvider {


    public WORPCProvider() { return null; }

    public void processMessage(MessageContext msgContext, SOAPEnvelope reqEnv, SOAPEnvelope resEnv, Object obj) throws Exception {}

    static  {}

    private static final long serialVersionUID = 1L;
    protected static Class D2WSClass;
    protected static Method D2WSMethod;

}
