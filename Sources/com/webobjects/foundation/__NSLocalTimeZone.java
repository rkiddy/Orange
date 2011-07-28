
package com.webobjects.foundation;

import java.io.ObjectStreamException;
import java.util.Locale;


final class __NSLocalTimeZone extends NSTimeZone {


    public __NSLocalTimeZone() { return null; }

    public static Object decodeObject(NSCoder aDecoder) { return null; }

    public String abbreviationForTimestamp(NSTimestamp aTimestamp) { return null; }

    public Class classForCoder() { return null; }

    public Object clone() { return null; }

    public NSData data() { return null; }

    public void encodeWithCoder(NSCoder nscoder) {}

    public boolean equals(Object anObject) { return true; }

    public String getDisplayName(boolean inDaylightSavingTime, int aTZStyle, Locale aLocale) { return null; }

    public String getID() { return null; }

    public int getRawOffset() { return 0; }

    public synchronized int hashCode() { return null; }

    public boolean isDaylightSavingTimeForTimestamp(NSTimestamp aTimestamp) { return true; }

    protected Object readResolve() throws ObjectStreamException { return null; }

    int secondsFromGMTForOffsetInSeconds(long offset) { return null; }

    public String toString() { return null; }

    public boolean useDaylightTime() { return true; }

    static  {}

    static final long serialVersionUID = 0x89afdf44L;
    public static final Class _CLASS;
    private static final String __NSLOCALTIMEZONE_TOSTRING_1 = "Local Time Zone [";
    private static final String __NSLOCALTIMEZONE_TOSTRING_2 = "]";

}
