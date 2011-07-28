
package com.webobjects.jndiadaptor;

import javax.naming.directory.*;

public interface JNDIType {

    public abstract String objectIdentifier();

    public abstract String name();

    public abstract String javaValueClassName();

    public abstract String objCValueClassName();

    public abstract String valueType();

    public abstract String filterExpression(Object obj);

    public abstract Object createInternalValue(Attribute attribute, String s);

    public abstract BasicAttribute createBasicAttribute(String s, Object obj);

    public abstract ModificationItem createModificationItem(String s, Object obj, Object obj1);
}
