package com.zgysw.www.fragment;

import android.os.Bundle;
import android.view.View;

import com.zgysw.www.R;
import com.zgysw.www.base.BaseFragment;

/**
 * 首页页面
 */

public class HomeFragment extends BaseFragment {


    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }
    public static HomeFragment newInstance() {
        return new HomeFragment();
    }
}
