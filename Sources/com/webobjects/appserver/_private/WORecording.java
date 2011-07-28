
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Enumeration;


public class WORecording {


    public String toString() { return null; }

    private void _setRecordingPath(String aPath) throws IOException {}

    public WORecording() throws IOException { return null; }

    private String _stringForMessage(WOMessage aMessage, String firstLine) { return null; }

    public void saveRequest(WORequest aRequest) throws IOException {}

    public String _stringByReplacingInString(String original, String s1, String s2) { return null; }

    private WOResponse _wildcardedResponse(WOResponse aResponse) { return null; }

    public void saveResponse(WOResponse aResponse) throws IOException {}

    public void applicationWillDispatchRequest(NSNotification aNotification) {}

    public void applicationDidDispatchRequest(NSNotification aNotification) {}

    static  {}

    private long _recordingStep;
    private WORequest _request;
    private String _recordingPath;
    private String _wildcards;
    private static DecimalFormat TheNumberFormatter;
    private static final NSSelector appWillDispatch;
    private static final NSSelector appDidDispatch;

}
