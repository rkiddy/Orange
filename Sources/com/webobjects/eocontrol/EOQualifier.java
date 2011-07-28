
package com.webobjects.eocontrol;

import com.webobjects.eocontrol._private._EOQualifierParser;
import com.webobjects.foundation.*;
import java.io.Serializable;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.*;


public abstract class EOQualifier
    implements Serializable, EOQualifierEvaluation {
    public static class ComparisonSupport {


        public ComparisonSupport() { return null; }

        public static ComparisonSupport supportForClass(Class aClass) { return null; }

        public static void setSupportForClass(ComparisonSupport supportClass, Class aClass) { return null; }

        public static boolean compareValues(Object left, Object right, NSSelector selector) { return null; }

        public boolean _compareWithArbitrarySelector(Object left, Object right, NSSelector selector) { return true; }

        private static int _handleNulls(Object left, Object right) { return null; }

        private static Number _coerceToCorrectNumberClass(Object value, Class targetClass) { return null; }

        private static Boolean _coerceToBooleanClass(Object value) { return null; }

        private static NSTimestamp _coerceToTimestampClass(Object value) { return null; }

        public boolean isEqualTo(Object left, Object right) { return true; }

        public boolean isNotEqualTo(Object left, Object right) { return true; }

        protected int _genericCompareTo(Object left, Object right) { return 0; }

        public boolean isLessThan(Object left, Object right) { return true; }

        public boolean isGreaterThan(Object left, Object right) { return true; }

        public boolean isLessThanOrEqualTo(Object left, Object right) { return true; }

        public boolean isGreaterThanOrEqualTo(Object left, Object right) { return true; }

        public boolean doesContain(Object left, Object right) { return true; }

        public boolean isLike(Object left, Object right) { return true; }

        public boolean isCaseInsensitiveLike(Object left, Object right) { return true; }

        static  {}

        private static final int kNeitherNull = 42;
        private static final int kComparisonNone = 190;
        private static final String defaultStringTimestampFormat = "%Y-%m-%d %H:%M:%S %Z";
        private static final NSTimestampFormatter defaultStringTimestampFormatter;
        private static _NSThreadsafeMutableDictionary _supportByClass;
        private static final ComparisonSupport defaultComparisonSupport;

    }

    public class QualifierVariableSubstitutionException extends RuntimeException {


        public QualifierVariableSubstitutionException(String message) { return null; }

        private static final long serialVersionUID = 0x85af9de9L;
        final EOQualifier this$0;

    }

    public static interface Comparison {


        public abstract boolean isEqualTo(Object obj);

        public abstract boolean isNotEqualTo(Object obj);

        public abstract boolean isLessThan(Object obj);

        public abstract boolean isGreaterThan(Object obj);

        public abstract boolean isLessThanOrEqualTo(Object obj);

        public abstract boolean isGreaterThanOrEqualTo(Object obj);

        public abstract boolean doesContain(Object obj);

        public abstract boolean isLike(Object obj);

        public abstract boolean isCaseInsensitiveLike(Object obj);



        public static final Class _CLASS = null;

    }



    public static NSArray allQualifierOperators() { return null; }

    public static NSArray relationalQualifierOperators() { return null; }

    public boolean _isEmpty() { return true; }

    public static String stringForOperatorSelector(NSSelector selector) { return null; }

    public static NSSelector operatorSelectorForString(String string) { return null; }

    public static NSArray filteredArrayWithQualifier(NSArray array, EOQualifier qualifier) { return null; }

    public static void filterArrayWithQualifier(NSMutableArray array, EOQualifier qualifier) { return null; }

    static void _andOrQualifierAddBindingsToDictionary(EOQualifier qualifier, NSArray originalQualifiers, NSMutableDictionary dictionary) {}

    static EOQualifier _andOrQualifierWithBindingsAndOptions(EOQualifier qualifier, NSArray originalQualifiers, NSDictionary bindings, boolean requiresAll) { return null; }

    public EOQualifier() { return null; }

    public abstract EOQualifier qualifierWithBindings(NSDictionary nsdictionary, boolean flag);

    void _addBindingsToDictionary(NSMutableDictionary nsmutabledictionary) { return null; }

    public NSArray bindingKeys() { return null; }

    public String keyPathForBindingKey(String key) { return null; }

    public boolean evaluateWithObject(Object object) { return true; }

    static NSArray _qualifierArrayFromDictionary(NSDictionary dictionary) { return null; }

    public static EOQualifier qualifierToMatchAllValues(NSDictionary values) { return null; }

    public static EOQualifier qualifierToMatchAnyValue(NSDictionary values) { return null; }

    static void _validateKeyWithRootClassDescription(EOClassDescription classDescription, String key) {}

    public abstract void validateKeysWithRootClassDescription(EOClassDescription eoclassdescription);

    public abstract void addQualifierKeysToSet(NSMutableSet nsmutableset);

    public NSSet allQualifierKeys() { return null; }

    public Object clone() { return null; }

    protected static NSSelector operatorSelectorForSelectorNamed(String string) { return null; }

    public static EOQualifier qualifierWithQualifierFormat(String format, NSArray arguments) { return null; }

    public void _accept(EOQualifierVisitor visitor, boolean isPostOrder) {}

    static  {}

    public static final Class _CLASS = null;
    private static final String _QualifierOperatorEqualKey = "isEqualTo";
    private static final String _QualifierOperatorNotEqualKey = "isNotEqualTo";
    private static final String _QualifierOperatorLessThanKey = "isLessThan";
    private static final String _QualifierOperatorGreaterThanKey = "isGreaterThan";
    private static final String _QualifierOperatorLessThanOrEqualToKey = "isLessThanOrEqualTo";
    private static final String _QualifierOperatorGreaterThanOrEqualToKey = "isGreaterThanOrEqualTo";
    private static final String _QualifierOperatorContainsKey = "doesContain";
    private static final String _QualifierOperatorLikeKey = "isLike";
    private static final String _QualifierOperatorCaseInsensitiveLikeKey = "isCaseInsensitiveLike";
    public static final NSSelector QualifierOperatorEqual;
    public static final NSSelector QualifierOperatorNotEqual;
    public static final NSSelector QualifierOperatorLessThan;
    public static final NSSelector QualifierOperatorGreaterThan;
    public static final NSSelector QualifierOperatorLessThanOrEqualTo;
    public static final NSSelector QualifierOperatorGreaterThanOrEqualTo;
    public static final NSSelector QualifierOperatorContains;
    public static final NSSelector QualifierOperatorLike;
    public static final NSSelector QualifierOperatorCaseInsensitiveLike;
    private static final String _relationalOperators[];
    private static final String _operators[];
    private static final String _selectorKeys[];
    private static final NSSelector _selectors[];
    private static _EOQualifierParser _qualifierParser;
    private static final NSArray _allRelationalOperators;
    private static final NSArray _allOperators;
    private static final NSDictionary _operatorsBySelector;
    private static final NSDictionary _selectorsBySelectorKey;
    private static final NSDictionary _selectorsByOperator;
    static final NSSelector JavaQualifierOperatorContains;

}
