
package com.webobjects.foundation;

import java.io.*;
import java.security.AccessController;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import sun.security.action.GetPropertyAction;


public class NSTimeZone extends TimeZone
    implements Cloneable, Serializable, NSCoding {
    protected static class __NSTZPeriodComparator extends NSComparator {


        public __NSTZPeriodComparator() { return null; }

        public __NSTZPeriodComparator(boolean ascending) { return null; }

        public int compare(Object object1, Object object2) throws NSComparator.ComparisonException { return 0; }

        protected boolean _ascending;

    }

    protected static class __NSTZPeriod {


        protected __NSTZPeriod() { return null; }

        protected boolean before(__NSTZPeriod aNSTZP) { return true; }

        protected boolean equals(__NSTZPeriod aNSTZP) { return true; }

        protected String _abbreviation;
        protected int _isdst;
        protected int _offset;
        protected double _startTime;

    }



    public NSTimeZone() { return null; }

    protected NSTimeZone(String aName, NSData aData) { return null; }

    private static int __bSearchTZPeriods(NSMutableArray tzPeriods, int count, double time) { return null; }

    private static NSTimeZone __concoctFixedTimeZone(int seconds, String abbr, int isDST) { return null; }

    private static int __detzcode(byte buffer[], int offset) { return null; }

    private static void __entzcode(int value, byte buffer[], int offset) { return null; }

    private static void __initTimeZoneVariables() { return null; }

    private static int __less2(int A, int W) { return null; }

    private static int __less3(int A, int X) { return null; }

    private static int __less4(int A, int Y) { return null; }

    private static int __less5(int A, int Z) { return null; }

    private static void __loadZipEntriesFromZoneArchive() { return null; }

    private static int __log2(int x) { return null; }

    private static synchronized NSTimeZone __lookupOrCreateTimeZone(String aName) { return null; }

    private static NSMutableArray __parseTimeZoneData(NSData aData) { return null; }

    private static String __replacementTimeZoneNameForName(String aName, boolean tryAbbreviation) { return null; }

    public static NSDictionary abbreviationDictionary() { return null; }

    public Class classForCoder() { return null; }

    public Object clone() { return null; }

    public static Object decodeObject(NSCoder aDecoder) { return null; }

    public static synchronized NSTimeZone defaultTimeZone() { return null; }

    public static String[] getAvailableIDs() { return null; }

    public static NSTimeZone getGMT() { return null; }

    public static TimeZone getDefault() { return null; }

    public static NSArray knownTimeZoneNames() { return null; }

    /**
     * @deprecated Method localTimeZone is deprecated
     */

    public static NSTimeZone localTimeZone() { return null; }

    /**
     * @deprecated Method resetSystemTimeZone is deprecated
     */

    public static synchronized void resetSystemTimeZone() { return null; }

    public static synchronized void setDefault(TimeZone aTZ) { return null; }

    public static synchronized void setDefaultTimeZone(NSTimeZone aTZ) { return null; }

    public void setID(String anID) {}

    public void setRawOffset(int offsetMillis) {}

    public static synchronized NSTimeZone systemTimeZone() { return null; }

    public static synchronized NSTimeZone timeZoneForSecondsFromGMT(int secondsOffsetFromGMT) { return null; }

    public static synchronized NSTimeZone timeZoneWithName(String aName, boolean tryAbbreviation) { return null; }

    public static synchronized NSTimeZone timeZoneWithNameAndData(String aName, NSData aData) { return null; }

    public static NSTimeZone _nstimeZoneWithTimeZone(TimeZone aZone) { return null; }

    private synchronized void _initialize() { return null; }

    public String abbreviation() { return null; }

    public String abbreviationForTimestamp(NSTimestamp aTimestamp) { return null; }

    public NSData data() { return null; }

    public void encodeWithCoder(NSCoder aCoder) {}

    public boolean equals(Object anObject) { return true; }

    public String getDisplayName(boolean inDaylightSavingTime, int aTZStyle, Locale aLocale) { return null; }

    public String getID() { return null; }

    public int getOffset(int anEra, int aYear, int aMonth, int aDayOfMonth, int aDayOfWeek, int milliseconds) { return 0; }

    int getOffset(NSTimestamp ts) { return null; }

    public int getRawOffset() { return 0; }

    public synchronized int hashCode() { return null; }

    public boolean hasSameRules(TimeZone aTZ) { return true; }

    public boolean inDaylightTime(Date aDate) { return true; }

    public boolean isDaylightSavingTime() { return true; }

    public boolean isDaylightSavingTimeForTimestamp(NSTimestamp aTimestamp) { return true; }

    /**
     * @deprecated Method isEqualToTimeZone is deprecated
     */

    public boolean isEqualToTimeZone(NSTimeZone aTimeZone) { return true; }

    /**
     * @deprecated Method name is deprecated
     */

    public String name() { return null; }

    public int secondsFromGMT() { return 0; }

    public int secondsFromGMTForTimestamp(NSTimestamp aTimestamp) { return 0; }

    int secondsFromGMTForOffsetInSeconds(long offset) { return null; }

    public String toString() { return null; }

    public boolean useDaylightTime() { return true; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    protected Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    /**
     * @deprecated Field SystemTimeZoneDidChangeNotification is deprecated
     */
    public static final String SystemTimeZoneDidChangeNotification = "NSSystemTimeZoneDidChangeNotification";
    public static final Class _CLASS;
    private static final String __ABBR_TABLE_NAME = "com/webobjects/foundation/TimeZoneInfo/Abbreviations.table";
    private static final int __ABBR_TABLE_SIZE_IN_BYTES = 9932;
    private static final String __ALIAS_TABLE_NAME = "com/webobjects/foundation/TimeZoneInfo/Aliases.table";
    private static final int __ALIAS_TABLE_SIZE_IN_BYTES = 3092;
    private static final String __GENERIC_TZ_NAME_STEM = "Etc/GMT";
    private static final String __GMT = "GMT";
    private static final int __GMT_LENGTH;
    private static final String __MINUS = "-";
    private static final String __PLUS = "+";
    private static final String __UTF8 = "UTF8";
    private static final String __ZONE_ARCHIVE_NAME = "com/webobjects/foundation/TimeZoneInfo/zoneinfo.zip";
    static final long serialVersionUID = 0xbb34a25cL;
    private static final String SerializationNameFieldKey = "name";
    private static final String SerializationDataFieldKey = "timeZoneData";
    private static NSDictionary __abbreviations;
    private static NSDictionary __aliases;
    private static NSTimeZone __defaultTimeZone;
    private static NSTimeZone __gmt;
    private static final NSNumberFormatter __hourFormatter;
    private static final NSNumberFormatter __gmtHourFormatter;
    private static NSSet __knownTimeZoneNames;
    private static final NSMutableDictionary __knownTimeZones;
    private static final __NSLocalTimeZone __localTimeZone;
    private static final NSNumberFormatter __gmtMinuteFormatter;
    private static final NSMutableDictionary __namesDataTable;
    private static NSTimeZone __systemTimeZone;
    private static final __NSTZPeriodComparator __tzPeriodComparator;
    protected NSData _data;
    protected transient int _hashCode;
    protected transient boolean _initialized;
    protected String _name;
    protected transient int _rawOffset;
    protected transient NSMutableArray _timeZonePeriods;
    protected transient int _timeZonePeriodsCount;
    protected transient boolean _useDaylightTime;
    private static final ObjectStreamField serialPersistentFields[];

}
