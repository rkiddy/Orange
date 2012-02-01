package com.webobjects.foundation;
/**
 * NSTimestamp objects represent a particular instant in time. Unlike the NSGregorianDate class in previous versions of the Foundation framework, NSTimestamp does not support calendar functions. Refer to the table below to determine which classes to use to perform date operations in WebObjects.
 * Class Description NSTimestamp represents an instant in time java.util.GregorianCalendar represents a calendar date NSTimeZone represents a time zone NSTimestampFormatter converts NSTimestamps to strings and vice versa
 * This class's absolute reference date is the first instant of 1 January 1970, 00:00:00, GMT.
 * For the following code segments, you need to import java.util.* to access Java's date API.
 * To break up a NSTimestamp into its component year, month, day, hour, etc., you can convert it into a java.util.GregorianCalendar and invoke its get method on the individual fields:
 * To create an NSTimestamp based on its components, use the following code:
 * To add an offset in Gregorian units to an NSTimestamp, use the following code:
 * To create an NSTimestamp representing the current time, use the no-argument constructor:
 * The Enterprise Objects Framework expects dates to be represented as NSTimestamp objects. To convert a java.util.Date to an NSTimestamp use:
 * Since NSTimestamp is a subclass of java.util.Date, you don't need to convert an NSTimestamp into a java.util.Date.
 * NSTimestamp does not maintain time zone information. All NSTimestamps are 64 bit millisecond offsets since the reference date in the reference time zone. This is January 1, 1970, 00:00:00 GMT.
 * NSTimestamp.getTime()'s behavior matches that of java.util.Date, NOT java.sql.Timestamp. java.sql.Timestamp.getTime() returns a value with a precision of 1 second. Both NSTimestamp and java.util.Date return a value with a precision of 1 millisecond. java.sql.Timestamps have all fractional seconds in their nanosecond field, while NSTimestamps only place fractions of milliseconds in their nanosecond field.
 * See Also:NSTimestamp.getTime(), NSTimestampFormatter, NSTimeZone, Date, GregorianCalendar, Timestamp, Serialized Form
 */
public class NSTimestamp extends java.sql.Timestamp implements com.webobjects.foundation.NSCoding{
    /**
     * An NSTimestamp that represents a date in the distant future (in terms of centuries).
     */
    public static final com.webobjects.foundation.NSTimestamp DistantFuture=null;

    /**
     * An NSTimestamp that represents a date in the distant past (in terms of centuries).
     */
    public static final com.webobjects.foundation.NSTimestamp DistantPast=null;

