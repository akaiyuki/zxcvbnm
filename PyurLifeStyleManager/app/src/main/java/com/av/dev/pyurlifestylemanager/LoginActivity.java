package com.av.dev.pyurlifestylemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
