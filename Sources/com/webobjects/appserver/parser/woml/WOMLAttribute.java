
package com.webobjects.appserver.parser.woml;

import java.util.Map;
import org.xml.sax.Attributes;


public class WOMLAttribute extends WOMLNamespaced {


    public WOMLAttribute(Map uriToNamespace, Attributes attributes, int index) { return null; }

    public boolean isValueDynamic() { return true; }

    public String getValue() { return null; }

    public String toString() { return null; }

    private String value;

}
