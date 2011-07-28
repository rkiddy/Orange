
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.D2WKeyValueArchiving;
import com.apple.client.directtoweb.common.D2WKeyValueArchivingDelegate;


class ServerArchivingDelegate
    implements D2WKeyValueArchivingDelegate {


    ServerArchivingDelegate() { return null; }

    public String interchangeClassNameForObject(D2WKeyValueArchiving object) { return null; }

    public String javaClassNameForInterchangeClassName(String interchangeClassName) { return null; }

    static  {}

    public static final String settingsInterchangeName = "com.apple.client.directtoweb.common.Settings";
    public static final String serverSideSettingsClassName = "com.webobjects.directtoweb.ServerSideSettings";
    public static final String actionInterchangeName = "com.apple.client.directtoweb.common.Action";
    public static final String serverSideActionClassName = "com.webobjects.directtoweb.ServerSideAction";
    static ServerArchivingDelegate instance;

}
