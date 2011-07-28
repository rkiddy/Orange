
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.AssistantPacket;


public interface ServerInterface {

    public abstract String sessionID();

    public abstract AssistantPacket responseTo(AssistantPacket assistantpacket, AssistantConnection assistantconnection);

    public abstract AssistantPacket resynchronizeResponseTo(AssistantPacket assistantpacket, AssistantConnection assistantconnection);

    public abstract void newConnection(AssistantConnection assistantconnection);

    public abstract void removeConnection(AssistantConnection assistantconnection);
}
