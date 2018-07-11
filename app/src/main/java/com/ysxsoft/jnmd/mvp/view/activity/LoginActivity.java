package com.ysxsoft.jnmd.mvp.view.activity;

import com.ysxsoft.jnmd.R;
import com.ysxsoft.jnmd.mvp.base.BaseActivity;
import com.ysxsoft.jnmd.mvp.contract.CLogin;
import com.ysxsoft.jnmd.mvp.presenter.PLoginImpl;

/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class LoginActivity extends BaseActivity<PLoginImpl> implements CLogin.IVLogin {


    @Override
    protected void initView() {
        super.initView();

    }

    @Override
    public int setContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PLoginImpl(mContext, this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

}
