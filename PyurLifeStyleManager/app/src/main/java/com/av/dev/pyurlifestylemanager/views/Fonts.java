package com.av.dev.pyurlifestylemanager.views;

import android.graphics.Typeface;

import com.av.dev.pyurlifestylemanager.core.BaseActivity;

/**
 * Created by CodeSyaona on 15/09/2017.
 */

public class Fonts {

    public static Typeface latoRegular = Typeface.createFromAsset(BaseActivity.INSTANCE.getAssets(), "fonts/lato/lato.ttf");
    public static Typeface latoBold = Typeface.createFromAsset(BaseActivity.INSTANCE.getAssets(),"fonts/lato/latobold.ttf");
    public static Typeface latoItalic = Typeface.createFromAsset(BaseActivity.INSTANCE.getAssets(),"fonts/lato/latoitalic.ttf");
    public static Typeface trajanRegular = Typeface.createFromAsset(BaseActivity.INSTANCE.getAssets(),"fonts/trajan/trajan.otf");
    public static Typeface trajanBold = Typeface.createFromAsset(BaseActivity.INSTANCE.getAssets(),"fonts/trajan/trajanbold.otf");


}
