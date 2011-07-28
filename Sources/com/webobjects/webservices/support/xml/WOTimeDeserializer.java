
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSTimestamp;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.ser.CalendarDeserializer;


public class WOTimeDeserializer extends CalendarDeserializer
    implements WOSoapConstants {


    public WOTimeDeserializer(Class aJavaType, QName anXmlType) { return null; }

    public Object makeValue(String source) { return null; }

    private static final long serialVersionUID = 0x2eec8d45L;

}
