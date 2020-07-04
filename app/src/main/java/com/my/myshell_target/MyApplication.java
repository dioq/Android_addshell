package com.my.myshell_target;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.multidex.MultiDex;

import com.my.myshell_target.hotfix.Hotfix;

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        Log.i("demo", "apk onCreate:" + this);
        new Hotfix().dynamicUpdate(this);
    }

}
