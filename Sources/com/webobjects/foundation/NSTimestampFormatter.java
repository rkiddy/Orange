package com.webobjects.foundation;

/**
 * <p>
 * Instances of NSTimestampFormatter format NSTimestamps into their textual representations and convert textual representations of dates and times into NSTimestamps. You have a great degree flexibility when expressing dates and times: "Thu 22 Dec 1994" is just as acceptable as "12/22/94".
 * </p><p>
 * You can associate a timestamp pattern with a WOString or WOTextField dynamic element. WebObjects uses an NSTimestampFormatter object to perform the appropriate conversions.
 * </p><p>
 * You can also create an NSTimestampFormatter with the constructor, provide a timestamp pattern string, and use the format and parseObject methods of <code>java.text.Format</code> to convert between NSTimestamps and their textual representations:
 * 
 * <blockquote><pre>
 *      NSTimestampFormatter formatter = new NSTimestampFormatter("%m/%d/%y");
 *      String description = formatter.format(myNSTimestamp);
 *      NSTimestampFormatter formatter = new NSTimestampFormatter("%m/%d/%y");
 *      NSTimestamp myNSTimestamp = (NSTimestamp) formatter.parseObject(myTimestampString);
 * </pre></blockquote>
 * </p>
 * The default pattern for NSTimestampFormatter is <code>%Y-%m-%d %H:%M:%S %Z</code>. You can specify a pattern whenever you create a NSTimestampFormatter. This pattern is a string that contains specifiers that are very similar to those used in the standard C library function <strong>strftime()</strong>. When NSTimestampFormatter converts a date to a string, it uses this pattern.
 * </p><p>
 * The date conversion specifiers cover a range of date conventions.
 * </p>
 * <table border="1">
 * <caption>Conversion Specifiers</caption>
 * <tr><th>Specifier</th><th>Description</th></tr>
 * <tr><td>%%</td><td>a '%' character</td></tr>
 * <tr><td>%a</td><td>abbreviated weekday name</th></tr>
 * <tr><td>%A</td><td>full weekday name</th></tr>
 * <tr><td>%b</td><td>abbreviated month name</th></tr>
 * <tr><td>%B</td><td>full month name</th></tr>
 * <tr><td>%c</td><td>shorthand for "%X %x", the locale format for date and time</th></tr>
 * <tr><td>%d</td><td>day of the month as a decimal number (01-31)</th></tr>
 * <tr><td>%e</td><td>same as %d but does not print the leading 0 for days 1 through 9</th></tr>
 * <tr><td>%F</td><td>milliseconds as a decimal number (000-999)</th></tr>
 * <tr><td>%H</td><td>hour based on a 24-hour clock as a decimal number (00-23)</th></tr>
 * <tr><td>%I</td><td>hour based on a 12-hour clock as a decimal number (01-12)</th></tr>
 * <tr><td>%j</td><td>day of the year as a decimal number (001-366)</th></tr>
 * <tr><td>%m</td><td>month as a decimal number (01-12)</th></tr>
 * <tr><td>%M</td><td>minute as a decimal number (00-59)</th></tr>
 * <tr><td>%p</td><td>AM/PM designation for the locale</th></tr>
 * <tr><td>%S</td><td>second as a decimal number (00-59)</th></tr>
 * <tr><td>%w</td><td>weekday as a decimal number (0-6), where Sunday is 0. Note: this is not implemented in the current version.</th></tr>
 * <tr><td>%x</td><td>date using the date representation for the locale</th></tr>
 * <tr><td>%X</td><td>time using the time representation for the locale</th></tr>
 * <tr><td>%y</td><td>year without century (00-99)</th></tr>
 * <tr><td>%Y</td><td>year with century (such as 1990)</th></tr>
 * <tr><td>%Z</td><td>time zone name (such as "Europe/Paris" or "PST")</th></tr>
 * <tr><td>%z</td><td>time zone offset from GMT in hours and minutes (such as "+0200" or "-1200")</th></tr>
 * </table>
 * <p>
 * Note that time zone names can not contain spaces. For example, "Pacific Daylight Time" is not a valid time zone name, but "America/Los_Angeles" and "PDT" are both valid.
 * </p><p>
 * Alternatively, you can specify the pattern using Sun's date pattern specifiers. See Sun's documentation for the java.text.SimpleDateFormat class for more information.
 * </p><p>
 * When you convert a string without a time zone specification to an NSTimestamp, the formatter assumes the time zone is the default parse time zone. An analogous time zone, called the default format time zone, is used when converting an NSTimestamp to a string. 
 * Sometimes you need to give the user a choice of time zones. For example, you might put the time zones in a pop-up list. In such cases, you can use the parseObjectInUTC method to parse a date string for the UTC time zone. The following code shows how you can compute the offset from UTC for the particular time zone the user chooses and add it to the parsed timestamp:
 * <blockqoute><pre>
 * NSTimestamp date = (NSTimestamp) myFormatter.parseInUTC(myString);
 * NSTimeZone tz = NSTimeZone.timeZoneWithName(myTimeZoneName);
 * int offset = tz.secondsFromGMTForTimestamp(date);
 * long milliseconds = date.getTime() - offset * 1000;
 * NSTimestamp dateWithTimeZone = new NSTimestamp(milliseconds);
 * </pre></blockqoute>
 * </p>
 */
public class NSTimestampFormatter extends java.text.Format implements java.io.Serializable{

}
