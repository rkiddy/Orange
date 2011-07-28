
package com.webobjects.directtoweb;

import com.webobjects.appserver.WOApplication;
import com.webobjects.foundation.NSForwardException;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;


public class AssistantServer extends Thread {


    public AssistantServer() { return null; }

    public int port() { return 0; }

    public void run() {}

    private ServerSocket _serverSocket;
    private int _assistantPort;

}
