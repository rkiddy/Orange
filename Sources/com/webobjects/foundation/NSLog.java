
package com.webobjects.foundation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import org.apache.log4j.Level;


public final class NSLog {
    public static class _DevNullPrintStream extends PrintStream {


        public _DevNullPrintStream(OutputStream os) { return null; }

        public _DevNullPrintStream(OutputStream os, boolean aBOOL) { return null; }

        protected void setError() {}

        public boolean checkError() { return true; }

        public void close() {}

        public void flush() {}

        public void print(boolean flag) {}

        public void print(char c1) {}

        public void print(char ac[]) {}

        public void print(double d1) {}

        public void print(float f1) {}

        public void print(int j) {}

        public void print(long l1) {}

        public void print(Object obj1) {}

        public void print(String s1) {}

        public void println() {}

        public void println(boolean flag) {}

        public void println(char c) {}

        public void println(char ac[]) {}

        public void println(double d) {}

        public void println(float f) {}

        public void println(int i) {}

        public void println(long l) {}

        public void println(Object obj) {}

        public void println(String s) {}

        public void write(int i) {}

        public void write(byte abyte0[], int i, int j) {}

        public OutputStream originalOutputStream;

    }

    public static class PrintStreamLogger extends Logger {


        public PrintStreamLogger() { return null; }

        public PrintStreamLogger(PrintStream ps) { return null; }

        public void _setPrefixInfo(String s) {}

        protected String _verbosePrefix() { return null; }

        public synchronized void appendln() { return null; }

        public synchronized void appendln(Throwable aValue) { return null; }

        public synchronized void appendln(Object aValue) { return null; }

        public void flush() {}

        public PrintStream printStream() { return null; }

        public void setPrintStream(PrintStream aStream) {}

        static  {}

        protected String _prefixInfo;
        protected PrintStream _stream;
        private static final String _defaultFormatString = "yyyy-M-d H:m:s z";
        private static final TimeZone _tz;
        private long _lastVerboseLogTime;
        private String _lastTimestampText;

    }

    public static class Log4JLogger extends Logger {


        public Log4JLogger() { return null; }

        public Log4JLogger(org.apache.log4j.Logger aLogger, int level) { return null; }

        protected static int convertLog4JLevelToNSLogLevel(int aLog4JDebugLevel) { return null; }

        protected static int convertNSLogLevelToLog4JLevel(int anNSLogDebugLevel) { return null; }

        public int allowedDebugLevel() { return 0; }

        public void appendln() {}

        public void appendln(Object aValue) {}

        public void flush() {}

        public org.apache.log4j.Logger log4jLogger() { return null; }

        public void setAllowedDebugLevel(int aDebugLevel) {}

        public void setLog4jLogger(org.apache.log4j.Logger aLogger) {}

        protected org.apache.log4j.Logger logger;
        protected Level logLevel;

    }

    public static abstract class Logger {


        public Logger() { return null; }

        public int allowedDebugLevel() { return 0; }

        public void appendln(boolean aValue) {}

        public void appendln(byte aValue) {}

        public void appendln(byte aValue[]) {}

        public void appendln(char aValue) {}

        public void appendln(char aValue[]) {}

        public void appendln(double aValue) {}

        public void appendln(float aValue) {}

        public void appendln(int aValue) {}

        public void appendln(long aValue) {}

        public void appendln(short aValue) {}

        public void appendln(Throwable aValue) {}

        public abstract void appendln(Object obj);

        public abstract void appendln();

        public abstract void flush();

        public boolean isEnabled() { return true; }

        public boolean isVerbose() { return true; }

        public void setAllowedDebugLevel(int aDebugLevel) {}

        public void setIsEnabled(boolean aBool) {}

        public void setIsVerbose(boolean aBool) {}

        protected int debugLevel;
        protected boolean isEnabled;
        protected boolean isVerbose;

    }



    private NSLog() { return null; }

    public static void _conditionallyLogPrivateException(Throwable t) { return null; }

    public static boolean _debugLoggingAllowedForGroups(long aDebugGroups) { return null; }

    public static boolean _debugLoggingAllowedForLevel(int aDebugLevel) { return null; }

    public static boolean _debugLoggingAllowedForLevelAndGroups(int aDebugLevel, long aDebugGroups) { return null; }

    private static void _initDebugDefaults() { return null; }

