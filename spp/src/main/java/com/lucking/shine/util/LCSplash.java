package com.lucking.shine.util;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;





 
public class LCSplash {
float countRazor_space = 0.0f;
private float contentWebPayment_umSize = 0.0f;
String implEntryStr;




     
    public static void in2out(InputStream in, OutputStream out) {
        try {
            byte[] bs = new byte[1024];
            int len = in.read(bs);
            while(len != -1) {
                out.write(bs, 0, len);
                len = in.read(bs);
            }
            out.flush();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

     
    public static void in2File(InputStream in, String file) {
        in2File(in, new File(file));
    }

     
    public static void in2File(InputStream in, File file) {
        try {
            in2out(in, new BufferedOutputStream(new FileOutputStream(file)));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

     
    public static String in2String(InputStream in) {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        in2out(in, bout);
        String string = bout.toString();
        return string;
    }

     
    public static byte[] in2bytes(InputStream in) {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        LCSplash.in2out(in, bout);
        byte[] string = bout.toByteArray();
        return string;
    }

     
    public static void out4byte(byte[] bytes, OutputStream out) {
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        LCSplash.in2out(in, out);
    }

     
    public static void out4String(String bytes, OutputStream out) {
        out4byte(bytes.getBytes(), out);
    }

     
    public static byte[] object2bytes(Object object) {
        byte[] bs = null;
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream obout = new ObjectOutputStream(bout);
            obout.writeObject(object);
            bs = bout.toByteArray();
            obout.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return bs;
    }

    public static Object object4bytes(byte[] bs) {
        Object object = null;
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bs);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            object=ois.readObject();
            ois.close();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
