
package com.webobjects.foundation;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public final class _NSUtilities {
    public static class JavaArchiveFilter
        implements FilenameFilter {


        public JavaArchiveFilter() { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private static final String JAR = ".jar";
        private static final String ZIP = ".zip";

    }

    public static class JavaClassFilter
        implements FilenameFilter {


        public JavaClassFilter() { return null; }

        public boolean accept(File dir, String aName) { return true; }

        private static final String CLASS_SUFFIX = ".class";

    }

    private static class _NoClassUnderTheSun {


        private _NoClassUnderTheSun() { return null; }

        static  {}

        protected static final Class _CLASS;

    }

    static interface _ResourceSearcher {

        public abstract Class _searchForClassWithName(String s);

        public abstract URL _searchPathURLForResourceWithName(Class class1, String s, String s1);
    }



    public _NSUtilities() { return null; }

    public static Object valueForKeyArray(NSKeyValueCoding kvcObject, NSArray keyArray) { return null; }

    public static Integer IntegerForInt(int i) { return null; }

    public static String shortClassName(Object obj) { return null; }

    public static Class _classWithFullySpecifiedName(String className) { return null; }

    public static Class classObjectForClass(Class objectClass) { return null; }

    public static _ResourceSearcher _resourceSearcher() { return null; }

    public static void _setResourceSearcher(_ResourceSearcher resourceSearcher) { return null; }

    public static URL _pathURLForResourceWithName(Class resourceClass, String resourceName, String extension) { return null; }

    public static void _setPrincipalClassLoadingWarningsNeeded(boolean flag) { return null; }

    public static void registerPackage(String packageName) { return null; }

    public static void setClassForName(Class objectClass, String className) { return null; }

    public static Class classWithName(String className) { return null; }

    static Class _classWithPartialName(String partialName, boolean extensiveSearch) { return null; }

    static Class _searchForClassInPackages(String className, NSArray packages, boolean registerPackageOnHit, boolean sortPackageArray) { return null; }

    public static NSArray classNamesFromArchiveInputStream(InputStream is) { return null; }

    public static NSArray classNamesFromArchive(File anArchive) { return null; }

    public static NSArray classNamesFromArchiveAtPathURL(URL archivePathURL) { return null; }

    public static NSArray classNamesFromArchiveAtPath(String archivePath) { return null; }

    private static RuntimeException _explainInstantiationException(Class objectClass, Class parameters[], Throwable throwable, boolean shouldLog) { return null; }

    public static Object instantiateObject(Class objectClass, Class parameterTypes[], Object parameters[], boolean shouldThrow, boolean shouldLog) { return null; }

    public static Object instantiateObjectWithConstructor(Constructor constructor, Class objectClass, Object parameters[], boolean shouldThrow, boolean shouldLog) { return null; }

    public static Constructor constructorForClass(Class objectClass, Class parameterTypes[]) { return null; }

    public static boolean _isClassABoolean(Class valueClass) { return null; }

    public static boolean _isClassANumber(Class valueClass) { return null; }

    public static boolean _isClassANumberOrABoolean(Class valueClass) { return null; }

    public static Object tryToConvertIntoNumberOrBooleanValueClass(Object value, Class valueClass) { return null; }

    public static Number convertBooleanIntoNumberValue(Boolean value) { return null; }

    public static Boolean convertNumberIntoBooleanValue(Number value) { return null; }

    public static Number convertBooleanIntoCompatibleNumberValue(Boolean value, Class newValueType) { return null; }

    public static Number convertNumberIntoCompatibleValue(Number value, Class newValueType) { return null; }

    public static int compareNumbers(Number number1, Number number2) { return null; }

    public static Object convertNumberOrBooleanIntoCompatibleValue(Object value, Class newValueType) { return null; }

    public static int compareNumbersOrBooleans(Object numericalValue1, Object numericalValue2) { return null; }

    static String _isoLatinEncoding() { return null; }

    public static String _encodingNameFromObjectiveC(String objectiveCEncodingName) { return null; }

    static  {}

    public static final Class _CLASS;
    private static final _NSThreadsafeMutableDictionary _classesByPartialName;
    private static final _NSThreadsafeMutableArray _packages;
    private static volatile _ResourceSearcher _privateResourceSearcher;
    static boolean _principalClassLoadingWarningsNeeded;
    public static final String WebObjectsRootPropertyKey = "WORootDirectory";
    public static final String WebObjectsLocalRootPropertyKey = "WOLocalRootDirectory";
    public static final String WebObjectsUserDirectoryPropertyKey = "WOUserDirectory";
    public static final String WebObjectsVersionPropertyKey = "webobjects.version";
    public static final Class _ObjectClass;
    public static final Class _ClassClass;
    public static final Class _StringClass;
    public static final Class _NumberClass;
    public static final Class _BigDecimalClass;
    public static final Class _BigIntegerClass;
    public static final Class _BooleanClass;
    public static final Class _DateClass;
    public static final Class _LocaleClass;
    public static final Class _ShortClass;
    public static final Class _ByteClass;
    public static final Class _IntegerClass;
    public static final Class _LongClass;
    public static final Class _DoubleClass;
    public static final Class _FloatClass;
    public static final Class _VoidClass;
    public static final Class _CharacterClass;
    public static final Object _NoObjectArray[];
    public static final byte _NoByteArray[];
    public static final int _NoIntArray[];
    public static final Class _NoClassArray[];
    public static final String _NoStringArray[];
    public static final Class _ObjectClassArray[];
    public static final Class _StringClassArray[];
    public static final Class _ArrayClassArray[];
    public static final Class _DictionaryClassArray[];
    public static final Class _NotificationClassArray[];
    public static final Class _DateFormatSymbolsClass;
    public static final Class _DecimalFormatSymbolsClass;
    public static final Class _ObjectArrayClass;
    private static final JavaClassFilter TheJavaClassFilter;
    private static final BigDecimal _zeroBigDecimal;
    private static final BigInteger _zeroBigInteger;
    private static final Integer _integers[];
    private static final int _intMin = -3;
    private static final int _intMax = 513;
    private static final int _intOffset = 3;
    protected static final Short _shortFalse;
    protected static final Short _shortTrue;
    private static final String _isoLatinEncoding;
    public static final String MacOSRomanStringEncoding = "MacRoman";
    public static final String ASCIIStringEncoding = "ASCII";
    public static final String NEXTSTEPStringEncoding;
    public static final String JapaneseEUCStringEncoding = "EUC_JP";
    public static final String UTF8StringEncoding = "UTF-8";
    public static final String ISOLatin1StringEncoding;
    public static final String SymbolStringEncoding = "MacSymbol";
    public static final String NonLossyASCIIStringEncoding = "ASCII";
    public static final String ShiftJISStringEncoding = "SJIS";
    public static final String ISOLatin2StringEncoding = "ISO8859_2";
    public static final String UnicodeStringEncoding = "Unicode";
    public static final String WindowsCP1251StringEncoding = "Cp1251";
    public static final String WindowsCP1252StringEncoding = "Cp1252";
    public static final String WindowsCP1253StringEncoding = "Cp1253";
    public static final String WindowsCP1254StringEncoding = "Cp1254";
    public static final String WindowsCP1250StringEncoding = "Cp1250";
    public static final String ISO2022JPStringEncoding = "ISO2022JP";

}
