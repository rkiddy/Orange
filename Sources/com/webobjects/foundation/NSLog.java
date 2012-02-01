package com.webobjects.foundation;
/**
 * NSLog is a static class that is used to access the WebObjects Foundation logging system. It allows you to log debugging messages and provides functionality for controlling the level and focus of debugging output. Logging with NSLog offers greater flexibility and integration with the WebObjects runtime and debugging system than does logging with System.out, System.err, or java.rmi.server.LogStream.
 * By specifying debug groups and the debug level using NSLog's methods, you can control the scope and granularity of debugging output. Perhaps you are only interested in seeing debugging output that relates to the Enterprise Objects Framework, or more specifically, debugging output that relates to database fetches. NSLog is designed to allow you to specify the output based on predefined debug groups and levels.
 * Although NSLog provides functionality for advanced debugging, it is also as simple to use as System.out:
 * The above code outputs WebObjects in the console by default, but output can be directed to custom NSLog.Logger classes.
 * The logging system is made up of three classes: NSLog and NSLog.Logger, and NSLog.PrintStreamLogger. NSLog provides methods for controlling the level (amount of information sent to the logger) and focus (scope of the information sent to the logger) of debugging output. NSLog.Logger is an abstract class that provides the basic functionality for NSLog.
 * NSLog also provides two concrete subclasses of NSLog.Logger: NSLog.PrintStreamLogger and NSLog.Log4JLogger. NSLog.PrintStreamLogger appends information to a java.io.PrintStream pointing to System.out or System.err, or to a custom java.io.PrintStream. NSLog.Log4JLogger appends information to an org.apache.log4j.Logger.
 * The NSLog class cannot be instantiated.
 * NSLog offers the ability to redirect output to custom java.io.PrintStreams, such as local files. Note that setting the WOOutputPath property in WOApplication will automatically redirect output from NSLog to the specified file. This example illustrates manually appending error output to the local file /Local/Users/log.txt:
 * NSLog also allows developer to use their own custom subclasses of NSLog.Logger or NSLog.PrintStreamLogger to implement custom behavior. By subclassing NSLog.Logger instead of NSLog.PrintStreamLogger, you can provide custom logging implementations that are not based on java.io.PrintStreams, such as outputting to email, Swing windows, etc. In the following example, a custom Logger is used to capture error messages:
 * To control the scope of the debug information that is sent to the logger, NSLog declares a number of debug groups. By default, logging is enabled for all the debug groups declared by NSLog, except DebugGroupParsing. All the WebObjects frameworks, including Foundation and EOF, use NSLog for debugging, and rely on debug groups to control the scope of their debug logging.
 * As an example, this code uses debug groups to disable logging for debug information related to the Enterprise Objects Framework:
 * Before sending debug information to the logger, all classes that log EOF-related debug information check to see if debug logging is allowed for EOF-related issues using one of the debugLoggingAllowedFor... methods. Since the above code removed the DebugGroupEnterpriseObjects bit from the bit mask, EOF-related issues won't be sent to the logger.
 * To control the granularity of debug information that is sent to the logger, NSLog declares a number of debug levels. A debug level specifies the importance of the information displayed in a message. These messages may be the result of exceptions or errors, but may also just be informational, such as printing variable values.
 * When an exception is encountered, the exception message should always be output, but the stack trace should only be output if a particular level of debugging is requested:
 * When you desire to see the value of a variable at particular points in the application, DebugLevelInformational can be used to control logging. Logging the values of variables can be expensive, so it is prudent to wrap this kind of logging in a debug level conditional. For instance, you should conditionalize the logging of values in an array like this:
 * DebugLevelDetailed should be used to conditionalize logging for computationally intensive tasks, such as JDBC function calls.
 * Note that if the allowed debug level is specified using the setAllowedDebugLevel method, messages of that level and lower will be logged. That is, DebugLevelDetailed will also log messages of level DebugLevelInformational and messages of level DebugLevelCritical. Likewise, DebugLevelInformational will also log messages of level DebugLevelCritical, but not messages of level DebugLevelDetailed.
 * NSLog uses a bit mask to specify a set of debug groups, which means that you can easily create a custom debug groups mask for more flexible logging. For instance, if the requirement is logging debugging output only for EOF-related issues and EOModel-related issues, you can simply bitwise inclusive OR the groups together using the | operator in Java. That creates a debug groups mask which can be used to more flexibly monitor and log errors relating to those two issues. To do this:
 * In addition to the debug groups provided by WebObjects, new debug groups can be added. The high 32 bits (i.e. bits 32 - 63) are available to developers. The low bits are reserved by WebObjects An example of declaring a new debug group:
 * Debug groups and levels can be enabled from the command line, or in Properties files by setting values for the properties NSDebugLevel and NSDebugGroups. You can enable multiple debug groups by name, by bit position, or both. A series of examples:
 * The following tables display the values of different debug groups and debug levels:
 * See Also:NSLog.Logger
 */
