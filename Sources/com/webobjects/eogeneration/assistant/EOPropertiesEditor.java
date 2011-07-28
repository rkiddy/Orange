
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.foundation.*;


public class EOPropertiesEditor extends EOComponentController
    implements EOAssistant.Editor, _EOEditorStringSelector.ChangeListener, _EOEditorStringList.ChangeListener, _EOEditorStringAddition.AdditionListener {


    public EOPropertiesEditor() { return null; }

    protected void connectionWasEstablished() {}

    public int priority() { return 0; }

    private void _refreshForNewQualifier() {}

    public void refresh() {}

    public void stringSelectionChanged(_EOEditorStringSelector stringSelector, String string) {}

    public void stringListChanged(_EOEditorStringList stringList, NSArray strings) {}

    public void stringListResetToDefaultRequest(_EOEditorStringList stringList) {}

    public void stringAdded(_EOEditorStringAddition stringAddition, String string) {}

    static  {}

    public static final Class _CLASS;
    private NSMutableDictionary _specification;
    private NSMutableDictionary _questionIndependentSpecification;
    private boolean _useQuestionIndependentSpecification;
    private _EOEditorStringSelector _entitySelector;
    private _EOEditorStringSelector _taskSelector;
    private _EOEditorStringSelector _questionSelector;
    private _EOEditorStringList _otherKeysList;
    private _EOEditorStringList _keysList;
    private _EOEditorStringAddition _stringAddition;
    private EOActionButtonsController _actionButtonsController;

}
