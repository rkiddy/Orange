
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.EOGeneralAdaptorException;
import javax.naming.NamingException;

public class JNDIAdaptorException extends EOGeneralAdaptorException {


    public JNDIAdaptorException(String message) { return null; }

    public JNDIAdaptorException(String message, NamingException namingException) { return null; }

    public JNDIAdaptorException(NamingException namingException) { return null; }

    public NamingException namingException() { return null; }

    private static final long serialVersionUID = 0xadac5821L;
    private final NamingException _namingException;

}
