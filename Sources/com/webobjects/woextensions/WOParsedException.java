
package com.webobjects.woextensions;

import com.webobjects.foundation.NSArray;

public class WOParsedException {


    public WOParsedException(String message) { return null; }

    public void setFrames(NSArray frames) {}

    public NSArray getFrames() { return null; }

    public void setCommonFrames(int commonFrames) {}

    public boolean showEllipsis() { return true; }

    public String getEllipsis() { return null; }

    public String getMessage() { return null; }

    protected NSArray frames;
    protected int commonFrames;
    protected String message;

}
