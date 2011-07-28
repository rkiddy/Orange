
package com.webobjects.foundation;

import java.lang.ref.*;
import java.util.Enumeration;
import java.util.NoSuchElementException;


public abstract class _NSWeakMutableCollection {
    public static class _NSWeakMutableCollectionReference extends WeakReference {


        public String toString() { return null; }

        public _NSWeakMutableCollectionReference(Object anObject, ReferenceQueue refQueue, Object aKey) { return null; }

        public _NSWeakMutableCollectionReference(Object anObject, ReferenceQueue refQueue) { return null; }

        public _NSWeakMutableCollectionReference(Object anObject) { return null; }

        public int hashCode() { return 0; }

        public boolean equals(Object anObject) { return true; }

        protected Object key() { return null; }

        protected int hash;
        private Object _key;

    }

    public static class _NSWeakMutableCollectionEnumerator
        implements Enumeration {


        public _NSWeakMutableCollectionEnumerator(Enumeration enumeration) { return null; }

        public boolean hasMoreElements() { return true; }

        public Object nextElement() { return null; }

        private Enumeration _enumeration;
        private Object _nextElement;

    }



    public _NSWeakMutableCollection() { return null; }

    public abstract NSArray allObjects();

    public abstract int count();

    public abstract Object[] objects();

    /**
     * @deprecated Method objectEnumerator is deprecated
     */

    public abstract Enumeration objectEnumerator();

    public abstract Enumeration referenceEnumerator();

    public abstract void addObject(Object obj);

    public abstract void removeObject(Object obj);

    public abstract void addReference(WeakReference weakreference);

    public abstract void removeReference(Object obj);

    protected abstract void __removeReference(Reference reference);

    public abstract void removeAllObjects();

    public abstract String toString();

    protected synchronized void processQueue() { return null; }

    protected ReferenceQueue queue;

}
