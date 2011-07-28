
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.text.Format;


public abstract class EOFormatValueController extends EOValueController
    implements EOWidgetController.FormatWidget {


    public EOFormatValueController() { return null; }

    public EOFormatValueController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void setFormatAllowed(boolean flag) {}

    public boolean isFormatAllowed() { return true; }

    public void setFormatClass(Class formatClass) {}

    public Class formatClass() { return null; }

    public void setFormatPattern(String formatPattern) {}

    public String formatPattern() { return null; }

    protected Format formatForAssociation() { return null; }

    static  {}

    public static final Class _CLASS;
    private boolean _formatAllowed;
    private Class _formatClass;
    private String _formatPattern;

}
