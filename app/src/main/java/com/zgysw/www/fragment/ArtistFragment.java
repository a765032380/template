package com.zgysw.www.fragment;

import android.os.Bundle;
import android.view.View;

import com.zgysw.www.R;
import com.zgysw.www.base.BaseFragment;

/**
 * 艺人的界面
 */

public class ArtistFragment extends BaseFragment {


    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_artist;
    }
    public static ArtistFragment newInstance() {
        return new ArtistFragment();
    }
}
