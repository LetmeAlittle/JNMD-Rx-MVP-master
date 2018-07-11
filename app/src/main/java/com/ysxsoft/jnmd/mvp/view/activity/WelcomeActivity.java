package com.ysxsoft.jnmd.mvp.view.activity;

import com.ysxsoft.jnmd.R;
import com.ysxsoft.jnmd.mvp.base.BaseActivity;
import com.ysxsoft.jnmd.mvp.contract.CWelcome;
import com.ysxsoft.jnmd.mvp.presenter.PWelcomeImpl;

import android.os.Bundle;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class WelcomeActivity extends BaseActivity<PWelcomeImpl> implements CWelcome.IVWelcome {


    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_welcome;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PWelcomeImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
