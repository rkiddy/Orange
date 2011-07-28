
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.*;
import java.io.PrintStream;
import java.util.Date;


public class EODynamicApplication extends EOApplication {


    public EODynamicApplication() { return null; }

    protected NSArray defaultActions() { return null; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    protected void finishInitialization() {}

    public void _printActiveWindowComponentHierarchy() {}

    public void _printActiveWindowEditingContexts() {}

    public void _printControllerHierarchy() {}

    public void _runGarbageCollector() {}

    public void _restartApplication() {}

    public void _resetCaches() {}

    static  {}

    public static final Class _CLASS;
    public static final String _ControllerFactoryClassNameArgument = "controllerFactoryClassName";
    private static final String _ControllerCachingArgument = "controllerCaching";
    private static final String _XMLLoggingArgument = "XMLLogging";


    // Unreferenced inner class com/webobjects/eogeneration/EODynamicApplication$1

/* anonymous class */
    class _cls1 extends com.webobjects.eoapplication._EOTimer.CallbackAdaptor {


        _cls1() { return null; }

        public void timerFired(_EOTimer timer, Date date, Date lastFireDate) {}

        final EODynamicApplication this$0;

    }

}
