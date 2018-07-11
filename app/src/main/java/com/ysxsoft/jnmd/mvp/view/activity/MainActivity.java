package com.ysxsoft.jnmd.mvp.view.activity;

import com.ysxsoft.jnmd.R;
import com.ysxsoft.jnmd.mvp.base.BaseActivity;
import com.ysxsoft.jnmd.mvp.contract.CMain;
import com.ysxsoft.jnmd.mvp.presenter.PMainImpl;

import android.os.Bundle;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class MainActivity extends BaseActivity<PMainImpl> implements CMain.IVMain {


    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PMainImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
