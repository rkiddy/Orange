
package com.webobjects.webservices.support.xml;

import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.encoding.ser.BaseSerializerFactory;
import org.apache.axis.encoding.ser.CalendarSerializer;

public class WOTimeSerializerFactory extends BaseSerializerFactory {


    public WOTimeSerializerFactory(Class javaType, QName xmlType) { return null; }

    public static SerializerFactory create(Class javaType, QName xmlType) { return null; }

    private static final long serialVersionUID = 0xb6740284L;

}
