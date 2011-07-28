
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOComponentDefinition;
import com.webobjects.appserver.parser.WOComponentTemplateParser;
import com.webobjects.appserver.parser.WOHTMLFormatException;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.appserver.parser.woml.WOMLNamespaceProvider;
import com.webobjects.eocontrol.EOEventCenter;
import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.*;


public class WOComponent extends WOElement
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions, NSValidation, WOActionResults, Cloneable, Serializable {
    public static class _EventLoggingEnabler
        implements com.webobjects.eocontrol.EOEventCenter.EventRecordingHandler {

        public _EventLoggingEnabler() { return null; }

        public void setLoggingEnabled(boolean isLogging, Class aClass) {}
    }

    public static class Event extends WOEvent {


        public Event() { return null; }

        public String displayComponentName() { return null; }

        public String comment() { return null; }

        private static final long serialVersionUID = 0x9b8b6efL;

    }



    protected String _templateNameForClass(Class aClass) { return null; }

    /**
     * @deprecated Method WOComponent is deprecated
     */

    public WOComponent() { return null; }

    public WOComponent(WOContext aContext) { return null; }

    public Object clone() throws CloneNotSupportedException { return null; }

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    public String toString() { return null; }

    public String name() { return null; }

    /**
     * @deprecated Method path is deprecated
     */

    public String path() { return null; }

    public URL pathURL() { return null; }

    public String baseURL() { return null; }

    public String frameworkName() { return null; }

    public void setCachingEnabled(boolean aFlag) {}

    public boolean isCachingEnabled() { return true; }

    public void _setContext(WOContext aContext) {}

    public void _setIsPage(boolean aFlag) {}

    public boolean _isPage() { return true; }

    public WOComponentDefinition _componentDefinition() { return null; }

    public WOElement template() { return null; }

    public WOElement _childTemplate() { return null; }

    public void pullValuesFromParent() {}

    public void pushValuesToParent() {}

    public void _cleanUpStatelessComponent() {}

    private void _doPushValuesUp() {}

    public void _setParent(WOComponent aParent, NSMutableDictionary anAssociationsDict, WOElement aContentElement) {}

    /**
     * @deprecated Method templateWithName is deprecated
     */

    public WOElement templateWithName(String aName) { return null; }

    private void _doSetSubcomponent(WOComponent aComponent, String anElementID) {}

    public void _setSubcomponent(WOComponent aChild, String anElementId) {}

    public WOComponent _subcomponentForElementWithID(String anElementID) { return null; }

    public NSArray bindingKeys() { return null; }

    public WOAssociation _associationWithName(String aBindingName) { return null; }

    public boolean isStateless() { return true; }

    public void reset() {}

    public boolean synchronizesVariablesWithBindings() { return true; }

    public Object valueForBinding(String aBindingName) { return null; }

    protected Object __valueForBinding(String binding) { return null; }

    public boolean valueForBooleanBinding(String binding, boolean defaultValue) { return true; }

    public Number valueForNumberBinding(String binding, Number defaultValue) { return null; }

    public Integer valueForIntegerBinding(String binding, Number defaultValue) { return null; }

    public String valueForStringBinding(String binding, String defaultValue) { return null; }

    public NSArray valueForNSArrayBindings(String binding, NSArray defaultValue) { return null; }

    public NSDictionary valueForNSDictionaryBindings(String binding, NSDictionary defaultValue) { return null; }

    public void setValueForBinding(Object aValue, String aBindingName) {}

    public boolean hasBinding(String aBindingName) { return true; }

    public boolean canGetValueForBinding(String aBindingName) { return true; }

    public boolean canSetValueForBinding(String aBindingName) { return true; }

    public void awake() {}

    public void _awakeInContext(WOContext aContext) {}

    public void ensureAwakeInContext(WOContext aContext) {}

    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {}

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) { return null; }

    public void appendToResponse(WOResponse aResponse, WOContext aContext) {}

    public void _sleepInContext(WOContext aContext) {}

    public void sleep() {}

    public WOComponent parent() { return null; }

    public WOActionResults performParentAction(String anActionName) { return null; }

    public WOComponentVariable variableWithName(String name) { return null; }

    public Object variableValueForName(String name) { return null; }

    public void setVariableValueForName(String name, Object value) {}

    public WOApplication application() { return null; }

    public WOContext context() { return null; }

    public boolean hasSession() { return true; }

    public WOSession session() { return null; }

    public WOComponent pageWithName(String aName) { return null; }

    /**
     * @deprecated Method logString is deprecated
     */

    public static void logString(String string) { return null; }

    /**
     * @deprecated Method debugString is deprecated
     */

    public static void debugString(String string) { return null; }

    public void validationFailedWithException(Throwable t, Object value, String keyPath) {}

    public Object validateValueForKey(Object value, String key) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public Object validateTakeValueForKeyPath(Object value, String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    /**
     * @deprecated Method templateWithHTMLString is deprecated
     */

    public static WOElement templateWithHTMLString(String anHTMLString, String aDeclarationString, NSArray aLanguageArray) { return null; }

    /**
     * @deprecated Method templateWithHTMLString is deprecated
     */

    public static WOElement templateWithHTMLString(String referenceName, String anHTMLString, String aDeclarationString, NSArray aLanguageArray, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) { return null; }

    public static WOElement templateWithHTMLString(String frameworkName, String referenceName, String anHTMLString, String aDeclarationString, NSArray aLanguageArray, WOAssociationFactory associationFactory, WOMLNamespaceProvider namespaceProvider) { return null; }

    public String descriptionForResponse(WOResponse aResponse, WOContext aContext) { return null; }

    public WOResponse generateResponse() { return null; }

    private WOResponse _generateResponseInContext(WOContext aContext) { return null; }

    private void _appendPageToResponse(WOResponse aResponse, WOContext aContext) {}

    public Object _unroll() { return null; }

    public void set_unroll(Object obj) {}

    public Object _componentUnroll() { return null; }

    public void set_componentUnroll(Object obj) {}

    public boolean isEventLoggingEnabled() { return true; }

    private Event _markStartOfEventIfNeeded(String eventName) { return null; }

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    NSArray _subcomponents() { return null; }

    static  {}

    static final long serialVersionUID = 0x3fec616aL;
    private String _name;
    private NSMutableDictionary _subcomponents;
    private String _templateName;
    private transient WOElement _template;
    private transient WOComponentDefinition _componentDefinition;
    private transient WOComponent _parent;
    private NSMutableDictionary _variables;
    private NSMutableDictionary _variableValues;
    public transient NSMutableDictionary _keyAssociations;
    private transient WOElement _childTemplate;
    private transient WOContext _context;
    private transient WOSession _session;
    private boolean _isPage;
    private boolean _caching;
    private boolean _isSynchronized;
    private static NSMutableDictionary TheTemplateNameDictionary;
    protected static String _Extension;
    private static final Class _ContextParameter[];
    protected static boolean _IsEventLoggingEnabled;
    private static final String TakeValuesFromRequestEvent = "takeValuesFromRequest";
    private static final String InvokeActionForRequestEvent = "invokeActionForRequest";
    private static final String AppendToResponseEvent = "appendToResponse";
    private static final String AwakeEvent = "awake";
    private static final String SleepEvent = "sleep";

}
