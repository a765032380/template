package com.zgysw.www;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zgysw.www.activity.HomeActivity;
import com.zgysw.www.base.AppActivity;
import com.zgysw.www.base.BaseFragment;
import com.zgysw.www.fragment.HomeFragment;

public class MainActivity extends AppActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return HomeFragment.newInstance();
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
