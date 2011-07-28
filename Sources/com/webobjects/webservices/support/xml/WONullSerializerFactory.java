
package com.webobjects.webservices.support.xml;

import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.BaseSerializerFactory;


public class WONullSerializerFactory extends BaseSerializerFactory {


    public WONullSerializerFactory() { return null; }

    public WONullSerializerFactory(Class javaType, QName xmlType) { return null; }

    public static SerializerFactory create(Class javaType, QName xmlType) { return null; }

    private static final long serialVersionUID = 0x3b4a0f09L;

}
