package com.webobjects.foundation;
/**
 * NSTimeZone defines the behavior of time zones for different geopolitical regions. Consequently, these objects have names (and abbreviations, such as "PST") for these regions. NSTimeZone objects also represent a temporal offset, either plus or minus, from Greenwich Mean Time (GMT).
 * NSTimeZone provides several ways to instantiate time zones. The class also permits you to set the default time zone within your application (setDefault). You can access this default time zone at any time with the getDefault static method. With the localTimeZone static method, you can get a relative time zone object that acts as a proxy for the default time zone for any locale in which it finds itself.
 * Because NSTimeZone is a subclass of java.util.TimeZone, you can also use the java.util.TimeZone API with NSTimeZones.
 * WARNING: NSTimeZone is only intended to be used with NSTimestamp and NSTimestampFormatter. It produces incorrect results when used with Java's date-related classes.
 * Some NSTimestamp methods return date objects that are automatically bound to time zone objects. These date objects use the functionality of NSTimeZone to adjust dates for the proper locale. Unless you specify otherwise, objects returned from NSTimestamp are bound to the default time zone for the current locale.
 * See Also:NSTimeZone.abbreviation(), NSTimeZone.getDefault(), NSTimeZone.getID(), NSTimeZone.localTimeZone(), NSTimeZone.setDefault(java.util.TimeZone), NSTimestamp, NSTimestampFormatter, Serialized Form
 */
public class NSTimeZone extends java.util.TimeZone implements java.lang.Cloneable, java.io.Serializable, com.webobjects.foundation.NSCoding{
    /**
     * Deprecated.
     * The name for the notification posted during any invocation of NSTimeZone's resetSystemTimeZone method.
     * See Also:NSTimeZone.resetSystemTimeZone(), NSNotification, Constant Field Values
     */
    public static final java.lang.String SystemTimeZoneDidChangeNotification="NSSystemTimeZoneDidChangeNotification";

    /**
     * Required internally to implement the java.io.Serializable interface and should be considered private.
     * Use the following methods to get NSTimeZone objects: timeZoneForSecondsFromGMT timeZoneWithName
     * See Also:NSTimeZone.timeZoneWithName(java.lang.String, boolean), NSTimeZone.timeZoneForSecondsFromGMT(int), Serializable
     */
    public NSTimeZone(){
         //TODO codavaj!!
    }

    /**
     * Used internally by NSTimeZone and should be considered private.
     * Use the following methods to get NSTimeZone objects: timeZoneForSecondsFromGMT timeZoneWithName
     * Parameters:aName - the proposed name for the newly instantiated NSTimeZone objectaData - the proposed behavior for the newly instantiated NSTimeZone object (represented by raw binary data)See Also:NSTimeZone.timeZoneWithName(java.lang.String, boolean), NSTimeZone.timeZoneForSecondsFromGMT(int)
     */
    protected NSTimeZone(java.lang.String aName, com.webobjects.foundation.NSData aData){
         //TODO codavaj!!
    }