    /**
     * Creates an NSTimestamp representing the current time, accurate to the millisecond.
     */
    public NSTimestamp(){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp from a Date.
     * Parameters:date - Date to use to initialize the new NSTimestampSee Also:Date
     */
    public NSTimestamp(java.util.Date date){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp representing the specified year, month,day, hours, minutes, and seconds in the specified time zone. Note especially that NSTimestamp denotes months as values from 1 to 12, so that 1 = January, 2 = February, etc. java.util date classes index months from zero ( 0 = January, 1 = February, etc.), so if you extract the month value from a java.util date object, you need to correct for this difference by adding one before passing the value to this constructor, and vice versa.
     * The arguments should specify dates which fall within the range of 1583 C.E. - 4000 C.E. Other dates may suffer from loss of precision, or only remain valid as long as they are not rendered human readable. Dates before DistantPast or after DistantFuture will result in an IllegalArgumentException.
     * Parameters:year - year where DistantPast < year < DistantFuturemonth - month where 1 <= month <= 12date - date where 1 <= date <= 31hour - hour where 0 <= hour <= 23minute - minute where 0 <= minute <= 59second - second where 0 <= second <= 59tz - time zone Throws: IllegalArgumentException - (year <= DistantPast.yearOfCommonEra()) || (year >= DistantFuture.yearOfCommonEra())
     */
    public NSTimestamp(int year, int month, int date, int hour, int minute, int second, java.util.TimeZone tz){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp representing the specified number of milliseconds since the reference date, January 1, 1970, 00:00:00 GMT.
     * Parameters:time - milliseconds since the reference date
     */
    public NSTimestamp(long time){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp representing the specified number of milliseconds and nanoseconds since the reference date, January 1, 1970, 00:00:00 GMT.
     * Parameters:milliseconds - milliseconds since the reference datenanoseconds - nanoseconds in addition to milliseconds
     */
    public NSTimestamp(long milliseconds, int nanoseconds){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp object representing the specified number of milliseconds and nanoseconds since the reference date in the specified time zone.
     * NSTimestamp does not maintain time zone information. All NSTimestamps are millisecond offsets since the reference date in the reference time zone. This method assumes time is a time from the tz time zone, and converts time into a time appropriate for NSTimestamp to handle.
     * Parameters:time - time in millisecondsnanos - time in nanosecondstz - time zone
     */
    public NSTimestamp(long time, int nanos, java.util.TimeZone tz){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp object representing the specified number of milliseconds after the time specified by date.
     * Parameters:time - offset in millisecondsdate - input date after which the time is to be calculated
     */
    public NSTimestamp(long time, com.webobjects.foundation.NSTimestamp date){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp representing the specified number of milliseconds since the reference date in the specified time zone.
     * NSTimestamp does not maintain time zone information. All NSTimestamps are millisecond offsets since the reference date in the reference time zone. This method assumes time is a time from the tz time zone, and converts time into a time appropriate for NSTimestamp to handle.
     * Parameters:time - time in millisecondstz - new time zone
     */
    public NSTimestamp(long time, java.util.TimeZone tz){
         //TODO codavaj!!
    }

    /**
     * Creates an NSTimestamp from a java.sql.Timestamp.
     * Parameters:sqlTimestamp - Timestamp to use to initialize the new NSTimestampSee Also:Timestamp
     */
    public NSTimestamp(java.sql.Timestamp sqlTimestamp){
         //TODO codavaj!!
    }

    /**
     * Conformance to the NSCoding interface
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Determines whether this NSTimestamp is before, after, or the same as another NSTimestamp. Returns an integer indicating whether the receiver is before, after, or the same as ts. If the receiver is before ts, this method returns NSComparator.OrderedAscending. If the receiver is after ts, this method returns NSComparator.OrderedDescending. If the dates match, this method returns NSComparator.OrderedSame.
     */
    public int compare(com.webobjects.foundation.NSTimestamp ts){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static long currentTimeIntervalSinceReferenceDate(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public long dayOfCommonEra(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Indicates the day of the month for this NSTimestamp.
     */
    public int dayOfMonth(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Indicates the day of the week for this NSTimestamp. Returns a number that indicates the day of the week (0 through 6) of the receiver; 0 indicates Sunday.
     */
    public int dayOfWeek(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Indicates the day of the year for this NSTimestamp.
     */
    public int dayOfYear(){
        return 0; //TODO codavaj!!
    }

    /**
     * Provides an NSTimestamp from data in coder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Provides an NSTimestamp that represents a date many centuries in the future. You can pass this value where an NSTimestamp is required to have the date argument essentially ignored. For example, the NSLock method tryLock(NSTimeStamp) returns false if the receiver fails to acquire the lock before the specified date. You can use the object returned by distantFuture as the date argument to wait indefinitely to acquire the lock.
     */
    public static com.webobjects.foundation.NSTimestamp distantFuture(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Provides an NSTimestamp that represents a date many centuries in the past. You can use this object in your code as a control date, a guaranteed temporal boundary.
     */
    public static com.webobjects.foundation.NSTimestamp distantPast(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Determines the earliest of this NSTimestamp and another NSTimestamp.
     */
    public com.webobjects.foundation.NSTimestamp earlierTimestamp(com.webobjects.foundation.NSTimestamp ts){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Encodes the receiver using coder. Object type information along with an object's data is stored.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    public int getNanos(){
        return 0; //TODO codavaj!!
    }

    /**
     * NSTimestamp.getTime()'s behavior matches that of java.util.Date, NOT java.sql.Timestamp. java.sql.Timestamp.getTime() returns a value with a precision of 1 second. Both NSTimestamp and java.util.Date return a value with a precision of 1 millisecond. java.sql.Timestamps have all fractional seconds in their nanosecond field, while NSTimestamps only place fractions of milliseconds in their nanosecond field. This means the nanosecond field of a java.sql.Timestamp and NSTimestamp which both represent the same offset from the reference date may be different values. The reference date is January 1, 1970, 00:00:00 GMT
     */
    public long getTime(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Computes the time difference in calendar units between this NSTimestamp and timestamp and returns it in years, months, days, hours, minutes, and seconds. NSTimestamp.IntRef is a local class that contains a single element: the integer value.
     * You can choose any representation you wish for the time difference by passing null for the arguments you want to ignore. For example, the following code fragment computes the difference in months, days, and years between two dates:
     * blockquote NSTimestamp momsBDay = new NSTimestamp(1936, 1, 8, 7, 30, 0, java.util.TimeZone.getTimeZone(EST)); NSTimestamp dateOfBirth = new NSTimestamp(1965, 12, 7, 17, 25, 0, new NSTimeZone(EST)); NSTimestamp.IntRef years = new NSTimestamp.IntRef(); NSTimestamp.IntRef months = new NSTimestamp.IntRef(); NSTimestamp.IntRef days = new NSTimestamp.IntRef(); dateOfBirth.gregorianUnitsSinceTimestamp(momsBDay, years, months, days, null, null, null)/blockquote
     * If you want to express the years in terms of months, you pass null for the years argument: blockquote dateOfBirth.gregorianUnitsSinceTimestamp(momsBDay, null, months, days, null, null, null); /blockquote This message returns 358 months and 29 days.
     */
    public void gregorianUnitsSinceTimestamp(com.webobjects.foundation.NSTimestamp.IntRef years, com.webobjects.foundation.NSTimestamp.IntRef months, com.webobjects.foundation.NSTimestamp.IntRef days, com.webobjects.foundation.NSTimestamp.IntRef hours, com.webobjects.foundation.NSTimestamp.IntRef minutes, com.webobjects.foundation.NSTimestamp.IntRef seconds, com.webobjects.foundation.NSTimestamp time){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the hour value (0 through 23) of this NSTimestamp. On Daylight Savings "fall back" days, a value of 1 is returned for two consecutive hours, but with a different time zone (the first in daylight savings time and the second in standard time).
     */
    public int hourOfDay(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Determines the later of this NSTimestamp and another NSTimestamp.
     */
    public com.webobjects.foundation.NSTimestamp laterTimestamp(com.webobjects.foundation.NSTimestamp ts){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the microseconds value of this NSTimestamp.
     */
    public int microsecondOfSecond(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Indicates the time interval in seconds corresponding to the specified time represented in milliseconds. Any fractional part of a second is truncated.
     */
    public static long millisecondsToTimeInterval(long milliseconds){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the minutes value of this NSTimestamp.
     */
    public int minuteOfHour(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns a number that indicates the month of the year of this NSTimestamp. Note that java.util.Calendar represents months as integers from 0 to 11.
     */
    public int monthOfYear(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the seconds value of this NSTimestamp.
     */
    public int secondOfMinute(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setDate(int date){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setHours(int hours){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setMinutes(int minutes){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setMonth(int month){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * NSTimestamp objects are immutable.
     */
    public void setNanos(int nanoseconds){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * NSTimestamp objects are immutable.
     */
    public void setSeconds(int seconds){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setTime(long time){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setYear(int year){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the number of seconds between this NSTimestamp's time and the current system time. This value is negative if this NSTimestamp's time is earlier than the current system time.
     */
    public long timeIntervalSinceNow(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the number of seconds between this NSTimestamp's time and the reference date. This value is negative if this NSTimestamp's time is earlier than the reference date.
     */
    public long timeIntervalSinceReferenceDate(){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the number of seconds between this NSTimestamp's time and ts. This value is negative if this NSTimestamp's time is earlier than time.
     */
    public long timeIntervalSinceTimestamp(com.webobjects.foundation.NSTimestamp ts){
        return 0l; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns a time interval in milliseconds corresponding to the specified timeInterval represented in seconds.
     */
    public static long timeIntervalToMilliseconds(long timeInterval){
        return 0l; //TODO codavaj!!
    }

    /**
     * Returns an NSTimestamp that is updated with the years, months, days, hours, minutes, and seconds offsets specified as arguments. The offsets can be positive (future) or negative (past). This method preserves "clock time" across changes in Daylight Savings Time zones and leap years. For example, adding one month to an NSTimestamp with a time of 12 noon correctly maintains time at 12 noon.
     * The following code fragment shows an NSTimestamp created with a date a week later than an existing NSTimestamp.
     * blockquote NSTimestamp now = new NSTimestamp(); NSTimestamp nextWeek = now.timestampByAddingGregorianUnits(0, 0, 7, 0, 0, 0); /blockquote
     */
    public com.webobjects.foundation.NSTimestamp timestampByAddingGregorianUnits(int years, int months, int days, int hours, int minutes, int seconds){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns an NSTimestamp with the specified time interval in seconds added to this NSTimestamp's time.
     */
    public com.webobjects.foundation.NSTimestamp timestampByAddingTimeInterval(long interval){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public com.webobjects.foundation.NSTimeZone timeZone(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public int yearOfCommonEra(){
        return 0; //TODO codavaj!!
    }

    class IntRef{
    }
}
