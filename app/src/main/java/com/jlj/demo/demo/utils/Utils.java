package com.jlj.demo.demo.utils;

import android.os.Build;

import java.util.UUID;

/**
 * Created by jianglinjun on 17/4/5.
 */

public class Utils {
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

    public static String getUnique(){
        return Build.SERIAL;
    }
}
