
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;


public class EOEvent
    implements Serializable {


    protected static String _descriptionFileName(String aName) { return null; }

    public static NSDictionary eventTypeDescriptions(Class aClass) { return null; }

    protected static String _eventDescriptionForEventType(Class aClass, String type) { return null; }

    public String title() { return null; }

    public EOEvent() { return null; }

    public void setInfo(Object info) {}

    public void setType(String type) {}

    public String signatureOfType(int tag) { return null; }

    public void markStartWithInfo(Object info) {}

    public void markAtomicWithInfo(Object info) {}

    public void markEnd() {}

    public EOEvent parentEvent() { return null; }

    public String type() { return null; }

    public Object info() { return null; }

    public String toString() { return null; }

    public String description() { return null; }

    public static String classDescription(Class aClass) { return null; }

    public NSTimestamp startDate() { return null; }

    public long duration() { return 0L; }

    public long durationWithoutSubevents() { return 0L; }

    public NSArray subevents() { return null; }

    public String comment() { return null; }

    public String displayComponentName() { return null; }

    public static NSArray groupEvents(NSArray events, int tag) { return null; }

    public static NSArray aggregateEvents(NSArray events, int tag) { return null; }

    protected final void _appendEvent(EOEvent event) { return null; }

    protected final EOEvent _cancelEvent(EOEvent event) { return null; }

    private final void _deepDescriptionsWithPrefix(String prefix, String unit, NSMutableArray all) { return null; }

    String _deepDescription() { return null; }

    public long _preciseDuration() { return 0L; }

    public long _preciseDurationWithoutSubevents() { return 0L; }

    private static NSArray _aggregatedEvents(NSArray events, int query, Class c) { return null; }

    public int _compareDuration(EOEvent other) { return 0; }

    protected final void _markEndWithLastEvent(EOEvent last) { return null; }

    protected EOEvent _nextEvent() { return null; }

    protected EOEvent _childEvent() { return null; }

    protected void _setNextEvent(EOEvent next) {}

    static boolean isAtomic(long duration) { return true; }

    static boolean isOpenBranch(long duration) { return true; }

    static boolean isClosedBranch(long duration) { return true; }

    private void _subeventsOfClass(Class c, String type, NSMutableArray result) {}

    protected NSArray _nestedEventsOfClass(Class c, String type) { return null; }

    public int compare(EOEvent other) { return 0; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x57582751L;
    private static final String SerializationInfoFieldKey = "info";
    private static final String SerializationTypeFieldKey = "type";
    private static final String SerializationCallStackFieldKey = "callStack";
    private static final String SerializationEncounteredFieldKey = "encountered";
    private static final String SerializationDurationFieldKey = "duration";
    private static final String SerializationParentFieldKey = "parent";
    private static final String SerializationChildFieldKey = "child";
    private static final String SerializationNextFieldKey = "next";
    private static final Class _EOEventClass;
    protected Object _info;
    protected String _type;
    protected NSArray _callStack;
    protected long _encountered;
    protected long _duration;
    protected EOEvent _parent;
    protected EOEvent _child;
    protected EOEvent _next;
    public static final int BasicEventSignature = 0;
    public static final String EventGroupName = "EOEventGroupName";
    static final NSMutableDictionary descs;
    static final _EOEventDurationComparator AscendingDurationComparator;
    private static final ObjectStreamField serialPersistentFields[];

}
