
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.io.*;


public class EOUserFileDefaults extends EODefaults {


    public EOUserFileDefaults() { return null; }

    private File _defaultsFile() { return null; }

    protected NSDictionary loadPersistentValues() { return null; }

    protected void savePersistentValues(NSDictionary values) {}

    private static final String _UserDefaultsFileArgument = "userDefaultsFile";

}
