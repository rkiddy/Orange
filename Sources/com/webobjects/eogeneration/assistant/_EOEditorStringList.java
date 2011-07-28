
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOCustomObject;
import com.webobjects.eogeneration.EOTableColumnController;
import com.webobjects.eogeneration.EOTableController;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation.*;

public class _EOEditorStringList extends EOEntityController {
    public static class _Object extends EOCustomObject {


        public _Object(String string) { return null; }

        public String string() { return null; }

        private String _string;

    }

    public static interface ChangeListener {


        public abstract void stringListChanged(_EOEditorStringList _peoeditorstringlist, NSArray nsarray);

        public abstract void stringListResetToDefaultRequest(_EOEditorStringList _peoeditorstringlist);



        public static final Class _CLASS = null;

    }



    private static NSArray _defaultActions() { return null; }

    public _EOEditorStringList(boolean keepStringsSorted, boolean provideDefaultActions, String label, int tableWidth, int tableHeight, boolean canResizeVertically) { return null; }

    protected void connectionWasEstablished() {}

    public boolean fetchesOnConnect() { return true; }

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    public void setReferenceList(_EOEditorStringList referenceList) {}

    public _EOEditorStringList referenceList() { return null; }

    public void _update(NSArray selection) {}

    public void setStringsWithSelection(NSArray strings, NSArray selection) {}

    public void setStrings(NSArray strings) {}

    public NSArray strings() { return null; }

    public void removeStringsIfPresent(NSArray strings) {}

    public NSArray selectedStrings() { return null; }

    public int numberOfSelectedStrings() { return 0; }

    public int indexOfSingleSelectedString() { return 0; }

    public void setCanResetToDefault(boolean flag) {}

    public boolean canResetToDefault() { return true; }

    protected NSArray defaultActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    public void _addString(String string) {}

    public void _removeString(String string) {}

    private void _removeSelectedStrings() {}

    private void _addFromReferenceList(_EOEditorStringList referenceList) {}

    public void resetToDefault() {}

    public void _fireChangeNotification() {}

    public void addSpecialString(String string) {}

    public void add() {}

    public void remove() {}

    public void up() {}

    public void down() {}

    static  {}

    public static final Class _CLASS = null;
    private static NSMutableArray _defaultActions;
    private NSMutableArray _strings;
    private boolean _keepStringsSorted;
    private boolean _provideDefaultActions;
    private boolean _canResetToDefault;
    private _EOEditorStringList _referenceList;

}