public final class NSLog{
    /**
     * Logger sending error to system error file.
     */
    public static com.webobjects.foundation.NSLog.Logger debug;

    /**
     * The debug group for logging of general application generation issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupApplicationGeneration=8l;

    /**
     * The debug group for logging of encoding and decoding issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupArchiving=64l;

    /**
     * The debug group for logging of association exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupAssociations=524288l;

    /**
     * The debug group for logging of binding exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupComponentBindings=512l;

    /**
     * The debug group for logging issues related to components and component definitions.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupComponents=67108864l;

    /**
     * The debug group for logging of controller exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupControllers=1048576l;

    /**
     * The debug group for logging of database access exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupDatabaseAccess=65536l;

    /**
     * The debug group for logging of Monitor, wotaskd, and deployment related issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupDeployment=4194304l;

    /**
     * The debug group for enabling logging of general EOF issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupEnterpriseObjects=2l;

    /**
     * The debug group for logging of formatting exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupFormatting=1024l;

    /**
     * The debug group for logging of I/O exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupIO=8192l;

    /**
     * The debug group for logging issues related to JSP or Servlet integration.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupJSPServlets=134217728l;

    /**
     * The debug group for logging of key value coding exceptions and problems
     * See Also:Constant Field Values
     */
    public static final long DebugGroupKeyValueCoding=256l;

    /**
     * The debug group for logging of EOModel exceptions, problems, and inconsistencies.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupModel=32768l;

    /**
     * The debug group for logging of threading issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupMultithreading=16l;

    /**
     * The debug group for logging of HTML parsing issues and other HTML-related issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupParsing=8388608l;

    /**
     * The debug group for logging of qualifier issues
     * See Also:Constant Field Values
     */
    public static final long DebugGroupQualifiers=2048l;

    /**
     * The debug group for logging of class introspection issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupReflection=16777216l;

    /**
     * The debug group for logging of issues related to the request-response loop.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupRequestHandling=33554432l;

    /**
     * The debug group for logging of resource loading/lookup exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupResources=32l;

    /**
     * The debug group for logging of dynamic rule system issues and logging issues
     * See Also:Constant Field Values
     */
    public static final long DebugGroupRules=2097152l;

    /**
     * The debug group for logging of SQL generation issues and logging.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupSQLGeneration=131072l;

    /**
     * The debug group for logging of dynamic rule system issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupTiming=16384l;

    /**
     * The debug mask for logging of widget set and view exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupUserInterface=262144l;

    /**
     * The debug group for logging of validation exceptions and problems.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupValidation=128l;

    /**
     * The debug group for enabling logging of general WebObjects framework issues.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupWebObjects=4l;

    /**
     * The debug group for logging issues related to Web Services.
     * See Also:Constant Field Values
     */
    public static final long DebugGroupWebServices=268435456l;

    /**
     * Logs debug messages that should not be sent in non-debug mode, such as stack traces. Logging with this debug level is not likely to affect the performance of the application.
     * See Also:Constant Field Values
     */
    public static final int DebugLevelCritical=1;