    private static int parseIntValueFromString(String aDebugLevel) { return null; }

    private static long parseLongValueFromString(String aDebugGroup) { return null; }

    public static void _setInInitPhase(boolean flag) { return null; }

    public static synchronized void allowDebugLoggingForGroups(long aDebugGroups) { return null; }

    /**
     * @deprecated Method allowedDebugLevel is deprecated
     */

    public static int allowedDebugLevel() { return null; }

    public static boolean debugLoggingAllowedForGroups(long aDebugGroups) { return null; }

    public static boolean debugLoggingAllowedForLevel(int aDebugLevel) { return null; }

    public static boolean debugLoggingAllowedForLevelAndGroups(int aDebugLevel, long aDebugGroups) { return null; }

    public static PrintStream printStreamForPath(String aPath) { return null; }

    public static synchronized void refuseDebugLoggingForGroups(long aDebugGroups) { return null; }

    public static void setAllowedDebugGroups(long aDebugGroups) { return null; }

    /**
     * @deprecated Method setAllowedDebugLevel is deprecated
     */

    public static void setAllowedDebugLevel(int aDebugLevel) { return null; }

    public static void setDebug(Logger instance) { return null; }

    public static void setDebug(Logger instance, int aDebugLevel) { return null; }

    public static void setErr(Logger instance) { return null; }

    public static void setOut(Logger instance) { return null; }

    public static String throwableAsString(Throwable t) { return null; }

    static  {}

    public static final long DebugGroupEnterpriseObjects = 2L;
    public static final long DebugGroupWebObjects = 4L;
    public static final long DebugGroupApplicationGeneration = 8L;
    public static final long DebugGroupMultithreading = 16L;
    public static final long DebugGroupResources = 32L;
    public static final long DebugGroupArchiving = 64L;
    public static final long DebugGroupValidation = 128L;
    public static final long DebugGroupKeyValueCoding = 256L;
    public static final long DebugGroupComponentBindings = 512L;
    public static final long DebugGroupFormatting = 1024L;
    public static final long DebugGroupQualifiers = 2048L;
    public static final long DebugGroupIO = 8192L;
    public static final long DebugGroupTiming = 16384L;
    public static final long DebugGroupModel = 32768L;
    public static final long DebugGroupDatabaseAccess = 0x10000L;
    public static final long DebugGroupSQLGeneration = 0x20000L;
    public static final long DebugGroupUserInterface = 0x40000L;
    public static final long DebugGroupAssociations = 0x80000L;
    public static final long DebugGroupControllers = 0x100000L;
    public static final long DebugGroupRules = 0x200000L;
    public static final long DebugGroupDeployment = 0x400000L;
    public static final long DebugGroupParsing = 0x800000L;
    public static final long DebugGroupReflection = 0x1000000L;
    public static final long DebugGroupRequestHandling = 0x2000000L;
    public static final long DebugGroupComponents = 0x4000000L;
    public static final long DebugGroupJSPServlets = 0x8000000L;
    public static final long DebugGroupWebServices = 0x10000000L;
    private static final long _DebugGroupAll = -1L;
    private static final long _DefaultDebugGroups = 0xff7fffffL;
    public static final int DebugLevelOff = 0;
    public static final int DebugLevelCritical = 1;
    public static final int DebugLevelInformational = 2;
    public static final int DebugLevelDetailed = 3;
    public static final String _D2WTraceRuleFiringEnabledKey = "D2WTraceRuleFiringEnabled";
    public static final String _D2WTraceRuleModificationsEnabledKey = "D2WTraceRuleModificationsEnabled";
    private static final String EOAdaptorDebugEnabled = "EOAdaptorDebugEnabled";
    private static final String NSDebugGroups = "NSDebugGroups";
    private static final String NSDebugLevel = "NSDebugLevel";
    private static final int debugGroupMaxBitPos = 63;
    private static final int debugGroupMinBitPos = 0;
    private static final char debugGroupRangeChar = 58;
    private static final int notFound = -1;
    public static volatile Logger debug;
    public static volatile Logger err;
    public static volatile Logger out;
    private static volatile long debugGroups;
    private static volatile boolean PRIVATE_DEBUGGING_ENABLED;
    private static volatile boolean _inInitPhase;
    public static volatile String _WODebuggingEnabledKey;

}
