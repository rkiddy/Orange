
package com.webobjects.eoaccess;

import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

public interface EOPropertyListEncoding {

    public abstract void awakeWithPropertyList(NSDictionary nsdictionary);

    public abstract void encodeIntoPropertyList(NSMutableDictionary nsmutabledictionary);
}
