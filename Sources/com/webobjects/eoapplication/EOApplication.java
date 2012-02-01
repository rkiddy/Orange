package com.webobjects.eoapplication;
/**
 * Java Client applications typically execute as a desktop application (often referred to as a Java application), launched through Web Start or through a command line or as an applet running in a browser. EOApplication insulates the developer from this distinction by serving as an execution-mode-independent repository for application-level client-side logic. The provided JApplet subclass EOApplet simply invokes EOApplication with the HTML arguments as parameters.
 * To support different kind of architectures, EOApplication uses an application support object which has to be a subclass of the abstract inner class EOApplication.ApplicationSupport. The application support implementation can encapsulate different kind of initialization behavior, for example for three-tier Java Client applications the creation of a distribution channel is taken care of by the EOClientApplicationSupport class. EOApplication does not provide a main function, that is left to the application support class. The main function typically invokes the static startApplication method on EOApplication with an instance of the appropriate application support class.
 * Each application has a window observer which keeps track of all of the windows in the application, which window is active, and whether all windows have been closed. The window observer has two notifications: ActiveWindowChangedNotification and LastWindowClosedNotification, which the finishInitialization method binds to the activeWindowDidChange and lastWindowDidClose methods, respectively.
 * Each application also has a defaults manager, an EODefaults object, which maintains two dictionaries for application defaults: a transient dictionary whose values are forgotten when the application exits, and a persistent dictionary whose values are stored on the server. The defaults manager implements valueForKey to read the defaults and setPersistentValueForKey and setTransientValueForKey to store the defaults.
 */
public class EOApplication extends com.webobjects.eoapplication.EOController{
    /**
     * The name of the notification sent when the application did finish the launch sequence.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationDidStartNotification="EOApplicationDidStart";

    /**
     * The name of the notification sent when the application has switched to the final event thread. User interface related initializations should be performed after this notification was sent.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationWillFinishInitializationNotification="EOApplicationWillFinishInitialization";

    /**
     * The name of the notification sent when the application is about to quit.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationWillQuitNotification="EOApplicationWillQuit";

    /**
     * The name of the notification sent when the application is beginning the launch sequence.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ApplicationWillStartNotification="EOApplicationWillStart";

    /**
     * Creates a new EOApplication object.
     */
    public EOApplication(){
         //TODO codavaj!!
    }

