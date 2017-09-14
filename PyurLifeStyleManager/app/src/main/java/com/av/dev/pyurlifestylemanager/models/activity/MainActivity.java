package com.av.dev.pyurlifestylemanager.models.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.Menu;
import android.view.MenuItem;

import com.av.dev.pyurlifestylemanager.core.BaseActivity;
import com.av.dev.pyurlifestylemanager.R;
import com.av.dev.pyurlifestylemanager.core.PEngine;
import com.av.dev.pyurlifestylemanager.models.fragment.AccountFragment;
import com.av.dev.pyurlifestylemanager.models.fragment.RequestFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    public static MainActivity INSTANCE = null;

    @BindView(R.id.navigation)
    BottomNavigationView bottomToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        INSTANCE = this;

        setFrameLayout(R.id.framelayout_main);

        PEngine.switchFragment(INSTANCE, new AccountFragment(), getFrameLayout());

        setBottomToolbar();
    }

    private void setBottomToolbar(){
        bottomToolbar.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        //try
                        Menu menu = bottomToolbar.getMenu();

                        switch (item.getItemId()) {
                            case R.id.menu_service:
                                // TODO

                                menu.findItem(R.id.menu_request).setIcon(R.drawable.ic_request);
                                menu.findItem(R.id.menu_account).setIcon(R.drawable.ic_account);


//                                item.setIcon(R.drawable.ic_home_click);
                                return true;
                            case R.id.menu_request:
                                // TODO

                                menu.findItem(R.id.menu_service).setIcon(R.drawable.ic_home);
                                menu.findItem(R.id.menu_account).setIcon(R.drawable.ic_account);

//                                item.setIcon(R.drawable.ic_pyur_click);
                                PEngine.switchFragment(INSTANCE, new RequestFragment(), getFrameLayout());
                                return true;
                            case R.id.menu_account:
                                // TODO
                                menu.findItem(R.id.menu_service).setIcon(R.drawable.ic_home);
                                menu.findItem(R.id.menu_request).setIcon(R.drawable.ic_request);

//                                item.setIcon(R.drawable.ic_account_click);
                                PEngine.switchFragment(INSTANCE, new AccountFragment(), getFrameLayout());
                                return true;
                        }
                        return false;
                    }
                });
    }
}
