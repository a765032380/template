package com.zgysw.www.activity;

import com.zgysw.www.R;
import com.zgysw.www.base.BaseActivity;

public class HomeActivity extends BaseActivity{
    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected int getFragmentContentId() {
        return 0;
    }
}
