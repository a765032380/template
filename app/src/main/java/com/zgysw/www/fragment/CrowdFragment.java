package com.zgysw.www.fragment;

import android.os.Bundle;
import android.view.View;

import com.zgysw.www.R;
import com.zgysw.www.base.BaseFragment;

/**
 * 众筹页面
 */

public class CrowdFragment extends BaseFragment {
    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_crowd;
    }
    public static CrowdFragment newInstance() {
        return new CrowdFragment();
    }
}
