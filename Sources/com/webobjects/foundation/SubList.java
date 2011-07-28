
package com.webobjects.foundation;

import java.lang.reflect.Array;
import java.util.*;


class SubList extends ArrayList {


    SubList(List list, int fromIndex, int toIndex) { return null; }

    protected SubList(NSMutableArray parentList, NSMutableArray list, int fromIndex, int toIndex) { return null; }

    public Object set(int index, Object t) { return null; }

    public Object get(int index) { return null; }

    private final int _findObjectInParentArray(int index, int length, Object object, boolean identical) { return null; }

    private final int _findObjectInSubList(int index, int length, Object object, boolean identical) { return null; }

    public boolean contains(Object element) { return true; }

    public boolean containsAll(Collection c) { return true; }

    public boolean equals(Object object) { return true; }

    private boolean _equalsArray(List otherArray) { return true; }

    public int size() { return 0; }

    public int indexOf(Object elem) { return 0; }

    public boolean isEmpty() { return true; }

    public boolean retainAll(Collection c) { return true; }

    public Object remove(int index) { return null; }

    public boolean remove(Object obj) { return true; }

    public boolean removeAll(Collection collection) { return true; }

    public void clear() {}

    public Object clone() { return null; }

    protected void removeRange(int fromIndex, int toIndex) {}

    public void add(int index, Object element) {}

    public boolean add(Object element) { return true; }

    public boolean addAll(Collection c) { return true; }

    public boolean addAll(int index, Collection c) { return true; }

    public Object[] objectsInRange(NSRange range) { return null; }

    public Object[] toArray() { return null; }

    public Object[] toArray(Object objects[]) { return null; }

    public String toString() { return null; }

    public Iterator iterator() { return null; }

    public int lastIndexOf(Object o) { return 0; }

    public ListIterator listIterator(int index) { return null; }

    private void rangeCheck(int fromIndex, int toIndex) {}

    private void rangeCheck(int index) {}

    private static final long serialVersionUID = 0xb9accda9L;
    public static final int NotFound = -1;
    List _supportingList;
    List _parentList;
    int _offset;
    int _size;


    // Unreferenced inner class com/webobjects/foundation/SubList$1

/* anonymous class */
    class _cls1
        implements ListIterator {


        _cls1() { return null; }

        public boolean hasNext() { return true; }

        public Object next() { return null; }

        public boolean hasPrevious() { return true; }

        public Object previous() { return null; }

        public int nextIndex() { return 0; }

        public int previousIndex() { return 0; }

        public void remove() {}

        public void set(Object o) {}

        public void add(Object o) {}

        private ListIterator _supportingListIterator;
        final int val$index;
        final SubList this$0;

    }

}
