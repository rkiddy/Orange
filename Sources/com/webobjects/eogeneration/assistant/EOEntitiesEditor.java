
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.*;
import com.webobjects.foundation.*;


public class EOEntitiesEditor extends EOComponentController
    implements EOAssistant.Editor, _EOEditorStringList.ChangeListener {


    public EOEntitiesEditor() { return null; }

    protected void connectionWasEstablished() {}

    public int priority() { return 0; }

    public void refresh() {}

    public void stringListChanged(_EOEditorStringList stringList, NSArray strings) {}

    public void stringListResetToDefaultRequest(_EOEditorStringList stringList) {}

    static  {}

    public static final Class _CLASS;
    private _EOEditorStringList _mainEntitiesList;
    private _EOEditorStringList _enumerationEntitiesList;
    private _EOEditorStringList _otherEntitiesList;

}
