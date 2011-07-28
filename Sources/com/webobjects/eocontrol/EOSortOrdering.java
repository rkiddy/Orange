
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.util.Date;


public class EOSortOrdering
    implements Serializable, NSCoding, EOKeyValueArchiving {
    public static class ComparisonSupport {


        public ComparisonSupport() { return null; }

        public static ComparisonSupport supportForClass(Class aClass) { return null; }

        public static void setSupportForClass(ComparisonSupport support, Class aClass) { return null; }

        public static int compareValues(Object left, Object right, NSSelector selector) { return null; }

        public int _compareWithArbitrarySelector(Object left, Object right, NSSelector selector) { return 0; }

        private static int _handleNulls(Object left, Object right) { return null; }

        private static NSTimestamp _coerceToTimestampClass(Object value) { return null; }

        protected int _genericCompareTo(Object left, Object right) { return 0; }

        protected int _genericCaseInsensitiveCompareTo(Object left, Object right) { return 0; }

        public int compareAscending(Object left, Object right) { return 0; }

        public int compareDescending(Object left, Object right) { return 0; }

        public int compareCaseInsensitiveAscending(Object left, Object right) { return 0; }

        public int compareCaseInsensitiveDescending(Object left, Object right) { return 0; }

        static  {}

        private static final int kNeitherNull = -42;
        private static final String defaultStringTimestampFormat = "%Y-%m-%d %H:%M:%S %Z";
        private static final NSTimestampFormatter defaultStringTimestampFormatter;
        private static _NSThreadsafeMutableDictionary _supportByClass;
        private static final ComparisonSupport defaultComparisonSupport;

    }

    public static class _MultipleSortValueHolder extends _SortValueHolder {


        public _MultipleSortValueHolder(Object object, String keys[]) { return null; }

        public Object valueAtIndex(int index) { return null; }

        private String _keys[];
        private Object _values[];
        private int _valuesAvailableIndex;

    }

    public static class _SingleSortValueHolder extends _SortValueHolder {


        public _SingleSortValueHolder(Object object, String key) { return null; }

        public Object value() { return null; }

        Object _value;

    }

    public static class _SortValueHolder {


        public _SortValueHolder(Object object) { return null; }

        public Object object() { return null; }

        Object _object;

    }

    public static class _MultipleValueComparator extends NSComparator {


        public _MultipleValueComparator(NSSelector selectors[]) { return null; }

        public int compare(Object left, Object right) throws com.webobjects.foundation.NSComparator.ComparisonException { return 0; }

        private NSSelector _selectors[];

    }

    public static class _SingleValueComparator extends NSComparator {


        public _SingleValueComparator(NSSelector selector) { return null; }

        public int compare(Object left, Object right) throws com.webobjects.foundation.NSComparator.ComparisonException { return 0; }

        private NSSelector _selector;

    }

    public static interface Comparison {


        public abstract int compareAscending(Object obj);

        public abstract int compareDescending(Object obj);

        public abstract int compareCaseInsensitiveAscending(Object obj);

        public abstract int compareCaseInsensitiveDescending(Object obj);



        public static final Class _CLASS = null;

    }



    public EOSortOrdering(String key, NSSelector selector) { return null; }

    public static NSSelector _operatorSelectorForString(String string) { return null; }

    public static EOSortOrdering sortOrderingWithKey(String key, NSSelector selector) { return null; }

    private static NSArray _sortUsingKeyOrderArray(NSArray array, NSArray sortOrderings, NSMutableArray sortedArray) { return null; }

    public static NSArray sortedArrayUsingKeyOrderArray(NSArray array, NSArray sortOrderings) { return null; }

    public static void sortArrayUsingKeyOrderArray(NSMutableArray array, NSArray sortOrderings) { return null; }

    public String key() { return null; }

    public NSSelector selector() { return null; }

    public String toString() { return null; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS = null;
    static final long serialVersionUID = 0x7061e1e2L;
    private static final String SerializationKeyFieldKey = "key";
    private static final String SerializationSelectorNameFieldKey = "selectorName";
    public static final NSSelector CompareAscending;
    public static final NSSelector CompareDescending;
    public static final NSSelector CompareCaseInsensitiveAscending;
    public static final NSSelector CompareCaseInsensitiveDescending;
    private static final NSDictionary _selectorsByOperator;
    private String _key;
    private NSSelector _selector;
    private static final ObjectStreamField serialPersistentFields[];

}
