package com.webobjects.eocontrol;
/**
 * The EODeferredFaulting interface defines the methods enterprise objects use to manage deferred faulting.
 * The Enterprise Objects technology uses faults as stand-ins for objects whose data has not yet been fetched. Although fault creation is much faster than fetching, fault instantiation still takes time. To further improve performance, Enterprise Objects can use deferred faults which are more efficient.
 * In an object whose class enables deferred faulting, the object's relationships are initially set to deferred faults. For a particular relationship, a single deferred fault is shared between all instances of an Enterprise Object class. This sharing of deferred faults can significantly reduce the number of faults that need to be created, and usually reduces the overhead of fault creation during a fetch.
 * For example, consider a Movie class with a studio relationship. Without deferred faulting, during a fetch of twenty movie objects, twenty faults are created for the studio relationship. This results in one fault for each movie. With deferred faulting, only one fault is created, a deferred fault that is shared by all the movies.
 */
public interface EODeferredFaulting extends com.webobjects.eocontrol.EOFaulting{
    /**
     * Enterprise Object instances that use deferred faulting invoke this method before accessing a relationship to ensure that the relationship isn't a deferred fault. EOCustomObject and EOGenericRecord's implementations check if the object is a deferred fault. It creates and returns a regular fault if it is.
     * For example, suppose a Movie enterprise object uses deferred faulting. Then the accessors for its relationships, studio for example, should invoke willReadRelationship before returning the object. This code might look like this:
     * public Studio studio(){ willRead(); return this.willReadRelationship(studio); }
     */
    abstract java.lang.Object willReadRelationship(java.lang.Object value);

}
