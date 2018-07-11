package com.ysxsoft.jnmd.mvp.presenter;

import android.content.Context;

import com.ysxsoft.jnmd.mvp.contract.CLogin;
import com.ysxsoft.jnmd.mvp.model.MLoginImpl;
import com.ysxsoft.jnmd.mvp.base.BasePresenter;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PLoginImpl extends BasePresenter<CLogin.IVLogin, MLoginImpl> implements CLogin.IPLogin {


    public PLoginImpl(Context mContext, CLogin.IVLogin mView) {
        super(mContext, mView, new MLoginImpl());
    }

}
