
package com.webobjects.foundation;

import java.io.*;
import java.sql.Timestamp;
import java.util.*;


public class NSTimestamp extends Timestamp
    implements NSCoding {
    private class GregorianDateAsRawUnits {


        public GregorianDateAsRawUnits(int units[]) { return null; }

        public GregorianDateAsRawUnits(int y, int m, int d, int h, int min, int s) { return null; }

        public GregorianDateAsRawUnits() { return null; }

        public String toString() { return null; }

        public int years;
        public int months;
        public int days;
        public int hours;
        public int minutes;
        public int seconds;
        final NSTimestamp this$0;

    }

    /**
     * @deprecated Class IntRef is deprecated
     */

    public static class IntRef {


        public IntRef() { return null; }

        public String toString() { return null; }

        public int value;

    }



    /**
     * @deprecated Method currentTimeIntervalSinceReferenceDate is deprecated
     */

    public static long currentTimeIntervalSinceReferenceDate() { return null; }

    /**
     * @deprecated Method distantFuture is deprecated
     */

    public static NSTimestamp distantFuture() { return null; }

    /**
     * @deprecated Method distantPast is deprecated
     */

    public static NSTimestamp distantPast() { return null; }

    /**
     * @deprecated Method millisecondsToTimeInterval is deprecated
     */

    public static long millisecondsToTimeInterval(long milliseconds) { return null; }

    /**
     * @deprecated Method timeIntervalToMilliseconds is deprecated
     */

    public static long timeIntervalToMilliseconds(long timeInterval) { return null; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public NSTimestamp() { return null; }

    public NSTimestamp(long time) { return null; }

    public NSTimestamp(long milliseconds, int nanoseconds) { return null; }

    public NSTimestamp(long time, NSTimestamp date) { return null; }

    public NSTimestamp(long time, TimeZone tz) { return null; }

    public NSTimestamp(long time, int nanos, TimeZone tz) { return null; }

    public NSTimestamp(int year, int month, int date, int hour, int minute, int second, TimeZone tz) { return null; }

    public NSTimestamp(Date date) { return null; }

    public NSTimestamp(Timestamp sqlTimestamp) { return null; }

    public NSTimestamp timestampByAddingGregorianUnits(int years, int months, int days, int hours, int minutes, int seconds) { return null; }

    private long absoluteTimeAddGregorianUnits(long at, GregorianDateAsRawUnits units, boolean dateIsPostGregorian) { return 0L; }

    private GregorianDateAsRawUnits absoluteTimeGetGregorianDate(long at) { return null; }

    private long gregorianDateGetAbsoluteTime(GregorianDateAsRawUnits gdate) { return 0L; }

    private int __AbsoluteFromYMD(int year, int month, int day) { return 0; }

    private void __YMDFromAbsolute(int absolute, GregorianDateAsRawUnits ymd) {}

    private int __DaysInMonth(int month, int year) { return 0; }

    private int __DaysBeforeMonth(int month, int year) { return 0; }

    private int __DaysAfterMonth(int month, int year) { return 0; }

    private int __DoubleModToInt(double d, int modulus) { return 0; }

    private double __DoubleMod(double d, int modulus) { return null; }

    /**
     * @deprecated Method timestampByAddingTimeInterval is deprecated
     */

    public NSTimestamp timestampByAddingTimeInterval(long interval) { return null; }

    /**
     * @deprecated Method dayOfCommonEra is deprecated
     */

    public long dayOfCommonEra() { return 0L; }

    /**
     * @deprecated Method dayOfMonth is deprecated
     */

    public int dayOfMonth() { return 0; }

    /**
     * @deprecated Method dayOfWeek is deprecated
     */

    public int dayOfWeek() { return 0; }

    /**
     * @deprecated Method dayOfYear is deprecated
     */

    public int dayOfYear() { return 0; }

    /**
     * @deprecated Method hourOfDay is deprecated
     */

    public int hourOfDay() { return 0; }

    /**
     * @deprecated Method microsecondOfSecond is deprecated
     */

    public int microsecondOfSecond() { return 0; }

    /**
     * @deprecated Method minuteOfHour is deprecated
     */

    public int minuteOfHour() { return 0; }

    /**
     * @deprecated Method monthOfYear is deprecated
     */

    public int monthOfYear() { return 0; }

    /**
     * @deprecated Method secondOfMinute is deprecated
     */

    public int secondOfMinute() { return 0; }

    /**
     * @deprecated Method yearOfCommonEra is deprecated
     */

    public int yearOfCommonEra() { return 0; }

    /**
     * @deprecated Method gregorianUnitsSinceTimestamp is deprecated
     */

    public void gregorianUnitsSinceTimestamp(IntRef years, IntRef months, IntRef days, IntRef hours, IntRef minutes, IntRef seconds, NSTimestamp time) {}

    /**
     * @deprecated Method timeIntervalSinceTimestamp is deprecated
     */

    public long timeIntervalSinceTimestamp(NSTimestamp ts) { return 0L; }

    /**
     * @deprecated Method timeIntervalSinceNow is deprecated
     */

    public long timeIntervalSinceNow() { return 0L; }

    /**
     * @deprecated Method timeIntervalSinceReferenceDate is deprecated
     */

    public long timeIntervalSinceReferenceDate() { return 0L; }

    public int compare(NSTimestamp ts) { return 0; }

    /**
     * @deprecated Method earlierTimestamp is deprecated
     */

    public NSTimestamp earlierTimestamp(NSTimestamp ts) { return null; }

    /**
     * @deprecated Method laterTimestamp is deprecated
     */

    public NSTimestamp laterTimestamp(NSTimestamp ts) { return null; }

    public String toString() { return null; }

    /**
     * @deprecated Method timeZone is deprecated
     */

    public NSTimeZone timeZone() { return null; }

    private void _initializeCalendar() {}

    private long _timeInMillis(long milliseconds, int nanos) { return 0L; }

    /**
     * @deprecated Method setNanos is deprecated
     */

    public void setNanos(int nanoseconds) {}

    /**
     * @deprecated Method setDate is deprecated
     */

    public void setDate(int date) {}

    /**
     * @deprecated Method setHours is deprecated
     */

    public void setHours(int hours) {}

    /**
     * @deprecated Method setMinutes is deprecated
     */

    public void setMinutes(int minutes) {}

    /**
     * @deprecated Method setMonth is deprecated
     */

    public void setMonth(int month) {}

    /**
     * @deprecated Method setSeconds is deprecated
     */

    public void setSeconds(int seconds) {}

    /**
     * @deprecated Method setTime is deprecated
     */

    public void setTime(long time) {}

    private static long _timestampAdjustedForZone(long time, TimeZone tz) { return null; }

    private void _shiftMilliseconds(int nanos) {}

    private void _initialize(long m, int n) {}

    public long getTime() { return 0L; }

    public int getNanos() { return 0; }

    /**
     * @deprecated Method setYear is deprecated
     */

    public void setYear(int year) {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    private static transient boolean _JVM131Compatible;
    public static final NSTimestamp DistantPast;
    public static final NSTimestamp DistantFuture;
    static final long serialVersionUID = 0xdbdc3a9cL;
    private static int _DistantPastYear;
    private static int _DistantFutureYear;
    private transient Calendar _calendar;
    private transient boolean _notInConstructor;
    private static final String SerializationLegacyFieldKey = "_timeZone";
    private static final ObjectStreamField serialPersistentFields[];

}
