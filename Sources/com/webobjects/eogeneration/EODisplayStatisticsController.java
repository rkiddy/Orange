
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EODelayedObserver;
import com.webobjects.eocontrol.EOObserverCenter;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.eointerface.swing.EOTextField;
import com.webobjects.foundation.*;
import java.awt.Font;


public class EODisplayStatisticsController extends EOStaticLabelController {
    public class _DisplayGroupObserver extends EODelayedObserver {


        public _DisplayGroupObserver() { return null; }

        public void subjectChanged() {}

        final EODisplayStatisticsController this$0;

    }



    public EODisplayStatisticsController() { return null; }

    public EODisplayStatisticsController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public boolean canBeTransient() { return true; }

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    protected void componentDidBecomeVisible() {}

    protected Font _preferredFont() { return null; }

    protected int _preferredAlignment() { return 0; }

    public void setDisplayPattern(String displayPattern) {}

    public String displayPattern() { return null; }

    public void setDisplayGroupProviderMethodName(String string) {}

    public String displayGroupProviderMethodName() { return null; }

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    public void setDisplayGroup(EODisplayGroup displayGroup) {}

    public EODisplayGroup displayGroup() { return null; }

    public void subjectChanged() {}

    static  {}

    public static final Class _CLASS;
    private static final String _DefaultPattern = "# (*)";
    private static final String _DisplayedPatternIdentifier = "*";
    private static final String _SelectedPatternIdentifier = "#";
    private String _displayPattern;
    private String _displayGroupProviderMethodName;
    private EODisplayGroup _displayGroup;
    private _DisplayGroupObserver _observer;

}
