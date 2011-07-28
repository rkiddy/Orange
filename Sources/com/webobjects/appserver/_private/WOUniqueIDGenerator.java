
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOApplication;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation._NSCollectionPrimitives;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.*;
import java.util.Random;

public class WOUniqueIDGenerator {


    public static WOUniqueIDGenerator sharedInstance() { return null; }

    private WOUniqueIDGenerator() { return null; }

    private void basicSeedInformation(byte buffer[], long time) {}

    public String longUniqueID() { return null; }

    public String longUniqueID(long timeHint) { return null; }

    private String encodeAsSixBitASCII(byte input[]) { return null; }

    static  {}

    private long counter;
    private Random random;
    private MessageDigest digester;
    private int woAppHash;
    private int woPort;
    private boolean doDigest;
    private byte basicSeedCache[];
    private static final int BasicSeedBufferSize = 24;
    private static final int RandomBufferSize = 8;
    private static final int IPAddressBufferSize = 4;
    private static final String PRNGName = "SHA1PRNG";
    private static WOUniqueIDGenerator _SharedInstance;
    private static final char _Chars[];

}