    /**
     * Returns the abbreviation for the NSTimeZone at the current instant, such as "EDT" (Eastern Daylight Time). Invokes abbreviationForTimestamp with an NSTimestamp representing the current instant.
     * Invoked by toString.
     */
    public java.lang.String abbreviation(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the mappings of time zone abbreviations to time zone names.
     * Any given name may be represented by several abbreviations. Conversely, more than one time zone may have the same abbreviation. For example, US/Pacific and Canada/Pacific both use the abbreviation "PST." In these cases, this method always chooses a single name to which to map the abbreviation.
     */
    public static com.webobjects.foundation.NSDictionary abbreviationDictionary(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the abbreviation for the NSTimeZone at the instant specified by aTimestamp.
     * Note that the abbreviation may be different at different instants. For example, during daylight savings time, the US/Eastern time zone has an abbreviation of "EDT". At other times, its abbreviation is "EST".
     * Invoked by abbreviation.
     */
    public java.lang.String abbreviationForTimestamp(com.webobjects.foundation.NSTimestamp aTimestamp){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Allows the receiver, before being encoded, to substitute a class other than its own in a coder. For example, private subclasses can substitute the name of a public superclass when being encoded.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Since NSTimeZones are immutable, there's no need to make an actual clone.
     */
    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides an opaque object representing the behavior for this NSTimeZone. Invoked by equals.
     */
    public com.webobjects.foundation.NSData data(){
        return null; //TODO codavaj!!
    }

    /**
     * Provided for compliance with com.webobjects.foundation.NSCoding. Provides an NSTimeZone object for the decoded data. Attempts to avoid creating duplicate objects.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder aDecoder){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the last object given to NSTimeZone via setDefault or setDefaultTimeZone.If no default time zone has been explicitly set, this method returns the system time zone. The default time zone returned by NSTimeZone may or may not be consistent with the default time zone returned by java.util.TimeZone.
     */
    public static com.webobjects.foundation.NSTimeZone defaultTimeZone(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Encodes the receiver using coder. Object type information along with an object's data is stored.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder aCoder){
        return; //TODO codavaj!!
    }

    /**
     * Indicates whether this NSTimeZone has the same data as that of anObject. Invoked by: hasSameRules isEqualToTimeZone
     */
    public boolean equals(java.lang.Object anObject){
        return false; //TODO codavaj!!
    }

    /**
     * Provides a list of all of the names and abbreviations known to NSTimeZone.
     */
    public static java.lang.String[] getAvailableIDs(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the last object given to NSTimeZone via setDefault or setDefaultTimeZone. If no default time zone has been explicitly set, this method returns the system time zone. The default time zone returned by NSTimeZone may or may not be consistent with the default time zone returned by java.util.TimeZone.
     */
    public static java.util.TimeZone getDefault(){
        return null; //TODO codavaj!!
    }

    public java.lang.String getDisplayName(boolean inDaylightSavingTime, int aTZStyle, java.util.Locale aLocale){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSTimeZone object representing GMT.
     */
    public static com.webobjects.foundation.NSTimeZone getGMT(){
        return null; //TODO codavaj!!
    }

    public java.lang.String getID(){
        return null; //TODO codavaj!!
    }

    public int getOffset(int anEra, int aYear, int aMonth, int aDayOfMonth, int aDayOfWeek, int milliseconds){
        return 0; //TODO codavaj!!
    }

    /**
     * Provides the generic difference between the NSTimeZone and Greenwich Mean Time (the offset).
     * Because NSTimeZones represent geopolitical regions, many timezones don't have one, generic offset. The offset can change over time for reasons other than daylight saving purposes. Consequently, this method will return zero except for generic, apolitical time zones of the form GMT+/-hrs or Etc/GMT+/-hrs, like those generated by timeZoneForSecondsFromGMT.
     */
    public int getRawOffset(){
        return 0; //TODO codavaj!!
    }

    public int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Invokes equals with aTZ.
     */
    public boolean hasSameRules(java.util.TimeZone aTZ){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether this NSTimeZone uses daylight savings time at aDate.
     * Invokes isDaylightSavingTimeForTimestamp with an NSTimestamp representing aDate.
     */
    public boolean inDaylightTime(java.util.Date aDate){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether this NSTimeZone currently uses daylight savings time. Invokes isDaylightSavingTimeForTimestamp with an NSTimestamp representing the current instant.
     */
    public boolean isDaylightSavingTime(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether this NSTimeZone uses daylight savings time at aTimestamp.
     * Invoked by: inDaylightTime isDaylightSavingTime
     */
    public boolean isDaylightSavingTimeForTimestamp(com.webobjects.foundation.NSTimestamp aTimestamp){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Invokes equals with aTimeZone.
     */
    public boolean isEqualToTimeZone(com.webobjects.foundation.NSTimeZone aTimeZone){
        return false; //TODO codavaj!!
    }

    /**
     * Provides a list of all of the names and abbreviations known to NSTimeZone.
     */
    public static com.webobjects.foundation.NSArray knownTimeZoneNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Provides an object that forwards all messages to the default time zone in the current locale for the application. This behavior is particularly useful for NSTimestamp objects that are archived or distributed across a network. Such objects may be used in different locales than the one in which they were created.
     */
    public static com.webobjects.foundation.NSTimeZone localTimeZone(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Invokes getID.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException{
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method provided for backward compatibility only. Sets the system time zone to null and posts an NSTimeZone.SystemTimeZoneDidChangeNotification.
     */
    public static void resetSystemTimeZone(){
        return; //TODO codavaj!!
    }

    /**
     * Indicates the difference between the NSTimeZone and Greenwich Mean Time (the offset) at the current instant.
     */
    public int secondsFromGMT(){
        return 0; //TODO codavaj!!
    }

    /**
     * Indicates the difference between the NSTimeZone and Greenwich Mean Time (the offset) at the instant specified by aTimestamp.
     * The NSTimeZone object may change its offset from GMT at different points in the year. For example, the U.S. time zones change offsets with daylight savings time.
     * Because NSTimeZone objects represent geopolitical regions, offsets such as those for daylight savings time may change across different spans. For example, the organization which governs a region may abolish daylight savings time, though daylight savings time would be relevant for moments preceding the abolition.
     */
    public int secondsFromGMTForTimestamp(com.webobjects.foundation.NSTimestamp aTimestamp){
        return 0; //TODO codavaj!!
    }

    /**
     * Changes the time zone provided by getDefault or defaultTimeZone for the application. The default time zone is not the same as the localTimeZone, which cannot be substituted.
     */
    public static void setDefault(java.util.TimeZone aTZ){
        return; //TODO codavaj!!
    }

    /**
     * Changes the time zone provided by getDefault or defaultTimeZone for the application. The default time zone is not the same as the localTimeZone, which cannot be substituted.
     */
    public static void setDefaultTimeZone(com.webobjects.foundation.NSTimeZone aTZ){
        return; //TODO codavaj!!
    }

    /**
     * Irrelevant for NSTimeZone objects, which are not mutable.
     */
    public void setID(java.lang.String anID){
        return; //TODO codavaj!!
    }

    /**
     * Irrelevant for NSTimeZone objects, which are not mutable.
     */
    public void setRawOffset(int offsetMillis){
        return; //TODO codavaj!!
    }

    /**
     * Provides the time zone object representing the system's time zone. This is different from localTimeZone and may be different from the time zone object returned by getDefault.
     */
    public static com.webobjects.foundation.NSTimeZone systemTimeZone(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides an NSTimeZone object representing a fixed offset, specified in seconds, from Greenwich Mean Time. If secondsOffsetFromGMT corresponds to a whole hour between 12 and -12, this method returns an existing, well-known NSTimeZone object that follows the POSIX convention. The time zone name is "Etc/GMT<+/->", where "hour" is a whole number 1-12 and the sign (plus or minus) is the
     * of the sign of the offset. An offset of zero is a special case, for which the time zone name is simply "Etc/GMT".
     * If secondsOffsetFromGMT does not correspond to a whole hour between 12 and -12, this method creates a new time zone for the specified offset, rounded to the nearest minute. In this case, the time zone name is consistent with the Java convention rather than the POSIX convention. The time zone name is "GMT<+/->:", where the hour is always represented by two digits, and where the sign (plus or minus) is the same as the sign of the offset. Time zones created from offsets are always apolitical. They never use daylight savings time, and their offsets are constant throughout the year, and throughout history.
     */
    public static com.webobjects.foundation.NSTimeZone timeZoneForSecondsFromGMT(int secondsOffsetFromGMT){
        return null; //TODO codavaj!!
    }

    /**
     * Provides an NSTimeZone object corresponding to aName. Avoids creating duplicate NSTimeZone objects as much as possible. This method is the recommended way for you to create or retrieve NSTimeZone objects.
     * Invoked by: decodeObject readResolve systemTimeZone timeZoneForSecondsFromGMT
     */
    public static com.webobjects.foundation.NSTimeZone timeZoneWithName(java.lang.String aName, boolean tryAbbreviation){
        return null; //TODO codavaj!!
    }

    /**
     * Use timeZoneWithName instead of calling this method directly.
     * Invoked by: decodeObject readResolve timeZoneForSecondsFromGMT
     */
    public static com.webobjects.foundation.NSTimeZone timeZoneWithNameAndData(java.lang.String aName, com.webobjects.foundation.NSData aData){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether the NSTimeZone ever uses or has used daylight savings time. Only ever true for objects that represent geopolitical regions.
     */
    public boolean useDaylightTime(){
        return false; //TODO codavaj!!
    }

}
