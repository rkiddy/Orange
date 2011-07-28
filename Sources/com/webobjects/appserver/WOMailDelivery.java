
package com.webobjects.appserver;

import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import sun.net.smtp.SmtpClient;


public class WOMailDelivery {
    private static class Dy {

        private Dy() { return null; }

        public static Object call(String className, String methodName, Object param1) { return null; }

        public static Object call(String className, String methodName, Object param1, Object param2) { return null; }

        public static Object call(String className, String methodName, Object params[]) { return null; }

        public static Object call(Object target, String methodName, Object param1) { return null; }

        public static Object call(Object target, String methodName, Object param1, Object param2) { return null; }

        public static Object make(String className, Object param1) { return null; }

        public static Object make(String className, Object param1, Object param2) { return null; }

        public static Object get(String className, String fieldName) { return null; }

        public static Object call(Object target, String methodName, Object params[]) { return null; }

        public static Object make(String className, Object params[]) { return null; }

        public static Object get(Object target, String fieldName) { return null; }

        private static Class[] parameterTypes(Object params[]) { return null; }

        private static boolean parameterTypesAreAssignable(Class invocationParameterTypes[], Class methodParameterTypes[]) { return null; }
    }

    protected static class ThreadedTransportSender extends Thread {


        public ThreadedTransportSender(Object smtpMessage) { return null; }

        public void run() {}

        protected Object _smtpMessage;

    }



    public static WOMailDelivery sharedInstance() { return null; }

    protected WOMailDelivery() { return null; }

    public String composePlainTextEmail(String aSender, NSArray toAddresses, NSArray bccAddresses, String aSubject, String aMessage, boolean sendNow) { return null; }

    public String composeComponentEmail(String aSender, NSArray toAddresses, NSArray bccAddresses, String aSubject, WOComponent aComponent, boolean sendNow) { return null; }

    public void sendEmail(String mailString) {}

    public String toString() { return null; }

    protected Object mailSession() { return null; }

    protected boolean hasJavaMail() { return true; }

    protected Object newMimeMessage(String fromEmailAddress, NSArray toEmailAddresses, NSArray bccEmailAddresses, String subject, String message, String contentType, boolean sendNow) { return null; }

    protected String mimeMessageToString(Object smtpMessage) { return null; }

    static  {}

    private static WOMailDelivery TheSharedInstance;
    protected Object mailSession;
    public static final boolean SEND_NOW = true;
    public static final boolean DONT_SEND = false;

}
