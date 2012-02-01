package com.webobjects.eoapplication.client;
/**
 * EOApplet is the default Applet class embedded in WebObjects pages containing a WOJavaClientApplet dynamic element. EOApplet's only task is to read all the application's arguments (passed as HTML parameters) and forward them to the initialization code in EOApplication. For maximum flexibility, any application- specific code should be implemented in EOApplication's finishInitialization method rather than EOApplet's init method.
 * In the controller hierarchy, the applet is represented by an EOAppletController, which becomes a client subcontroller of the EOApplication object.
 * See Also:Serialized Form
 */
public class EOApplet extends javax.swing.JApplet{
    /**
     * Creates a new EOApplet.
     */
    public EOApplet(){
         //TODO codavaj!!
    }

    /**
     * Destroys the applet, thereby cleaning up resources, etc.
     */
    public void destroy(){
        return; //TODO codavaj!!
    }

    /**
     * Instantiates an EOAppletController for the controller hierarchy and invokes EOApplication's startApplication method using all HTML parameters retrieved via Applet's getParameter.
     */
    public void init(){
        return; //TODO codavaj!!
    }

}
