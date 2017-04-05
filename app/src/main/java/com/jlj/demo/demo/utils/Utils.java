package com.jlj.demo.demo.utils;

import android.os.Build;

import java.util.UUID;

/**
 * Created by jianglinjun on 17/4/5.
 */

public class Utils {
    public static int getSDK() {
        return Build.VERSION.SDK_INT;
    }
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }
    public static String getPkg(){
        return "";
    }
    public static String getUnique(){
        return Build.SERIAL;
    }
}
