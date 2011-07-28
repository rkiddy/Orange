
package com.webobjects.jspservlet;

import com.webobjects.appserver.WOSession;
import java.io.Serializable;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class _WOSessionWatcher
    implements Serializable, HttpSessionBindingListener {


    public _WOSessionWatcher(WOSession aSession) { return null; }

    public void _clearWOSession() {}

    public void valueBound(HttpSessionBindingEvent httpsessionbindingevent) {}

    public void valueUnbound(HttpSessionBindingEvent event) {}

    private static final long serialVersionUID = 0xc975896eL;
    WOSession mySession;

}
