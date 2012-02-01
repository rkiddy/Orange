package com.webobjects.eocontrol;
/**
 * The EOKeyValueArchiving interface declares the methods that a class must implement so that instances of that class can be encoded and decoded with EOKeyValueArchiver and EOKeyValueUnarchiver objects.
 * An archiver instructs the object to encode its state by invoking encodeWithKeyValueArchiver and an unarchiver instructs an object's class to decode its state by invoking the static method decodeWithKeyValueUnarchiver which takes an EOKeyValueArchiver as argument.
 * The method decodeWithKeyValueUnarchiver isn't strictly part of the EOKeyValueArchiving interface, but it is required of any class that implements the interface. decodeWithKeyValueUnarchiver is a static method, and therefore can't be formally declared in the EOKeyValueArchiving interface. Any class that implements the EOKeyValueArchiving interface must implement its methods, and implement the static method decodeWithKeyValueUnarchiver. The method signature is:
 * See Also:EOKeyValueArchiver, EOKeyValueUnarchiver, EOKeyValueArchiving.Awaking, EOKeyValueArchiving.FinishInitialization, EOKeyValueArchiving.Support
 */
public interface EOKeyValueArchiving{
    /**
     * Asks the receiver to archive its state into the EOKeyValueArchiver archiver.
     */
    abstract void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver);

    /**
     * EOKeyValueArchiving.FinishInitialization is an interface which can be optionally implemented by EOKeyValueArchiving objects if they have special initialization needs at the end of an unarchiving process of an EOKeyValueUnarchiver.
     * See Also:EOKeyValueArchiving.Awaking
     */
    public static interface FinishInitialization{
        /**
         * Notifies the receiver that the EOKeyValueUnarchiver unarchiver has unarchived and awaken all objects from an archive. Objects receive this method at the end of an unarchiving process of an EOKeyValueUnarchiver, when all objects have been unarchived and after they have been asked to awake through the EOKeyValueArchiving.Awaking interface method awakeFromKeyValueUnarchiver.
         */
        abstract void finishInitializationWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver);

    }
    /**
     * EOKeyValueArchiving.Awaking is an interface which can be optionally implemented by EOKeyValueArchiving objects if they need to be awaken explicitly at the end of an unarchiving process of an EOKeyValueUnarchiver.
     * See Also:EOKeyValueArchiving.FinishInitialization
     */
    public static interface Awaking{
        /**
         * Notifies the receiver that the EOKeyValueUnarchiver unarchiver has unarchived all objects from an archive. Objects receive this method at the end of an unarchiving process of an EOKeyValueUnarchiver, when all objects have been unarchived, but before they are asked to finish initialization through the EOKeyValueArchiving.FinishInitialization interface method finishInitializationWithKeyValueUnarchiver.
         */
        abstract void awakeFromKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver);

    }
    /**
     * EOKeyValueArchiving.Support is an abstract class that defines a mechanism for one class to provide EOKeyValueArchiving behavior on behalf of another class. Subclasses of EOKeyValueArchiving.Support archive and unarchive objects of a different class. Subclasses of EOKeyValueArchiving.Support are needed to provide archiving for classes whose code WebObjects or you don't own and that don't implement EOKeyValueArchiving.
     * A subclass of EOKeyValueArchiving.Support need to implement the methods encodeWithKeyValueArchiver and decodeObjectWithKeyValueUnarchiver to archive and unarchive objects of a specific non-EOKeyValueArchiving class. You can also override the methods awakeFromKeyValueUnarchiver and finishInitializationWithKeyValueUnarchiver, EOKeyValueArchiving.Support's implementations of these methods do nothing.
     * EOKeyValueArchiving.Support manages a registry of Support classes for classes that don't implement EOKeyValueArchiving. The methods setSupportForClass and supportForClass are used to register and access the EOKeyValueArchiving.Support classes for performing archiving on non-EOKeyValueArchiving objects.
     * See Also:EOKeyValueArchiving
     */
    public static abstract class Support{
        public Support(){
             //TODO codavaj!!
        }

        /**
         * Asks the receiver to awake the object receiver after the EOKeyValueUnarchiver unarchiver has unarchived all objects from an archive. This method is invoked at the end of an unarchiving process of an EOKeyValueUnarchiver, when all objects have been unarchived, but before they are asked to finish initialization.
         */
        public void awakeFromKeyValueUnarchiver(java.lang.Object receiver, com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
            return; //TODO codavaj!!
        }

        /**
         * Asks the receiver to re(create) the an object from the EOKeyValueUnarchiver unarchiver.
         */
        public abstract java.lang.Object decodeObjectWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver);

        /**
         * Asks the receiver to archive the state of receiver into the EOKeyValueArchiver archiver.
         */
        public abstract void encodeWithKeyValueArchiver(java.lang.Object receiver, com.webobjects.eocontrol.EOKeyValueArchiver archiver);

        /**
         * Asks the receiver to finish initializing the object receiver after the EOKeyValueUnarchiver unarchiver has unarchived and awaken all objects from an archive. This method is invoked at the end of an unarchiving process of an EOKeyValueUnarchiver, when all objects have been unarchived and after they have been asked to awake.
         */
        public void finishInitializationWithKeyValueUnarchiver(java.lang.Object receiver, com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
            return; //TODO codavaj!!
        }

        /**
         * Sets the support object used for archiving and unarchiving for instances of aClass to support.
         */
        public static void setSupportForClass(com.webobjects.eocontrol.EOKeyValueArchiving.Support support, java.lang.Class aClass){
            return; //TODO codavaj!!
        }

        /**
         * Returns the support object used for archiving and unarchiving for instances of aClass.
         */
        public static com.webobjects.eocontrol.EOKeyValueArchiving.Support supportForClass(java.lang.Class aClass){
            return null; //TODO codavaj!!
        }

    }
}
