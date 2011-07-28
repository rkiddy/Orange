
package com.webobjects.webservices.support._private;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import com.webobjects.webservices.support.xml.*;
import java.util.*;
import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.DeserializerFactory;
import javax.xml.rpc.encoding.SerializerFactory;
import org.apache.axis.encoding.TypeMapping;
import org.apache.axis.encoding.TypeMappingRegistry;


public class WOWSSupport {
    public static interface Delegate {

        public abstract void registerTypeMapping(SerializerFactory serializerfactory, DeserializerFactory deserializerfactory, Class class1, QName qname);
    }



    public WOWSSupport() { return null; }

    public static void setDelegate(Delegate aDelegate) { return null; }

    public static void _registerSerializersAndDeserializersForAllMappingsInRegistry(SerializerFactory sFactory, DeserializerFactory dFactory, Class aClass, QName aQname, TypeMappingRegistry tmr) { return null; }

    public static void _registerSerializersForAllMappingsInRegistry(TypeMappingRegistry tmr) { return null; }

    public static void _registerSerializersForAllMappingsInRegistry(TypeMappingRegistry tmr, Collection additionalTypeMappings) { return null; }

    public static Collection defaultTypeMappings() { return null; }

    public static final String SessionIDKey = "wosid";
    public static final String InstanceKey = "woinst";
    private static Delegate _delegate;

}
