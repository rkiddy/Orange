package com.webobjects.foundation;
/**
 * The NSCoding interface declares the methods that a class must implement so that instances of that class can be encoded and decoded. This capability provides the basis for archiving (where objects and other structures are stored on disk) and distribution (where objects are copied to different address spaces).
 * When an object receives an encodeWithCoder message, it should encode all of its vital instance variables, after sending a message to super if its superclass also conforms to the NSCoding interface. An object doesn't have to encode all of its instance variables. Some values may not be important to reestablish the state of the object and others may be derivable from related state upon decoding. Still other instance variables should be encoded only under certain conditions. The important concept to keep in mind is the state of the instance that you want to preserve. Thus, you would only encode and decode (or derive from decoded values) all the instance variables that you think are important to preserve the state of the instance.
 * For example, suppose a fictitious MapView class was being created that displays a legend and a map at various magnifications. The MapView class defines several instance variables, including the name of the map and the current magnification. The encodeWithCoder method of MapView might look like the following:
 * This example assumes that the superclass of MapView also implements the NSCoding interface. If the superclass of the class does not implement NSCoding, you should omit the line that invokes super's encodeWithCoder method.
 * encodeObject and encodeInt are coder methods in NSCoder that you can and should use to encode instance variables of your class. There are other coder methods for other types. Each encode method in NSCoder has a corresponding decode method used for decoding.
 * In decodeObject the class should first send a message to super's implementation of decodeObject (if appropriate) to initialize inherited instance variables. It should then decode and initialize its own. MapView's implementation of decodeObject might look like this:
 * If the superclass of the class does not implement NSCoding, a new instance of the class should simply be created instead of invoking the superclass's decodeObject method. Notice also that the decode methods used corresponds to the encode methods used during encoding.
 * During encoding a coder allows an object being coded to substitute a different class for itself than the object's actual class. For example, this allows a private class to be represented in a coder by a public class. To allow the substitution, a coder invokes the method classForCoder on the object before it's encoded. The coder uses the class returned by this method instead of the object's actual class for both encoding and decoding.
 * See Also:NSCoder, NSCoding.encodeWithCoder(NSCoder coder), NSCoding.Support.decodeObject(NSCoder coder), NSCoding.classForCoder()
 */
public interface NSCoding{
    /**
     * Allows the receiver, before being encoded, to substitute a class other than its own in a coder. For example, private subclasses can substitute the name of a public superclass when being encoded.
     */
    abstract java.lang.Class classForCoder();

    /**
     * Encodes the receiver using coder. Object type information along with an object's data is stored.
     */
    abstract void encodeWithCoder(com.webobjects.foundation.NSCoder coder);

    /**
     * NSCoding.Support is an abstract class that defines a mechanism for one class to provide NSCoding behavior on behalf of another class. Subclasses of NSCoding.Support encode and decode objects of a different class. Subclasses of NSCoding.Support are needed to provide coding for classes whose code you don't own and that don't implement NSCoding.
     * See Also:NSCoding.encodeWithCoder(NSCoder coder), NSCoding.Support.decodeObject(NSCoder aCoder), NSCoding.Support.setSupportForClass(NSCoding.Support supportClass, Class aClass), NSCoding.Support.supportForClass(Class aClass), NSCoding
     */
    public static abstract class Support{
        public Support(){
             //TODO codavaj!!
        }

        /**
         * NSCoding.Support's default implementation simply returns receiver's actual class.
         */
        public java.lang.Class classForCoder(java.lang.Object receiver){
            return null; //TODO codavaj!!
        }

        /**
         * Implemented by subclasses to decode an object of a specific type from the data in coder.
         */
        public abstract java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder);

        /**
         * Implemented by subclasses to encode an object receiver of a specific type using NSCoder coder.
         */
        public abstract void encodeWithCoder(java.lang.Object receiver, com.webobjects.foundation.NSCoder coder);

        /**
         * Sets support as the NSCoding.Support class to use for encoding and decoding instances of aClass.
         */
        public static void setSupportForClass(com.webobjects.foundation.NSCoding.Support support, java.lang.Class aClass){
            return; //TODO codavaj!!
        }

        /**
         * Gets the registered NSCoding.Support class to encode and decode instances of aClass.
         */
        public static com.webobjects.foundation.NSCoding.Support supportForClass(java.lang.Class aClass){
            return null; //TODO codavaj!!
        }

    }
}
