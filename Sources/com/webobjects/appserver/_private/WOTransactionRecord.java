
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSDictionary;
import java.io.Serializable;

public class WOTransactionRecord
    implements Serializable {


    private WOTransactionRecord(WOComponent aPage) { return null; }

    public WOTransactionRecord(WOComponent aPage, WOContext aContext, String key) { return null; }

    public WOTransactionRecord(WOComponent aPage, WOContext aContext) { return null; }

    public void touch() {}

    public boolean isExpired() { return true; }

    public String key() { return null; }

    public WOComponent responsePage() { return null; }

    public void setResponsePage(WOComponent aPage) {}

    public boolean isMatchingIDs(WOContext aContext) { return true; }

    public void setOldPage() {}

    public boolean isOldPage() { return true; }

    public static void setBounceTimeOut(long value) { return null; }

    public static long bounceTimeOut() { return null; }

    public String toString() { return null; }

    static final long serialVersionUID = 0x4bd6ca62L;
    private WOComponent _responsePage;
    private String _contextID;
    private String _senderID;
    private NSDictionary _formValues;
    private String _key;
    private boolean _oldPage;
    private long _lastModified;
    protected static long _bounceTimeOut;
    protected static final long DefaultBounceTimeOut = 0x493e0L;

}
