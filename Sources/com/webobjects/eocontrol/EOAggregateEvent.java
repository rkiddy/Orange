
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.util.Iterator;


public class EOAggregateEvent extends EOEvent {


    public EOAggregateEvent() { return null; }

    public void addEvent(EOEvent e) {}

    public NSArray events() { return null; }

    public NSArray subevents() { return null; }

    public String signatureOfType(int tag) { return null; }

    public String description() { return null; }

    public long _preciseDuration() { return 0L; }

    public long _preciseDurationWithoutSubevents() { return 0L; }

    public long durationWithoutSubevents() { return 0L; }

    public EOEvent _child() { return null; }

    public String displayComponentName() { return null; }

    public String title() { return null; }

    public String comment() { return null; }

    public Object info() { return null; }

    public int _compareDuration(EOEvent other) { return 0; }

    public void _setAggregateTag(int tag) {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xca961eb8L;
    private static final String SerializationReferencesFieldKey = "references";
    private static final String SerializationChildrenFieldKey = "children";
    private static final String SerializationAggregateSignatureTagFieldKey = "sigTag";
    NSMutableSet _references;
    NSArray _children;
    int _aggregateSignatureTag;
    private static final ObjectStreamField serialPersistentFields[];

}
