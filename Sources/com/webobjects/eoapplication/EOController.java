
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation.*;
import java.lang.reflect.*;
import java.util.Enumeration;
import java.util.NoSuchElementException;


public abstract class EOController
    implements NSDisposable, NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions, EOAction.Enabling {
    public static interface Enumeration
        extends java.util.Enumeration {
        public static abstract class _Abstract
            implements Enumeration {


            public _Abstract(Class controllerInterface) { return null; }

            public abstract boolean hasMoreElements();

            public Object nextElement() { return null; }

            public EOController nextController() { return null; }

            Class _controllerInterface;

        }


        public abstract EOController nextController();
    }

    public static interface _DisposeCallback {


        public abstract boolean _shouldControllerBeDisposed(EOController eocontroller);

        public abstract void _controllerDisposed(EOController eocontroller);



        public static final Class _CLASS = null;

    }



    public static EOController _newController(String controllerClassName) { return null; }

    public static void _disposeController(EOController controller) { return null; }

    public EOController() { return null; }

    public EOController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    private void _disposeObjectsInRegistry() {}

    protected boolean _disposeIfTransientAndNotExplicitlyForbidden() { return true; }

    protected boolean disposeIfTransient() { return true; }

    public NSDisposableRegistry disposableRegistry() { return null; }

    public void _addToDisposableRegistry(NSDisposable disposable) {}

    public void _setDisposeCallback(_DisposeCallback disposeCallback) {}

    public _DisposeCallback _disposeCallback() { return null; }

    protected void setTransientExplicitlyForbidden(boolean flag) {}

    protected boolean isTransientExplicitlyForbidden() { return true; }

    public void setTypeName(String typeName) {}

    public String typeName() { return null; }

    private String _defaultsKey(String key) { return null; }

    public void _setDefaultsValueForKey(Object value, String key, boolean persistentValue) {}

    public Object _defaultsValueForKey(String key) { return null; }

    public void _setPersistentIntDefaultsValueForKey(int value, String key) {}

    public void _setTransientIntDefaultsValueForKey(int value, String key) {}

    public int _intDefaultsValueForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    private Object _hierarchicalThingForKey(Class controllerInterface, String key, boolean startAtSupercontroller, boolean returnController) { return null; }

    public Object _hierarchicalValueForKey(Class controllerInterface, String key, boolean startAtSupercontroller) { return null; }

    public Object hierarchicalValueForKey(Class controllerInterface, String key) { return null; }

    protected EOController _hierarchicalControllerForKey(Class controllerInterface, String key, boolean startAtSupercontroller) { return null; }

    public EOController hierarchicalControllerForKey(Class controllerInterface, String key) { return null; }

    public Object _valueForProviderMethodName(String providerMethodName) { return null; }

    public boolean _hasSubcontrollers() { return true; }

    public int _numberOfSubcontrollers() { return 0; }

    public NSArray subcontrollers() { return null; }

    protected boolean setSupercontroller(EOController controller) { return true; }

    public EOController supercontroller() { return null; }

    public EOController supercontroller(Class controllerInterface) { return null; }

    protected void subcontrollerWasAdded(EOController eocontroller) {}

    protected void subcontrollerWasRemoved(EOController eocontroller) {}

    public void addSubcontroller(EOController controller) {}

    protected void removeSubcontroller(EOController controller) {}

    public void removeFromSupercontroller() {}

    protected boolean removeTransientSubcontroller(EOController controller) { return true; }

    public boolean isSupercontrollerOfController(EOController controller) { return true; }

    public boolean isAncestorOfController(EOController controller) { return true; }

    public boolean canBeTransient() { return true; }

    public void _raiseBecauseOfMissingSupercontroller(Class supercontrollerInterface, String operationDescription, String conditionDescription) {}

    public void _raiseBecauseOfMissingProperty(String propertyDescription, String operationDescription, String conditionDescription) {}

    public void _raiseBecauseOfIllegalPropertyChange(String propertyDescription, String stateDescription, boolean propertyChangeAllowedAfterStateChange) {}

    public void _raiseBecauseOfIllegalProviderMethodNameChangeAfterGeneration(String propertyDescription, String generationObjectDescription) {}

    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask) {}

    protected void setConnected(boolean flag) {}

    public boolean isConnected() { return true; }

    protected boolean _hasEverBeenConnected() { return true; }

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    public void establishConnection() {}

    public void breakConnection() {}

    public void establishConnectionToSupercontrollers() {}

    public void breakConnectionToSubcontrollers() {}

    public Enumeration controllerEnumeration(int enumerationType, Class controllerInterface) { return null; }

    public NSArray controllersInEnumeration(int enumerationType, Class controllerInterface) { return null; }

    public void invokeMethod(int enumerationType, Class controllerInterface, String methodName, Class parameterTypes[], Object parameters[]) {}

    private Boolean _invokeBooleanMethodOnController(EOController controller, String booleanMethodName, Class parameterTypes[], Object parameters[]) { return null; }

    public EOController _controllerMatchingBooleanValue(int enumerationType, Class controllerInterface, String booleanMethodNameWithoutParameters, boolean matchValue) { return null; }

    public NSArray _controllersMatchingBooleanValue(int enumerationType, Class controllerInterface, String booleanMethodNameWithoutParameters, boolean matchValue) { return null; }

    public boolean _invokeBooleanMethodStopOnMatchingValue(int enumerationType, Class controllerInterface, String booleanMethodName, boolean stopValue, Class parameterTypes[], Object parameters[]) { return true; }

    public boolean _canFindControllerWithBooleanValue(int enumerationType, Class controllerInterface, String booleanMethodNameWithoutParameters, boolean matchValue) { return true; }

    private boolean _controllerMatchesKeyValuePair(EOController controller, String key, Object value) { return true; }

    private boolean _controllerMatchesKeyValuePairs(EOController controller, NSDictionary keyValuePairs) { return true; }

    public EOController controllerWithKeyValuePair(int enumerationType, Class controllerInterface, String key, Object value) { return null; }

    public EOController controllerWithKeyValuePairs(int enumerationType, Class controllerInterface, NSDictionary keyValuePairs) { return null; }

    public NSArray controllersWithKeyValuePair(int enumerationType, Class controllerInterface, String key, Object value) { return null; }

    public NSArray controllersWithKeyValuePairs(int enumerationType, Class controllerInterface, NSDictionary keyValuePairs) { return null; }

    public void setAdditionalActions(NSArray additionalActions) {}

    public NSArray additionalActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    public void enableActionNamed(String actionName) {}

    public void disableActionNamed(String actionName) {}

    public boolean isActionNamedEnabled(String actionName) { return true; }

    public void resetActions() {}

    public NSArray actionNames() { return null; }

    public EOAction actionWithName(String actionName) { return null; }

    protected NSArray defaultActions() { return null; }

    public NSArray actions() { return null; }

    public NSArray enabledActions() { return null; }

    public void setAdditionalKeyValuePairs(NSDictionary dictionary) {}

    public NSDictionary additionalKeyValuePairs() { return null; }

    public void setAdditionalKeyValuePair(Object value, String key) {}

    public void _setInfo(Object value, String key) {}

    public Object _info(String key) { return null; }

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS = null;
    public static final int ControllerAndSubcontrollersEnumeration = 0;
    public static final int SubcontrollersEnumeration = 1;
    public static final int SupercontrollersEnumeration = 2;
    public static final int ControllerAndSupercontrollersEnumeration = 3;
    private static final char _ProviderMethodNameClassAndStaticMethodNameSeparator = 58;
    private static final char _ProviderMethodNameSupercontrollerIdentifier = 94;
    private String _typeName;
    private EOController _supercontroller;
    private NSMutableArray _subcontrollers;
    private boolean _isConnected;
    private boolean _hasEverBeenConnected;
    private NSArray _actions;
    private NSArray _additionalActions;
    private NSMutableArray _enabledActions;
    private NSMutableArray _disabledActionNames;
    private NSDisposableRegistry _disposableRegistry;
    private _DisposeCallback _disposeCallback;
    private boolean _transientExplicitlyForbidden;
    private NSDictionary _additionalKeyValuePairs;
    private NSMutableDictionary _info;

}
