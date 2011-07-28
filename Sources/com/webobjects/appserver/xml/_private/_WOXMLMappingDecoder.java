
package com.webobjects.appserver.xml._private;

import com.webobjects.appserver.xml.WOXMLDecoder;
import com.webobjects.appserver.xml.WOXMLException;
import com.webobjects.foundation.*;
import java.util.Enumeration;


public class _WOXMLMappingDecoder extends WOXMLDecoder {


    protected String classNameForXMLTag(String xmlTag) { return null; }

    protected String propertyKeyForXMLTag(String xmlTag, String xmlEntityName) { return null; }

    protected boolean forceListForPropertyKey(String propertyKey, String className) { return true; }

    protected boolean reportEmptyValuesForPropertyKey(String propertyKey, String className) { return true; }

    protected boolean ignoreUnmappedTagsForXMLTag(String xmlTag) { return true; }

    protected String contentsKeyForXMLTag(String xmlTag) { return null; }

    /**
     * @deprecated Method handler is deprecated
     */

    protected _DecodingHandler handler() { return null; }

    protected _DecodingContentHandler contentHandler() { return null; }

    protected Class classForXMLTag(String xmlTag) { return null; }

    Object newInstance(String xmlTag, NSMutableDictionary collectedValues) { return null; }

    public _WOXMLMappingDecoder(_MappingModel model) { return null; }

    public _WOXMLMappingDecoder(String mappingModelURL) { return null; }

    public Object decodeObjectForKey(String key) { return null; }

    static  {}

    static final Object UNMAPPED_KEY;
    static final Object CONTENTS_KEY;
    private _MappingModel _mappingModel;
    protected NSMutableDictionary _collectedValues;
    static final Class _xmlDecodingConstructorArg[];

}
