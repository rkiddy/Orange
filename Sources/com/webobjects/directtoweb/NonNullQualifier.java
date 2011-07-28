
package com.webobjects.directtoweb;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableSet;


public class NonNullQualifier extends EOQualifier
    implements EOKeyValueArchiving {


    public NonNullQualifier(String key) { return null; }

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    public boolean evaluateWithObject(EOKeyValueCodingAdditions o) { return true; }

    public String description() { return null; }

    public String toString() { return null; }

    public EOQualifier qualifierWithBindings(NSDictionary bindings, boolean requiresAll) { return null; }

    public void validateKeysWithRootClassDescription(EOClassDescription eoclassdescription) {}

    public void addQualifierKeysToSet(NSMutableSet nsmutableset) {}

    private static final long serialVersionUID = 0x931577a6L;
    private String _key;

}
