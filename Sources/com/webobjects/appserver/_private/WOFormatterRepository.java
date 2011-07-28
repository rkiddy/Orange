
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOComponent;
import com.webobjects.foundation.*;
import java.math.BigDecimal;
import java.text.Format;
import java.util.Date;

public class WOFormatterRepository {


    public WOFormatterRepository() { return null; }

    public static NSNumberFormatter numberFormatterForFormatString(String formatString) { return null; }

    private String _reformatDateFormatStringToJDK(String formatString) { return null; }

    public static NSTimestampFormatter dateFormatterForFormatString(String formatString) { return null; }

    public static Format formatterForComponent(WOComponent aComponent, WOAssociation dateFormat, WOAssociation numberFormat, WOAssociation formatter) { return null; }

    public static Format formatterForInstance(Object aValue, WOComponent aComponent, WOAssociation dateFormat, WOAssociation numberFormat, WOAssociation formatter) { return null; }

    static  {}

    public static final String DefaultDateFormat = "%Y/%m/%d";
    public static final String DefaultNumberFormat = "0";
    public static final String DefaultDecimalNumberFormat = "#,##0.00;-(#,##0.00)";
    private static final _NSThreadsafeMutableDictionary TheNumberFormatters;
    private static final _NSThreadsafeMutableDictionary TheDateFormatters;

}
