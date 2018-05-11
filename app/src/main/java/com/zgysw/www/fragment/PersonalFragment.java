package com.zgysw.www.fragment;

import android.os.Bundle;
import android.view.View;

import com.zgysw.www.R;
import com.zgysw.www.base.BaseFragment;

/**
 * 个人中心页面
 */

public class PersonalFragment extends BaseFragment {


    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_personal;
    }
    public static PersonalFragment newInstance() {
        return new PersonalFragment();
    }
}
