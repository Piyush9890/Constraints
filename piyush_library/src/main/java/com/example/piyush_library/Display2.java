package com.example.piyush_library;

import android.content.Context;
import android.widget.Toast;

public class Display2 {
    public static void Toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
