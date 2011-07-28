
package com.webobjects.webservices.support.xml;

import javax.xml.namespace.QName;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.ser.BaseDeserializerFactory;


public class WONullDeserializerFactory extends BaseDeserializerFactory {


    public WONullDeserializerFactory() { return null; }

    public WONullDeserializerFactory(Class aJavaType, QName anXmlType) { return null; }

    public static DeserializerFactory create(Class javaType, QName xmlType) { return null; }

    private static final long serialVersionUID = 0x9ccdbb71L;

}
