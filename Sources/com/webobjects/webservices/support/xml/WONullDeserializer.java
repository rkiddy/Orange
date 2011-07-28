
package com.webobjects.webservices.support.xml;

import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.DeserializerImpl;


public class WONullDeserializer extends DeserializerImpl
    implements Deserializer, WOSoapConstants {


    public WONullDeserializer() { return null; }

    private static final long serialVersionUID = 0x94d604bbL;

}
