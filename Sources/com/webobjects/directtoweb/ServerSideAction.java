
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.Action;
import com.webobjects.eocontrol.*;

public class ServerSideAction extends Action
    implements EOKeyValueArchiving {

    public ServerSideAction() { return null; }

    public ServerSideAction(String label, String task, String entity) { return null; }

    public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) {}

    public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }
}
