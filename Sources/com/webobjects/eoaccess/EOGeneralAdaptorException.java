
package com.webobjects.eoaccess;

import com.webobjects.foundation.NSDictionary;

public class EOGeneralAdaptorException extends RuntimeException {


    public EOGeneralAdaptorException(String message) { return null; }

    public EOGeneralAdaptorException(String name, NSDictionary userInfo) { return null; }

    public EOGeneralAdaptorException(String selectorName, String className, String message) { return null; }

    public NSDictionary userInfo() { return null; }

    private static final long serialVersionUID = 0x987e1f0dL;
    private NSDictionary _userInfo;

}
