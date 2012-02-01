package com.webobjects.appserver;
/**
 * WOMailDelivery constructs and delivers email messages. It can send both plain-text messages (you supply the string) and rich-text messages (you supply the WOComponent).
 * WOMailDelivery requires a SMTP server to be set (if no value is provided, the default-and-probably-wrong "smtp" is used). You can set the SMTP server using a number of methods:
 * Usage: WOMailDelivery is a singleton, accessed via its sharedInstance() method:
 * JavaMail vs. SmtpClient: WOMailDelivery will use JavaMail if it is installed, enabling features such as BCC addressing, MIME-encoded messages, threaded delivery and better SMTP server compatibility (otherwise the older sun.net.smtp.SmtpClient is used). You can install JavaMail by copying activation.jar and mail.jar (installed in /ThirdPartyJars) into /Library/WebObjects/Extensions.
 */
public class WOMailDelivery{
    /**
     * Constant for passing as sendNow parameter to
     * and
     * .
     * See Also:Constant Field Values
     */
    public static final boolean DONT_SEND=false;

    /**
     * Intentionally undocumented.
     * Since: 5.3
     */
    protected java.lang.Object mailSession;

    /**
     * Constant for passing as sendNow parameter to
     * and
     * .
     * See Also:Constant Field Values
     */
    public static final boolean SEND_NOW=true;

    /**
     * This protected constructor initializes a newly-instantiated WOMailDelivery object. WebObjects applications shouldn't allocate WOMailDelivery objects, but instead should make use of the shared instance provided by WOMailDelivery's sharedInstance class method.
     * See Also:WOMailDelivery.sharedInstance()
     */
    protected WOMailDelivery(){
         //TODO codavaj!!
    }

    /**
     * Composes and optionally delivers a rich-text email message.
     * The body of the message is the HTML generated when this method invokes generateResponse on aComponent. WOMailDelivery uses the WOCGIAdaptorURL default to complete all URLs in the message to be mailed, so the email's recipient can click on the URLs to visit them. If sendNow is true, the message is sent immediately.
     */
    public java.lang.String composeComponentEmail(java.lang.String aSender, com.webobjects.foundation.NSArray toAddresses, com.webobjects.foundation.NSArray bccAddresses, java.lang.String aSubject, com.webobjects.appserver.WOComponent aComponent, boolean sendNow){
        return null; //TODO codavaj!!
    }

    /**
     * Composes and optionally delivers a plain-text email message.
     */
    public java.lang.String composePlainTextEmail(java.lang.String aSender, com.webobjects.foundation.NSArray toAddresses, com.webobjects.foundation.NSArray bccAddresses, java.lang.String aSubject, java.lang.String aMessage, boolean sendNow){
        return null; //TODO codavaj!!
    }

    /**
     * Intentionally undocumented.
     */
    protected boolean hasJavaMail(){
        return false; //TODO codavaj!!
    }

    /**
     * Intentionally undocumented.
     */
    protected java.lang.Object mailSession(){
        return null; //TODO codavaj!!
    }

    /**
     * Intentionally undocumented.
     */
    protected java.lang.String mimeMessageToString(java.lang.Object smtpMessage){
        return null; //TODO codavaj!!
    }

    /**
     * Intentionally undocumented.
     */
    protected java.lang.Object newMimeMessage(java.lang.String fromEmailAddress, com.webobjects.foundation.NSArray toEmailAddresses, com.webobjects.foundation.NSArray bccEmailAddresses, java.lang.String subject, java.lang.String message, java.lang.String contentType, boolean sendNow){
        return null; //TODO codavaj!!
    }

    /**
     * Sends mailString, with mailString being a String conforming to the SMTP format. The compose...Email methods return such Strings. Calling these methods with sendNow set to false allows the caller to modify the returned String before using this method to send it.
     */
    public void sendEmail(java.lang.String mailString){
        return; //TODO codavaj!!
    }

    /**
     * Returns the shared instance of WOMailDelivery that all classes should use. Use this instead of creating another instance.
     */
    public static com.webobjects.appserver.WOMailDelivery sharedInstance(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String representation of the WOMailDelivery object containing the receiver's class name and the SMTP host name.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Intentionally undocumented.
     * Since: 5.3
     */
    protected static class ThreadedTransportSender extends java.lang.Thread{
        /**
         * Intentionally undocumented.
         * Since: 5.3
         */
        public ThreadedTransportSender(java.lang.Object smtpMessage){
             //TODO codavaj!!
        }

        /**
         * Intentionally undocumented.
         */
        public void run(){
            return; //TODO codavaj!!
        }

    }
}
