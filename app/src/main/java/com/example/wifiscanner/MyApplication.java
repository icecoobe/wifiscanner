package com.example.wifiscanner;

import android.app.Application;
import android.view.Gravity;
import android.widget.Toast;


public class MyApplication extends Application {
    private static MyApplication instance;

    private static Toast toast;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        toast = new Toast(getApplicationContext());
        getToast().setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        getToast().setDuration(Toast.LENGTH_LONG);
    }

    public static Toast getToast(){
        return toast;
    }

    public static MyApplication getInstance(){
        return instance;
    }
}
