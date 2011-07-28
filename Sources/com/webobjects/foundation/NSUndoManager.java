
package com.webobjects.foundation;

import java.util.*;


public class NSUndoManager
    implements NSDisposable {
    public static class _NSUndoStack {


        public void _removeBottom() {}

        public _NSUndoStack() { return null; }

        public int max() { return 0; }

        public int count() { return 0; }

        public void setMax(int m) {}

        public void push(_NSUndoObject undo) {}

        public _NSUndoObject popUndoObject() { return null; }

        public _NSUndoBeginMark _beginMark() { return null; }

        public void setGroupIdentifier(Object identifier) {}

        public Object groupIdentifier() { return null; }

        public _NSUndoObject topUndoObject() { return null; }

        public void markBegin() {}

        public void markEnd() {}

        public boolean popAndInvoke() { return true; }

        public int nestingLevel() { return 0; }

        public void removeAllObjects() {}

        public void removeAllObjectsWithTarget(Object target) {}

        public void removeObject(_NSUndoObject undo) {}

        public String toString() { return null; }

        private int _max;
        private int _count;
        private int _nestingLevel;
        _NSUndoObject _head;

    }

    private static class _NSUndoLightInvocation extends _NSUndoObject {


        public _NSUndoLightInvocation(Object target, NSSelector selector, Object arg) { return null; }

        public _NSUndoLightInvocation(Object target, NSSelector selector, Object args[]) { return null; }

        public void invoke() {}

        Object _argument() { return null; }

        Object[] _arguments() { return null; }

        public String toString() { return null; }

        private NSSelector _selector;
        private Object _args[];

    }

    static class _NSUndoEndMark extends _NSUndoObject {

        _NSUndoEndMark() { return null; }

        public boolean isEndMark() { return true; }

        public String toString() { return null; }
    }

    static class _NSUndoBeginMark extends _NSUndoObject {


        _NSUndoBeginMark() { return null; }

        public void setGroupIdentifier(Object identifier) {}

        public Object groupIdentifier() { return null; }

        public boolean isBeginMark() { return true; }

        public String toString() { return null; }

        private Object _groupIdentifier;

    }

    private static class _NSUndoObject {


        public _NSUndoObject() { return null; }

        public _NSUndoObject(Object target) { return null; }

        public boolean isBeginMark() { return true; }

        public boolean isEndMark() { return true; }

        public void invoke() {}

        public Object target() { return null; }

        _NSUndoObject next;
        _NSUndoObject previous;
        protected Object _target;

    }

    static class WeakHashSet extends AbstractSet
        implements Set {


        public WeakHashSet() { return null; }

        public WeakHashSet(Collection c) { return null; }

        public WeakHashSet(int initialCapacity, float loadFactor) { return null; }

        public WeakHashSet(int initialCapacity) { return null; }

        public Iterator iterator() { return null; }

        public int size() { return 0; }

        public boolean isEmpty() { return true; }

        public boolean contains(Object o) { return true; }

        public boolean add(Object o) { return true; }

        public boolean remove(Object o) { return true; }

        public void clear() {}

        static  {}

        private static final long serialVersionUID = 0x7498f94aL;
        private transient WeakHashMap _map;
        private static final Object PRESENT;

    }



    private void _prepareEventGrouping() {}

    public void _processEndOfEventNotification(Object arg) {}

    private void _postCheckpointNotification() {}

    private void _registerUndoObject(_NSUndoObject undo) {}

    private void _setGroupIdentifier(Object identifier) {}

    public _NSUndoStack _undoStack() { return null; }

    public NSUndoManager() { return null; }

    public void dispose() {}

    public void disposeIfNoSourceRegistered() {}

    public void registerActionSource(Object source, NSSelector callback) {}

    public void removeActionSource(Object source) {}

    public void beginUndoGrouping() {}

    public int groupingLevel() { return 0; }

    public void endUndoGrouping() {}

    public void disableUndoRegistration() {}

    public void enableUndoRegistration() {}

    public boolean isUndoRegistrationEnabled() { return true; }

    public boolean groupsByEvent() { return true; }

    public void setGroupsByEvent(boolean groupsByEvent) {}

    public void setLevelsOfUndo(int levels) {}

    public int levelsOfUndo() { return 0; }

    public void undo() {}

    public void undoNestedGroup() {}

    public void redo() {}

    public boolean canUndo() { return true; }

    public boolean canRedo() { return true; }

    public boolean isUndoing() { return true; }

    public boolean isRedoing() { return true; }

    public void removeAllActions() {}

    public void removeAllActionsWithTarget(Object target) {}

    public void registerUndoWithTarget(Object target, NSSelector selector, Object object) {}

    public void registerUndoWithTargetAndArguments(Object target, NSSelector selector, Object objects[]) {}

    static  {}

    public static final Class _CLASS;
    private _NSUndoStack _undoStack;
    private _NSUndoStack _redoStack;
    private int _disabled;
    private boolean _undoing;
    private boolean _redoing;
    private boolean _registeredForCallback;
    private boolean _postingCheckpointNotification;
    private boolean _groupsByEvent;
    private WeakHashSet _source;
    public static final int UndoCloseGroupingRunLoopOrdering = 0x55730;
    public static final String CheckpointNotification = "NSUndoManagerCheckpointNotification";
    public static final String WillUndoChangeNotification = "NSUndoManagerWillUndoChangeNotification";
    public static final String WillRedoChangeNotification = "NSUndoManagerWillRedoChangeNotification";
    public static final String DidUndoChangeNotification = "NSUndoManagerDidUndoChangeNotification";
    public static final String DidRedoChangeNotification = "NSUndoManagerDidRedoChangeNotification";
    public static final String DidOpenUndoGroupNotification = "NSUndoManagerDidOpenUndoGroupNotification";
    public static final String WillCloseUndoGroupNotification = "NSUndoManagerWillCloseUndoGroupNotification";
    private static final NSSelector _endOfEventSelector;
    private static final boolean DebugUndo = false;

}
