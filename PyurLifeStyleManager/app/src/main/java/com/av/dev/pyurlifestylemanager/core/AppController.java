package com.av.dev.pyurlifestylemanager.core;

import android.app.Application;

/**
 * Created by CodeSyaona on 13/09/2017.
 */

public class AppController extends Application {

    private static AppController mInstance;
    public static synchronized AppController getInstance() {
        return mInstance;
    }


    @Override
    public void onCreate() {
        super.onCreate();



        mInstance = this;


    }


}
