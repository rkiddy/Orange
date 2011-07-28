
package com.webobjects.foundation;

import java.lang.reflect.Array;


public class _NSCollectionPrimitives {


    private _NSCollectionPrimitives() { return null; }

    public static final Object[] emptyArray() { return null; }

    public static final int log2(int num) { return null; }

    public static final void copyIntoBuffer(byte buffer[], int index, int value) { return null; }

    public static final void copyIntoBuffer(byte buffer[], int index, long value) { return null; }

    public static final Object[] copyArray(Object array[]) { return null; }

    public static final Object[] copyArray(Object array[], int newSize) { return null; }

    public static final byte[] copyArray(byte array[]) { return null; }

    public static final byte[] copyArray(byte array[], int newSize) { return null; }

    public static final char[] copyArray(char array[]) { return null; }

    public static final char[] copyArray(char array[], int newSize) { return null; }

    public static final short[] copyArray(short array[]) { return null; }

    public static final short[] copyArray(short array[], int newSize) { return null; }

    public static final int[] copyArray(int array[]) { return null; }

    public static final int[] copyArray(int array[], int newSize) { return null; }

    public static final long[] copyArray(long array[]) { return null; }

    public static final long[] copyArray(long array[], int newSize) { return null; }

    public static final float[] copyArray(float array[]) { return null; }

    public static final float[] copyArray(float array[], int newSize) { return null; }

    public static final double[] copyArray(double array[]) { return null; }

    public static final double[] copyArray(double array[], int newSize) { return null; }

    private static final void _K2_sort_recur(Object a[], int lo0, int hi0, NSComparator comparator) throws NSComparator.ComparisonException { return null; }

    public static final void K2SortArray(Object a[], int length, NSComparator comparator) throws NSComparator.ComparisonException { return null; }

    public static final int countObjectInArray(Object array[], int firstIdx, int lastIdx, Object object, boolean identical) { return null; }

    public static final boolean containsObjectInArray(Object array[], int firstIdx, int lastIdx, Object object, boolean identical) { return null; }

    public static final int findObjectInArray(Object array[], int firstIdx, int lastIdx, Object object, boolean identical) { return null; }

    public static final void replaceObjectInArray(Object array[], int firstIdx, int lastIdx, Object existing, Object object, boolean identical, boolean allOccurrences) { return null; }

    public static final int removeObjectInArray(Object array[], int firstIdx, int lastIdx, int count, Object existing, boolean identical, boolean allOccurrences) { return null; }

    public static final int deletionLimitForTableBuckets(int hashTableBuckets) { return null; }

    public static final int hashTableBucketsForCapacity(int capacity) { return null; }

    public static final int hashTableCapacityForCapacity(int capacity) { return null; }

    public static final Object[] keysInHashTable(Object keyArray[], Object valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final Object[] valuesInHashTable(Object keyArray[], Object valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final Object findValueInHashTable(Object key, Object keyArray[], Object valueArray[], byte flagsArray[]) { return null; }

    public static final boolean addValueInHashTable(Object key, Object value, Object keyArray[], Object valueArray[], byte flagsArray[]) { return null; }

    public static final boolean addValueToSet(Object key, Object keyArray[], byte flagsArray[]) { return null; }

    public static final Object removeValueInHashTable(Object key, Object keyArray[], Object valueArray[], byte flagsArray[]) { return null; }

    public static final int[] keysInHashTable(int keyArray[], Object valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final Object[] valuesInHashTable(int keyArray[], Object valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final Object findValueInHashTable(int key, int keyArray[], Object valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final boolean addValueInHashTable(int key, Object value, int keyArray[], Object valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final Object removeValueInHashTable(int key, int keyArray[], Object valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final Object[] keysInHashTable(Object keyArray[], int valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final int[] valuesInHashTable(Object keyArray[], int valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final int findValueInHashTable(Object key, Object keyArray[], int valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final boolean addValueInHashTable(Object key, int value, Object keyArray[], int valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    public static final int removeValueInHashTable(Object key, Object keyArray[], int valueArray[], byte flagsArray[], int capacity, int hashtableBuckets) { return null; }

    static  {}

    public static final Class _CLASS;
    public static final int IntegerNotAvailable = 0x80000000;
    public static final Object EmptyArray[];
    public static final int EmptyIntegerArray[];
    public static final byte EmptyByteArray[];
    public static final byte EmptyFlag = 0;
    public static final byte DeletedFlag = 64;
    public static final byte OccupiedFlag = -128;
    public static final byte StatusMask = -64;
    public static final int KeyHashMask = 63;
    public static final int NoMatchIndex = -1;
    public static final int LESS_THAN = -1;
    public static final int EQUAL_TO = 0;
    public static final int GREATER_THAN = 1;
    private static final int _hashTableCapacities[];
    private static final int _hashTableNBuckets[];

}
