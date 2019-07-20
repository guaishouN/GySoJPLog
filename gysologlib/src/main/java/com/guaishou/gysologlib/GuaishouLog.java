package com.guaishou.gysologlib;

import android.util.Log;

public class GuaishouLog {
    private static String tag_str = "GuaishouLog";
    public static void setTag(String tag){
        if (null==tag || tag.isEmpty()) return;
        tag_str = tag;
    }
    public static void print(String msg){
        Log.d(tag_str,msg==null?"msg==null":msg.isEmpty()?"msg.isEmpty()":msg);
    }
}