    /**
     * This method is invoked when the user changes the active window in the receiver (usually by clicking in an inactive window). It is invoked via a notification from the application's window observer.
     */
    public void activeWindowDidChange(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's application name.
     */
    public java.lang.String applicationName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns all of the application's arguments in a dictionary. If the application is a desktop application (and not an applet), the arguments can come from both the command line and the WOJavaClientApplet on the server side.
     */
    public com.webobjects.foundation.NSDictionary arguments(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not the application can quit (shows a Quit menu item). Defaults to true if the application is run as a desktop application and false if it runs as an applet.
     */
    public boolean canQuit(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the actions (EOAction objects) for the application. The application object's actions are displayed in the main menu of the Java Client application.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's defaults manager (an EODefaults object). If your application requires the user to log in, you may override this method so it returns null until the user has authenticated.
     */
    public com.webobjects.eoapplication.EODefaults defaults(){
        return null; //TODO codavaj!!
    }

    /**
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array containing the application's visible documents (EODocument controllers).
     */
    public com.webobjects.foundation.NSArray documents(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the application's documents (EODocument controllers) that edit enterprise objects with an entity name matching entityName and a global ID matching globalID.
     */
    public com.webobjects.foundation.NSArray documentsForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the application's documents (EODocument controllers) that are edited (and not saved).
     */
    public com.webobjects.foundation.NSArray editedDocuments(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is invoked after the final event thread is guaranteed to be running. If you subclass EOApplication, use this method to initialize anything relating to the user interface or event handling. Do not perform such initialization using EOApplication's constructor.
     */
    protected void finishInitialization(){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether any of the application's documents (EODocument controllers) are edited (and not saved). Otherwise returns false.
     */
    public boolean hasEditedDocuments(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array containing the preferred display language lookup order for the user (in English). Examples for display languages: "English", "German".
     */
    public com.webobjects.foundation.NSArray languages(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is invoked when the user closes the last window in the application. It is invoked as a notification from the receiver's window observer. Usually causes the application to quit.
     */
    public void lastWindowDidClose(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings which can be used to identify the preferred locale/language for the user. The various indicators are a mixture of different representations, for example "en_US", "en", "English".
     */
    public com.webobjects.foundation.NSArray localeIndicators(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the preferred Locale lookup order for the user.
     */
    public com.webobjects.foundation.NSArray locales(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of Strings (all lowercase) which can be used to identify the platform the application is running on. Examples: "macos", "windows".
     */
    public com.webobjects.foundation.NSArray platformIndicators(){
        return null; //TODO codavaj!!
    }

    /**
     * Causes the receiver to quit (provided canQuit is true).
     */
    public void quit(){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether or not the receiver quits when the user closes all of its windows. Defaults to true.
     */
    public boolean quitsOnLastWindowClose(){
        return false; //TODO codavaj!!
    }

    /**
     * Can be invoked to quit the application after showing a panel with an explanation (for example in case of a Session Time Out error for a three-tier application).
     */
    public void quitWithMessage(java.lang.String title, java.lang.String message){
        return; //TODO codavaj!!
    }

    /**
     * Updates the client application's enterprise objects to reflect the changes sent to the server from other client applications. By default, the application does not automatically update its objects, however, the user can usually update the objects manually from the Document menu.
     */
    public void refreshData(){
        return; //TODO codavaj!!
    }

    /**
     * Attempts to save all of the receiver's edited documents.
     */
    public boolean saveAll(){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the receiver's application name.
     */
    public void setApplicationName(java.lang.String applicationName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the application's arguments. This method might be useful for application support objects when arguments are read in from different locations.
     */
    public static void setArguments(com.webobjects.foundation.NSDictionary arguments){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether or not the application can quit (shows a Quit menu item).
     */
    public void setCanQuit(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's defaults manager (an EODefaults object).
     */
    public void setDefaults(com.webobjects.eoapplication.EODefaults defaults){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether or not the receiver quits when the user closes all of its windows.
     */
    public void setQuitsOnLastWindowClose(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the application's window observer to EOWindowObserver. The window observer manages the application's windows: Which window is active, how many there are, etc.
     */
    public void setWindowObserver(com.webobjects.eoapplication.EOWindowObserver windowObserver){
        return; //TODO codavaj!!
    }

    /**
     * Returns the shared EOApplication instance initialized in the startApplication method.
     */
    public static com.webobjects.eoapplication.EOApplication sharedApplication(){
        return null; //TODO codavaj!!
    }

    /**
     * This method is the primary entry point for starting a Java Client application. Together with the finishInitialization method it performs the complete startup sequence (connect to the server, warm up the user interface, determine languages, etc.)
     * The parameters dictionary contains all client parameters known at the time this method is invoked. For applets, these are all values of the WOJavaClientApplet bindings on the server side, passed in the HTML. For applications, these are all command line arguments.
     * The initialTopComponentController parameter can specify an EOComponentController in the controller hierarchy which becomes the parent controller for the intial EOInterfaceController if one is specified. For applets, this controller is an EOAppletController. For desktop applications, this is null, which causes a new EOFrameController to be instantiated and used as the top-most EOComponentController.
     */
    public static com.webobjects.eoapplication.EOApplication startApplication(com.webobjects.foundation.NSDictionary parameters, com.webobjects.eoapplication.EOComponentController initialTopComponentController, com.webobjects.eoapplication.EOApplication.ApplicationSupport applicationSupport){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver as a string describing the state of the application.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the application's window observer.
     */
    public com.webobjects.eoapplication.EOWindowObserver windowObserver(){
        return null; //TODO codavaj!!
    }

    /**
     * EOApplication.ApplicationSupport can encapsulate behavior of Java Client applications used in different architectures. An instance of EOApplication.ApplicationSupport is passed to the startApplication method on EOApplication and provides various methods used by the EOApplication instance to perform certain initalization and clean up tasks.
     * The application object passes an arguments dictionary to many methods. This dictionary contains all application arguments known to the appliation at this time (depending on the architecture more arguments might be added during the startup sequence). If the application support object gets access to more arguments, it should invoke the setArguments method on EOApplication.
     */
    public static abstract class ApplicationSupport{
        /**
         * Creates a new EOApplication.ApplicationSupport object.
         */
        public ApplicationSupport(){
             //TODO codavaj!!
        }

        /**
         * Gives the application support object an opportunity to complete the termination process of the application.
         */
        public void acknowledgeQuit(){
            return; //TODO codavaj!!
        }

        /**
         * Gives the application support object an opportunity to complete the startup sequence of the application before the application starts listening to user events.
         */
        public void finishStartup(com.webobjects.foundation.NSDictionary arguments){
            return; //TODO codavaj!!
        }

        /**
         * Gives the application support object an opportunity to prepare the application instance, for example to set the name and the default manager. The application support object should not access the EOApplication instance before receiving this method.
         */
        public void prepareApplication(com.webobjects.eoapplication.EOApplication application, com.webobjects.foundation.NSDictionary arguments){
            return; //TODO codavaj!!
        }

        /**
         * Gives the application support object an opportunity to initialize principal classes.
         */
        public void prepareClasses(com.webobjects.foundation.NSDictionary arguments){
            return; //TODO codavaj!!
        }

        /**
         * Gives the application support object an opportunity to initialize global objects, for example data source factories and distribution channels.
         */
        public void prepareGlobalObjects(com.webobjects.foundation.NSDictionary arguments){
            return; //TODO codavaj!!
        }

        /**
         * This method is invoked to ask the application support object to refresh all the data fetched into the application to reflect the latest state.
         */
        public void refreshData(){
            return; //TODO codavaj!!
        }

        /**
         * Gives the application support object an opportunity to run startup dialogs, for example to ask for connection URLs.
         */
        public void runStartupDialogs(com.webobjects.foundation.NSDictionary arguments){
            return; //TODO codavaj!!
        }

    }
}
