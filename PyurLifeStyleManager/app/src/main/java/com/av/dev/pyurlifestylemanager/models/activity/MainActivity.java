package com.av.dev.pyurlifestylemanager.models.activity;

import android.os.Bundle;

import com.av.dev.pyurlifestylemanager.core.BaseActivity;
import com.av.dev.pyurlifestylemanager.R;
import com.av.dev.pyurlifestylemanager.core.PEngine;
import com.av.dev.pyurlifestylemanager.models.AccountFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    public static MainActivity INSTANCE = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        INSTANCE = this;

        setFrameLayout(R.id.framelayout_main);

        PEngine.switchFragment(INSTANCE, new AccountFragment(), getFrameLayout());

    }
}
