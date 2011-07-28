
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.AssistantPacket;
import com.webobjects.appserver.WOApplication;
import com.webobjects.foundation.NSForwardException;
import com.webobjects.foundation.NSLog;
import java.io.*;
import java.net.Socket;


public class AssistantConnection extends Thread {


    public AssistantConnection(Socket clientSocket) { return null; }

    public void run() {}

    public void sendPacket(AssistantPacket packet) throws IOException {}

    public Socket _clientSocket;
    protected DataInputStream _in;
    protected DataOutputStream _out;
    private ServerInterface _session;

}
