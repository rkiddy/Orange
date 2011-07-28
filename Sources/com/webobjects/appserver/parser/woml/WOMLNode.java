
package com.webobjects.appserver.parser.woml;

import com.webobjects.appserver.WOElement;


public abstract class WOMLNode {


    public WOMLNode(WOMLPosition position) { return null; }

    public WOMLPosition getPosition() { return null; }

    public void setPosition(WOMLPosition value) {}

    public WOElement getWOElement() { return null; }

    public void setWOElement(WOElement value) {}

    private WOMLPosition _position;
    private WOElement _woElement;

}
