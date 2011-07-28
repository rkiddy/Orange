
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.*;
import com.webobjects.foundation.*;
import java.awt.Dimension;


public class EOWidgetParametersEditor extends EODocumentController
    implements EOAssistant.Editor, _EOEditorStringSelector.ChangeListener {
    public static interface ValueCustomizer {


        public abstract void refreshWithTaskEntityPropertyKeyParameters(String s, String s1, String s2, boolean flag);



        public static final Class _CLASS = null;

    }



    private void _addValueCustomizers(NSArray customizers, boolean grouped) {}

    public EOWidgetParametersEditor() { return null; }

    protected void connectionWasEstablished() {}

    public int priority() { return 0; }

    private void _refreshForNewQualifier() {}

    private void _refreshForNewEntity() {}

    public void refresh() {}

    public void stringSelectionChanged(_EOEditorStringSelector stringSelector, String string) {}

    static  {}

    public static final Class _CLASS = null;
    private _EOEditorStringSelector _taskSelector;
    private _EOEditorStringSelector _entitySelector;
    private _EOEditorStringSelector _propertyKeySelector;
    private _EOEditorSelectionValueCustomizer _typeCustomizer;
    private NSMutableArray _valueCustomizers;


    // Unreferenced inner class com/webobjects/eogeneration/assistant/EOWidgetParametersEditor$1

/* anonymous class */
    class _cls1
        implements _EOEditorValueCustomizer.DefaultValue {


        _cls1() { return null; }

        public String defaultValueForValueKeyAndSpecification(String valueKey, NSDictionary specification) { return null; }

    }

}
