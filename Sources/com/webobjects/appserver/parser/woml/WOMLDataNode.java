
package com.webobjects.appserver.parser.woml;



public abstract class WOMLDataNode extends WOMLTextNode {


    public WOMLDataNode(WOMLPosition position) { return null; }

    public boolean getShouldEmitStart() { return true; }

    public void setShouldEmitStart(boolean value) {}

    public boolean getShouldEmitEnd() { return true; }

    public void setShouldEmitEnd(boolean value) {}

    public abstract String getOutputPrefix();

    public abstract String getOutputSuffix();

    public String getOutputText() { return null; }

    private boolean shouldEmitStart;
    private boolean shouldEmitEnd;

}
