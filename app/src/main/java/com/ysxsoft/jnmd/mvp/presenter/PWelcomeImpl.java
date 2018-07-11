package com.ysxsoft.jnmd.mvp.presenter;

import android.content.Context;

import com.ysxsoft.jnmd.mvp.contract.CWelcome;
import com.ysxsoft.jnmd.mvp.model.MWelcomeImpl;
import com.ysxsoft.jnmd.mvp.base.BasePresenter;


/**
 * Created by Liang_Lu on 2017/12/21.
 *
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 */

public class PWelcomeImpl extends BasePresenter<CWelcome.IVWelcome, MWelcomeImpl> implements CWelcome.IPWelcome {


    public PWelcomeImpl(Context mContext, CWelcome.IVWelcome mView) {
        super(mContext, mView, new MWelcomeImpl());
    }

}
