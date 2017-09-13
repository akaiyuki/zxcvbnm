package com.av.dev.pyurlifestylemanager.models.activity;

import android.os.Bundle;

import com.av.dev.pyurlifestylemanager.core.BaseActivity;
import com.av.dev.pyurlifestylemanager.core.PEngine;
import com.av.dev.pyurlifestylemanager.R;
import com.av.dev.pyurlifestylemanager.models.LoginFragment;

public class LoginActivity extends BaseActivity {

    public static LoginActivity INSTANCE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        INSTANCE = this;

        setFrameLayout(R.id.framelayout_main);

        PEngine.switchFragment(INSTANCE, new LoginFragment(), getFrameLayout());

    }
}
