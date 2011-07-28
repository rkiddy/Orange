
package com.webobjects.eoapplication;

import java.applet.*;
import java.awt.Image;
import java.awt.image.ImageProducer;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

class BeansAppletContext
    implements AppletContext {


    BeansAppletContext(Applet appletTarget) { return null; }

    public AudioClip getAudioClip(URL url) { return null; }

    public synchronized Image getImage(URL url) { return null; }

    public Applet getApplet(String name) { return null; }

    public Enumeration getApplets() { return null; }

    public void showDocument(URL url1) {}

    public void showDocument(URL url1, String s) {}

    public void showStatus(String s) {}

    public InputStream getStream(String key) { return null; }

    public Iterator getStreamKeys() { return null; }

    public void setStream(String s, InputStream inputstream) {}

    Applet target;
    Hashtable imageCache;

}
