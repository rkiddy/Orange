package com.webobjects.appserver;
/**
 * <p>
 * WODirectAction is an abstract class that defines the interface for direct action classes. You subclass WODirectAction to provide an object 
 * that is a repository for action methods.
 * </p><p>
 * WODirectAction provides the simplest interface for adding logic and custom code to your WebObjects application. WODirectAction objects are 
 * instantiated when a URL requested by a client browser is sent to the WebObjects application. The <code>WODirectActionRequestHandler</code>
 * determines the proper class and action to be invoked and then passes control to the WODirectAction subclass.
 * </p><p>
 * In contrast to a WOComponent-based action, a direct action is well-defined by the URL that invokes it. For example, the following URL will 
 * invoke the method findEmployeeAction on the subclass of WODirectAction called Common:
 * <blockquote><pre>
   http://localhost/cgi-bin/WebObjects/Myapp.woa/wa/Common/findEmployee
   </pre><blockquote>
 * </p><p>
 * A subclass of WODirectAction is a repository for action methods. New WebObjects applications contain a default implementation of WODirectAction
 * subclass called <code>DirectAction</code>. The DirectAction class is used when no class is specified in the URL.
 * </p><p>
 * In summary, here are some URLs and actions they invoke:
   <table border="1">
   <tr><th>This URL...</th><th>Invokes this method...</th></tr>
   <tr><td>.../MyApp.woa/wa/xi</td><td><code>defaultAction</code> on class DirectAction</td></tr>
   <tr><td>.../MyApp.woa/wa/find</td>
       <td><code>findAction</code> on class DirectAction, if it exists, or <code>defaultAction</code> on class find otherwise</td></tr>
   <tr><td>.../MyApp.woa/wa/find/</td><td>same as .../MyApp.woa/wa/find</td></tr>
   <tr><td>.../MyApp.woa/wa/Common/find</td><td>findAction on class Common</td></tr>
   <tr><td>.../MyApp.woa/wa/Common/</td>
       <td><code>CommonAction</code> on class DirectAction, if it exists, or <code>defaultAction</code> on class Common otherwise</td></tr>
   </table>
 * </p><p>
 * WODirectActionRequestHandler only invokes methods on subclasses of WODirectAction. If the specified class or action doesn't exist, 
 * WODirectActionRequestHandler throws an exception.
 * </p><p>
 * To handle stale session IDs (e.g. session IDs stored in cookies, and those session IDs refer to expired sessions), make sure to do the 
 * following at the beginning of your direct action method:
 * <blockquote><pre>
   public WOActionResults myAction() {
     if ( getSessionIDForRequest(request()) != null && existingSession() == null ) {
         // special behavior, like a returning a login page, e.g. return pageWithName("LoginPage");
     } else {
         // whatever else you'd normally do here
     }
   }
   </pre></blockquote>
 */
public class WODirectAction extends com.webobjects.appserver.WOAction implements com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions, com.webobjects.foundation.NSValidation{
    /**
     * String at the end of the WODirectAction name (i.e fetchMovieAction the actionText value is 'Action')
     * See Also:Constant Field Values
     */
    public static final java.lang.String actionText="Action";

    /**
     * Subclasses must override to provide any additional initialization.
     * Parameters:aRequest - the request to be processed
     */
    public WODirectAction(com.webobjects.appserver.WORequest aRequest){
         //TODO codavaj!!
    }

    /**
     * Returns a WOActionResults object that is the result of sending generateResponse() to the page named "Main".
     */
    public com.webobjects.appserver.WOActionResults defaultAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the session ID, or null if one does not exist. Searchs for aRequest's session ID, first in the form values, then in the cookies.
     */
    public java.lang.String getSessionIDForRequest(com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

    /**
     * Performs the action with the specified name and returns the result of that action. The default implementation appends "Action" to anActionName and tries to invoke the resulting method name. Override this method to change how actions are dispatched.
     */
    public com.webobjects.appserver.WOActionResults performActionNamed(java.lang.String anActionName){
        return null; //TODO codavaj!!
    }

    /**
     * Performs takeValueForKey on each key in aKeyArray using values from the receiver's request.
     * This method uses an NSArray for each form value. This is useful when a user can select multiple items for a form value, such as a WOBrowser. If a form value contains only one item, this method uses an NSArray with one object. To use single objects as form values use takeFormValuesForKeyArray.
     */
    public void takeFormValueArraysForKeyArray(com.webobjects.foundation.NSArray aKeyArray){
        return; //TODO codavaj!!
    }

    /**
     * Performs takeValueForKey on the each key in aKeyArray using values from the receiver's request. This method uses an a single object for each form value. If a form value contains more than one item, such as a WOBrowser, this method uses the first item in the array. To use arrays of objects as form values, use takeFormValueArraysForKeyArray.
     */
    public void takeFormValuesForKeyArray(com.webobjects.foundation.NSArray aKeyArray){
        return; //TODO codavaj!!
    }

}
