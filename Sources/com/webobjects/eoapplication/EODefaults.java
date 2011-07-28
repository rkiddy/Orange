
package com.webobjects.eoapplication;

import com.webobjects.foundation.*;

public class EODefaults
    implements NSDisposable {


    public EODefaults() { return null; }

    public void dispose() {}

    protected NSDictionary loadPersistentValues() { return null; }

    protected void savePersistentValues(NSDictionary values) {}

    protected void _loadPersistentValues() {}

    public void flushDefaultsToPersistentStore() {}

    public void _handleQuit(NSNotification notification) {}

    public void clearAllValues() {}

    public void setPersistentValueForKey(Object value, String key) {}

    public void setTransientValueForKey(Object value, String key) {}

    public Object valueForKey(String key) { return null; }

    public NSDictionary allValues() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String _PersistentNumberOfRecentDocumentsParameter = "_EOPersistentNumberOfRecentDocuments";
    public static final String _PersistentRecentDocumentIdentifiersParameter = "_EOPersistentRecentDocumentIdentifiers";
    public static final String _PersistentWindowXParameter = "_EOWindowX";
    public static final String _PersistentWindowYParameter = "_EOWindowY";
    public static final String _PersistentWindowWidthParameter = "_EOWindowWidth";
    public static final String _PersistentWindowHeightParameter = "_EOWindowHeight";
    public static final String _PersistentDialogWidthParameter = "_EODialogWidth";
    public static final String _PersistentDialogHeightParameter = "_EODialogHeight";
    public static final String _PersistentLastItemParameter = "_EOLastItem";
    public static final String _TransientMinimumWidthParameter = "_EOTransientMinimumWidth";
    public static final String _TransientMinimumHeightParameter = "_EOTransientMinimumHeight";
    public static final String _TransientMinimumSubcontrollerAreaWidthParameter = "_EOTransientMinimumSubcontrollerAreaWidth";
    public static final String _TransientMinimumSubcontrollerAreaHeightParameter = "_EOTransientMinimumSubcontrollerAreaHeight";
    public static final String _TransientWindowCountParameter = "_EOTransientWindowCount";
    public static final String _TransientWindowOpenCountParameter = "_EOTransientOpenWindowCount";
    private static final NSSelector _handleQuitSelector;
    private NSMutableDictionary _persistentValues;
    private NSMutableDictionary _transientValues;
    private boolean _persistentValuesLoaded;
    private boolean _persistentValuesSaved;
    public static final String LoadUserDefaultsNotification = "EOLoadUserDefaultsNotification";
    public static final String SaveUserDefaultsNotification = "EOSaveUserDefaultsNotification";
    public static final String DefaultsKey = "defaults";

}