    /**
     * Logs debug messages that qualify as computationally intensive, such as JDBC function calls. Logging with this debug level will slow the application considerably.
     * See Also:Constant Field Values
     */
    public static final int DebugLevelDetailed=3;

    /**
     * Logs debug messages that don't qualify as computationally intensive. Logging with this debug level will slow the application only moderately.
     * See Also:Constant Field Values
     */
    public static final int DebugLevelInformational=2;

    /**
     * Logs no messages. The default.
     * See Also:Constant Field Values
     */
    public static final int DebugLevelOff=0;

    /**
     * Logger sending output to system error file.
     */
    public static com.webobjects.foundation.NSLog.Logger err;

    /**
     * Logger sending output to system output file.
     */
    public static com.webobjects.foundation.NSLog.Logger out;

    /**
     * Enables logging for the debug group or the debug groups mask specified by aDebugGroups by adding it (via bitwise inclusive OR) to the debug groups mask. For instance, to allow debug logging for EOF-related issues, add the EOF debug group, DebugGroupEnterpriseObjects to the mask:
     * blockquote
     * NSLog.allowDebugLoggingForGroups(DebugGroupEnterpriseObjects);
     * /blockquote
     * This differs from setAllowedDebugGroups in that allowDebugLoggingForGroups adds debug groups and debug groups masks to the existing bit mask in NSLog. setAllowedDebugGroups, however, replaces the existing bit mask in NSLog with the debug group or debug groups mask it is passed. For example,
     * blockquote
     * // This will add the EOF debug group to the mask: NSLog.allowDebugLoggingForGroups(DebugGroupEnterpriseObjects); // This will replace all debug groups and masks in // the bit mask with the EOF debug group NSLog.setAllowedDebugGroups(DebugGroupEnterpriseObjects);
     * /blockquote
     * Use the refuseDebugLoggingForGroups method to disallow specific debug groups.
     * By default, logging is allowed for all debug groups. If you set the debug level to be high (for example, DebugLevelDetailed), the debugging output may be overwhelming.
     */
    public static void allowDebugLoggingForGroups(long aDebugGroups){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Invokes NSLog.debug.allowedDebugLevel().
     */
    public static int allowedDebugLevel(){
        return 0; //TODO codavaj!!
    }

    /**
     * Allow debug logging if the groups specified by aDebugGroups are enabled (that is, the debug groups are part of the debug groups enabled by allowDebugLoggingForGroups or setAllowedDebugGroups). This method will return false if allowedDebugLevel returns DebugLevelOff. See
     * Creating Custom Debug Groups
     * in the class concepts for examples of how to create a custom debug groups bit mask.
     */
    public static boolean debugLoggingAllowedForGroups(long aDebugGroups){
        return false; //TODO codavaj!!
    }

    /**
     * Allow debug logging if aDebuglevel is less than or equal to the debug level provided by allowedDebugLevel. This is because the highest debug level, DebugLevelDetailed, implies DebugLevelInformational which implies DebugLevelCritical. See
     * Debug Levels
     * in the class concepts for more information.
     */
    public static boolean debugLoggingAllowedForLevel(int aDebugLevel){
        return false; //TODO codavaj!!
    }

    /**
     * Invokes debugLoggingAllowedForGroups and debugLoggingAllowedForLevel. Returns true if both of these methods return true.
     */
    public static boolean debugLoggingAllowedForLevelAndGroups(int aDebugLevel, long aDebugGroups){
        return false; //TODO codavaj!!
    }

    /**
     * Provides a java.io.PrintStream object representing the file specified by aPath. If the stream cannot be created, returns null, but no exception will be thrown.
     */
    public static java.io.PrintStream printStreamForPath(java.lang.String aPath){
        return null; //TODO codavaj!!
    }

    /**
     * Disables debug logging for the debug groups mask specified by aDebugGroups.
     * By default, logging is allowed for all debug groups. If the debug level is set to be high (for example, DebugLevelDetailed), the debugging output may be overwhelming.
     */
    public static void refuseDebugLoggingForGroups(long aDebugGroups){
        return; //TODO codavaj!!
    }

    /**
     * Specifies the set (the bit mask) of allowed debug groups. Typically, this method is invoked at the beginning of the application execution, since it affects logging behavior in the entire application, and completely overrides the global debug groups mask. If it is required to turn logging on for a smaller scope and for a shorter period of execution, allowDebugLoggingForGroups and refuseDebugLoggingForGroups should be used.
     * Note: This method completely overrides the global debug groups mask, and affects logging behavior in the entire application. It is suggested that it is used once at the beginning of application execution.
     * By default, logging is allowed for all debug groups. If the debug level is set to be high (for example, DebugLevelDetailed), the debugging output may be overwhelming.
     */
    public static void setAllowedDebugGroups(long aDebugGroups){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Invokes setAllowedDebugLevel on NSLog.debug.
     * NOTE: NSLog stores no state regarding debug level. If you replace NSLog.debug using setDebug(Logger), you must invoke NSLog.debug.setAllowedDebugLevel. Otherwise, use setDebug(Logger, int).
     */
    public static void setAllowedDebugLevel(int aDebugLevel){
        return; //TODO codavaj!!
    }

    /**
     * Sets the debugging logger NSLog.debug to instance. By default, NSLog.debug is an NSLog.PrintStreamLogger that sends its output to System.err. NSLog.debug is used for status and error messages that will conditionally be shown. If instance is null, no change will be made.
     * NOTE: NSLog itself stores no state regarding debug level. After calling this method, you must invoke NSLog.debug.setAllowedDebugLevel.
     */
    public static void setDebug(com.webobjects.foundation.NSLog.Logger instance){
        return; //TODO codavaj!!
    }

    /**
     * Sets the debugging logger NSLog.debug to instance. By default, NSLog.debug is an NSLog.PrintStreamLogger that sends its output to System.err. NSLog.debug is used for status and error messages that will conditionally be shown. If instance is null, no change will be made.
     * NOTE: NSLog itself stores no state regarding debug level.
     */
    public static void setDebug(com.webobjects.foundation.NSLog.Logger instance, int aDebugLevel){
        return; //TODO codavaj!!
    }

    /**
     * Sets the logger NSLog.err to instance. By default, NSLog.err is an NSLog.PrintStreamLogger that sends its output to System.err. NSLog.err is used for error messages that will always be shown. If instance is null, no change will be made.
     */
    public static void setErr(com.webobjects.foundation.NSLog.Logger instance){
        return; //TODO codavaj!!
    }

    /**
     * Sets the logger NSLog.out to instance. By default, NSLog.out is an NSLog.PrintStreamLogger that sends its output to System.out. NSLog.out is used for status messages that will always be shown. If instance is null, no change will be made.
     */
    public static void setOut(com.webobjects.foundation.NSLog.Logger instance){
        return; //TODO codavaj!!
    }

    /**
     * Provides the stack trace of t as a string.
     */
    public static java.lang.String throwableAsString(java.lang.Throwable t){
        return null; //TODO codavaj!!
    }

    /**
     * NSLog.PrintStreamLogger is a concrete subclass of NSLog.Logger. It logs output to a java.io.PrintStream which is contained by the logger. This PrintStream can be changed, which causes the logger to direct log messages somewhere else, such as a local file. NSLog.PrintStreamLogger provides additional method behavior for verbose logging.
     * By default, NSLog.out is an NSLog.PrintStreamLogger that points at System.out with verbose logging disabled. NSLog.err and NSLog.debug are NSLog.PrintStreamLoggers that point to System.err with verbose logging enabled.
     * Verbose logging produces output of the format: [Current Time] Current Thread Name output
     * See Also:NSLog, NSLog.Logger
     */
    public static class PrintStreamLogger extends com.webobjects.foundation.NSLog.Logger{
        /**
         * Creates a new NSLog.PrintStreamLogger which directs output to System.out.
         * See Also:NSLog.Logger
         */
        public PrintStreamLogger(){
             //TODO codavaj!!
        }

        /**
         * Creates a new NSLog.PrintStreamLogger which directs output to ps.
         * Parameters:ps - the PrintStream that may accept output Throws: IllegalArgumentException - if ps is nullSee Also:NSLog.Logger
         */
        public PrintStreamLogger(java.io.PrintStream ps){
             //TODO codavaj!!
        }

        /**
         * Invokes println() and flush on printStream, if isEnabled returns true.
         */
        public void appendln(){
            return; //TODO codavaj!!
        }

        /**
         * Writes the string representation of aValue to printStream, if isEnabled returns true.
         * For example, a generic object passed to this method might output "java.lang.Object@67e5d". The toString method of aValue provides the string representation.
         * Prefixes the string representation if isVerbose returns true.
         */
        public void appendln(java.lang.Object aValue){
            return; //TODO codavaj!!
        }

        /**
         * Writes the stack trace of aValue to printStream, if isEnabled returns true. This is overridden here for efficiency.
         * Prefixes the stack trace if isVerbose returns true.
         */
        public void appendln(java.lang.Throwable aValue){
            return; //TODO codavaj!!
        }

        /**
         * Invokes flush on printStream.
         */
        public void flush(){
            return; //TODO codavaj!!
        }

        /**
         * Provides the PrintStream wrapped by this NSLog.Logger instance.
         */
        public java.io.PrintStream printStream(){
            return null; //TODO codavaj!!
        }

        /**
         * Redirects all output for this NSLog.Logger instance to aStream. No change is made if aStream is null.
         */
        public void setPrintStream(java.io.PrintStream aStream){
            return; //TODO codavaj!!
        }

    }
    /**
     * NSLog.Log4JLogger is a concrete subclass of NSLog.Logger. It logs output to an org.apache.log4j.Logger contained by this NSLog.Logger. Thisorg.apache.log4j.Logger can be changed, which causes the receiver to direct log messages.
     * NOTE: allowedDebugLevel is significant for any NSLog.Log4JLogger, not just an instance assigned to NSLog.debug. appendln(Object) requires a debug level internally to determine which public log method to use, because org.apache.log4j.Logger.forcedLog is protected. Make sure that you use the NSLog.Log4JLogger(int) constructor or manually invoke setAllowedDebugLevel on any new NSLog.Log4JLogger instance; this instance may fail to log output until this happens.
     * Since: 5.2.2 See Also:NSLog.Log4JLogger.allowedDebugLevel(), NSLog.Log4JLogger.appendln(Object), NSLog.Log4JLogger.setAllowedDebugLevel(int), NSLog, NSLog.Logger, NSLog.Logger.allowedDebugLevel()
     */
    public static class Log4JLogger extends com.webobjects.foundation.NSLog.Logger{
        protected org.apache.log4j.Logger logger;

        protected org.apache.log4j.Level logLevel;

        public Log4JLogger(){
             //TODO codavaj!!
        }

        /**
         * Creates a new NSLog.Log4JLogger which directs output to aLogger. aLogger should be completely preconfigured. No assumptions will be made about its configuration; consequently, this constructor invokes super.setIsVerbose(false).
         * Throws: IllegalArgumentException - if aLogger is nullSee Also:NSLog.Log4JLogger.log4jLogger(), NSLog.Logger.setIsVerbose(boolean), NSLog.Logger
         */
        public Log4JLogger(org.apache.log4j.Logger aLogger, int level){
             //TODO codavaj!!
        }

        /**
         * Invokes getLevel().toInt() on log4jLogger, and maps the result to the equivalent NSLog debug level.
         * This mapping is as follows: Log4J Debug Level NSLog Debug Level null DebugLevelOff org.apache.log4j.Level.OFF DebugLevelOff org.apache.log4j.Level.ERROR DebugLevelCritical org.apache.log4j.Level.FATAL DebugLevelCritical org.apache.log4j.Level.INFO DebugLevelInformational org.apache.log4j.Level.WARN DebugLevelInformational org.apache.log4j.Level.ALL DebugLevelDetailed org.apache.log4j.Level.DEBUG DebugLevelDetailed
         */
        public int allowedDebugLevel(){
            return 0; //TODO codavaj!!
        }

        /**
         * Invokes appendln(Object) with an empty string.
         */
        public void appendln(){
            return; //TODO codavaj!!
        }

        /**
         * Passes aValue as the Object parameter to the appropriate method of log4jLogger, if isEnabled returns true.
         */
        public void appendln(java.lang.Object aValue){
            return; //TODO codavaj!!
        }

        protected static int convertLog4JLevelToNSLogLevel(int aLog4JDebugLevel){
            return 0; //TODO codavaj!!
        }

        protected static int convertNSLogLevelToLog4JLevel(int anNSLogDebugLevel){
            return 0; //TODO codavaj!!
        }

        /**
         * Does nothing. org.apache.log4j.Logger does not provide a mechanism to flush output on demand. By default, org.apache.log4j.Logger does flush each fragment of output automatically.
         */
        public void flush(){
            return; //TODO codavaj!!
        }

        /**
         * Provides the org.apache.log4j.Logger wrapped by this NSLog.Log4JLogger instance. The methods for this object use the org.apache.log4j.Logger instance directly, rather than via this accessor method.
         */
        public org.apache.log4j.Logger log4jLogger(){
            return null; //TODO codavaj!!
        }

        /**
         * Passes aDebugLevel to setLevel on log4jLogger. aDebugLevel may be either an NSLog debug level or an integer level from org.apache.log4j.Level. Maps an NSLog debug level to the equivalent org.apache.log4j.Level integer, or passes through a value from org.apache.log4j.Level.
         * This mapping is as follows: NSLog Debug Level Log4J Debug Level DebugLevelOff org.apache.log4j.Level.OFF DebugLevelCritical org.apache.log4j.Level.ERROR DebugLevelInformational org.apache.log4j.Level.INFO DebugLevelDetailed org.apache.log4j.Level.ALL
         */
        public void setAllowedDebugLevel(int aDebugLevel){
            return; //TODO codavaj!!
        }

        /**
         * Redirects output from this NSLog.Log4JLogger instance to aLogger. No change is made if aLogger is null. aLogger should be completely preconfigured. No assumptions will be made about its configuration;.
         */
        public void setLog4jLogger(org.apache.log4j.Logger aLogger){
            return; //TODO codavaj!!
        }

    }
    /**
     * NSLog.Logger is an abstract class that specifies the core functionality for NSLog. You can subclass NSLog.Logger to add custom logging implementations based on email, java.io.PrintWriters, display to a Swing window, etc. To add custom logging implementations based on java.io.PrintStream, subclass NSLog.PrintStreamLogger. If you subclass NSLog.Logger, you need only implement two of the appendln methods: appendln(Object), and appendln(), since the other appendln methods invoke appendln(Object) and appendln(). You must also implement flush() if you subclass.
     * See Also:NSLog, NSLog.Log4JLogger, NSLog.PrintStreamLogger
     */
    public static abstract class Logger{
        protected int debugLevel;

        protected boolean isEnabled;

        protected boolean isVerbose;

        /**
         * The default constructor for Logger does nothing. By default, allowedDebugLevel is DebugLevelOff, and both isEnabled and isVerbose return true.
         */
        public Logger(){
             //TODO codavaj!!
        }

        /**
         * Indicates the debug level for this NSLog.Logger instance. Ignore this setting for any NSLog.Logger except the one assigned to NSLog.debug.
         * NOTE: Before invoking any of the appendln methods on NSLog.debug, check one of the NSLog.debugLoggingAllowedFor... methods. The aforementioned NSLog class methods invoke NSLog.debug.allowedDebugLevel. Otherwise, the debug level would be useless. This usage pattern is the only one provided, because methods that encapsulate the check whether to log actually slow execution by an order of magnitude when logging is disabled.
         */
        public int allowedDebugLevel(){
            return 0; //TODO codavaj!!
        }

        /**
         * Since this is an abstract method, it does nothing by default.
         */
        public abstract void appendln();

        /**
         * Calls appendln(Object), passing Boolean.TRUE if aValue is true, or Boolean.FALSE if aValue is false.
         */
        public void appendln(boolean aValue){
            return; //TODO codavaj!!
        }

        /**
         * Transforms aValue into a java.lang.String object using the default encoding, and passes it to appendln(Object).
         */
        public void appendln(byte aValue){
            return; //TODO codavaj!!
        }

        void appendln(byte[] aValue){
            return; //TODO codavaj!!
        }

        /**
         * Transforms aValue into a java.lang.String object, and passes it to appendln(Object).
         */
        public void appendln(char aValue){
            return; //TODO codavaj!!
        }

        void appendln(char[] aValue){
            return; //TODO codavaj!!
        }

        /**
         * Transforms aValue into a java.lang.Double object, and passes it to appendln(Object).
         */
        public void appendln(double aValue){
            return; //TODO codavaj!!
        }

        /**
         * Transforms aValue into a java.lang.Float object, and passes it to appendln(Object).
         */
        public void appendln(float aValue){
            return; //TODO codavaj!!
        }

        /**
         * Transforms aValue into a java.lang.Integer object, and passes it to appendln(Object).
         */
        public void appendln(int aValue){
            return; //TODO codavaj!!
        }

        /**
         * Transforms aValue into a java.lang.Long object, and passes it to appendln(Object).
         */
        public void appendln(long aValue){
            return; //TODO codavaj!!
        }

        /**
         * Since this is an abstract method, it does nothing by default. It's up to the subclass to implement the behavior. Note that this method may represent a race condition, so implementations of this method must either be declared synchronized or otherwise be designed to be thread-safe.
         */
        public abstract void appendln(java.lang.Object aValue);

        /**
         * Transforms aValue into a java.lang.Short object, and passes it to appendln(Object).
         */
        public void appendln(short aValue){
            return; //TODO codavaj!!
        }

        /**
         * Calls appendln(Object) with NSLog.throwableAsString(aValue) as an argument.
         */
        public void appendln(java.lang.Throwable aValue){
            return; //TODO codavaj!!
        }

        /**
         * Since this is an abstract method, it does nothing by default.
         */
        public abstract void flush();

        /**
         * Provides the state of an internal boolean that regulates whether logging is enabled or disabled. When logging is disabled, the NSLog.Logger subclass instance should ignore all invocations of appendln. By default, logging is enabled. Note that it is up to subclass implementations to pay attention to this setting, as NSLog.Logger does nothing but maintain state in an instance variable. Typically this instance variable is accessed directly, rather than through this method.
         */
        public boolean isEnabled(){
            return false; //TODO codavaj!!
        }

        /**
         * Provides the state of an internal boolean that regulates whether verbose logging is activated or deactivated. When logging is verbose, the NSLog.Logger subclass instance should provide additional information, such as a prefix including the timestamp and thread ID.
         * Note that it is up to subclass implementations to pay attention to this setting, as NSLog.Logger does nothing but maintain state in an instance variable. Typically this instance variable is accessed directly, rather than through this method.
         * By default, verbose logging is enabled, except for the default NSLog.PrintStreamLogger object provided initially to NSLog.out.
         */
        public boolean isVerbose(){
            return false; //TODO codavaj!!
        }

        /**
         * Sets the debug level to aDebugLevel. Ignore this setting for any NSLog.Logger except the one assigned to NSLog.debug. Typically, this method is invoked at the beginning of the application execution, since it affects logging behavior in the entire application.
         * By default, logging is allowed for all debug groups. If the debug level is set to be high (for example, DebugLevelDetailed), the debugging output may be overwhelming.
         * NOTE: NSLog stores no state regarding debug level. If you replace NSLog.debug using setDebug(Logger), you must invoke NSLog.debug.setAllowedDebugLevel. Otherwise, use setDebug(Logger, int).
         */
        public void setAllowedDebugLevel(int aDebugLevel){
            return; //TODO codavaj!!
        }

        /**
         * Sets the value of an internal boolean to aBool.
         */
        public void setIsEnabled(boolean aBool){
            return; //TODO codavaj!!
        }

        /**
         * Sets the value of an internal boolean to aBool.
         */
        public void setIsVerbose(boolean aBool){
            return; //TODO codavaj!!
        }

    }
}
