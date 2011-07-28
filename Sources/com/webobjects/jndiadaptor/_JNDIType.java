
package com.webobjects.jndiadaptor;

import com.webobjects.foundation.*;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;


abstract class _JNDIType {


    public _JNDIType(String objectIdentifier, String name, String valueType) { return null; }

    public _JNDIType(String objectIdentifier, String name) { return null; }

    public final String objectIdentifier() { return null; }

    public final String name() { return null; }

    public final String valueType() { return null; }

    public String filterExpression(Object internal) { return null; }

    public final Object createInternalValue(Attribute attribute, String valueType) { return null; }

    protected abstract Object convert(Object obj, String s);

    public final BasicAttribute createBasicAttribute(String id, Object internal) { return null; }

    protected abstract Object revert(Object obj);

    public final ModificationItem createModificationItem(String id, Object oldInternal, Object newInternal) { return null; }

    public final boolean isNull(Object value) { return null; }

    private final String _objectIdentifier;
    private final String _name;
    private final String _valueType;

}
