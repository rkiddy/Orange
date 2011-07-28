
package com.webobjects.appserver.parser.woml;

import java.util.ArrayList;
import java.util.List;


public abstract class WOMLParentNode extends WOMLNode {


    public WOMLParentNode(WOMLPosition position) { return null; }

    public List getChildNodes() { return null; }

    public List getChildElements() { return null; }

    private List childNodes;
    private List childElements;

}
