
package com.webobjects.eoapplication;

import java.applet.*;
import java.net.URL;

class BeansAppletStub
    implements AppletStub {


    BeansAppletStub(Applet appletTarget, AppletContext appletContext, URL appletCodeBase, URL appletDocBase) { return null; }

    public boolean isActive() { return true; }

    public URL getDocumentBase() { return null; }

    public URL getCodeBase() { return null; }

    public String getParameter(String name) { return null; }

    public AppletContext getAppletContext() { return null; }

    public void appletResize(int i, int j) {}

    transient boolean active;
    transient Applet target;
    transient AppletContext context;
    transient URL codeBase;
    transient URL docBase;

}
