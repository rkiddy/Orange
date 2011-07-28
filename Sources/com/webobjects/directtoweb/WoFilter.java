
package com.webobjects.directtoweb;

import java.io.File;
import java.io.FilenameFilter;

class WoFilter
    implements FilenameFilter {

    WoFilter() { return null; }

    public boolean accept(File dir, String name) { return true; }
}
