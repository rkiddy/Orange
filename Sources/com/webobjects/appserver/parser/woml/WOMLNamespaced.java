
package com.webobjects.appserver.parser.woml;

import java.util.Map;

public class WOMLNamespaced {


    public WOMLNamespaced(Map uriToNamespace, String uri, String localName, String qName) { return null; }

    public boolean hasNamespace() { return true; }

    public boolean isNamespace(String otherNamespace) { return true; }

    public String getNamespace() { return null; }

    public String getName() { return null; }

    public String getQName() { return null; }

    private String _namespace;
    private String _name;
    private String _qName;

}
