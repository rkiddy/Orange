
package com.webobjects.appserver;

import com.webobjects.foundation.NSLog;


public class WORedirect extends WOComponent {


    public WORedirect(WOContext aContext) { return null; }

    public String url() { return null; }

    public void setUrl(String aString) {}

    /**
     * @deprecated Method setURL is deprecated
     */

    public void setURL(String aString) {}

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    static final long serialVersionUID = 0xebdd8b4eL;
    private String _url;

}
