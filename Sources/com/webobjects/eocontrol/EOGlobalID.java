package com.webobjects.eocontrol;
/**
 * An EOGlobalID is a compact, universal, identifier for a persistent object. This forms the basis for uniquing in the Enterprise Objects Framework. An EOGlobalID uniquely identifies the same object or record both between EOEditingContexts in a single application, and in multiple applications (as in distributed systems). EOGlobalID is an abstract class, declaring only the methods needed for identification. A concrete subclass must define appropriate storage for identifying values (such as primary keys), as well as an initialization or creation method to build IDs.
 * EOEditingContexts and other object stores support the insertion of new objects without established IDs, creating temporary IDs that get replaced with permanent ones as soon as the new objects are saved to their persistent stores. The temporary IDs are instances of the EOTemporaryGlobalID class.
 * When an EOObjectStore saves these newly inserted objects, it must replace the temporary IDs with persistent ones. When it does this, it must post a GlobalIDChangedNotification announcing the change so that observers can update their accounts of which objects are identified by which global IDs. The notification's userInfo dictionary contains a mapping from the temporary IDs (the keys) to their permanent replacements (the values).
 * See Also:EOGlobalID.GlobalIDChangedNotification, EOTemporaryGlobalID, EOObjectStore, Serialized Form
 */
public abstract class EOGlobalID implements java.io.Serializable, java.lang.Cloneable{
    /**
     * Posted whenever EOTemporaryGlobalIDs are replaced by permanent EOGlobalIDs. The notification contains:
     * Notification Objectnull UserinfoA mapping from the temporary IDs (keys) to permanent IDs (values) See Also:Constant Field Values Constructor Detail EOGlobalID public EOGlobalID() Method Detail equals public abstract boolean equals(Objectobject) Compares the receiver to object. If the contents of object are equal to the contents of the receiver, this method returns true. If not, it returns false. Two data objects are equal if they hold the same number of bytes, and if the bytes at the same position in the objects are the same. Overrides:equals in class Object Parameters:object - input object against which the receiver is compared Returns:true if the objects are equal; false otherwise hashCode public abstract int hashCode() Provides an appropriate hash code useful for storing the receiver in a hash-based data structure. Overrides:hashCode in class Object Returns:hash code int useful for storing the receiver in a hash-based data structure isTemporary public boolean isTemporary() If the receiver is temporary (that is, most likely an instance of EOTemporaryGlobalID), this method returns true; false otherwise. See the class description for more information on temporary IDs. Note that EOGlobalID's implementation simply returns false. Returns:true if the globalID is temporarySee Also:EOGlobalID, EOTemporaryGlobalID clone public Object clone() EOGlobalID's implementation simply returns a reference to the receiver (this). Overrides:clone in class Object Returns:an Object reference to the receiver Overview Package Class Tree Deprecated Index Help Last updated June 2008 PREV CLASS NEXT CLASS FRAMES NO FRAMES All Classes SUMMARY:NESTED|FIELD|CONSTR|METHOD DETAIL:FIELD|CONSTR|METHOD Copyright 2000-2008 Apple Inc.
     */
    public static final java.lang.String GlobalIDChangedNotification="EOGlobalIDChangedNotification";

    EOGlobalID(){
         //TODO codavaj!!
    }

    java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    boolean equals(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    int hashCode(){
        return 0; //TODO codavaj!!
    }

    boolean isTemporary(){
        return false; //TODO codavaj!!
    }

}
