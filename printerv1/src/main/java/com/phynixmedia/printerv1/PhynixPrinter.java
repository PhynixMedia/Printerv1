package com.phynixmedia.printerv1;

import android.content.Context;
import android.widget.Toast;

public class PhynixPrinter {

    public static void s(Context c, String message){

        Toast.makeText(c, message, Toast.LENGTH_LONG).show();
    }
}
