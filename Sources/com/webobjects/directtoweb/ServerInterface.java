package com.webobjects.directtoweb;
public interface ServerInterface{
    abstract void newConnection(com.webobjects.directtoweb.AssistantConnection connection);

    abstract void removeConnection(com.webobjects.directtoweb.AssistantConnection connection);

    abstract com.apple.client.directtoweb.common.AssistantPacket responseTo(com.apple.client.directtoweb.common.AssistantPacket packet, com.webobjects.directtoweb.AssistantConnection sender);

    abstract com.apple.client.directtoweb.common.AssistantPacket resynchronizeResponseTo(com.apple.client.directtoweb.common.AssistantPacket packet, com.webobjects.directtoweb.AssistantConnection sender);

    abstract java.lang.String sessionID();

}
