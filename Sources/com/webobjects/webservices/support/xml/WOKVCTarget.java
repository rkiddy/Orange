
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSKeyValueCoding;
import org.apache.axis.encoding.Target;
import org.xml.sax.SAXException;

public class WOKVCTarget
    implements Target {


    public WOKVCTarget(Object target, String key) { return null; }

    public void set(Object value) throws SAXException {}

    protected Object _target;
    protected String _key;

}
