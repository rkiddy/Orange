
package com.webobjects.appserver.xml;

import com.webobjects.appserver.xml._private._MappingModel;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.*;
import java.util.*;


class WOXMLMappingCoder extends WOXMLCoder {


    WOXMLMappingCoder(String mappingModelURL) { return null; }

    public String xmlTagForClassNamed(String className) { return null; }

    public String xmlTagForPropertyKey(String propertyKey, String className) { return null; }

    protected void _encodeEO(EOEnterpriseObject eo) {}

    protected void encodeDictionaryWithXMLTag(NSDictionary a, String tag) {}

    protected void encodeArrayWithXMLTag(NSArray a, String tag, boolean codeBasedOnClass, int outputTags) {}

    public void encodeObjectForKey(Object object, String key) {}

    public void encodeObjectWithXMLTag(Object o, String tag, boolean codeBasedOnClass, int outputTags) {}

    public void encodeBooleanForKey(boolean b, String key) {}

    public void encodeIntForKey(int i, String key) {}

    public void encodeFloatForKey(float f, String key) {}

    public void encodeDoubleForKey(double d, String key) {}

    public synchronized String encodeRootObjectForKey(Object object, String key) { return null; }

    private _MappingModel _mappingModel;

}
