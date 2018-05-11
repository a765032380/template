package com.zgysw.www.base;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zgysw.www.R;
import com.zgysw.www.fragment.ArtistFragment;
import com.zgysw.www.fragment.CrowdFragment;
import com.zgysw.www.fragment.HomeFragment;
import com.zgysw.www.fragment.PersonalFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public abstract class AppActivity extends BaseActivity {

    public static AppActivity appActivity;
    //获取第一个fragment
    protected abstract BaseFragment getFirstFragment();

    @BindView(R.id.fragment_container)
    RelativeLayout fragmentContainer;
    @BindView(R.id.iv_Home)
    ImageView iv_Home;
    @BindView(R.id.tv_Home)
    TextView tv_Home;
    @BindView(R.id.ll_Home)
    LinearLayout ll_Home;
    @BindView(R.id.iv_Crowd)
    ImageView iv_Crowd;
    @BindView(R.id.tv_Crowd)
    TextView tv_Crowd;
    @BindView(R.id.ll_Crowd)
    LinearLayout ll_Crowd;
    @BindView(R.id.iv_Artist)
    ImageView iv_Artist;
    @BindView(R.id.tv_Artist)
    TextView tv_Artist;
    @BindView(R.id.ll_Artist)
    LinearLayout ll_Artist;
    @BindView(R.id.iv_Personal)
    ImageView iv_Personal;
    @BindView(R.id.tv_Personal)
    TextView tv_Personal;
    @BindView(R.id.ll_Personal)
    LinearLayout ll_Personal;
    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;

    @OnClick({R.id.ll_Artist, R.id.ll_Crowd, R.id.ll_Personal, R.id.ll_Home})
    public void OnClink(View view) {
        switch (view.getId()) {
            case R.id.ll_Home:
                showHome();
                break;
            case R.id.ll_Crowd:
                showCrowd();
                break;
            case R.id.ll_Artist:
                showArtist();
                break;
            case R.id.ll_Personal:
                showPersonal();
                break;
        }
    }

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        appActivity = this;
        ButterKnife.bind(this);
        if (null != getIntent()) {
            handleIntent(getIntent());
        }
        //避免重复添加Fragment
        if (null == getSupportFragmentManager().getFragments()
                || getSupportFragmentManager().getFragments().size() == 0) {
            BaseFragment firstFragment = getFirstFragment();

            if (null != firstFragment) {
                addFragment(firstFragment);
            }
        }
    }

    private void showPersonal() {
        addFragment(PersonalFragment.newInstance());
        setSelectText(tv_Personal);
    }
    private void showArtist() {
        addFragment(ArtistFragment.newInstance());
        setSelectText(tv_Artist);
    }
    private void showCrowd() {
        addFragment(CrowdFragment.newInstance());
        setSelectText(tv_Crowd);
    }
    private void showHome() {
        addFragment(HomeFragment.newInstance());
        setSelectText(tv_Home);
    }

    private void setSelectText(TextView tv){
        tv_Home.setTextColor(getResources().getColor(R.color.main_text_default));
        tv_Crowd.setTextColor(getResources().getColor(R.color.main_text_default));
        tv_Artist.setTextColor(getResources().getColor(R.color.main_text_default));
        tv_Personal.setTextColor(getResources().getColor(R.color.main_text_default));
        tv.setTextColor(getResources().getColor(R.color.main_text_select));
    }

    //获取Intent
    protected void handleIntent(Intent intent) {

    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.fragment_container;
    }

}
