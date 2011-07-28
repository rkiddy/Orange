
package com.webobjects.webservices.support._private;

import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.DeserializerFactory;
import javax.xml.rpc.encoding.SerializerFactory;

public class MappingRegistryEntry {


    public MappingRegistryEntry(Class aClass, QName aQName, SerializerFactory sFactory, DeserializerFactory dFactory) { return null; }

    public Class mappedClass() { return null; }

    public DeserializerFactory deserializerFactory() { return null; }

    public QName qName() { return null; }

    public SerializerFactory serializerFactory() { return null; }

    protected SerializerFactory _serializerFactory;
    protected DeserializerFactory _deserializerFactory;
    protected Class _mappedClass;
    protected QName _qName;

}
