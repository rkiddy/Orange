
package com.webobjects.directtoweb;

import com.webobjects.eocontrol.*;
import java.io.Serializable;


public class Assignment
    implements EOKeyValueArchiving, Serializable {


    Assignment() { return null; }

    public Assignment(String keyPath, Object value) { return null; }

    public Assignment(EOKeyValueUnarchiver unarchiver) { return null; }

    public String keyPath() { return null; }

    public Object value() { return null; }

    /**
     * @deprecated Method value is deprecated
     */

    public Object value(D2WContext context) { return null; }

    public String toString() { return null; }

    String valueString() { return null; }

    public Object fire(D2WContext context) { return null; }

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    private static final long serialVersionUID = 1L;
    public static final String KeyPathKey = "keyPath";
    public static final String ValueKey = "value";
    private static final String _NullValueString = "<null>";
    private String _keyPath;
    private Object _value;

}
