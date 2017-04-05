package com.jlj.demo.demo.utils;

import android.os.Build;

<<<<<<< HEAD
=======
import java.util.UUID;

>>>>>>> developer_1.0.0
/**
 * Created by jianglinjun on 17/4/5.
 */

public class Utils {
<<<<<<< HEAD
    public static int getSDK(){
        return Build.VERSION.SDK_INT;
=======
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

    public static String getUnique(){
        return Build.SERIAL;
>>>>>>> developer_1.0.0
    }
}
