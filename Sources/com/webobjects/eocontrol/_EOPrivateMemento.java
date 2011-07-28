
package com.webobjects.eocontrol;

import com.webobjects.foundation.NSDictionary;


public interface _EOPrivateMemento {
    public static class DefaultImplementation
        implements _EOPrivateMemento {


        public static Object createStateObject(EOEnterpriseObject eo, EOEditingContext ec, EOGlobalID gid, EOClassDescription cd) { return null; }

        public DefaultImplementation(EOEnterpriseObject eo, EOEditingContext ec, EOGlobalID gid, EOClassDescription cd) { return null; }

        public EOEditingContext __editingContext() { return null; }

        public void __setEditingContext(EOEditingContext ec) {}

        public EOClassDescription __classDescription() { return null; }

        public void __setClassDescription(EOClassDescription cd) {}

        public EOGlobalID __globalID() { return null; }

        public void __setGlobalID(EOGlobalID gid) {}

        public NSDictionary __originalSnapshot() { return null; }

        public void __setOriginalSnapshot(NSDictionary os) {}

        public NSDictionary __lastSnapshot() { return null; }

        public void __setLastSnapshot(NSDictionary ls) {}

        public int __retainCount() { return 0; }

        public void __setRetainCount(int rc) {}

        public boolean __isInitialized() { return true; }

        public void __setInitialized(boolean inited) {}

        public boolean __isShared() { return true; }

        public void __setShared(boolean shared) {}

        public boolean __hasAuxillaryObservers() { return true; }

        public void __setAuxillaryObservers(boolean hao) {}

        public void __clearPendingChanges() {}

        public boolean __hasPendingChanges() { return true; }

        public boolean __hasPendingUpdate() { return true; }

        public void __setPendingUpdate(boolean changed) {}

        public boolean __isPendingInsertion() { return true; }

        public void __setPendingInsertion(boolean inserted) {}

        public boolean __isPendingDeletion() { return true; }

        public void __setPendingDeletion(boolean deleted) {}

        private transient EOClassDescription __classDescription;
        private transient EOEditingContext __editingContext;
        private transient EOGlobalID __gid;
        private transient NSDictionary __originalSnapshot;
        private transient NSDictionary __lastSnapshot;
        private transient int __retainCount;
        private transient int __flags;
        private static final int kInitializedFlag = 0;
        private static final int kInitializedMask = 1;
        private static final int kSharedFlag = 1;
        private static final int kSharedMask = 2;
        private static final int kAuxObserverFlag = 2;
        private static final int kAuxObserverMask = 4;
        private static final int kPendingUpdatesFlag = 3;
        private static final int kPendingUpdatesMask = 8;
        private static final int kPendingInsertionFlag = 4;
        private static final int kPendingInsertionMask = 16;
        private static final int kPendingDeletionFlag = 5;
        private static final int kPendingDeletionMask = 32;
        private static final int kPendingChangesMask = 56;

    }


    public abstract EOEditingContext __editingContext();

    public abstract void __setEditingContext(EOEditingContext eoeditingcontext);

    public abstract EOClassDescription __classDescription();

    public abstract void __setClassDescription(EOClassDescription eoclassdescription);

    public abstract EOGlobalID __globalID();

    public abstract void __setGlobalID(EOGlobalID eoglobalid);

    public abstract NSDictionary __originalSnapshot();

    public abstract void __setOriginalSnapshot(NSDictionary nsdictionary);

    public abstract NSDictionary __lastSnapshot();

    public abstract void __setLastSnapshot(NSDictionary nsdictionary);

    public abstract int __retainCount();

    public abstract void __setRetainCount(int i);

    public abstract boolean __isInitialized();

    public abstract void __setInitialized(boolean flag);

    public abstract boolean __isShared();

    public abstract void __setShared(boolean flag);

    public abstract boolean __hasAuxillaryObservers();

    public abstract void __setAuxillaryObservers(boolean flag);

    public abstract boolean __hasPendingChanges();

    public abstract void __clearPendingChanges();

    public abstract boolean __hasPendingUpdate();

    public abstract void __setPendingUpdate(boolean flag);

    public abstract boolean __isPendingInsertion();

    public abstract void __setPendingInsertion(boolean flag);

    public abstract boolean __isPendingDeletion();

    public abstract void __setPendingDeletion(boolean flag);
}
