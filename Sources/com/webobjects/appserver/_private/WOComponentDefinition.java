
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.appserver.parser.WOComponentTemplateParser;
import com.webobjects.appserver.parser.WOHTMLFormatException;
import com.webobjects.appserver.parser.declaration.WODeclarationFormatException;
import com.webobjects.appserver.parser.woml.WOMLTemplateExtensions;
import com.webobjects.eocontrol.EOEventCenter;
import com.webobjects.foundation.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;


public class WOComponentDefinition {
    public static class _EventLoggingEnabler
        implements com.webobjects.eocontrol.EOEventCenter.EventRecordingHandler {

        public _EventLoggingEnabler() { return null; }

        public void setLoggingEnabled(boolean isLogging, Class aClass) {}
    }



    private WOComponentDefinition() { return null; }

    public String _combinedComponentExtension(URL aPathURL) { return null; }

    public WOComponentDefinition(String aName, URL aPathURL, String aURL, String aFrameworkName, String aLanguage) { return null; }

    public void awake() {}

    public void sleep() {}

    public String toString() { return null; }

    public String name() { return null; }

    public URL pathURL() { return null; }

    public String baseURL() { return null; }

    public String frameworkName() { return null; }

    public void setCachingEnabled(boolean aFlag) {}

    public boolean isCachingEnabled() { return true; }

    public synchronized WOElement template() { return null; }

    private String readWoDeclaration(URL wodPath, String suggestedEncoding) { return null; }

    public synchronized NSDictionary archive() { return null; }

    public synchronized String encoding() { return null; }

    public WOComponentReference componentReferenceWithAssociations(NSDictionary someAssociations, WOElement anElement) { return null; }

    private Class _componentClass() { return null; }

    public Class componentClass() { return null; }

    private WOComponent _componentInstanceInContext(WOContext aContext) { return null; }

    public boolean isStateless() { return true; }

    public boolean isCombinedComponent() { return true; }

    private WOComponent _sharedInstanceInContext(WOContext aContext) { return null; }

    public void _checkInComponentInstance(WOComponent aComponentInstance) {}

    public WOComponent componentInstanceInContext(WOContext aContext) { return null; }

    public void finishInitializingComponent(WOComponent aComponent) {}

    public URL pathURLForResourceNamed(String aName, String anExtension, NSArray languages) { return null; }

    static  {}

    public static final WOComponentDefinition NotFound;
    private String _name;
    private URL _pathURL;
    private String _url;
    private String _frameworkName;
    private String _language;
    private String _className;
    Class _componentClass;
    boolean _caching;
    boolean _isAwake;
    boolean _isCombinedComponent;
    private WOElement _template;
    private URL _htmlPath;
    private URL _wodPath;
    private URL _wooPath;
    private URL _womlPath;
    private NSDictionary _archive;
    private String _encoding;
    protected boolean _isStateless;
    private WODeployedBundle _bundle;
    private ArrayList _instancePool;
    private boolean _hasBeenAccessed;
    private boolean _hasContextConstructor;
    private static final Object TheWOComponentConstructorLock;
    public static WOContext TheTemporaryContext;
    protected static boolean _IsEventLoggingEnabled;
    public static String InitEvent;

}
